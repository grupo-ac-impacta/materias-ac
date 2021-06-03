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
					System.out.println("\n O TAD dicion�rio � uma estrutura de dados que conseguimos armazenar \n "
							+ "pares chave-valor (k,v). \n" 
							+ "\n Para instancia-lo, basta executar: \n "
							+ "SortedListPriorityQueue<Integer, String> fila = new SortedListPriorityQueue<Integer, String>(); \n "
							+ "\n Os par�metros K, V passados para a classe simbolizam os tipos da Chave e Valor, respectivamente. \n "
							+ "Durante nossos exemplos, utilizamos K como Integer e V como String. \n");
					continue;
				case 2:
					System.out.println("\n O m�todo size() retorna o n�mero de entradas em P.");
					continue;
				case 3:
					try {
						System.out.println(fila.size());
						}
					catch (Exception e) {
						System.out.println("Exce��o: O m�todo size() da fila de prioridade: " + e);
					}
					continue;
				case 4:
					System.out.println("\n O m�todo isEmpty() testa se P est� vazia, \n"
							+ "Retorna 'True' caso vazia, e 'False' caso contrario.");
					continue;
				case 5:
					try {
						System.out.println(fila.isEmpty());
						}
					catch (Exception e) {
						System.out.println("Exce��o: O m�todo isEmpty() da Fila de Prioridade: " + e);
					}
					continue;	
				case 6:
					System.out.println("\n O m�todo min() retorna (mas n�o remove) uma entrada de P com a menor chave;\n"
							+ "uma condi��o de erro ocorre se P estiver vazia;");
					continue;
				case 7:					
					try {
						System.out.println(fila.min());
						}
					catch (Exception e) {
						System.out.println("Exce��o: O m�todo min() da Fila de Prioridade: " + e);
					}
					continue;
				case 8:
					System.out.println("\n O m�todo insert(k, v) insere em P a chave k com o valor x e retorna a entrada armazenada; \n"
							+ "uma condi��o de erro ocorre se k � inv�lido (isto �, k n�o pode ser comparado como outras chaves);");
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
						System.out.println("Exce��o: O m�todo insert(k, v) da Fila de Prioridade: " + e);
					}
					continue;					
				case 10:
					System.out.println("\n  O m�todo removeMin() remove de P e retorna uma entrada com a menor chave; \n"
							+ "uma condi��o de erro");
					continue;
				case 11:
					try {
						System.out.println(fila.removeMin());
						}
					catch (Exception e) {
						System.out.println("Exce��o: m�todo removeMin() da Fila de Prioridade: " + e);
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
		System.out.println("� Digite '2' para entender o m�todo size()");
		System.out.println("� Digite '3' para executar o m�todo size()");
		System.out.println("� Digite '4' para entender o m�todo isEmpty()");
		System.out.println("� Digite '5' para executar o m�todo isEmpty()");
		System.out.println("� Digite '6' para entender o m�todo min()");
		System.out.println("� Digite '7' para executar o m�todo min()");
		System.out.println("� Digite '8' para entender o m�todo insert(k, x)");
		System.out.println("� Digite '9' para executar o m�todo insert(k, x)");
		System.out.println("� Digite '10' para entender o m�todo removeMin()");
		System.out.println("� Digite '11' para executar o m�todo removeMin()");
		System.out.println("==============================================================");
	}
}
