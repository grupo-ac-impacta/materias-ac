package main;

import java.util.Scanner;

public class Index {
	
	public static void main(String[] args) {
		start();
	}
	
	public static void start() {
		Scanner s = new Scanner(System.in);
		Integer optionSelected = -1;

		while(optionSelected != 0) {
			listOptions();
			
			System.out.println("Digite: ");
			optionSelected = s.nextInt();

			switch (optionSelected) {
				case 1:
					TAD_lista_arranjo.Index listaArranjo = new TAD_lista_arranjo.Index();
					listaArranjo.init();
					continue;
				case 2:
					TAD_dicionario.Index dicionario = new TAD_dicionario.Index();
					dicionario.init();
					continue;
				default:
					System.out.println("Valor inválido");
					continue;
			}
		}
	}

	public static void listOptions() {
		System.out.println("==================== Lista de Interfaces =====================");
		System.out.println("• Digite '0' para sair");
		System.out.println("• Digite '1' para acessar a interface da lista de Arranjo");
		System.out.println("• Digite '2' para acessar a interface do Dicionário");
		System.out.println("==============================================================");
	}
}