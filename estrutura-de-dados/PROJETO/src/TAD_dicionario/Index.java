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
					System.out.println("\n O método put(key, value) é utilizado para adicionar valors ao Dicionário. \n "
							+ "É necessário informar uma chave seguido de um valor. \n "
							+ "Neste exemplo utilizaremos a Chave como Integer e o valor como String. \n "
							+ "Considerando um Dicionário *D*, a chamada do método ficará assim: D.put(5, \"Leandro\"). \n "
							+ "O método retornará o elemento inserido após a execução. \n");
					continue;
				case 2:
					System.out.println("Digite a chave: ");
					k = s.nextInt();
					System.out.println("Digite o valor: ");
					v = s.next();
					System.out.println(D.put(k, v).toString());
					continue;
				case 3:
					System.out.println("\n O método get(key) é utilizado para resgatar elementos a partir de uma determinada chave"
							+ " presente no Dicionário. \n "
							+ "É necessário informar uma chave. \n "
							+ "Neste exemplo utilizaremos a Chave como Integer. \n "
							+ "Considerando um Dicionário *D*, a chamada do método ficará assim: D.get(5). \n "
							+ "O método retornará o elemento após a execução. Caso o elemento não exista, retornará NULL \n");
					continue;
				case 4:
					System.out.println("Digite a chave: ");
					k = s.nextInt();
					Map.Entry<Integer, String> r = D.get(k);
					if(r != null) { System.out.println(r.toString()); }
					else { System.out.println("null"); }
					continue;
				case 5:
					System.out.println("\n O método size() é utilizado para determinar o tamanho do Dicionário. \n "
							+ "Considerando um Dicionário *D*, a chamada do método ficará assim: D.size(). \n "
							+ "Caso o elemento não exista, retornará 0 \n");
					continue;
				case 6:
					System.out.println(D.size());
					continue;
				case 7:
					System.out.println("\n O método isEmpty() é utilizado para determinar se o Dicionário está vazio. \n "
							+ "Considerando um Dicionário *D*, a chamada do método ficará assim: D.isEmpty(). \n "
							+ "Retornará um booleano \n");
					continue;
				case 8:
					System.out.println("" + D.isEmpty());
					continue;
				case 9:
					System.out.println("\n O método getAll(k) é utilizado para resgatar uma lista iteravel de todos elementos"
							+ "com chave igual a 'k' no Dicionário. \n "
							+ "Neste exemplo utilizaremos a Chave como Integer. \n "
							+ "Considerando um Dicionário *D*, a chamada do método ficará assim: D.getAll(k). \n "
							+ "Retornará um iterável\n");
					continue;
				case 10:
					System.out.println("Digite a chave: ");
					k = s.nextInt();
					Iterable<Map.Entry<Integer, String>> gA = D.getAll(2);
					if(gA != null) { System.out.println(gA.toString()); }
					else { System.out.println("null"); }
					continue;
				case 11:
					System.out.println("\n O método remove(element) é utilizado para remover um elemento (chave: valor) do Dicionário. \n "
							+ "Considerando um Dicionário *D*, a chamada do método ficará assim: D.remove(D.get(key)). \n "
							+ "Retornará o elemento caso exista, senão retornará NULL \n");
					continue;
				case 12:
					System.out.println("Digite a chave: ");
					k = s.nextInt();
					Map.Entry<Integer, String> el = D.remove(D.get(k));
					if(el != null) { System.out.println(el.toString()); }
					else { System.out.println("null"); }
				case 13:
					System.out.println("\n O método entrySet() é utilizado para resgatar uma coleção iteravel do todas "
							+ "as chaves e valores do Dicionário. \n "
							+ "Considerando um Dicionário *D*, a chamada do método ficará assim: D.entrySet(). \n "
							+ "Retornará uma lista iterável, senão retorna NULL \n");
					continue;
				case 14:
					Iterable<Map.Entry<Integer, String>> ld = D.entrySet();
					if(ld != null) { System.out.println(ld.toString()); }
					else { System.out.println("null"); }
				default:
					System.out.println("Valor inválido");
					continue;
			}
		}
	}
	
	public static void listOptions() {
		System.out.println("==================== Lista de Arranjo =====================");
		System.out.println("• Digite '0' para voltar");
		System.out.println("• Digite '1' para entender o método put(key, value)");
		System.out.println("• Digite '2' para executar o método put(key, value)");
		System.out.println("• Digite '3' para entender o método get(key)");
		System.out.println("• Digite '4' para executar o método get(key)");
		System.out.println("• Digite '5' para entender o método size()");
		System.out.println("• Digite '6' para executar o método size()");
		System.out.println("• Digite '7' para entender o método isEmpty()");
		System.out.println("• Digite '8' para executar o método isEmpty()");
		System.out.println("• Digite '9' para entender o método getAll(key)");
		System.out.println("• Digite '10' para executar o método getAll(key)");
		System.out.println("• Digite '11' para entender o método remove(element)");
		System.out.println("• Digite '12' para executar o método remove(element)");
		System.out.println("• Digite '13' para entender o método entrySet()");
		System.out.println("• Digite '14' para executar o método entrySet()");
		System.out.println("==============================================================");
	}
}
