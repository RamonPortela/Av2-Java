package com.av2.utilidade;

import java.util.Scanner;

import com.av2.viajante.Viajante;

public class MetodosAuxiliares {
	static Scanner scan = new Scanner(System.in);
	public static void leViajante(Viajante viajante){
		System.out.println("Entre com o nome completo do viajante: ");
		viajante.setNomeCompletoViajante(scan.nextLine());
		System.out.println("Entre com o cpf do viajante: ");
		viajante.setCpfViajante(scan.nextLine());
	}
}
