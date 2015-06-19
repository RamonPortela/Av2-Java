package com.av2.utilidade;

public class Create {

	public static void main(String[] args) {
		
		CreateFile teste = new CreateFile();
		
		teste.openFile();
		teste.addRegistro();
		teste.closedFile();
	}

}