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
							+ "Os par�metros K, V passados para a classe simbolizam os tipos da Chave e Valor, respectivamente. \n "
							+ "Durante nossos exemplos, utilizamos K como Integer e V como String. (Lembrando que K precisa ser valor unico)  \n ");
					continue;
				case 2:
					System.out.println("\n O m�todo put(key, value) � utilizado para adicionar valores ao Mapa\n "
							+ "� necess�rio informar uma chave seguido de um valor. \n "
							+ "Neste exemplo utilizaremos a Chave como Integer e o valor como String. \n "
							+ "Considerando um Mapa *mapa*, a chamada do m�todo ficar� assim: mapa.put(5, \"Leandro\"). \n "
							+ "O m�todo retornar� o elemento inserido ap�s a execu��o. \n");
					continue;
				case 3:
					try {
						System.out.println("Digite a chave: ");
						k = s.nextInt();
						System.out.println("Digite o valor: ");
						v = s.next();
						System.out.println(mapa.put(k, v).toString());
					} catch (Exception e) {
						System.out.println("Exce��o: m�todo PUT do mapa: " + e);
					}
					continue;
				case 4:
					System.out.println("\n O m�todo remove(element) � utilizado para remover um elemento (chave: valor) do Mapa. \n "
							+ "Considerando um Mapa *mapa*, a chamada do m�todo ficar� assim: mapa.remove(mapa.get(key)). \n "
							+ "Retornar� o elemento caso exista, sen�o retornar� NULL \n");
					continue;
				case 5:
					try {
						System.out.println("Digite a chave: ");
						k = s.nextInt();
						String el = mapa.remove(k);
						if(el != null) { System.out.println(el.toString()); }
						else { System.out.println("null"); }
					} catch (Exception e) {
						System.out.println("Exce��o: m�todo get do mapa: " + e);
					}
					continue;
				case 6:
					System.out.println("\n O m�todo size() � utilizado para determinar o tamanho do Mapa. \n "
							+ "Considerando um Mapa *mapa*, a chamada do m�todo ficar� assim: mapa.size(). \n "
							+ "Caso o elemento n�o exista, retornar� 0 \n");
					continue;
				case 7:
					System.out.println(mapa.size());
					continue;
				case 8:
					System.out.println("\n O m�todo get(key) � utilizado para resgatar elementos a partir de uma determinada chave"
							+ " presente no Mapa\n "
							+ "� necess�rio informar uma chave. \n "
							+ "Neste exemplo utilizaremos a Chave como Integer. \n "
							+ "Considerando um Mapa *mapa*, a chamada do m�todo ficar� assim: mapa.get(5). \n "
							+ "O m�todo retornar� o elemento ap�s a execu��o. Caso o elemento n�o exista, retornar� NULL \n");
					continue;
				case 9:
					try {
						System.out.println("Digite a chave: ");
						k = s.nextInt();
						String r = mapa.get(k);
						if(r != null) { System.out.println(r.toString()); }
						else { System.out.println("null"); }
					} catch (Exception e) {
						System.out.println("Exce��o: m�todo GET do mapa: " + e);
					}
					continue;
				case 10:
					System.out.println("\n O m�todo isEmpty() � utilizado para determinar se o Mapa est� vazio. \n "
							+ "Considerando um Mapa *mapa*, a chamada do m�todo ficar� assim: mapa.isEmpty(). \n "
							+ "Retornar� um booleano \n");
					continue;
				case 11:
					System.out.println("" + mapa.isEmpty());
					continue;
				case 12:
					System.out.println("\n O m�todo entrySet() � utilizado para resgatar uma cole��o iteravel do todas "
							+ "as chaves e valores do Mapa. \n "
							+ "Considerando um Mapa *mapa*, a chamada do m�todo ficar� assim: mapa.entrySet(). \n "
							+ "Retornar� uma lista iter�vel, sen�o retorna NULL \n");
					continue;
				case 13:
					try {
						Iterable<Entry<Integer, String>> ld = mapa.entrySet();
						if(ld != null) { System.out.println(ld.toString()); }
						else { System.out.println("null"); }
					} catch (Exception e) {
						System.out.println("Exce��o: m�todo entrySet do mapa: " + e);
					}
					continue;
				case 14:
					System.out.println("\n O m�todo keySet() � utilizado para retornar uma cole��o iteravel de todas as chaves armazenadas no Mapa. \n "
							+ "Considerando um Mapa *mapa*, a chamada do m�todo ficar� assim: mapa.keySet(). \n "
							+ "Retornar� um iterator das chaves, sen�o retornar� NULL \n");  
					continue;
				case 15:
					try {
						Iterable<Integer> ld = mapa.keySet();
						if(ld != null) { System.out.println(ld.toString()); }
						else { System.out.println("null"); }						
					} catch (Exception e) {
						System.out.println("Exce��o: m�todo keySet do mapa: " + e);
					}
					continue;
				case 16:	
					System.out.println("\n O m�todo values() � utilizado para retornar todos os valores associados com as chaves. \n "
							+ "Considerando um Mapa *mapa*, a chamada do m�todo ficar� assim: mapa.values(). \n "
							+ "Retornar� um iterator com os valores, sen�o retornar� NUMM \n");
					continue;
				case 17:
					try {
						Iterable<String> ld = mapa.values();
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
		System.out.println("==================== Mapa =====================");
		System.out.println("� Digite '0' para voltar");
		System.out.println("� Digite '1' para entender a estrutura de dados Mapa");
		System.out.println("� Digite '2' para entender o m�todo put(key, value)");
		System.out.println("� Digite '3' para executar o m�todo put(key, value)");
		System.out.println("� Digite '4' para entender o m�todo remove(element)");
		System.out.println("� Digite '5' para executar o m�todo remove(element)");
		System.out.println("� Digite '6' para entender o m�todo size()");
		System.out.println("� Digite '7' para executar o m�todo size()");
		System.out.println("� Digite '8' para entender o m�todo get(key)");
		System.out.println("� Digite '9' para executar o m�todo get(key)");
		System.out.println("� Digite '10' para entender o m�todo isEmpty()");
		System.out.println("� Digite '11' para executar o m�todo isEmpty()");
		System.out.println("� Digite '12' para entender o m�todo entrySet(key)");
		System.out.println("� Digite '13' para executar o m�todo entrySet(key)");
		System.out.println("� Digite '14' para entender o m�todo keySet()");
		System.out.println("� Digite '15' para executar o m�todo keySet()");
		System.out.println("� Digite '16' para entender o m�todo values()");
		System.out.println("� Digite '17' para executar o m�todo values()");
		System.out.println("==============================================================");
	}
}