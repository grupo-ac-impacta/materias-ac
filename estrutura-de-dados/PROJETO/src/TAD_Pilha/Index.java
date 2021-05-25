package TAD_Pilha;

import java.util.Scanner;

import TAD_Pilha.source.NodeStack;

public class Index {
	
	public void init() {
		Scanner s = new Scanner(System.in);
		Integer optionSelected = -1;
		Integer E;
		
		NodeStack<Integer> a = new NodeStack<Integer>();
		
		while(optionSelected != 0) {
			listOptions();
			
			System.out.println("Digite: ");
			optionSelected = s.nextInt();
			
			switch (optionSelected) {
				case 0:
					break;
				case 1:
					System.out.println("\n Uma pilha(stack) é uma estrutura de dados do tipo LIFO (last-in first-out)\n "
									+ "onde o último elemento a ser inserido, será o primeiro a ser retirado.\n "
									+ "\n Assim, uma pilha permite acesso a apenas um item de dados - o último inserido\n"
									+" Para processar o penúltimo item inserido, deve-se remover o último.\n"
									+ " Para instancia-lo, basta executar: \n "
									+ "NodeStack<E> pilha = new NodeStack<E>(); \n "
									+ "\n O parâmetro E passado para a classe simboliza o tipo do elemento que será armazenado. \n "
									+ "Durante nossos exemplos, utilizamos E como Integer. \n");
					continue;
				case 2:
					System.out.println("\n O método size retornará um inteiro indicando tamanho da pilha \n ");
					continue;
				case 3:
					try {
						System.out.println(a.size());
					} catch (Exception e) {
						System.out.println("Exceção: método Size da pilha: " + e);
					}
					continue;
				case 4:
					System.out.println("\n O método isEmpty retornará um valor booleano, True se a pilha é vazia \n"
							+"\n e False se a listá não é vazia");
					continue;
				case 5:
					try {
						System.out.println(a.isEmpty());
					} catch (Exception e) {
						System.out.println("Exceção: método isEmpty da pilha: " + e);
					}
					continue;
				case 6:
					System.out.println("\n O método push(E) cria e encadeia um novo elemento na pilha. \n "
							+ "O método não tem retorno. Para verificar se foi inserido utilize o método top ");
					continue;
				case 7:
					try {
						System.out.println("Digite o elemento que deseja encadear");
						E = s.nextInt();
						a.push(E);					
					} catch (Exception e) {
						System.out.println("Exceção: método Push da pilha: " + e);
					}
					continue;
				case 8:
					System.out.println("\n O método Top retorna o elemento no topo da pilha. \n");
					continue;
				case 9:
					try {
						System.out.println(a.top());					
					} catch (Exception e) {
						System.out.println("Exceção: método Top da pilha: " + e);
					}
					continue;
				case 10:
					System.out.println("\n O método pop remove o elemento no topo da pilha. \n");
					continue;
				case 11:
					try {
						System.out.println("O elemento: " + a.pop() + " foi removido.");				
					} catch (Exception e) {
						System.out.println("Exceção: método Pop da pilha: " + e);
					}
					continue;
				case 12:
					System.out.println("\n O método toString retorna a pilha em formato de texto . \n");
					continue;
				case 13:
					try {
						System.out.println(a.toString());				
					} catch (Exception e) {
						System.out.println("Exceção: método toString da pilha: " + e);
					}
					continue;
				default:
					System.out.println("Valor inválido");
					continue;
			}
		}
		s.close();
	}
	
	public static void listOptions() {
		System.out.println("=========================== Pilha ============================");
		System.out.println("• Digite '0' para voltar");
		System.out.println("• Digite '1' para entender a estrutura de dados Pilha");
		System.out.println("• Digite '2' para entender o método size()");
		System.out.println("• Digite '3' para executar o método size()");
		System.out.println("• Digite '4' para entender o método isEmpty()");
		System.out.println("• Digite '5' para executar o método isEmpty()");
		System.out.println("• Digite '6' para entender o método push(E)");
		System.out.println("• Digite '7' para executar o método push(E)");
		System.out.println("• Digite '8' para entender o método top()");
		System.out.println("• Digite '9' para executar o método top()");
		System.out.println("• Digite '10' para entender o método pop()");
		System.out.println("• Digite '11' para executar o método pop()");
		System.out.println("• Digite '12' para entender o método toString()");
		System.out.println("• Digite '13' para executar o método toString()");
		System.out.println("==============================================================");
	}
}
