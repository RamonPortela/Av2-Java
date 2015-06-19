package com.av2.utilidade;

public class Teste {

	public static void main(String[] args) {
		
		ReadText teste = new ReadText();
		
		teste.openFile();
		teste.imprimirBilhete();
		teste.lerBilhete();
		teste.closedFile();
	}

}
