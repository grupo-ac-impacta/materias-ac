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
					System.out.println("\n Uma lista de nodos é uma coleção S de N elementos\n "
									+ "armazenados em uma certa ordem linear, de maneira que é possível\n "
									+ "e referir aos elementos de S como 1º, 2º, 3º e assim por diante.\n "
									+ "\n Para instancia-lo, basta executar: \n "
									+ "NodePositionList<E> lista = new NodePositionList(); \n "
									+ "\n O parâmetro E passado para a classe simboliza o tipo do elemento que será armazenado. \n "
									+ "Durante nossos exemplos, utilizamos E como Integer. \n");
					continue;
				case 2:
					System.out.println("\n O método size() retorna o tamanho da lista. ");
					continue;
				case 3:
					try {
						System.out.println(lista.size());
					} catch (Exception e) {
						System.out.println("Exceção: método size da Lista de Nodos: " + e);
					}
					continue;
				case 4:
					System.out.println("\n O método isEmpty() retorna se lista está ou não vazia.");
					continue;
				case 5:
					try {
						System.out.println(lista.isEmpty());
					} catch (Exception e) {
						System.out.println("Exceção: método isEmpty da Lista de Nodos: " + e);
					}
					continue;
				case 6:
					System.out.println("\n O método first retorna a posição do primeiro elemento da lista. \n"
							+ "Ocorre um erro se a lista estiver vazia. \n ");
					continue;
				case 7:
					try {
						System.out.println(lista.first().element());
					} catch (Exception e) {
						System.out.println("Exceção: método first da Lista de Nodos: " + e);
					}
					continue;
				case 8:
					System.out.println("\n O método last retorna a posição do último elemento da lista. \n"
							+ "Ocorre um erro se a lista estiver vazia.");
					continue;
				case 9:
					try {
						System.out.println(lista.last().element());
					} catch (Exception e) {
						System.out.println("Exceção: método last da Lista de Nodos: " + e);
					}
					continue;
				case 10:
					System.out.println("O método prev retorna a posição do elemento que precede o que se encontra na posição p. \n"
							+ "Ocorre um erro se p for a primeira posição.");
					continue;
				case 13:
					try {
						position = selectElement();
						System.out.println(lista.next(position).element());
					} catch (Exception e) {
						System.out.println("Exceção: método next da Lista de Nodos: " + e);
					}
					continue;
				case 12:
					System.out.println("O método next retorna a posição do elemento que segue o que se encontra na posição p. \n"
							+ "Ocorre um erro se p for a última posição.");
					continue;
				case 15:
					try {
						position = selectElement();
						System.out.println("Digite o valor: ");
						v = s.nextInt();
						System.out.println(lista.set(position, v));
					} catch (Exception e) {
						System.out.println("Exceção: método set da Lista de Nodos: " + e);
					}
					continue;
				case 14:
					System.out.println("\n O método set substitui o elemento que se encontra na posição p por e \n"
							+ "retornando o elemento que se encontrava antes na posição p.");
					continue;
				case 17:
					try {
						System.out.println("Digite o valor: ");
						v = s.nextInt();
						lista.addFirst(v);
					} catch (Exception e) {
						System.out.println("Exceção: método addFirst da Lista de Nodos: " + e);
					}
					continue;
				case 16:
					System.out.println("\n O método addFirst insere o novo elemento e como o primeiro elemento da lista.");
					continue;
				case 19:
					try {
						System.out.println("Digite o valor: ");
						v = s.nextInt();
						lista.addLast(v);
					} catch (Exception e) {
						System.out.println("Exceção: método addLast da Lista de Nodos: " + e);
					}
					continue;
				case 18:
					System.out.println("\n O método addLast Insere o novo elemento e como último elemento da lista.");
					continue;
				case 21:
					try {
						position = selectElement();
						System.out.println("Digite o valor: ");
						v = s.nextInt();
						lista.addBefore(position, v);
					} catch (Exception e) {
						System.out.println("Exceção: método addBefore da Lista de Nodos: " + e);
					}
					continue;
				case 20:
					System.out.println("\n O método addBefore insere um novo elemento e antes da posição p.");
					continue;
				case 23:
					try {
						position = selectElement();
						System.out.println("Digite o valor: ");
						v = s.nextInt();
						lista.addAfter(position, v);
					} catch (Exception e) {
						System.out.println("Exceção: método addAfter da Lista de Nodos: " + e);
					}
					continue;
				case 22:
					System.out.println("\n O método addAfter insere um novo elemento e depois da posição p.");
					continue;
				case 11:
					try {
						position = selectElement();
						System.out.println(lista.prev(position).element());						
					} catch (Exception e) {
						System.out.println("Exceção: método prev da Lista de Nodos: " + e);
					}
					continue;
				case 24:
					System.out.println("\n O método remove, remove e retorna o elemento na posição p da lista, invalidando esta posição.");
					continue;
				case 25:
					try {
						position = selectElement();
						System.out.println(lista.remove(position));						
					} catch (Exception e) {
						System.out.println("Exceção: método remove da Lista de Arranjo: " + e);
					}
					continue;
				default:
					System.out.println("Valor inválido");
					continue;
			}
		}
	}
	
	public static void listOptions() {

		System.out.println("==================== Lista de Nodos =====================");
		System.out.println("• Digite '0' para voltar");
		System.out.println("• Digite '1' para entender a estrutura de dados Lista de Nodos");
		System.out.println("• Digite '2' para entender o método size()");
		System.out.println("• Digite '3' para executar o método size()");
		System.out.println("• Digite '4' para entender o método isEmpty()");
		System.out.println("• Digite '5' para executar o método isEmpty()");
		System.out.println("• Digite '6' para entender o método first()");
		System.out.println("• Digite '7' para executar o método first()");
		System.out.println("• Digite '8' para entender o método last()");
		System.out.println("• Digite '9' para executar o método last()");
		System.out.println("• Digite '10' para entender o método prev(p)");
		System.out.println("• Digite '11' para executar o método prev(p)");
		System.out.println("• Digite '12' para entender o método next(p)");
		System.out.println("• Digite '13' para executar o método next(p)");
		System.out.println("• Digite '14' para entender o método set(p, e)");
		System.out.println("• Digite '15' para executar o método set(p, e)");
		System.out.println("• Digite '16' para entender o método addFirst(e)");
		System.out.println("• Digite '17' para executar o método addFirst(e)");
		System.out.println("• Digite '18' para entender o método addLast(e)");
		System.out.println("• Digite '19' para executar o método addLast(e)");
		System.out.println("• Digite '20' para entender o método addBefore(e)");
		System.out.println("• Digite '21' para executar o método addBefore(e)");
		System.out.println("• Digite '22' para entender o método addAfter(e)");
		System.out.println("• Digite '23' para executar o método addAfter(e)");
		System.out.println("• Digite '24' para entender o método remove(p)");
		System.out.println("• Digite '25' para executar o método remove(p)");
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
                    System.out.println("Não existe o elemento anterior");
                }
                continue;
            case 2: // Ir para o próximo
                try {
                    this.prev = this.current;
                    this.current = this.lista.next(this.current);
                    this.next = this.lista.last() == this.current ? null : this.lista.next(this.current);

                    listElements();
                    listOptions();
                } catch (Exception e) {
                    System.out.println("Não existe o próximo elemento");
                }
                continue;
            default:
                System.out.println("Valor inválido");
                continue;
            }
        }

        return this.current;
    }
	
	public void subListOptions() {
		System.out.println("• Digite '0' para selecionar o elemento corrente");
		System.out.println("• Digite '1' para ir para o elemento anterior");
		System.out.println("• Digite '2' para ir para o próximo elemento");
	}
	
	public void listElements() {
        System.out.println("• Elemento atual: " 
                            + (this.current != null ? this.current.element() : "null")
                            + (this.current == this.lista.first() ? " (primeiro)" : "")
                            );
        System.out.println("• Elemento anterior: " 
                            + (this.prev != null ? this.prev.element() : "null")
                            + (this.prev == this.lista.first() ? " (primeiro)" : "")
                            );
        System.out.println("• Próximo elemento: " 
                            + (this.next != null ? this.next.element() : "null")
                            + (this.next == this.lista.first() ? " (primeiro)" : "")
                            + "\n");
    }

}

	
