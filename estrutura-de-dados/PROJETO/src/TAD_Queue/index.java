package TAD_Queue;

import java.util.Scanner;

import TAD_Queue.source.ArrayQueue;

public class index {
	
	public void init() {
		Scanner s = new Scanner(System.in);
		Integer optionSelected = -1;
		Integer E;
		ArrayQueue<Integer> a = new ArrayQueue<Integer>();
		while(optionSelected != 0) {
			listOptions();
			
			System.out.println("Digite: ");
			optionSelected = s.nextInt();
			
			switch (optionSelected) {
				case 0:
					break;
				case 1:
					System.out.println("\n Filas - Queue. S�o estruturas de dados do tipo FIFO (first-in first-out)\n "
									+ "onde o primeiro elemento a ser inserido, ser� o primeiro a ser retirado.\n "
									+ "\n ou seja, adiciona-se itens no fim e remove-se do in�cio.\n"
									+ " Para instancia-lo, basta executar: \n "
									+ "ArrayQueue<Integer> fila = new ArrayQueue<Integer>(); \n "
									+ "\n O par�metro E passado para a classe simboliza o tipo do elemento que ser� armazenado. \n "
									+ "Durante nossos exemplos, utilizamos E como Integer. \n");
					continue;
				case 2:
					System.out.println("\n O m�todo size retornar� um inteiro indicando tamanho da fila \n ");
					continue;
				case 3:
					try {
						System.out.println(a.size());
					} catch (Exception e) {
						System.out.println("Exce��o: m�todo Size da fila: " + e);
					}
					continue;
				case 4:
					System.out.println("\n O m�todo isEmpty retornar� um valor booleano, True se a fila � vazia \n"
							+"\n e False se a fila n�o � vazia");
					continue;
				case 5:
					try {
						System.out.println(a.isEmpty());
					} catch (Exception e) {
						System.out.println("Exce��o: m�todo isEmpty da fila: " + e);
					}
					continue;
				case 6:
					System.out.println("\n O m�todo Front retorna o elemento na frente da fila \n ");
					continue;
				case 7:
					try {
						System.out.println(a.front());	
					} catch (Exception e) {
						System.out.println("Exce��o: m�todo Front da fila: " + e);
					}
					continue;
				case 8:
					System.out.println("\n O m�todo enqueue(E) adiciona o elemento na frente da fila. \n"
							+"No qual E � o elemento a ser adicionado.");
					continue;
				case 9:
					try {
						System.out.println("Digite o elemento que deseja inserir");
						E = s.nextInt();
						a.enqueue(E);					
					} catch (Exception e) {
						System.out.println("Exce��o: m�todo Enqueue da fila: " + e);
					}
					continue;
				case 10:
					System.out.println("\n O m�todo dequeue remove o elemento da frente da fila. \n");
					continue;
				case 11:
					try {
						System.out.println("O elemento: " + a.dequeue() + " foi removido.");				
					} catch (Exception e) {
						System.out.println("Exce��o: m�todo Dequeue da fila: " + e);
					}
					continue;
				default:
					System.out.println("Valor inv�lido");
					continue;
			}
		}
	}
	
	public static void listOptions() {
		System.out.println("============================ Fila =============================");
		System.out.println("� Digite '0' para voltar");
		System.out.println("� Digite '1' para entender a estrutura de dados Fila");
		System.out.println("� Digite '2' para entender o m�todo size()");
		System.out.println("� Digite '3' para executar o m�todo size()");
		System.out.println("� Digite '4' para entender o m�todo isEmpty()");
		System.out.println("� Digite '5' para executar o m�todo isEmpty()");
		System.out.println("� Digite '6' para entender o m�todo front()");
		System.out.println("� Digite '7' para executar o m�todo front()");
		System.out.println("� Digite '8' para entender o m�todo enqueue(E)");
		System.out.println("� Digite '9' para executar o m�todo enqueue(E)");
		System.out.println("� Digite '10' para entender o m�todo dequeue():");
		System.out.println("� Digite '11' para executar o m�todo dequeue():");
		System.out.println("==============================================================");
	}
}

