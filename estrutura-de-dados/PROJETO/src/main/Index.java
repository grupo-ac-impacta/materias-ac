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
			System.out.print("Digite: ");
			
			optionSelected = s.nextInt();

			switch (optionSelected) {
				case 1:
					TAD_lista_arranjo.Index listaArranjo = new TAD_lista_arranjo.Index();
					listaArranjo.init();
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
		System.out.println("• Digite '1' para acessar a interface de lista de Arranjo");
		System.out.println("==============================================================");
	}
}