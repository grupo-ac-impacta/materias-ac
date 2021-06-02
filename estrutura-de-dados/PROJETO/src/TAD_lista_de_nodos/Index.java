package TAD_lista_de_nodos;

import java.util.Scanner;

import TAD_lista_de_nodos.source.NodePositionList;
import interfaces.Position;

public class Index {
	NodePositionList<Integer> lista = null;
	Position<Integer> current = null;
	Position<Integer> prev = null;
	Position<Integer> next = null;
	
	public Index() {
		this.lista = new NodePositionList();
	}
	
	public void init() {
		Scanner s = new Scanner(System.in);
		Integer optionSelected = -1;
		Position<Integer> position;
		Integer v;
		
		while(optionSelected != 0) {
			listOptions();
			
			System.out.println("Digite: ");
			optionSelected = s.nextInt();
			
			switch (optionSelected) {
				case 0:
					break;
				case 1:				
					System.out.println("\n Uma lista de nodos � uma cole��o S de N elementos\n "
									+ "armazenados em uma certa ordem linear, de maneira que � poss�vel\n "
									+ "e referir aos elementos de S como 1�, 2�, 3� e assim por diante.\n "
									+ "\n Para instancia-lo, basta executar: \n "
									+ "NodePositionList<E> lista = new NodePositionList(); \n "
									+ "\n O par�metro E passado para a classe simboliza o tipo do elemento que ser� armazenado. \n "
									+ "Durante nossos exemplos, utilizamos E como Integer. \n");
					continue;
				case 2:
					System.out.println("\n O m�todo size() retorna o tamanho da lista. ");
					continue;
				case 3:
					try {
						System.out.println(lista.size());
					} catch (Exception e) {
						System.out.println("Exce��o: m�todo size da Lista de Nodos: " + e);
					}
					continue;
				case 4:
					System.out.println("\n O m�todo isEmpty() retorna se lista est� ou n�o vazia.");
					continue;
				case 5:
					try {
						System.out.println(lista.isEmpty());
					} catch (Exception e) {
						System.out.println("Exce��o: m�todo isEmpty da Lista de Nodos: " + e);
					}
					continue;
				case 6:
					System.out.println("\n O m�todo first retorna a posi��o do primeiro elemento da lista. \n"
							+ "Ocorre um erro se a lista estiver vazia. \n ");
					continue;
				case 7:
					try {
						System.out.println(lista.first().element());
					} catch (Exception e) {
						System.out.println("Exce��o: m�todo first da Lista de Nodos: " + e);
					}
					continue;
				case 8:
					System.out.println("\n O m�todo last retorna a posi��o do �ltimo elemento da lista. \n"
							+ "Ocorre um erro se a lista estiver vazia.");
					continue;
				case 9:
					try {
						System.out.println(lista.last().element());
					} catch (Exception e) {
						System.out.println("Exce��o: m�todo last da Lista de Nodos: " + e);
					}
					continue;
				case 10:
					System.out.println("O m�todo prev retorna a posi��o do elemento que precede o que se encontra na posi��o p. \n"
							+ "Ocorre um erro se p for a primeira posi��o.");
					continue;
				case 13:
					try {
						position = selectElement();
						System.out.println(lista.next(position).element());
					} catch (Exception e) {
						System.out.println("Exce��o: m�todo next da Lista de Nodos: " + e);
					}
					continue;
				case 12:
					System.out.println("O m�todo next retorna a posi��o do elemento que segue o que se encontra na posi��o p. \n"
							+ "Ocorre um erro se p for a �ltima posi��o.");
					continue;
				case 15:
					try {
						position = selectElement();
						System.out.println("Digite o valor: ");
						v = s.nextInt();
						System.out.println(lista.set(position, v));
					} catch (Exception e) {
						System.out.println("Exce��o: m�todo set da Lista de Nodos: " + e);
					}
					continue;
				case 14:
					System.out.println("\n O m�todo set substitui o elemento que se encontra na posi��o p por e \n"
							+ "retornando o elemento que se encontrava antes na posi��o p.");
					continue;
				case 17:
					try {
						System.out.println("Digite o valor: ");
						v = s.nextInt();
						lista.addFirst(v);
					} catch (Exception e) {
						System.out.println("Exce��o: m�todo addFirst da Lista de Nodos: " + e);
					}
					continue;
				case 16:
					System.out.println("\n O m�todo addFirst insere o novo elemento e como o primeiro elemento da lista.");
					continue;
				case 19:
					try {
						System.out.println("Digite o valor: ");
						v = s.nextInt();
						lista.addLast(v);
					} catch (Exception e) {
						System.out.println("Exce��o: m�todo addLast da Lista de Nodos: " + e);
					}
					continue;
				case 18:
					System.out.println("\n O m�todo addLast Insere o novo elemento e como �ltimo elemento da lista.");
					continue;
				case 21:
					try {
						position = selectElement();
						System.out.println("Digite o valor: ");
						v = s.nextInt();
						lista.addBefore(position, v);
					} catch (Exception e) {
						System.out.println("Exce��o: m�todo addBefore da Lista de Nodos: " + e);
					}
					continue;
				case 20:
					System.out.println("\n O m�todo addBefore insere um novo elemento e antes da posi��o p.");
					continue;
				case 23:
					try {
						position = selectElement();
						System.out.println("Digite o valor: ");
						v = s.nextInt();
						lista.addAfter(position, v);
					} catch (Exception e) {
						System.out.println("Exce��o: m�todo addAfter da Lista de Nodos: " + e);
					}
					continue;
				case 22:
					System.out.println("\n O m�todo addAfter insere um novo elemento e depois da posi��o p.");
					continue;
				case 11:
					try {
						position = selectElement();
						System.out.println(lista.prev(position).element());						
					} catch (Exception e) {
						System.out.println("Exce��o: m�todo prev da Lista de Nodos: " + e);
					}
					continue;
				case 24:
					System.out.println("\n O m�todo remove, remove e retorna o elemento na posi��o p da lista, invalidando esta posi��o.");
					continue;
				case 25:
					try {
						position = selectElement();
						System.out.println(lista.remove(position));						
					} catch (Exception e) {
						System.out.println("Exce��o: m�todo remove da Lista de Arranjo: " + e);
					}
					continue;
				default:
					System.out.println("Valor inv�lido");
					continue;
			}
		}
	}
	
