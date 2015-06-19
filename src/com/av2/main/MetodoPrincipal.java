package com.av2.main;

import com.av2.bilhete.Bilhete;
import com.av2.utilidade.MetodosAuxiliares;
import com.av2.viagem.Viagem;
import com.av2.viajante.Viajante;

public class MetodoPrincipal {

	public static void main(String[] args) {
		
		//cria um passageiro
		Viajante viajante = new Viajante();
		MetodosAuxiliares.leViajante(viajante);
		
		String nome = viajante.getNomeCompletoViajante();
		String cpf = viajante.getCpfViajante();
		
		Viagem viagem = new Viagem();
		MetodosAuxiliares.leViagem(viagem);
		int duracaoViagem = viagem.getDuracaoViagem();
		String destinoViagem = viagem.getDestinoViagem();
		String origemViagem = viagem.getOrigemViagem();
		String dataViagem = viagem.getDataViagem();
		String horaViagem = viagem.getHoraViagem();
		
		Bilhete bilhete = new Bilhete();
		MetodosAuxiliares.leBilhete(bilhete);
		int numeroVagao = bilhete.getNumeroVagao();
		int numeroAssento = bilhete.getNumeroAssento();
		String classeAssento = bilhete.getClasseAssento();
		
		System.out.println("Cliente: "+nome+" Cpf: "+ cpf);
		System.out.println("Duracação da viagem: "+duracaoViagem+" Destino da viagem: "+destinoViagem+" Origem da viagem: "+origemViagem+"\n "+" Data da viagem: "+dataViagem+" Hora da viagem: "+horaViagem);
		System.out.println("Numero do vagão: "+numeroVagao+" Numero de assento: "+ numeroAssento + " Classe do assento: "+ classeAssento);
	}
}
