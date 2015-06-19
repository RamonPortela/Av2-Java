package com.av2.utilidade;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class CreateFile {
	
	private Scanner input;
	
	private Formatter output; // Objeto utilizado para gerar o arquivo de texto
	
	public void OpenFile(){		
		try {
			output = new Formatter("Bilhete.txt");
		} catch (FileNotFoundException falhaAbertura) {
			System.err.println("Erro na criação ou Abertura do Arquivo");
			System.exit(1);
		}	
	}
	
	

}
