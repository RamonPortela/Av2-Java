package com.av2.utilidade;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.av2.bilhete.Bilhete;
import com.av2.viagem.Viagem;
import com.av2.viajante.Viajante;

public class ReadText {
	
	private Scanner input;
	Bilhete registroDoBilhete = new Bilhete();
	Viajante registroDoViajante = new Viajante();
	Viagem registroDaViagem = new Viagem();
	
	public void openFile(){	
		
		try {
			input = new Scanner(new File("Bilhete.txt"));
		} 
		catch (FileNotFoundException falhaAbertura) {
			System.err.println("Erro na criação ou Abertura do Arquivo");
			System.exit(1);
		}
	}
	
	public void lerBilhete(){
		
		while (input.hasNext()){
			input.nextLine();
			
			String[] primeiraLinha = input.nextLine().split("\t");
			String[] nome = primeiraLinha[0].split(":");
			String[] nomeFormatado = nome[1].split(" ");
			String[] cpf = primeiraLinha[1].split(":");
			String[] cpfFormatado = cpf[1].split(" ");			
			registroDoViajante.setNomeCompletoViajante(nomeFormatado[0]);		
			registroDoViajante.setCpfViajante(cpfFormatado[0]);
			
			
			String[] segundaLinha = input.nextLine().split("\t");
			String[] classe = segundaLinha[0].split(":");
			String[] classeFormatada = classe[1].split(" ");
			String[] numeroAsseto = segundaLinha[1].split(":");
			String[] numeroAssetoFormatado = numeroAsseto[1].split(" ");
			String[] numeroVagao = segundaLinha[2].split(":");
			String[] numeroVagaoFormatado = numeroVagao[1].split(" ");
			registroDoBilhete.setClasseAssento(classeFormatada[0]);			
			registroDoBilhete.setNumeroAssento(Integer.parseInt(numeroAssetoFormatado[0]));			
			registroDoBilhete.setNumeroVagao(Integer.parseInt(numeroVagaoFormatado[0]));
			
			break;
			
/*			registroDaViagem.setDataViagem(input.next());
			registroDaViagem.setOrigemViagem(input.next());
			registroDaViagem.setDestinoViagem(input.next());
			registroDaViagem.setDuracaoViagem(input.next());
			registroDaViagem.setHoraViagem(input.next());		*/
		}
	}
	
	public void mostrarBilhete(){	
		/*  "
				+ "Data da Viagem:%s \t Origem:%s \t Destino:%s \t Duração da Viagem:%s \t Hora da Viagem:%s	
*/		System.out.printf("Nome:%s \t Cpf:%s \nClasse:%s\t Numero do Assento:%d\t Numero do Vagão:%d \n",
				registroDoViajante.getNomeCompletoViajante(), registroDoViajante.getCpfViajante(),
				registroDoBilhete.getClasseAssento(), registroDoBilhete.getNumeroAssento(),
				registroDoBilhete.getNumeroVagao()/*,	registroDaViagem.getDataViagem(),
				registroDaViagem.getOrigemViagem(),	registroDaViagem.getDestinoViagem(),
				registroDaViagem.getDuracaoViagem(), registroDaViagem.getHoraViagem()*/);
		
	}
	
	// Fecha o Arquivo
	public void closedFile(){		
		if(input != null){
			input.close();
		}
		else if(input == null){
			System.out.println("Erro na Leitura do Arquivo.");
		}
	}

}
