package com.av2.utilidade;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.av2.bilhete.Bilhete;
import com.av2.viajante.Viajante;

public class ReadText {
	
	private Scanner input;
	
	Bilhete registrodoBilhete = new Bilhete();
	Viajante registrodoViajante = new Viajante();
	
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
		
		CreateFile registros = new CreateFile();
		
		registros.addRegistro();
		
		
		
		registrodoViajante.getCpfViajante();
		registrodoViajante.getNomeCompletoViajante();
		
		registrodoBilhete.getClasseAssento();
		registrodoBilhete.getNumeroAssento();
		registrodoBilhete.getNumeroVagao();
	}
	
	public void imprimirBilhete(){	
			
		System.out.printf("\n" + registrodoViajante.getNomeCompletoViajante(), registrodoViajante.getCpfViajante() ,registrodoBilhete.getClasseAssento(), registrodoBilhete.getNumeroAssento(), registrodoBilhete.getNumeroVagao());
		
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
