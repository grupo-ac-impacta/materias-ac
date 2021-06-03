package TAD_fila_de_prioridade;

import java.util.Map;
import java.util.Scanner;

import TAD_fila_de_prioridade.source.SortedListPriorityQueue;
import TAD_lista_de_nodos.source.NodePositionList;
import interfaces.Position;

public class index {

	public void init() {
		Scanner s = new Scanner(System.in);
		Integer optionSelected = -1;
		Position<Integer> position;
		Integer k;
		String v;
		

		SortedListPriorityQueue<Integer, String> fila = new SortedListPriorityQueue<Integer, String>();
		
		while(optionSelected != 0) {
			listOptions();

			System.out.println("Digite: ");
			optionSelected = s.nextInt();
			
			switch (optionSelected) {
				case 0:
					break;
				case 1:
					System.out.println("\n O TAD dicionário é uma estrutura de dados que conseguimos armazenar \n "
							+ "pares chave-valor (k,v). \n" 
							+ "\n Para instancia-lo, basta executar: \n "
							+ "SortedListPriorityQueue<Integer, String> fila = new SortedListPriorityQueue<Integer, String>(); \n "
							+ "\n Os parâmetros K, V passados para a classe simbolizam os tipos da Chave e Valor, respectivamente. \n "
							+ "Durante nossos exemplos, utilizamos K como Integer e V como String. \n");
					continue;
				case 2:
					System.out.println("\n O método size() retorna o número de entradas em P.");
					continue;
				case 3:
					try {
						System.out.println(fila.size());
						}
					catch (Exception e) {
						System.out.println("Exceção: O método size() da fila de prioridade: " + e);
					}
					continue;
				case 4:
					System.out.println("\n O método isEmpty() testa se P está vazia, \n"
							+ "Retorna 'True' caso vazia, e 'False' caso contrario.");
					continue;
				case 5:
					try {
						System.out.println(fila.isEmpty());
						}
					catch (Exception e) {
						System.out.println("Exceção: O método isEmpty() da Fila de Prioridade: " + e);
					}
					continue;	
				case 6:
					System.out.println("\n O método min() retorna (mas não remove) uma entrada de P com a menor chave;\n"
							+ "uma condição de erro ocorre se P estiver vazia;");
					continue;
				case 7:					
					try {
						System.out.println(fila.min());
						}
					catch (Exception e) {
						System.out.println("Exceção: O método min() da Fila de Prioridade: " + e);
					}
					continue;
				case 8:
					System.out.println("\n O método insert(k, v) insere em P a chave k com o valor x e retorna a entrada armazenada; \n"
							+ "uma condição de erro ocorre se k é inválido (isto é, k não pode ser comparado como outras chaves);");
					continue;
				case 9:
					try {
						System.out.println("Digite a chave: ");
						k = s.nextInt();
						System.out.println("Digite o valor: ");
						v = s.next();						
						System.out.println(fila.insert(k, v));
						}
					catch (Exception e) {
						System.out.println("Exceção: O método insert(k, v) da Fila de Prioridade: " + e);
					}
					continue;					
				case 10:
					System.out.println("\n  O método removeMin() remove de P e retorna uma entrada com a menor chave; \n"
							+ "uma condição de erro");
					continue;
				case 11:
					try {
						System.out.println(fila.removeMin());
						}
					catch (Exception e) {
						System.out.println("Exceção: método removeMin() da Fila de Prioridade: " + e);
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
		System.out.println("• Digite '1' para entender a estrutura de dados Dicionário");
		System.out.println("• Digite '2' para entender o método size()");
		System.out.println("• Digite '3' para executar o método size()");
		System.out.println("• Digite '4' para entender o método isEmpty()");
		System.out.println("• Digite '5' para executar o método isEmpty()");
		System.out.println("• Digite '6' para entender o método min()");
		System.out.println("• Digite '7' para executar o método min()");
		System.out.println("• Digite '8' para entender o método insert(k, x)");
		System.out.println("• Digite '9' para executar o método insert(k, x)");
		System.out.println("• Digite '10' para entender o método removeMin()");
		System.out.println("• Digite '11' para executar o método removeMin()");
		System.out.println("==============================================================");
	}
}
