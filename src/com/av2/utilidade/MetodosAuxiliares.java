package com.av2.utilidade;

import java.util.Scanner;

import com.av2.bilhete.Bilhete;
import com.av2.viagem.Viagem;
import com.av2.viajante.Viajante;

public class MetodosAuxiliares {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void leViajante(Viajante viajante){
		System.out.println("Entre com o nome completo do viajante: ");
		viajante.setNomeCompletoViajante(scan.nextLine());
		System.out.println("Entre com o cpf do viajante: ");
		viajante.setCpfViajante(scan.nextLine());
	}
	
	public static void leViagem(Viagem viagem){
		System.out.println("Entre com o tempo de duração da viagem: ");
		viagem.setDuracaoViagem(scan.nextLine());
		System.out.println("Entre com o local de destino da viagem: ");
		viagem.setDestinoViagem(scan.nextLine());
		System.out.println("Entre com o local de origem da viagem: ");
		viagem.setOrigemViagem(scan.nextLine());
		System.out.println("Entre com a data da viagem: ");
		viagem.setDataViagem(scan.nextLine());
		System.out.println("Entre com a hora da viagem: ");
		viagem.setHoraViagem(scan.nextLine());
	}
	
	public static void leBilhete(Bilhete bilhete){
		System.out.println("Entre com a classe do assento: ");
		bilhete.setClasseAssento(scan.nextLine());
		System.out.println("Entre com o numero do vagao: ");
		bilhete.setNumeroVagao(scan.nextInt());
		System.out.println("Entre com o numero do assento:");
		bilhete.setNumeroAssento(scan.nextInt());
	}
}
