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
					System.out.println("\n Uma lista arranjo (ou vetor) � uma cole��o S de N elementos\n "
									+ "armazenados em uma certa ordem linear, de maneira que � poss�vel\n "
									+ "se referir aos elementos de S como 1�, 2�, 3� e assim por diante.\n"
									+ "\n Para instancia-lo, basta executar: \n "
									+ "ArrayIndexList<E> a = new ArrayIndexList<E>(); \n "
									+ "\n O par�metro E passado para a classe simboliza o tipo do elemento que ser� armazenado. \n "
									+ "Durante nossos exemplos, utilizamos E como Integer. \n");
					continue;
				case 2:
					System.out.println("\n O m�todo add(i, e) insere um novo elemento e na lista de arranjo na posi��o i. \n "
									+ "Retornar� uma condi��o de erro caso i < 0 ou i > size() - 1. \n ");
					continue;
				case 3:
					try {
						System.out.println("Digite o �ndice");
						i = s.nextInt();
						System.out.println("Digite o valor");
						v = s.nextInt();
						A.add(i, v);
					} catch (Exception e) {
						System.out.println("Exce��o: m�todo ADD da Lista de Arranjo: " + e);
					}
					continue;
				case 4:
					System.out.println("\n O m�todo set(i, e) substitue o elemento da posi��o i pelo elemento e. \n"
							+ "Retornar� uma condi��o de erro caso i < 0 ou i > size() - 1. \n");
					continue;
				case 5:
					try {
						System.out.println("Digite o �ndice");
						i = s.nextInt();
						System.out.println("Digite o valor");
						v = s.nextInt();
						System.out.println(A.get(i));						
						A.set(i, v);
					} catch (Exception e) {
						System.out.println("Exce��o: m�todo PUT da Lista de Arranjo: " + e);
					}
					continue;
				case 6:
					System.out.println("\n O m�todo get(i) retorna o elemento da posi��o i. \n "
							+ "Retornar� uma condi��o de erro caso i < 0 ou i > size() - 1. \n");
					continue;
				case 7:
					try {
						System.out.println("Digite o �ndice");
						i = s.nextInt();
						System.out.println(A.get(i));						
					} catch (Exception e) {
						System.out.println("Exce��o: m�todo GET da Lista de Arranjo: " + e);
					}
					continue;
				case 8:
					System.out.println("\n O m�todo remove(i) remove e retorna o elemento da posi��o i. \n"
							+ "Retornar� uma condi��o de erro caso i < 0 ou i > size() - 1. \n");
					continue;
				case 9:
					try {
						System.out.println("Digite o �ndice");
						i = s.nextInt();
						System.out.println(A.remove(i));						
					} catch (Exception e) {
						System.out.println("Exce��o: m�todo REMOVE da Lista de Arranjo: " + e);
					}
					continue;
				default:
					System.out.println("Valor inv�lido");
					continue;
			}
		}
	}
	
	public static void listOptions() {
		System.out.println("==================== Lista de Arranjo =====================");
		System.out.println("� Digite '0' para voltar");
		System.out.println("� Digite '1' para entender a estrutura de dados Lista de Arranjo");
		System.out.println("� Digite '2' para entender o m�todo add(i, e)");
		System.out.println("� Digite '3' para executar o m�todo add(i, e)");
		System.out.println("� Digite '4' para entender o m�todo set(i, e)");
		System.out.println("� Digite '5' para executar o m�todo set(i, e)");
		System.out.println("� Digite '6' para entender o m�todo get(i)");
		System.out.println("� Digite '7' para executar o m�todo get(i)");
		System.out.println("� Digite '8' para entender o m�todo remove(i)");
		System.out.println("� Digite '9' para executar o m�todo remove(i)");
		System.out.println("==============================================================");
	}
}
