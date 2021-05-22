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
				case 3:
					TAD_Mapa.Index mapa = new TAD_Mapa.Index();
					mapa.init();
					continue;
				case 4:
					TAD_Mapa_ABB.Index abb = new TAD_Mapa_ABB.Index();
					abb.init();
					continue;
				case 5:
					TAD_Mapa_AVL.Index avl = new TAD_Mapa_AVL.Index();
					avl.init();
					continue;
				case 6:
					TAD_arvore_binaria.Index binaryTree = new TAD_arvore_binaria.Index();
					binaryTree.init();
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
		System.out.println("• Digite '3' para acessar a interface do Mapa");
		System.out.println("• Digite '4' para acessar a interface do Mapa - ABB");
		System.out.println("• Digite '5' para acessar a interface do Mapa - AVL");
		System.out.println("• Digite '6' para acessar a interface da Árvore Binária");
		System.out.println("==============================================================");
	}
}