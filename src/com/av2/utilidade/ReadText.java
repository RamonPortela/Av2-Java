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
			String[] nomeSeparado = nome[1].split(" ");
			String[] cpf = primeiraLinha[1].split(":");
			String[] cpfFormatado = cpf[1].split(" ");			
			registroDoViajante.setCpfViajante(cpfFormatado[0]);
			
			String nomeFormatado = "";
			
			for(int contador = 0; contador < nomeSeparado.length; contador++){
				nomeFormatado = nomeFormatado.concat(nomeSeparado[contador]);
				nomeFormatado += " ";				
			}
			registroDoViajante.setNomeCompletoViajante(nomeFormatado);	
			
			String[] segundaLinha = input.nextLine().split("\t");
			String[] classe = segundaLinha[0].split(":");
			String[] classeFormatada = classe[1].split(" ");
			String[] numeroAssento = segundaLinha[1].split(":");
			String[] numeroAssentoFormatado = numeroAssento[1].split(" ");
			String[] numeroVagao = segundaLinha[2].split(":");
			String[] numeroVagaoFormatado = numeroVagao[1].split(" ");
			registroDoBilhete.setClasseAssento(classeFormatada[0]);			
			registroDoBilhete.setNumeroAssento(Integer.parseInt(numeroAssentoFormatado[0]));			
			registroDoBilhete.setNumeroVagao(Integer.parseInt(numeroVagaoFormatado[0]));
			
			String[] terceiraLinha = input.nextLine().split("\t");
			String[] dataViagem = terceiraLinha[0].split(":");
			String[] dataViagemFormatada = dataViagem[1].split(" ");			
			String[] horaViagem = terceiraLinha[1].split(":");
			String[] horaViagemFormatada = horaViagem[1].split(" ");
			String[] duracaoViagem = terceiraLinha[2].split(":");
			String[] duracaoViagemFormatada = duracaoViagem[1].split(" ");
			registroDaViagem.setDataViagem(dataViagemFormatada[0]);
			registroDaViagem.setHoraViagem(horaViagemFormatada[0]);
			registroDaViagem.setDuracaoViagem(Integer.parseInt(duracaoViagemFormatada[0]));
			
			String[] quartaLinha = input.nextLine().split("\t");
			String[] origemViagem = quartaLinha[0].split(":");
			String[] origemSeparado = origemViagem[1].split(" ");
			String[] destinoViagem = quartaLinha[1].split(":");
			String[] destinoViagemSeparado = destinoViagem[1].split(" ");	
			
			String origemFormatado = "";
			
			for(int contador = 0; contador < origemSeparado.length; contador++){
				origemFormatado = origemFormatado.concat(origemSeparado[contador]);
				origemFormatado += " "; 
			}
			registroDaViagem.setOrigemViagem(origemFormatado);
			
			String destinoViagemFormatado = "";
			
			for(int contador = 0; contador < (destinoViagemSeparado.length-1); contador++){
				destinoViagemFormatado = destinoViagemFormatado.concat(destinoViagemSeparado[contador]);
				destinoViagemFormatado += " "; 
			}
			registroDaViagem.setDestinoViagem(destinoViagemFormatado);
			
			break;
		}
	}
	
	public void mostrarBilhete(){	
		
			System.out.printf("Nome:%s \t Cpf:%s \nClasse:%s\t Numero do Assento:%d\t Numero do Vagão:%d \nData da Viagem:%s \t Duração da Viagem:%s \t Hora da Viagem:%s \nOrigem:%s \t Destino:%s",
				registroDoViajante.getNomeCompletoViajante(), registroDoViajante.getCpfViajante(),
				registroDoBilhete.getClasseAssento(), registroDoBilhete.getNumeroAssento(),
				registroDoBilhete.getNumeroVagao(),	registroDaViagem.getDataViagem(),
				registroDaViagem.getDuracaoViagem(), registroDaViagem.getHoraViagem(),
				registroDaViagem.getOrigemViagem(),	registroDaViagem.getDestinoViagem());
		
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
