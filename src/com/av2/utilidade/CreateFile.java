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
	public void addRegistro(){
		
		Bilhete registroDoBilhete = new Bilhete();
		Viajante registroDoViajante = new Viajante();
		Viagem registroDaViagem = new Viagem();	
		
		MetodosAuxiliares.leViajante(registroDoViajante);
		MetodosAuxiliares.leBilhete(registroDoBilhete);
		MetodosAuxiliares.leViagem(registroDaViagem);
		
		registroDoViajante.getCpfViajante();
		registroDoViajante.getNomeCompletoViajante();
		
		registroDaViagem.getDataViagem();
		registroDaViagem.getDestinoViagem();
		registroDaViagem.getDuracaoViagem();
		registroDaViagem.getHoraViagem();
		registroDaViagem.getOrigemViagem();
		
		registroDoBilhete.getClasseAssento();
		registroDoBilhete.getNumeroAssento();
		registroDoBilhete.getNumeroVagao();		
		
		//System.out.println("Arquivo Criado.");
		
		}
	
	// Fecha o Arquivo
	public void closedFile(){		
		if(output != null){
			output.close();
		}
	}	
}
	


