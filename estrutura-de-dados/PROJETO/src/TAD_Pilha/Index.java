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
					System.out.println("\n Uma pilha(stack) � uma estrutura de dados do tipo LIFO (last-in first-out)\n "
									+ "onde o �ltimo elemento a ser inserido, ser� o primeiro a ser retirado.\n "
									+ "\n Assim, uma pilha permite acesso a apenas um item de dados - o �ltimo inserido\n"
									+" Para processar o pen�ltimo item inserido, deve-se remover o �ltimo.\n"
									+ " Para instancia-lo, basta executar: \n "
									+ "NodeStack<E> pilha = new NodeStack<E>(); \n "
									+ "\n O par�metro E passado para a classe simboliza o tipo do elemento que ser� armazenado. \n "
									+ "Durante nossos exemplos, utilizamos E como Integer. \n");
					continue;
				case 2:
					System.out.println("\n O m�todo size retornar� um inteiro indicando tamanho da pilha \n ");
					continue;
				case 3:
					try {
						System.out.println(a.size());
					} catch (Exception e) {
						System.out.println("Exce��o: m�todo Size da pilha: " + e);
					}
					continue;
				case 4:
					System.out.println("\n O m�todo isEmpty retornar� um valor booleano, True se a pilha � vazia \n"
							+"\n e False se a list� n�o � vazia");
					continue;
				case 5:
					try {
						System.out.println(a.isEmpty());
					} catch (Exception e) {
						System.out.println("Exce��o: m�todo isEmpty da pilha: " + e);
					}
					continue;
				case 6:
					System.out.println("\n O m�todo push(E) cria e encadeia um novo elemento na pilha. \n "
							+ "O m�todo n�o tem retorno. Para verificar se foi inserido utilize o m�todo top ");
					continue;
				case 7:
					try {
						System.out.println("Digite o elemento que deseja encadear");
						E = s.nextInt();
						a.push(E);					
					} catch (Exception e) {
						System.out.println("Exce��o: m�todo Push da pilha: " + e);
					}
					continue;
				case 8:
					System.out.println("\n O m�todo Top retorna o elemento no topo da pilha. \n");
					continue;
				case 9:
					try {
						System.out.println(a.top());					
					} catch (Exception e) {
						System.out.println("Exce��o: m�todo Top da pilha: " + e);
					}
					continue;
				case 10:
					System.out.println("\n O m�todo pop remove o elemento no topo da pilha. \n");
					continue;
				case 11:
					try {
						System.out.println("O elemento: " + a.pop() + " foi removido.");				
					} catch (Exception e) {
						System.out.println("Exce��o: m�todo Pop da pilha: " + e);
					}
					continue;
				case 12:
					System.out.println("\n O m�todo toString retorna a pilha em formato de texto . \n");
					continue;
				case 13:
					try {
						System.out.println(a.toString());				
					} catch (Exception e) {
						System.out.println("Exce��o: m�todo toString da pilha: " + e);
					}
					continue;
				default:
					System.out.println("Valor inv�lido");
					continue;
			}
		}
		s.close();
	}
	
	public static void listOptions() {
		System.out.println("=========================== Pilha ============================");
		System.out.println("� Digite '0' para voltar");
		System.out.println("� Digite '1' para entender a estrutura de dados Pilha");
		System.out.println("� Digite '2' para entender o m�todo size()");
		System.out.println("� Digite '3' para executar o m�todo size()");
		System.out.println("� Digite '4' para entender o m�todo isEmpty()");
		System.out.println("� Digite '5' para executar o m�todo isEmpty()");
		System.out.println("� Digite '6' para entender o m�todo push(E)");
		System.out.println("� Digite '7' para executar o m�todo push(E)");
		System.out.println("� Digite '8' para entender o m�todo top()");
		System.out.println("� Digite '9' para executar o m�todo top()");
		System.out.println("� Digite '10' para entender o m�todo pop()");
		System.out.println("� Digite '11' para executar o m�todo pop()");
		System.out.println("� Digite '12' para entender o m�todo toString()");
		System.out.println("� Digite '13' para executar o m�todo toString()");
		System.out.println("==============================================================");
	}
}
