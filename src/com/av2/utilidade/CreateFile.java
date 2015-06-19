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
		MetodosAuxiliares.leViagem(registroDaViagem);
		MetodosAuxiliares.leBilhete(registroDoBilhete);
		
		
		output.format("Nome:%s \t Cpf:%s \n Classe:%s \t Numero do Assento:%d \t Numero do Vagão:%d \n Data da Viagem:%s \t Origem:%s \t Destino:%s \t Duração da Viagem:%s \t Hora da Viagem:%s",
				registroDoViajante.getNomeCompletoViajante(), registroDoViajante.getCpfViajante(),
				registroDoBilhete.getClasseAssento(), registroDoBilhete.getNumeroAssento(),
				registroDoBilhete.getNumeroVagao(),	registroDaViagem.getDataViagem(),
				registroDaViagem.getOrigemViagem(),	registroDaViagem.getDestinoViagem(),
				registroDaViagem.getDuracaoViagem(), registroDaViagem.getHoraViagem());
		
		}
	
	// Fecha o Arquivo
	public void closedFile(){		
		if(output != null){
			output.close();
		}
	}	
}
	


