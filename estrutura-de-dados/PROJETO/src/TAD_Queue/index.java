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
					System.out.println("\n Filas - Queue. São estruturas de dados do tipo FIFO (first-in first-out)\n "
									+ "onde o primeiro elemento a ser inserido, será o primeiro a ser retirado.\n "
									+ "\n ou seja, adiciona-se itens no fim e remove-se do início.\n"
									+ " Para instancia-lo, basta executar: \n "
									+ "ArrayQueue<Integer> fila = new ArrayQueue<Integer>(); \n "
									+ "\n O parâmetro E passado para a classe simboliza o tipo do elemento que será armazenado. \n "
									+ "Durante nossos exemplos, utilizamos E como Integer. \n");
					continue;
				case 2:
					System.out.println("\n O método size retornará um inteiro indicando tamanho da fila \n ");
					continue;
				case 3:
					try {
						System.out.println(a.size());
					} catch (Exception e) {
						System.out.println("Exceção: método Size da fila: " + e);
					}
					continue;
				case 4:
					System.out.println("\n O método isEmpty retornará um valor booleano, True se a fila é vazia \n"
							+"\n e False se a fila não é vazia");
					continue;
				case 5:
					try {
						System.out.println(a.isEmpty());
					} catch (Exception e) {
						System.out.println("Exceção: método isEmpty da fila: " + e);
					}
					continue;
				case 6:
					System.out.println("\n O método Front retorna o elemento na frente da fila \n ");
					continue;
				case 7:
					try {
						System.out.println(a.front());	
					} catch (Exception e) {
						System.out.println("Exceção: método Front da fila: " + e);
					}
					continue;
				case 8:
					System.out.println("\n O método enqueue(E) adiciona o elemento na frente da fila. \n"
							+"No qual E é o elemento a ser adicionado.");
					continue;
				case 9:
					try {
						System.out.println("Digite o elemento que deseja inserir");
						E = s.nextInt();
						a.enqueue(E);					
					} catch (Exception e) {
						System.out.println("Exceção: método Enqueue da fila: " + e);
					}
					continue;
				case 10:
					System.out.println("\n O método dequeue remove o elemento da frente da fila. \n");
					continue;
				case 11:
					try {
						System.out.println("O elemento: " + a.dequeue() + " foi removido.");				
					} catch (Exception e) {
						System.out.println("Exceção: método Dequeue da fila: " + e);
					}
					continue;
				default:
					System.out.println("Valor inválido");
					continue;
			}
		}
	}
	
	public static void listOptions() {
		System.out.println("============================ Fila =============================");
		System.out.println("• Digite '0' para voltar");
		System.out.println("• Digite '1' para entender a estrutura de dados Fila");
		System.out.println("• Digite '2' para entender o método size()");
		System.out.println("• Digite '3' para executar o método size()");
		System.out.println("• Digite '4' para entender o método isEmpty()");
		System.out.println("• Digite '5' para executar o método isEmpty()");
		System.out.println("• Digite '6' para entender o método front()");
		System.out.println("• Digite '7' para executar o método front()");
		System.out.println("• Digite '8' para entender o método enqueue(E)");
		System.out.println("• Digite '9' para executar o método enqueue(E)");
		System.out.println("• Digite '10' para entender o método dequeue():");
		System.out.println("• Digite '11' para executar o método dequeue():");
		System.out.println("==============================================================");
	}
}

