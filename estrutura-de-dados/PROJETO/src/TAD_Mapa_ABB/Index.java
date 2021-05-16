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
					System.out.println("\n Uma árvore binária de pesquisa é uma árvore binaria T, em que cada nodo interno v de T armazena um elemento (k, x).  \n "
							+ "As chaves nos nodos da subárvore esquerda de v são menores ou iguais a k. \n"
							+ "As chaves nos nodos da subárvore direita de v são maiores ou iguais a k \n "
							+ "BinarySearchTree<Integer, Integer> ABB = new BinarySearchTree<Integer, Integer>(); \n "
							+ "Os parâmetros K, V passados para a classe simbolizam os tipos da Chave e Valor, respectivamente.  \n"
							+ "Durante nossos exemplos, utilizamos K como Integer e V como Integer.(Lembrando que K precisa ser valor unico) \n");
					continue;
				case 2:
					System.out.println("\n O método put(key, value) é utilizado para adicionar valores ao Mapa-ABB. \n "
							+ "É necessário informar uma chave seguido de um valor. \n "
							+ "Neste exemplo utilizaremos a Chave como Integer e o valor como String. \n "
							+ "Considerando um Mapa-ABB *abb*, a chamada do método ficará assim: abb.put(5, \"Leandro\"). \n "
							+ "O método retornará o elemento inserido após a execução. \n");
					continue;
				case 3:
					try {
						System.out.println("Digite a chave: ");
						k = s.nextInt();
						System.out.println("Digite o valor: ");
						v = s.nextInt();
						System.out.println(ABB.put(k, v).toString());
					} catch (Exception e) {
						System.out.println("Exceção: método PUT do mapa: " + e);
					}
					continue;
				case 4:
					System.out.println("\n O método remove(element) é utilizado para remover um elemento (chave: valor) do Mapa-ABB. \n "
							+ "Considerando um Mapa-ABB *abb*, a chamada do método ficará assim: abb.remove(abb.get(key)). \n "
							+ "Retornará o elemento caso exista, senão retornará NULL \n");
					continue;
				case 5:
					try {
						System.out.println("Digite a chave: ");
						k = s.nextInt();
						Integer el = ABB.remove(k);
						if(el != null) { System.out.println(el.toString()); }
						else { System.out.println("null"); }
					} catch (Exception e) {
						System.out.println("Exceção: método get do mapa: " + e);
					}
					continue;
				case 6:
					System.out.println("\n O método get(key) é utilizado para resgatar o valor de uma determinada chave"
							+ " presente no Mapa-ABB\n "
							+ "É necessário informar uma chave. \n "
							+ "Neste exemplo utilizaremos a Chave como Integer. \n "
							+ "Considerando um Mapa-ABB *abb*, a chamada do método ficará assim: abb.get(5). \n "
							+ "O método retornará o elemento após a execução. Caso o elemento não exista, retornará NULL \n");
					continue;
				case 7:
					try {
						System.out.println("Digite a chave: ");
						k = s.nextInt();
						Integer r = ABB.get(k);
						if(r != null) { System.out.println(r.toString()); }
						else { System.out.println("null"); }
					} catch (Exception e) {
						System.out.println("Exceção: método GET do mapa: " + e);
					}
					continue;
				case 8:
					System.out.println("\n O método keySet() é utilizado para retornar uma coleção iteravel de todas as chaves armazenadas no Mapa-ABB. \n "
							+ "Considerando um Mapa-ABB *abb*, a chamada do método ficará assim: abb.keySet(). \n "
							+ "Retornará um iterator das chaves, senão retornará NULL \n");  
					continue;
				case 9:
					try {
						Iterable<Integer> ld = ABB.keySet();
						if(ld != null) { System.out.println(ld.toString()); }
						else { System.out.println("null"); }						
					} catch (Exception e) {
						System.out.println("Exceção: método keySet do mapa: " + e);
					}
					continue;
				case 10:	
					System.out.println("\n O método values() é utilizado para retornar todos os valores associados com as chaves. \n "
							+ "Considerando um Mapa-ABB *abb*, a chamada do método ficará assim: abb.values(). \n "
							+ "Retornará um iterator com os valores, senão retornará NUMM \n");
					continue;
				case 11:
					try {
						Iterable<Integer> ld = ABB.values();
						if(ld != null) { System.out.println(ld.toString()); }
						else { System.out.println("null"); }	
					} catch (Exception e) {
						System.out.println("Exceção: método values do mapa: " + e);
					}
					continue;
				default:
					System.out.println("Valor inválido");
					continue;
			}
		}
	}
	
	public static void listOptions() {
		System.out.println("==================== Dicionário =====================");
		System.out.println("• Digite '0' para voltar");
		System.out.println("• Digite '1' para entender a estrutura de dados Mapa");
		System.out.println("• Digite '2' para entender o método put(key, value)");
		System.out.println("• Digite '3' para executar o método put(key, value)");
		System.out.println("• Digite '4' para entender o método remove(element)");
		System.out.println("• Digite '5' para executar o método remove(element)");
		System.out.println("• Digite '6' para entender o método get(key)");
		System.out.println("• Digite '7' para executar o método get(key)");
		System.out.println("• Digite '8' para entender o método entrySet(key)");
		System.out.println("• Digite '9' para executar o método entrySet(key)");
		System.out.println("• Digite '10' para entender o método values()");
		System.out.println("• Digite '11' para executar o método values()");
		System.out.println("==============================================================");
	}
}
