package com.av2.main;

import com.av2.utilidade.CreateFile;
import com.av2.utilidade.ReadText;

public class MetodoPrincipal {

	public static void main(String[] args) {
		
		//cria um objeto de escrita em arquivo
		CreateFile bilheteEscrever = new CreateFile();
		
		bilheteEscrever.openFile();
		bilheteEscrever.imprimirBilhete();
		bilheteEscrever.closedFile();
		System.out.println("Imprimindo bilhete...\n");
		
		//cria um objeto de leitura de arquivo
		ReadText bilheteLer = new ReadText();
		
		bilheteLer.openFile();
		bilheteLer.lerBilhete();
		bilheteLer.mostrarBilhete();
		bilheteLer.closedFile();
	}
}
