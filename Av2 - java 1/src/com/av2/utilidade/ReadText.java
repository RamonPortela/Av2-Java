package com.av2.utilidade;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.av2.bilhete.Bilhete;
import com.av2.viagem.Viagem;
import com.av2.viajante.Viajante;

public class ReadText {
	
	//variaveis privadas pois só serão acessadas a partir desta classe
	private Scanner input;
	private Bilhete registroDoBilhete = new Bilhete();
	private Viajante registroDoViajante = new Viajante();
	private Viagem registroDaViagem = new Viagem();
	
	//abre o arquivo txt
	public void openFile(){	
		
		try {
			input = new Scanner(new File("Bilhete.txt"));
		} 
		catch (FileNotFoundException falhaAbertura) {
			System.err.println("Erro na criação ou Abertura do Arquivo");
			System.exit(1);
		}
	}
	
	//Lê as linhas do arquivo txt e salva as informações nas suas respectivas variáveis
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
			
			//junta as strings do nome que estavam separadas
			for(int contadorLetrasNome = 0; contadorLetrasNome < nomeSeparado.length; contadorLetrasNome++){
				nomeFormatado = nomeFormatado.concat(nomeSeparado[contadorLetrasNome]);
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
			String[] horarioViagem = terceiraLinha[1].split(":");
			String horaViagem = horarioViagem[1];
			String minutoViagem = horarioViagem[2];
			String[] duracaoViagem = terceiraLinha[2].split(":");
			String[] duracaoViagemFormatada = duracaoViagem[1].split(" ");
			registroDaViagem.setDataViagem(dataViagemFormatada[0]);
			registroDaViagem.setDuracaoViagem(Integer.parseInt(duracaoViagemFormatada[0]));
			
			//junta as strings da hora e minuto
			String horaViagemFormatada = horaViagem+":"+minutoViagem;
			
			registroDaViagem.setHoraViagem(horaViagemFormatada);
			
			String[] quartaLinha = input.nextLine().split("\t");
			String[] origemViagem = quartaLinha[0].split(":");
			String[] origemSeparado = origemViagem[1].split(" ");
			String[] destinoViagem = quartaLinha[1].split(":");
			String[] destinoViagemSeparado = destinoViagem[1].split(" ");	
			
			String origemFormatado = "";
			
			//junta as strings do nome do estado
			for(int contadorLetrasOrigem = 0; contadorLetrasOrigem < origemSeparado.length; contadorLetrasOrigem++){
				origemFormatado = origemFormatado.concat(origemSeparado[contadorLetrasOrigem]);
				origemFormatado += " "; 
			}
			registroDaViagem.setOrigemViagem(origemFormatado);
			
			String destinoViagemFormatado = "";
			
			//junta as strings do nome do estado
			for(int contadorLetrasDestino = 0; contadorLetrasDestino < (destinoViagemSeparado.length-1); contadorLetrasDestino++){
				destinoViagemFormatado = destinoViagemFormatado.concat(destinoViagemSeparado[contadorLetrasDestino]);
				destinoViagemFormatado += " "; 
			}
			registroDaViagem.setDestinoViagem(destinoViagemFormatado);
			
			break;
		}
	}
	
	// Exibe no console os dados lidos do arquivo txt
	public void mostrarBilhete(){	
		
			System.out.printf("Nome: %s \t Cpf: %s \n"
								+ "Classe: %s\t Numero do Assento: %d\t Numero do Vagão: %d \n"
								+ "Data da Viagem: %s \t Duração da Viagem: %s Horas \t Hora da Viagem: %s \n"
								+ "Origem: %s \t Destino: %s",
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
