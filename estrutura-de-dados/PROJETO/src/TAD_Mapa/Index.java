package TAD_Mapa;

import java.util.Scanner;

import TAD_Mapa.Map;
import interfaces.Entry;

public class Index {
	
	public void init() {
		Scanner s = new Scanner(System.in);
		Integer optionSelected = -1;
		Integer k;
		String v;

		HashTableMap<Integer, String> mapa = new HashTableMap<Integer, String>();
		
		while(optionSelected != 0) {
			listOptions();

			System.out.println("Digite: ");
			optionSelected = s.nextInt();
			
			switch (optionSelected) {
				case 0:
					break;
				case 1:
					System.out.println("\n Mapas servem para armazenar elementos que podem ser localizados de forma rapida usando chaves.  \n "
							+ "Chaves possuem dois valores, \"k\" e \"v\", sendo \"k\" a chave e \"v\" o valor correspondente. \n"
							+ "HashTableMap<Integer, String> mapa = new HashTableMap<Integer, String>(); \n "
							+ "Os parâmetros K, V passados para a classe simbolizam os tipos da Chave e Valor, respectivamente. \n "
							+ "Durante nossos exemplos, utilizamos K como Integer e V como String. (Lembrando que K precisa ser valor unico)  \n ");
					continue;
				case 2:
					System.out.println("\n O método put(key, value) é utilizado para adicionar valores ao Mapa\n "
							+ "É necessário informar uma chave seguido de um valor. \n "
							+ "Neste exemplo utilizaremos a Chave como Integer e o valor como String. \n "
							+ "Considerando um Mapa *mapa*, a chamada do método ficará assim: mapa.put(5, \"Leandro\"). \n "
							+ "O método retornará o elemento inserido após a execução. \n");
					continue;
				case 3:
					try {
						System.out.println("Digite a chave: ");
						k = s.nextInt();
						System.out.println("Digite o valor: ");
						v = s.next();
						System.out.println(mapa.put(k, v).toString());
					} catch (Exception e) {
						System.out.println("Exceção: método PUT do mapa: " + e);
					}
					continue;
				case 4:
					System.out.println("\n O método remove(element) é utilizado para remover um elemento (chave: valor) do Mapa. \n "
							+ "Considerando um Mapa *mapa*, a chamada do método ficará assim: mapa.remove(mapa.get(key)). \n "
							+ "Retornará o elemento caso exista, senão retornará NULL \n");
					continue;
				case 5:
					try {
						System.out.println("Digite a chave: ");
						k = s.nextInt();
						String el = mapa.remove(k);
						if(el != null) { System.out.println(el.toString()); }
						else { System.out.println("null"); }
					} catch (Exception e) {
						System.out.println("Exceção: método get do mapa: " + e);
					}
					continue;
				case 6:
					System.out.println("\n O método size() é utilizado para determinar o tamanho do Mapa. \n "
							+ "Considerando um Mapa *mapa*, a chamada do método ficará assim: mapa.size(). \n "
							+ "Caso o elemento não exista, retornará 0 \n");
					continue;
				case 7:
					System.out.println(mapa.size());
					continue;
				case 8:
					System.out.println("\n O método get(key) é utilizado para resgatar elementos a partir de uma determinada chave"
							+ " presente no Mapa\n "
							+ "É necessário informar uma chave. \n "
							+ "Neste exemplo utilizaremos a Chave como Integer. \n "
							+ "Considerando um Mapa *mapa*, a chamada do método ficará assim: mapa.get(5). \n "
							+ "O método retornará o elemento após a execução. Caso o elemento não exista, retornará NULL \n");
					continue;
				case 9:
					try {
						System.out.println("Digite a chave: ");
						k = s.nextInt();
						String r = mapa.get(k);
						if(r != null) { System.out.println(r.toString()); }
						else { System.out.println("null"); }
					} catch (Exception e) {
						System.out.println("Exceção: método GET do mapa: " + e);
					}
					continue;
				case 10:
					System.out.println("\n O método isEmpty() é utilizado para determinar se o Mapa está vazio. \n "
							+ "Considerando um Mapa *mapa*, a chamada do método ficará assim: mapa.isEmpty(). \n "
							+ "Retornará um booleano \n");
					continue;
				case 11:
					System.out.println("" + mapa.isEmpty());
					continue;
				case 12:
					System.out.println("\n O método entrySet() é utilizado para resgatar uma coleção iteravel do todas "
							+ "as chaves e valores do Mapa. \n "
							+ "Considerando um Mapa *mapa*, a chamada do método ficará assim: mapa.entrySet(). \n "
							+ "Retornará uma lista iterável, senão retorna NULL \n");
					continue;
				case 13:
					try {
						Iterable<Entry<Integer, String>> ld = mapa.entrySet();
						if(ld != null) { System.out.println(ld.toString()); }
						else { System.out.println("null"); }
					} catch (Exception e) {
						System.out.println("Exceção: método entrySet do mapa: " + e);
					}
					continue;
				case 14:
					System.out.println("\n O método keySet() é utilizado para retornar uma coleção iteravel de todas as chaves armazenadas no Mapa. \n "
							+ "Considerando um Mapa *mapa*, a chamada do método ficará assim: mapa.keySet(). \n "
							+ "Retornará um iterator das chaves, senão retornará NULL \n");  
					continue;
				case 15:
					try {
						Iterable<Integer> ld = mapa.keySet();
						if(ld != null) { System.out.println(ld.toString()); }
						else { System.out.println("null"); }						
					} catch (Exception e) {
						System.out.println("Exceção: método keySet do mapa: " + e);
					}
					continue;
				case 16:	
					System.out.println("\n O método values() é utilizado para retornar todos os valores associados com as chaves. \n "
							+ "Considerando um Mapa *mapa*, a chamada do método ficará assim: mapa.values(). \n "
							+ "Retornará um iterator com os valores, senão retornará NUMM \n");
					continue;
				case 17:
					try {
						Iterable<String> ld = mapa.values();
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
		System.out.println("==================== Mapa =====================");
		System.out.println("• Digite '0' para voltar");
		System.out.println("• Digite '1' para entender a estrutura de dados Mapa");
		System.out.println("• Digite '2' para entender o método put(key, value)");
		System.out.println("• Digite '3' para executar o método put(key, value)");
		System.out.println("• Digite '4' para entender o método remove(element)");
		System.out.println("• Digite '5' para executar o método remove(element)");
		System.out.println("• Digite '6' para entender o método size()");
		System.out.println("• Digite '7' para executar o método size()");
		System.out.println("• Digite '8' para entender o método get(key)");
		System.out.println("• Digite '9' para executar o método get(key)");
		System.out.println("• Digite '10' para entender o método isEmpty()");
		System.out.println("• Digite '11' para executar o método isEmpty()");
		System.out.println("• Digite '12' para entender o método entrySet(key)");
		System.out.println("• Digite '13' para executar o método entrySet(key)");
		System.out.println("• Digite '14' para entender o método keySet()");
		System.out.println("• Digite '15' para executar o método keySet()");
		System.out.println("• Digite '16' para entender o método values()");
		System.out.println("• Digite '17' para executar o método values()");
		System.out.println("==============================================================");
	}
}