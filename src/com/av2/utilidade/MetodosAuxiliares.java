package com.av2.utilidade;

import java.util.Scanner;

import com.av2.bilhete.Bilhete;
import com.av2.viagem.Viagem;
import com.av2.viajante.Viajante;

public class MetodosAuxiliares {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void leViajante(Viajante viajante){
		String cpf;
		String nome;
		
		do{
			System.out.println("Entre com o nome completo do viajante: ");
			nome = scan.nextLine();		
			if(nome.length() > 39){
				System.out.println("O nome do passageiro n�o pode exceder 39 caracteres.");
			}
		}while(nome.length() > 39);
		viajante.setNomeCompletoViajante(nome);
		
		do{
			System.out.println("Entre com o cpf do viajante: ");
			cpf = scan.nextLine();
			if(cpf.length() > 14){
				System.out.println("Cpf inv�lido, cpf deve conter 14 caracteres incluindo ' . ' e ' - '.");
			}
		}while(cpf.length() > 14);
		viajante.setCpfViajante(cpf);
	}
	
	public static void leViagem(Viagem viagem){
		boolean confirmaData = false;
		boolean confirmaHora = false;
		String dataViagem;
		String horaViagem;
		int horaDuracao;
		
		do{
			System.out.println("Entre com o tempo de dura��o da viagem em horas: ");
			horaDuracao = scan.nextInt();
			if(horaDuracao < 1){
				System.out.println("O tempo de dura��o da viagem n�o pode ser menor que 1 hora.");
			}else if(horaDuracao > 99){
				System.out.println("O tempo de dura��o da viagem n�o exceder 99 horas.");
			}
		}while((horaDuracao < 1) || (horaDuracao > 99));
		viagem.setDuracaoViagem(horaDuracao);
		
		scan.nextLine();
		System.out.println("Entre com o local de destino da viagem: ");
		viagem.setDestinoViagem(scan.nextLine());
		System.out.println("Entre com o local de origem da viagem: ");
		viagem.setOrigemViagem(scan.nextLine());
		
		do{
			System.out.println("Entre com a data da viagem: ");
			dataViagem = scan.nextLine();	
			if(dataViagem.length() != 10){
				System.out.println("Data inv�lida. Data deve estar no formato: DD/MM/AAAA");
			}else{
				confirmaData = checaData(dataViagem);
			}			
		}while((dataViagem.length() != 10) || (!confirmaData));
		viagem.setDataViagem(dataViagem);
		
		do{
			System.out.println("Entre com a hora da viagem: ");
			horaViagem = scan.nextLine();	
			confirmaHora = checaHora(horaViagem);
		}while(!confirmaHora);
		viagem.setHoraViagem(horaViagem);
	}
	
	public static void leBilhete(Bilhete bilhete){
		String classeAssento;
		int numeroVagao;
		int numeroAssento;
		
		do{
			System.out.println("Entre com a classe do assento(primeira, executiva ou normal): ");
			classeAssento = scan.nextLine();	
			if((!classeAssento.equals("primeira")) && (!classeAssento.equals("executiva")) && (!classeAssento.equals("normal"))){
				System.out.println("Opcao inv�lida, digite uma op��o valida.");
			}			
		}while((!classeAssento.equals("primeira")) && (!classeAssento.equals("executiva")) && (!classeAssento.equals("normal")));
		
		bilhete.setClasseAssento(classeAssento);
		do{
			System.out.println("Entre com o numero do vagao: ");
			numeroVagao = scan.nextInt();
			if((numeroVagao < 1) || (numeroVagao > 15)){
				System.out.println("O n�mero do vag�o deve ser um numero entre 1 e 15.");
			}
		}while((numeroVagao < 1) || (numeroVagao > 15));
		
		bilhete.setNumeroVagao(numeroVagao);
		do{
			System.out.println("Entre com o numero do assento:");
			numeroAssento = scan.nextInt();		
			if((numeroAssento < 1) || (numeroAssento > 99)){
				System.out.println("O n�mero do assento deve ser um numero entre 1 e 99.");
			}
		}while((numeroAssento < 1) || (numeroAssento > 99));
		bilhete.setNumeroAssento(numeroAssento);
	}
	
	private static boolean checaData(String data){
		int contadorBarra = 0;
		int dia;
		int mes;
		int ano;
		
		for(int posicaoChar = 0; posicaoChar < data.length(); posicaoChar++){
			if(data.charAt(posicaoChar) == '/'){
				contadorBarra++;
			}
		}
		if(contadorBarra == 2){
			String[] dataSeparada = data.split("/");
			dia = Integer.parseInt(dataSeparada[0]);
			mes = Integer.parseInt(dataSeparada[1]);
			ano = Integer.parseInt(dataSeparada[2]);
			
			if((dia < 1) || (dia > 31)){
				System.out.println("Data inv�lida. Dia inv�lido");
				return false;
			}
			if((mes < 1) || (mes > 12)){
				System.out.println("Data inv�lida. M�s inv�lido");
				return false;
			}
			if((ano < 2000) || (ano > 2500)){
				System.out.println("Data inv�lida. Ano inv�lido");
				return false;
			}			
		}else{
			System.out.println("Data inv�lida. Data deve estar no formato: DD/MM/AAAA");
			return false;
		}
		return true;
	}
	
	private static boolean checaHora(String horario){
		int contadorDivisao = 0;
		int hora;
		int minuto;
		
		for(int posicaoChar = 0; posicaoChar < horario.length(); posicaoChar++){
			if(horario.charAt(posicaoChar) == ':'){
				contadorDivisao++;
			}
		}
		if(contadorDivisao == 1){
			String[] horaSeparada = horario.split(":");
			hora = Integer.parseInt(horaSeparada[0]);
			minuto = Integer.parseInt(horaSeparada[1]);
			
			if((hora < 0) || (hora > 23)){
				System.out.println("Horario inv�lido. Hora inv�lida");
				return false;
			}
			if((minuto < 0) || (minuto > 59)){
				System.out.println("Horario inv�lido. Minuto inv�lido");
				return false;
			}
		}
		else{
			System.out.println("Horario inv�lido. O horario deve estar no formato: HH:MM");
		}
		return true;
	}
}
