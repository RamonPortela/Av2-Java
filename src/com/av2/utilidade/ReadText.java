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
		
		while (input.hasNextLine()){
			Scanner in = new Scanner(input.nextLine());
			registroDoViajante.setNomeCompletoViajante(input.next());
			registroDoViajante.setCpfViajante(input.next());
			
/*			registroDoBilhete.setClasseAssento(input.next());
			registroDoBilhete.setNumeroAssento(input.nextInt());
			registroDoBilhete.setNumeroVagao(input.nextInt());
			
			registroDaViagem.setDataViagem(input.next());
			registroDaViagem.setOrigemViagem(input.next());
			registroDaViagem.setDestinoViagem(input.next());
			registroDaViagem.setDuracaoViagem(input.next());
			registroDaViagem.setHoraViagem(input.next());*/				
		}
	}
	
	public void mostrarBilhete(){	
		/*\n Classe:%s \t Numero do Assento:%d \t Numero do Vagão:%d \n"
				+ "Data da Viagem:%s \t Origem:%s \t Destino:%s \t Duração da Viagem:%s \t Hora da Viagem:%s	
*/		System.out.printf("Nome:%s \t Cpf:%s ",
				registroDoViajante.getNomeCompletoViajante(), registroDoViajante.getCpfViajante()/*,
				registroDoBilhete.getClasseAssento(), registroDoBilhete.getNumeroAssento(),
				registroDoBilhete.getNumeroVagao(),	registroDaViagem.getDataViagem(),
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
