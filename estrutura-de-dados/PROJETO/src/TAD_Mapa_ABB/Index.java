package TAD_Mapa_ABB;

import java.util.Scanner;
import TAD_Mapa_ABB.BinarySearchTree;

public class Index {
	
	public void init() {
		Scanner s = new Scanner(System.in);
		Integer optionSelected = -1;
		Integer k;
		Integer v;

		BinarySearchTree<Integer, Integer> ABB = new BinarySearchTree<Integer, Integer>();
		
		while(optionSelected != 0) {
			listOptions();

			System.out.println("Digite: ");
			optionSelected = s.nextInt();
			
			switch (optionSelected) {
				case 0:
					break;
				case 1:
					System.out.println("\n Uma �rvore bin�ria de pesquisa � uma �rvore binaria T, em que cada nodo interno v de T armazena um elemento (k, x).  \n "
							+ "As chaves nos nodos da sub�rvore esquerda de v s�o menores ou iguais a k. \n"
							+ "As chaves nos nodos da sub�rvore direita de v s�o maiores ou iguais a k \n "
							+ "BinarySearchTree<Integer, Integer> ABB = new BinarySearchTree<Integer, Integer>(); \n "
							+ "Os par�metros K, V passados para a classe simbolizam os tipos da Chave e Valor, respectivamente.  \n"
							+ "Durante nossos exemplos, utilizamos K como Integer e V como Integer.(Lembrando que K precisa ser valor unico) \n");
					continue;
				case 2:
					System.out.println("\n O m�todo put(key, value) � utilizado para adicionar valores ao Mapa-ABB. \n "
							+ "� necess�rio informar uma chave seguido de um valor. \n "
							+ "Neste exemplo utilizaremos a Chave como Integer e o valor como String. \n "
							+ "Considerando um Mapa-ABB *abb*, a chamada do m�todo ficar� assim: abb.put(5, \"Leandro\"). \n "
							+ "O m�todo retornar� o elemento inserido ap�s a execu��o. \n");
					continue;
				case 3:
					try {
						System.out.println("Digite a chave: ");
						k = s.nextInt();
						System.out.println("Digite o valor: ");
						v = s.nextInt();
						System.out.println(ABB.put(k, v).toString());
					} catch (Exception e) {
						System.out.println("Exce��o: m�todo PUT do mapa: " + e);
					}
					continue;
				case 4:
					System.out.println("\n O m�todo remove(element) � utilizado para remover um elemento (chave: valor) do Mapa-ABB. \n "
							+ "Considerando um Mapa-ABB *abb*, a chamada do m�todo ficar� assim: abb.remove(abb.get(key)). \n "
							+ "Retornar� o elemento caso exista, sen�o retornar� NULL \n");
					continue;
				case 5:
					try {
						System.out.println("Digite a chave: ");
						k = s.nextInt();
						Integer el = ABB.remove(k);
						if(el != null) { System.out.println(el.toString()); }
						else { System.out.println("null"); }
					} catch (Exception e) {
						System.out.println("Exce��o: m�todo get do mapa: " + e);
					}
					continue;
				case 6:
					System.out.println("\n O m�todo get(key) � utilizado para resgatar o valor de uma determinada chave"
							+ " presente no Mapa-ABB\n "
							+ "� necess�rio informar uma chave. \n "
							+ "Neste exemplo utilizaremos a Chave como Integer. \n "
							+ "Considerando um Mapa-ABB *abb*, a chamada do m�todo ficar� assim: abb.get(5). \n "
							+ "O m�todo retornar� o elemento ap�s a execu��o. Caso o elemento n�o exista, retornar� NULL \n");
					continue;
				case 7:
					try {
						System.out.println("Digite a chave: ");
						k = s.nextInt();
						Integer r = ABB.get(k);
						if(r != null) { System.out.println(r.toString()); }
						else { System.out.println("null"); }
					} catch (Exception e) {
						System.out.println("Exce��o: m�todo GET do mapa: " + e);
					}
					continue;
				case 8:
					System.out.println("\n O m�todo keySet() � utilizado para retornar uma cole��o iteravel de todas as chaves armazenadas no Mapa-ABB. \n "
							+ "Considerando um Mapa-ABB *abb*, a chamada do m�todo ficar� assim: abb.keySet(). \n "
							+ "Retornar� um iterator das chaves, sen�o retornar� NULL \n");  
					continue;
				case 9:
					try {
						Iterable<Integer> ld = ABB.keySet();
						if(ld != null) { System.out.println(ld.toString()); }
						else { System.out.println("null"); }						
					} catch (Exception e) {
						System.out.println("Exce��o: m�todo keySet do mapa: " + e);
					}
					continue;
				case 10:	
					System.out.println("\n O m�todo values() � utilizado para retornar todos os valores associados com as chaves. \n "
							+ "Considerando um Mapa-ABB *abb*, a chamada do m�todo ficar� assim: abb.values(). \n "
							+ "Retornar� um iterator com os valores, sen�o retornar� NUMM \n");
					continue;
				case 11:
					try {
						Iterable<Integer> ld = ABB.values();
						if(ld != null) { System.out.println(ld.toString()); }
						else { System.out.println("null"); }	
					} catch (Exception e) {
						System.out.println("Exce��o: m�todo values do mapa: " + e);
					}
					continue;
				default:
					System.out.println("Valor inv�lido");
					continue;
			}
		}
	}
	
	public static void listOptions() {
		System.out.println("==================== Dicion�rio =====================");
		System.out.println("� Digite '0' para voltar");
		System.out.println("� Digite '1' para entender a estrutura de dados Mapa");
		System.out.println("� Digite '2' para entender o m�todo put(key, value)");
		System.out.println("� Digite '3' para executar o m�todo put(key, value)");
		System.out.println("� Digite '4' para entender o m�todo remove(element)");
		System.out.println("� Digite '5' para executar o m�todo remove(element)");
		System.out.println("� Digite '6' para entender o m�todo get(key)");
		System.out.println("� Digite '7' para executar o m�todo get(key)");
		System.out.println("� Digite '8' para entender o m�todo entrySet(key)");
		System.out.println("� Digite '9' para executar o m�todo entrySet(key)");
		System.out.println("� Digite '10' para entender o m�todo values()");
		System.out.println("� Digite '11' para executar o m�todo values()");
		System.out.println("==============================================================");
	}
}
