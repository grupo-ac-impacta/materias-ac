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
					System.out.println("\n O m�todo put(key, value) � utilizado para adicionar valors ao Dicion�rio. \n "
							+ "� necess�rio informar uma chave seguido de um valor. \n "
							+ "Neste exemplo utilizaremos a Chave como Integer e o valor como String. \n "
							+ "Considerando um Dicion�rio *D*, a chamada do m�todo ficar� assim: D.put(5, \"Leandro\"). \n "
							+ "O m�todo retornar� o elemento inserido ap�s a execu��o. \n");
					continue;
				case 2:
					System.out.println("Digite a chave: ");
					k = s.nextInt();
					System.out.println("Digite o valor: ");
					v = s.next();
					System.out.println(D.put(k, v).toString());
					continue;
				case 3:
					System.out.println("\n O m�todo get(key) � utilizado para resgatar elementos a partir de uma determinada chave"
							+ " presente no Dicion�rio. \n "
							+ "� necess�rio informar uma chave. \n "
							+ "Neste exemplo utilizaremos a Chave como Integer. \n "
							+ "Considerando um Dicion�rio *D*, a chamada do m�todo ficar� assim: D.get(5). \n "
							+ "O m�todo retornar� o elemento ap�s a execu��o. Caso o elemento n�o exista, retornar� NULL \n");
					continue;
				case 4:
					System.out.println("Digite a chave: ");
					k = s.nextInt();
					Map.Entry<Integer, String> r = D.get(k);
					if(r != null) { System.out.println(r.toString()); }
					else { System.out.println("null"); }
					continue;
				case 5:
					System.out.println("\n O m�todo size() � utilizado para determinar o tamanho do Dicion�rio. \n "
							+ "Considerando um Dicion�rio *D*, a chamada do m�todo ficar� assim: D.size(). \n "
							+ "Caso o elemento n�o exista, retornar� 0 \n");
					continue;
				case 6:
					System.out.println(D.size());
					continue;
				case 7:
					System.out.println("\n O m�todo isEmpty() � utilizado para determinar se o Dicion�rio est� vazio. \n "
							+ "Considerando um Dicion�rio *D*, a chamada do m�todo ficar� assim: D.isEmpty(). \n "
							+ "Retornar� um booleano \n");
					continue;
				case 8:
					System.out.println("" + D.isEmpty());
					continue;
				case 9:
					System.out.println("\n O m�todo getAll(k) � utilizado para resgatar uma lista iteravel de todos elementos"
							+ "com chave igual a 'k' no Dicion�rio. \n "
							+ "Neste exemplo utilizaremos a Chave como Integer. \n "
							+ "Considerando um Dicion�rio *D*, a chamada do m�todo ficar� assim: D.getAll(k). \n "
							+ "Retornar� um iter�vel\n");
					continue;
				case 10:
					System.out.println("Digite a chave: ");
					k = s.nextInt();
					Iterable<Map.Entry<Integer, String>> gA = D.getAll(2);
					if(gA != null) { System.out.println(gA.toString()); }
					else { System.out.println("null"); }
					continue;
				case 11:
					System.out.println("\n O m�todo remove(element) � utilizado para remover um elemento (chave: valor) do Dicion�rio. \n "
							+ "Considerando um Dicion�rio *D*, a chamada do m�todo ficar� assim: D.remove(D.get(key)). \n "
							+ "Retornar� o elemento caso exista, sen�o retornar� NULL \n");
					continue;
				case 12:
					System.out.println("Digite a chave: ");
					k = s.nextInt();
					Map.Entry<Integer, String> el = D.remove(D.get(k));
					if(el != null) { System.out.println(el.toString()); }
					else { System.out.println("null"); }
				case 13:
					System.out.println("\n O m�todo entrySet() � utilizado para resgatar uma cole��o iteravel do todas "
							+ "as chaves e valores do Dicion�rio. \n "
							+ "Considerando um Dicion�rio *D*, a chamada do m�todo ficar� assim: D.entrySet(). \n "
							+ "Retornar� uma lista iter�vel, sen�o retorna NULL \n");
					continue;
				case 14:
					Iterable<Map.Entry<Integer, String>> ld = D.entrySet();
					if(ld != null) { System.out.println(ld.toString()); }
					else { System.out.println("null"); }
				default:
					System.out.println("Valor inv�lido");
					continue;
			}
		}
	}
	
	public static void listOptions() {
		System.out.println("==================== Lista de Arranjo =====================");
		System.out.println("� Digite '0' para voltar");
		System.out.println("� Digite '1' para entender o m�todo put(key, value)");
		System.out.println("� Digite '2' para executar o m�todo put(key, value)");
		System.out.println("� Digite '3' para entender o m�todo get(key)");
		System.out.println("� Digite '4' para executar o m�todo get(key)");
		System.out.println("� Digite '5' para entender o m�todo size()");
		System.out.println("� Digite '6' para executar o m�todo size()");
		System.out.println("� Digite '7' para entender o m�todo isEmpty()");
		System.out.println("� Digite '8' para executar o m�todo isEmpty()");
		System.out.println("� Digite '9' para entender o m�todo getAll(key)");
		System.out.println("� Digite '10' para executar o m�todo getAll(key)");
		System.out.println("� Digite '11' para entender o m�todo remove(element)");
		System.out.println("� Digite '12' para executar o m�todo remove(element)");
		System.out.println("� Digite '13' para entender o m�todo entrySet()");
		System.out.println("� Digite '14' para executar o m�todo entrySet()");
		System.out.println("==============================================================");
	}
}
