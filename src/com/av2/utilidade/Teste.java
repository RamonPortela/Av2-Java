package com.av2.utilidade;

public class Teste {

	public static void main(String[] args) {
		
		ReadText teste = new ReadText();
		
		teste.openFile();
		teste.lerBilhete();
		teste.imprimirBilhete();
		teste.closedFile();
	}

}
