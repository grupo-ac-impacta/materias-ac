package TAD_dicionario;

import java.util.Map;
import java.util.Scanner;

public class Index {
	
	public void init() {
		Scanner s = new Scanner(System.in);
		Integer optionSelected = -1;
		Integer k;
		String v;

		HashTableMultiMap<Integer, String> D = new HashTableMultiMap<Integer, String>();
		
		while(optionSelected != 0) {
			listOptions();

			System.out.println("Digite: ");
			optionSelected = s.nextInt();
			
			switch (optionSelected) {
				case 0:
					break;
				case 1:
					System.out.println("\n O TAD dicion�rio � uma estrutura de dados que conseguimos armazenar \n "
							+ "pares chave-valor (k,v). A principal diferen�a do TAD dicion�rio para o TAD mapa � que no \n "
							+ "dicion�rio as chaves podem ser duplicadas, enquanto no mapa s�o �nicas. \n "
							+ "Com essa possibilidade, conseguimos ter valores diferentes atribu�dos a uma s� chave, como \n "
							+ "em um dicion�rio real. \n "
							+ "\n Para instancia-lo, basta executar: \n "
							+ "HashTableMultiMap<K, V> dictionary = new HashTableMultiMap<K, V>(); \n "
							+ "\n Os par�metros K, V passados para a classe simbolizam os tipos da Chave e Valor, respectivamente. \n "
							+ "Durante nossos exemplos, utilizamos K como Integer e V como String. \n");
					continue;
				case 2:
					System.out.println("\n O m�todo put(key, value) � utilizado para adicionar valores ao Dicion�rio. \n "
							+ "� necess�rio informar uma chave seguido de um valor. \n "
							+ "Neste exemplo utilizaremos a Chave como Integer e o valor como String. \n "
							+ "Considerando um Dicion�rio *D*, a chamada do m�todo ficar� assim: D.put(5, \"Leandro\"). \n "
							+ "O m�todo retornar� o elemento inserido ap�s a execu��o. \n");
					continue;
				case 3:
					try {
						System.out.println("Digite a chave: ");
						k = s.nextInt();
						System.out.println("Digite o valor: ");
						v = s.next();
						System.out.println(D.put(k, v).toString());
					} catch (Exception e) {
						System.out.println("Exce��o: m�todo PUT do dicion�rio: " + e);
					}
					continue;
				case 4:
					System.out.println("\n O m�todo get(key) � utilizado para resgatar elementos a partir de uma determinada chave"
							+ " presente no Dicion�rio. \n "
							+ "� necess�rio informar uma chave. \n "
							+ "Neste exemplo utilizaremos a Chave como Integer. \n "
							+ "Considerando um Dicion�rio *D*, a chamada do m�todo ficar� assim: D.get(5). \n "
							+ "O m�todo retornar� o elemento ap�s a execu��o. Caso o elemento n�o exista, retornar� NULL \n");
					continue;
				case 5:
					try {
						System.out.println("Digite a chave: ");
						k = s.nextInt();
						Map.Entry<Integer, String> r = D.get(k);
						if(r != null) { System.out.println(r.toString()); }
						else { System.out.println("null"); }
					} catch (Exception e) {
						System.out.println("Exce��o: m�todo GET do dicion�rio: " + e);
					}
					continue;
				case 6:
					System.out.println("\n O m�todo size() � utilizado para determinar o tamanho do Dicion�rio. \n "
							+ "Considerando um Dicion�rio *D*, a chamada do m�todo ficar� assim: D.size(). \n "
							+ "Caso o elemento n�o exista, retornar� 0 \n");
					continue;
				case 7:
					System.out.println(D.size());
					continue;
				case 8:
					System.out.println("\n O m�todo isEmpty() � utilizado para determinar se o Dicion�rio est� vazio. \n "
							+ "Considerando um Dicion�rio *D*, a chamada do m�todo ficar� assim: D.isEmpty(). \n "
							+ "Retornar� um booleano \n");
					continue;
				case 9:
					System.out.println("" + D.isEmpty());
					continue;
				case 10:
					System.out.println("\n O m�todo getAll(k) � utilizado para resgatar uma lista iteravel de todos elementos"
							+ "com chave igual a 'k' no Dicion�rio. \n "
							+ "Neste exemplo utilizaremos a Chave como Integer. \n "
							+ "Considerando um Dicion�rio *D*, a chamada do m�todo ficar� assim: D.getAll(k). \n "
							+ "Retornar� um iter�vel\n");
					continue;
				case 11:
					try {
						System.out.println("Digite a chave: ");
						k = s.nextInt();
						Iterable<Map.Entry<Integer, String>> gA = D.getAll(k);
						if(gA != null) { System.out.println(gA.toString()); }
						else { System.out.println("null"); }
					} catch (Exception e) {
						System.out.println("Exce��o: m�todo getAll do dicion�rio: " + e);
					}
					continue;
				case 12:
					System.out.println("\n O m�todo remove(element) � utilizado para remover um elemento (chave: valor) do Dicion�rio. \n "
							+ "Considerando um Dicion�rio *D*, a chamada do m�todo ficar� assim: D.remove(D.get(key)). \n "
							+ "Retornar� o elemento caso exista, sen�o retornar� NULL \n");
					continue;
				case 13:
					try {
						System.out.println("Digite a chave: ");
						k = s.nextInt();
						Map.Entry<Integer, String> el = D.remove(D.get(k));
						if(el != null) { System.out.println(el.toString()); }
						else { System.out.println("null"); }
					} catch (Exception e) {
						System.out.println("Exce��o: m�todo get do dicion�rio: " + e);
					}
					continue;
				case 14:
					System.out.println("\n O m�todo entrySet() � utilizado para resgatar uma cole��o iteravel do todas "
							+ "as chaves e valores do Dicion�rio. \n "
							+ "Considerando um Dicion�rio *D*, a chamada do m�todo ficar� assim: D.entrySet(). \n "
							+ "Retornar� uma lista iter�vel, sen�o retorna NULL \n");
					continue;
				case 15:
					try {
						Iterable<Map.Entry<Integer, String>> ld = D.entrySet();
						if(ld != null) { System.out.println(ld.toString()); }
						else { System.out.println("null"); }
					} catch (Exception e) {
						System.out.println("Exce��o: m�todo entrySet do dicion�rio: " + e);
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
		System.out.println("� Digite '1' para entender a estrutura de dados Dicion�rio");
		System.out.println("� Digite '2' para entender o m�todo put(key, value)");
		System.out.println("� Digite '3' para executar o m�todo put(key, value)");
		System.out.println("� Digite '4' para entender o m�todo get(key)");
		System.out.println("� Digite '5' para executar o m�todo get(key)");
		System.out.println("� Digite '6' para entender o m�todo size()");
		System.out.println("� Digite '7' para executar o m�todo size()");
		System.out.println("� Digite '8' para entender o m�todo isEmpty()");
		System.out.println("� Digite '9' para executar o m�todo isEmpty()");
		System.out.println("� Digite '10' para entender o m�todo getAll(key)");
		System.out.println("� Digite '11' para executar o m�todo getAll(key)");
		System.out.println("� Digite '12' para entender o m�todo remove(element)");
		System.out.println("� Digite '13' para executar o m�todo remove(element)");
		System.out.println("� Digite '14' para entender o m�todo entrySet()");
		System.out.println("� Digite '15' para executar o m�todo entrySet()");
		System.out.println("==============================================================");
	}
}
