package TAD_lista_arranjo;

import java.util.Scanner;

import TAD_lista_arranjo.source.ArrayIndexList;

public class Index {
	
	public void init() {
		Scanner s = new Scanner(System.in);
		Integer optionSelected = -1;
		Integer i;
		Integer v;
		
		ArrayIndexList<Integer> A = new ArrayIndexList<Integer>();
		
		while(optionSelected != 0) {
			listOptions();
			
			System.out.println("Digite: ");
			optionSelected = s.nextInt();
			
			switch (optionSelected) {
				case 0:
					break;
				case 1:
					System.out.println("\n Uma lista arranjo (ou vetor) é uma coleção S de N elementos\n "
									+ "armazenados em uma certa ordem linear, de maneira que é possível\n "
									+ "se referir aos elementos de S como 1º, 2º, 3º e assim por diante.\n"
									+ "\n Para instancia-lo, basta executar: \n "
									+ "ArrayIndexList<E> a = new ArrayIndexList<E>(); \n "
									+ "\n O parâmetro E passado para a classe simboliza o tipo do elemento que será armazenado. \n "
									+ "Durante nossos exemplos, utilizamos E como Integer. \n");
					continue;
				case 2:
					System.out.println("\n O método add(i, e) insere um novo elemento e na lista de arranjo na posição i. \n "
									+ "Retornará uma condição de erro caso i < 0 ou i > size() - 1. \n ");
					continue;
				case 3:
					try {
						System.out.println("Digite o índice");
						i = s.nextInt();
						System.out.println("Digite o valor");
						v = s.nextInt();
						A.add(i, v);
					} catch (Exception e) {
						System.out.println("Exceção: método ADD da Lista de Arranjo: " + e);
					}
					continue;
				case 4:
					System.out.println("\n O método set(i, e) substitue o elemento da posição i pelo elemento e. \n"
							+ "Retornará uma condição de erro caso i < 0 ou i > size() - 1. \n");
					continue;
				case 5:
					try {
						System.out.println("Digite o índice");
						i = s.nextInt();
						System.out.println("Digite o valor");
						v = s.nextInt();
						System.out.println(A.get(i));						
						A.set(i, v);
					} catch (Exception e) {
						System.out.println("Exceção: método PUT da Lista de Arranjo: " + e);
					}
					continue;
				case 6:
					System.out.println("\n O método get(i) retorna o elemento da posição i. \n "
							+ "Retornará uma condição de erro caso i < 0 ou i > size() - 1. \n");
					continue;
				case 7:
					try {
						System.out.println("Digite o índice");
						i = s.nextInt();
						System.out.println(A.get(i));						
					} catch (Exception e) {
						System.out.println("Exceção: método GET da Lista de Arranjo: " + e);
					}
					continue;
				case 8:
					System.out.println("\n O método remove(i) remove e retorna o elemento da posição i. \n"
							+ "Retornará uma condição de erro caso i < 0 ou i > size() - 1. \n");
					continue;
				case 9:
					try {
						System.out.println("Digite o índice");
						i = s.nextInt();
						System.out.println(A.remove(i));						
					} catch (Exception e) {
						System.out.println("Exceção: método REMOVE da Lista de Arranjo: " + e);
					}
					continue;
				default:
					System.out.println("Valor inválido");
					continue;
			}
		}
	}
	
	public static void listOptions() {
		System.out.println("==================== Lista de Arranjo =====================");
		System.out.println("• Digite '0' para voltar");
		System.out.println("• Digite '1' para entender a estrutura de dados Lista de Arranjo");
		System.out.println("• Digite '2' para entender o método add(i, e)");
		System.out.println("• Digite '3' para executar o método add(i, e)");
		System.out.println("• Digite '4' para entender o método set(i, e)");
		System.out.println("• Digite '5' para executar o método set(i, e)");
		System.out.println("• Digite '6' para entender o método get(i)");
		System.out.println("• Digite '7' para executar o método get(i)");
		System.out.println("• Digite '8' para entender o método remove(i)");
		System.out.println("• Digite '9' para executar o método remove(i)");
		System.out.println("==============================================================");
	}
}