	public static void listOptions() {

		System.out.println("==================== Lista de Nodos =====================");
		System.out.println("� Digite '0' para voltar");
		System.out.println("� Digite '1' para entender a estrutura de dados Lista de Nodos");
		System.out.println("� Digite '2' para entender o m�todo size()");
		System.out.println("� Digite '3' para executar o m�todo size()");
		System.out.println("� Digite '4' para entender o m�todo isEmpty()");
		System.out.println("� Digite '5' para executar o m�todo isEmpty()");
		System.out.println("� Digite '6' para entender o m�todo first()");
		System.out.println("� Digite '7' para executar o m�todo first()");
		System.out.println("� Digite '8' para entender o m�todo last()");
		System.out.println("� Digite '9' para executar o m�todo last()");
		System.out.println("� Digite '10' para entender o m�todo prev(p)");
		System.out.println("� Digite '11' para executar o m�todo prev(p)");
		System.out.println("� Digite '12' para entender o m�todo next(p)");
		System.out.println("� Digite '13' para executar o m�todo next(p)");
		System.out.println("� Digite '14' para entender o m�todo set(p, e)");
		System.out.println("� Digite '15' para executar o m�todo set(p, e)");
		System.out.println("� Digite '16' para entender o m�todo addFirst(e)");
		System.out.println("� Digite '17' para executar o m�todo addFirst(e)");
		System.out.println("� Digite '18' para entender o m�todo addLast(e)");
		System.out.println("� Digite '19' para executar o m�todo addLast(e)");
		System.out.println("� Digite '20' para entender o m�todo addBefore(e)");
		System.out.println("� Digite '21' para executar o m�todo addBefore(e)");
		System.out.println("� Digite '22' para entender o m�todo addAfter(e)");
		System.out.println("� Digite '23' para executar o m�todo addAfter(e)");
		System.out.println("� Digite '24' para entender o m�todo remove(p)");
		System.out.println("� Digite '25' para executar o m�todo remove(p)");
		System.out.println("==============================================================");
	}
	
	public Position<Integer> selectElement() {
        this.current = this.lista.size() > 0 ? this.lista.first() : null;
        this.next = this.lista.size() >= 2 ? this.lista.next(this.current) : null;
        this.prev = null;

        Scanner s = new Scanner(System.in);
        Integer optionSelected = -1;

        listElements();
        listOptions();

        while (optionSelected != 0) {

            System.out.println("Digite: ");
            optionSelected = s.nextInt();

            switch (optionSelected) {
            case 0:
                break;
            case 1: // Ir para o anterior
                try {
                    this.next = this.current; 
                    this.current = this.lista.prev(this.current);
                    this.prev = this.lista.first() == this.current ? null : this.lista.prev(this.current);

                    listElements();
                    listOptions();
                } catch (Exception e) {
                    System.out.println("N�o existe o elemento anterior");
                }
                continue;
            case 2: // Ir para o pr�ximo
                try {
                    this.prev = this.current;
                    this.current = this.lista.next(this.current);
                    this.next = this.lista.last() == this.current ? null : this.lista.next(this.current);

                    listElements();
                    listOptions();
                } catch (Exception e) {
                    System.out.println("N�o existe o pr�ximo elemento");
                }
                continue;
            default:
                System.out.println("Valor inv�lido");
                continue;
            }
        }

        return this.current;
    }
	
	public void subListOptions() {
		System.out.println("� Digite '0' para selecionar o elemento corrente");
		System.out.println("� Digite '1' para ir para o elemento anterior");
		System.out.println("� Digite '2' para ir para o pr�ximo elemento");
	}
	
	public void listElements() {
        System.out.println("� Elemento atual: " 
                            + (this.current != null ? this.current.element() : "null")
                            + (this.current == this.lista.first() ? " (primeiro)" : "")
                            );
        System.out.println("� Elemento anterior: " 
                            + (this.prev != null ? this.prev.element() : "null")
                            + (this.prev == this.lista.first() ? " (primeiro)" : "")
                            );
        System.out.println("� Pr�ximo elemento: " 
                            + (this.next != null ? this.next.element() : "null")
                            + (this.next == this.lista.first() ? " (primeiro)" : "")
                            + "\n");
    }

}

	
