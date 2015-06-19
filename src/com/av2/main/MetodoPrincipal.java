package com.av2.main;

import com.av2.utilidade.MetodosAuxiliares;
import com.av2.viajante.Viajante;

public class MetodoPrincipal {

	public static void main(String[] args) {
		
		//cria um passageiro
		Viajante viajante = new Viajante();
		MetodosAuxiliares.leViajante(viajante);
		String nome = viajante.getNomeCompletoViajante();
		String cpf = viajante.getCpfViajante();
		System.out.println(nome+" "+ cpf);

	}

}
