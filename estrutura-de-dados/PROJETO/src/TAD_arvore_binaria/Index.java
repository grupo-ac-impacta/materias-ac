package TAD_arvore_binaria;

import java.util.Map;
import java.util.Scanner;

import TAD_arvore_binaria.source.LinkedBinaryTree;

public class Index {
	public void init() {
		Scanner s = new Scanner(System.in);
		Integer optionSelected = -1;
		Integer k;
		String v;

		LinkedBinaryTree<Integer> D = new LinkedBinaryTree<Integer>();

		while (optionSelected != 0) {
			listOptions();

			System.out.println("Digite: ");
			optionSelected = s.nextInt();

			switch (optionSelected) {
			case 0:
				break;
			case 1:
				System.out.println("\n O TAD dicionário é uma estrutura de dados que conseguimos armazenar \n "
						+ "pares chave-valor (k,v). A principal diferença do TAD dicionário para o TAD mapa é que no \n "
						+ "dicionário as chaves podem ser duplicadas, enquanto no mapa são únicas. \n "
						+ "Com essa possibilidade, conseguimos ter valores diferentes atribuídos a uma só chave, como \n "
						+ "em um dicionário real. \n " + "\n Para instancia-lo, basta executar: \n "
						+ "HashTableMultiMap<K, V> dictionary = new HashTableMultiMap<K, V>(); \n "
						+ "\n Os parâmetros K, V passados para a classe simbolizam os tipos da Chave e Valor, respectivamente. \n "
						+ "Durante nossos exemplos, utilizamos K como Integer e V como String. \n");
				continue;
			case 2:
				System.out.println("\n O método put(key, value) é utilizado para adicionar valores ao Dicionário. \n "
						+ "É necessário informar uma chave seguido de um valor. \n "
						+ "Neste exemplo utilizaremos a Chave como Integer e o valor como String. \n "
						+ "Considerando um Dicionário *D*, a chamada do método ficará assim: D.put(5, \"Leandro\"). \n "
						+ "O método retornará o elemento inserido após a execução. \n");
				continue;
			case 3:
				try {
					System.out.println("Digite a chave: ");
					k = s.nextInt();
					System.out.println("Digite o valor: ");
					v = s.next();
					System.out.println(D.put(k, v).toString());
				} catch (Exception e) {
					System.out.println("Exceção: método PUT do dicionário: " + e);
				}
				continue;
			case 4:
				System.out.println(
						"\n O método get(key) é utilizado para resgatar elementos a partir de uma determinada chave"
								+ " presente no Dicionário. \n " + "É necessário informar uma chave. \n "
								+ "Neste exemplo utilizaremos a Chave como Integer. \n "
								+ "Considerando um Dicionário *D*, a chamada do método ficará assim: D.get(5). \n "
								+ "O método retornará o elemento após a execução. Caso o elemento não exista, retornará NULL \n");
				continue;
			case 5:
				try {
					System.out.println("Digite a chave: ");
					k = s.nextInt();
//					Map.Entry<Integer, String> r = D.get(k);
//					if (r != null) {
//						System.out.println(r.toString());
//					} else {
//						System.out.println("null");
//					}
				} catch (Exception e) {
					System.out.println("Exceção: método GET do dicionário: " + e);
				}
				continue;
			case 6:
				System.out.println("\n O método size() é utilizado para determinar o tamanho do Dicionário. \n "
						+ "Considerando um Dicionário *D*, a chamada do método ficará assim: D.size(). \n "
						+ "Caso o elemento não exista, retornará 0 \n");
				continue;
			case 7:
				System.out.println(D.size());
				continue;
			case 8:
				System.out.println("\n O método isEmpty() é utilizado para determinar se o Dicionário está vazio. \n "
						+ "Considerando um Dicionário *D*, a chamada do método ficará assim: D.isEmpty(). \n "
						+ "Retornará um booleano \n");
				continue;
			case 9:
				System.out.println("" + D.isEmpty());
				continue;
			case 10:
				System.out
						.println("\n O método getAll(k) é utilizado para resgatar uma lista iteravel de todos elementos"
								+ "com chave igual a 'k' no Dicionário. \n "
								+ "Neste exemplo utilizaremos a Chave como Integer. \n "
								+ "Considerando um Dicionário *D*, a chamada do método ficará assim: D.getAll(k). \n "
								+ "Retornará um iterável\n");
				continue;
			case 11:
				try {
					System.out.println("Digite a chave: ");
					k = s.nextInt();
//					Iterable<Map.Entry<Integer, String>> gA = D.getAll(k);
//					if (gA != null) {
//						System.out.println(gA.toString());
//					} else {
//						System.out.println("null");
//					}
				} catch (Exception e) {
					System.out.println("Exceção: método getAll do dicionário: " + e);
				}
				continue;
			case 12:
				System.out.println(
						"\n O método remove(element) é utilizado para remover um elemento (chave: valor) do Dicionário. \n "
								+ "Considerando um Dicionário *D*, a chamada do método ficará assim: D.remove(D.get(key)). \n "
								+ "Retornará o elemento caso exista, senão retornará NULL \n");
				continue;
			case 13:
				try {
					System.out.println("Digite a chave: ");
					k = s.nextInt();
//					Map.Entry<Integer, String> el = D.remove(D.get(k));
//					if (el != null) {
//						System.out.println(el.toString());
//					} else {
//						System.out.println("null");
//					}
				} catch (Exception e) {
					System.out.println("Exceção: método get do dicionário: " + e);
				}
				continue;
			case 14:
				System.out.println("\n O método entrySet() é utilizado para resgatar uma coleção iteravel do todas "
						+ "as chaves e valores do Dicionário. \n "
						+ "Considerando um Dicionário *D*, a chamada do método ficará assim: D.entrySet(). \n "
						+ "Retornará uma lista iterável, senão retorna NULL \n");
				continue;
			case 15:
				try {
//					Iterable<Map.Entry<Integer, String>> ld = D.entrySet();
//					if (ld != null) {
//						System.out.println(ld.toString());
//					} else {
//						System.out.println("null");
//					}
				} catch (Exception e) {
					System.out.println("Exceção: método entrySet do dicionário: " + e);
				}
				continue;
			default:
				System.out.println("Valor inválido");
				continue;
			}
		}
	}

	public static void listOptions() {
		System.out.println("==================== Árvore Binária =====================");
		System.out.println("• Digite '0' para voltar");
		System.out.println("• Digite '2' para entender o método add(i, e)");
		System.out.println("• Digite '3' para executar o método add(i, e)");

		System.out.println("==============================================================");
	}
}
