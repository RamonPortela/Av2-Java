package com.av2.utilidade;

import java.io.FileNotFoundException;
import java.util.Formatter;

import com.av2.bilhete.Bilhete;
import com.av2.viagem.Viagem;
import com.av2.viajante.Viajante;

public class CreateFile {	
	
	private Formatter output; // Objeto utilizado para gerar o arquivo de texto
	
	// Cria um arquivo
	public void openFile(){		
		try {
			output = new Formatter("Bilhete.txt");
		} catch (FileNotFoundException falhaAbertura) {
			System.err.println("Erro na criação ou Abertura do Arquivo");
			System.exit(1);
		}	
	}
	
	// Adiciona o registro em um Arquivo
	public void imprimirBilhete(){
		
		Bilhete registroDoBilhete = new Bilhete();
		Viajante registroDoViajante = new Viajante();
		Viagem registroDaViagem = new Viagem();	
		
		MetodosAuxiliares.leViajante(registroDoViajante);
		MetodosAuxiliares.leBilhete(registroDoBilhete);
		MetodosAuxiliares.leViagem(registroDaViagem);
		
		
		output.format("+====================================================================+%n"
				+ "| Nome:%-39s \t Cpf:%-14s  |"
				+ "%n| Classe:%-10s \t Numero do Assento:%-2d \t Numero do Vagão:%-2d  |"
				+ "%n| Data da Viagem:%-10s \tHora da Viagem:%-5s\tDuração:%-2shr |"
				+ "%n| Origem:%-20s\tDestino:%-20s         |"
				+ "%n+====================================================================+",
				registroDoViajante.getNomeCompletoViajante(), registroDoViajante.getCpfViajante(),
				registroDoBilhete.getClasseAssento(), registroDoBilhete.getNumeroAssento(),
				registroDoBilhete.getNumeroVagao(),	registroDaViagem.getDataViagem(),
				registroDaViagem.getHoraViagem(), registroDaViagem.getDuracaoViagem(),
				registroDaViagem.getOrigemViagem(),	registroDaViagem.getDestinoViagem());
		
	}
	
	// Fecha o Arquivo
	public void closedFile(){		
		if(output != null){
			output.close();
		}
	}	
}
	


