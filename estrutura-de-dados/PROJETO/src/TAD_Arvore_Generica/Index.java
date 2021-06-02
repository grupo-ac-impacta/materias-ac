package TAD_Arvore_Generica;

import java.util.Map;
import java.util.Scanner;

import TAD_Arvore_Generica.source.LinkedTree;
import interfaces.Position;
import interfaces.BTPosition;
import interfaces.BinaryTree;

public class Index {
	private Position<Integer> parentElement = null;
	private Position<Integer> currentElement = null;
	private Position<Integer> leftChild = null;
	private Position<Integer> rightChild = null;
	private LinkedTree<Integer> tree = null;
	
	public Index() {
		this.tree = new LinkedTree<Integer>();
	}
	
	public void init() {
		
		Scanner s = new Scanner(System.in);
		Integer optionSelected = -1;
		Integer v;
		Position<Integer> element = null;

		while (optionSelected != 0) {
			listOptions();

			System.out.println("Digite: ");
			optionSelected = s.nextInt();

			switch (optionSelected) {
			case 0:
				break;
			case 1:
				System.out.println("\n O TAD Árvore Binária é uma estrutura de dados que conseguimos armazenar \n "
						+ "valores de forma que o elemento armazendo aponta para filhos, com isso conseguimos extrair maior \n "
						+ "desempenho para armazenar e resgatar dados. \n "
						+ "Nesse modelo de árvore, cada raíz (como é chamado cada elemento com filhos) deverá sempre ter dois elementos filho. \n "
						+ "Sendo assim, ao inserirmos os elementos na seguindo ordem 1: raiz da árvore (r), 2: filho esquerdo de 1 (e), 3: filho \n "
						+ "direito de 1 (d). A árvore obtida no final será como essa: \n \n "
						+ "   1 r \n "
						+ "   /\\ \n "
						+ "e 2  3 d\n \n "
						+ "Para instancia-la, basta executar: \n "
						+ "LinkedBinaryTree<E> tree = new LinkedBinaryTree<E>(); \n "
						+ "\n O parâmetro E passado para a classe simboliza o tipos dos Valores que serão inseridos na árvore binária. \n "
						+ "Durante nossos exemplos, utilizamos E como Integer. \n");
				continue;
			case 2:
				System.out.println("\n O método addRoot(v) é utilizado para adicionar valor a raíz árvore binária. \n "
						+ "Neste exemplo utilizaremos o valor como Integer. \n "
						+ "Considerando uma árvore binária *tree*, a chamada do método ficará assim: tree.addRoot(5). \n "
						+ "O método retornará o elemento inserido após a execução. \n "
						+ "Caso a raíz já está preenchida retornará uma exceção");
				continue;
			case 3:
				try {
					System.out.println("Digite o valor: ");
					v = s.nextInt();
					System.out.println(this.tree.addRoot(v).element());
				} catch (Exception e) {
					System.out.println("Exceção: método addRoot da árvore binária: " + e);
				}
				continue;
			case 4:
				System.out.println("\n O método insertLeft(e, v) é utilizado para adicionar valores a esquerda de um \n "
						+ "determinado elemento da árvore binária. \n "
						+ "É necessário informar uma elemento seguido de um valor. \n "
						+ "Neste exemplo utilizaremos o valor como Integer. \n "
						+ "Considerando uma árvore binária *tree*, a chamada do método ficará assim: tree.insertLeft(e, 5). \n "
						+ "O método retornará o elemento inserido após a execução. \n");
				continue;
			case 5:
				try {
					element = findElementBinaryTree();
					System.out.println("Digite o valor: ");
					v = s.nextInt();
					System.out.println(this.tree.insertLeft(element, v).element());
				} catch (Exception e) {
					System.out.println("Exceção: método insertLeft da árvore binária: " + e);
				}
				continue;
			case 6:
				System.out.println("\n O método insertRight(e, v) é utilizado para adicionar valores a direita de um \n "
						+ "determinado elemento da árvore binária. \n "
						+ "É necessário informar uma elemento seguido de um valor. \n "
						+ "Neste exemplo utilizaremos o valor como Integer. \n "
						+ "Considerando uma árvore binária *tree*, a chamada do método ficará assim: tree.insertRight(e, 5). \n "
						+ "O método retornará o elemento inserido após a execução. \n");
				continue;
			case 7:
				try {
					element = findElementBinaryTree();
					System.out.println("Digite o valor: ");
					v = s.nextInt();
					System.out.println(this.tree.insertRight(element, v).element());
				} catch (Exception e) {
					System.out.println("Exceção: método insertRight da árvore binária: " + e);
				}
				continue;
			case 8:
				System.out.println("\n O método remove(e) é utilizado para remover um \n "
						+ "determinado elemento da árvore binária. \n "
						+ "É necessário informar uma elemento. \n "
						+ "Ao remover o elemento, o mesmo será substituído por seu filho. \n "
						+ "Considerando uma árvore binária *tree*, a chamada do método ficará assim: tree.remove(e). \n "
						+ "O método retornará o valor armazenado após a remoção. Caso tenha dois filho, será retornado uma exceção \n");
				continue;
			case 9:
				try {
					element = findElementBinaryTree();
					System.out.println(this.tree.remove(element));
				} catch (Exception e) {
					System.out.println("Exceção: método remove da árvore binária: " + e);
				}
				continue;
			case 10:
				System.out.println("\n O método attach(e, t1, t2) é utilizado para anexar t1 e t2 como filhos esquerdo\n "
						+ "e direito, respectivamente do elemento e de uma árvore binária . \n"
						+ "É necessário informar uma elemento e dois valores. \n "
						+ "Considerando uma árvore binária *tree*, a chamada do método ficará assim: tree.attach(e, 5, 4). \n "
						+ "O método não tem retorno. Caso o elemento e não seja externo será retornado uma exceção \n");
				continue;
			case 11:
				try {
//					element = findElementBinaryTree();
					
//					this.tree.attach(element, T1, T2);
				} catch (Exception e) {
					System.out.println("Exceção: método attach da árvore binária: " + e);
				}
				continue;
			case 12:
				System.out.println("\n O método hasLeft(e) é utilizado identificar se um dado elemento de uma árvore binária "
						+ "tem filho esquerdo\n "
						+ "É necessário informar uma elemento. \n "
						+ "Considerando uma árvore binária *tree*, a chamada do método ficará assim: tree.hasLeft(e). \n "
						+ "O método retornará um booleano. Caso o elemento seja inválido será retornado uma exceção \n");
				continue;
			case 13:
				try {
					element = findElementBinaryTree();
					
					System.out.println(this.tree.hasLeft(element));
				} catch (Exception e) {
					System.out.println("Exceção: método hasLeft da árvore binária: " + e);
				}
				continue;
			case 14:
				System.out.println("\n O método hasRight(e) é utilizado identificar se um dado elemento de uma árvore binária "
						+ "tem filho direito\n "
						+ "É necessário informar uma elemento. \n "
						+ "Considerando uma árvore binária *tree*, a chamada do método ficará assim: tree.hasRight(e). \n "
						+ "O método retornará um booleano. Caso o elemento seja inválido será retornado uma exceção \n");
				continue;
			case 15:
				try {
					element = findElementBinaryTree();
					
					System.out.println(this.tree.hasRight(element));
				} catch (Exception e) {
					System.out.println("Exceção: método hasRight da árvore binária: " + e);
				}
				continue;
			case 16:
				System.out.println("\n O método isExternal(e) é utilizado identificar se um dado elemento de uma árvore binária "
						+ "tem filhos, ou seja, é externo ou não\n "
						+ "É necessário informar uma elemento. \n "
						+ "Considerando uma árvore binária *tree*, a chamada do método ficará assim: tree.isExternal(e). \n "
						+ "O método retornará um booleano. Caso o elemento seja inválido será retornado uma exceção \n");
				continue;
			case 17:
				try {
					element = findElementBinaryTree();
					
					System.out.println(this.tree.isExternal(element));
				} catch (Exception e) {
					System.out.println("Exceção: método isExternal da árvore binária: " + e);
				}
				continue;
			case 18:
				System.out.println("\n O método isInternal(e) é utilizado identificar se um dado elemento de uma árvore binária "
						+ "não tem filhos, ou seja, é interno ou não\n "
						+ "É necessário informar uma elemento. \n "
						+ "Considerando uma árvore binária *tree*, a chamada do método ficará assim: tree.isInternal(e). \n "
						+ "O método retornará um booleano. Caso o elemento seja inválido será retornado uma exceção \n");
				continue;
			case 19:
				try {
					element = findElementBinaryTree();
					
					System.out.println(this.tree.isInternal(element));
				} catch (Exception e) {
					System.out.println("Exceção: método isInternal da árvore binária: " + e);
				}
				continue;
			case 20:
				System.out.println("\n O método isEmpty() é utilizado identificar se uma árvore binária está vazia\n "
						+ "Considerando uma árvore binária *tree*, a chamada do método ficará assim: tree.isEmpty(). \n "
						+ "O método retornará um booleano. \n");
				continue;
			case 21:
				try {
					System.out.println(this.tree.isEmpty());
				} catch (Exception e) {
					System.out.println("Exceção: método isEmpty da árvore binária: " + e);
				}
				continue;
			case 22:
				System.out.println("\n O método positions() é utilizado para resgatar todos os elementos uma árvore binária\n "
						+ "Considerando uma árvore binária *tree*, a chamada do método ficará assim: tree.positions(). \n "
						+ "O método retornará um iterator. \n");
				continue;
			case 23:
				try {
					Iterable<Position<Integer>> position = this.tree.positions();
					String rs = "[";
					
					for (Position<Integer> p : position) {
						rs += p.element() + ", ";
					}
					
					System.out.println(rs.substring(0, rs.length() - 2) + "]");
				} catch (Exception e) {
					System.out.println("Exceção: método positions da árvore binária: " + e);
				}
				continue;	
			default:
				System.out.println("Valor inválido");
				continue;
			}
		}
	}

	private Position<Integer> findElementBinaryTree() {
		this.currentElement = this.tree.root();
		getChilden(currentElement);
		
		printElements();
		
		Scanner s = new Scanner(System.in);
		Integer optionSelected = -1;
		
		while (optionSelected != 0) {
			listOptionsSelectElement();

			System.out.println("Digite: ");
			optionSelected = s.nextInt();

			switch (optionSelected) {
			case 0:
				break;
			case 1:
				if(this.tree.hasLeft(this.currentElement)) {
					this.parentElement = this.currentElement;
					this.currentElement = this.leftChild;
					getChilden(this.currentElement);
				} else {
					System.out.println(" O elemento atual não possui filho esquerdo");
				}
				
				printElements();
				continue;
			case 2:
				if(this.tree.hasRight(this.currentElement)) {
					this.parentElement = this.currentElement;
					this.currentElement = this.rightChild;
					getChilden(this.currentElement);
				} else {
					System.out.println(" O elemento atual não possui filho esquerdo");
				}
				
				printElements();
				continue;
			case 3:
				try {
					this.parentElement = this.currentElement;
					this.currentElement = this.tree.parent(this.currentElement);
					getChilden(this.currentElement);
				} catch (Exception e) {
					System.out.println(" O elemento atual é a raíz");
				}
				
				printElements();
				continue;
			default:
				System.out.println("Valor inválido");
				continue;
			}
		}
		
		this.parentElement = null;
		this.leftChild = null;
		this.rightChild = null;
		return currentElement;
	}
	
	public String isRoot(Position<Integer> el) {
		return this.tree.isRoot(el) ? " (raíz)" : "";
	}
	
	public void printElements() {
		System.out.println("\n Elemento pai: " 
				+ (this.parentElement != null ? this.parentElement.element() : "null")
				+ (this.parentElement != null ? this.isRoot(this.parentElement) : "")
		);
		System.out.println(" Elemento atual: " 
				+ (this.currentElement != null ? this.currentElement.element() : "null") 
				+ (this.currentElement != null ? this.isRoot(this.currentElement) : "")
		);
		System.out.println(" Filho esquerdo: " + (this.leftChild != null ? this.leftChild.element() : "null"));
		System.out.println(" Filho direito: " + (this.rightChild != null ? this.rightChild.element() : "null") + " \n");
	}
	
	public void getChilden(Position<Integer> element) {
		this.leftChild = this.tree.hasLeft(element) ? this.tree.left(element) : null;
		this.rightChild = this.tree.hasRight(element) ? this.tree.right(element) : null;
	}

	public static void listOptions() {
		System.out.println("====================== Árvore Genérica =======================");
		System.out.println("• Digite '0' para voltar");
		System.out.println("• Digite '1' para entender a estrutrura de dados Árvore Genérica");
		System.out.println("• Digite '2' para entender o método root()");
		System.out.println("• Digite '3' para executar o método root()");
		System.out.println("• Digite '4' para entender o método parent(v)");
		System.out.println("• Digite '5' para executar o método parent(v)");
		System.out.println("• Digite '6' para entender o método children(v:");
		System.out.println("• Digite '7' para executar o método children(v)");
		System.out.println("• Digite '8' para entender o método isInternal(v)");
		System.out.println("• Digite '9' para executar o método isInternal(v)");
		System.out.println("• Digite '10' para entender o método isExternal(v)");
		System.out.println("• Digite '11' para executar o método isExternal(v)");
		System.out.println("• Digite '12' para entender o método isRoot(v)");
		System.out.println("• Digite '13' para executar o método isRoot(v)");
		System.out.println("• Digite '14' para entender o método size()");
		System.out.println("• Digite '15' para executar o método size()");
		System.out.println("• Digite '16' para entender o método isEmpty()");
		System.out.println("• Digite '17' para executar o método isEmpty()");
		System.out.println("• Digite '18' para entender o método replace(v, e)");
		System.out.println("• Digite '19' para executar o método replace(v, e)");
		System.out.println("• Digite '20' para entender o método isEmpty()");
		System.out.println("• Digite '21' para executar o método isEmpty()");
		System.out.println("• Digite '22' para entender o método iterator()");
		System.out.println("• Digite '23' para executar o método iterator()");
		System.out.println("==============================================================");
	}
	
	public static void listOptionsSelectElement() {
		System.out.println("========== Árvore Binária - Seleção de elemento ===============");
		System.out.println("• Digite '0' para selecionar o elemento atual");
		System.out.println("• Digite '1' para ir para o filho esquerdo do elemento atual");
		System.out.println("• Digite '2' para ir para o filho direito do elemento atual");
		System.out.println("• Digite '3' para ir para o pai do elemento atual");

		System.out.println("==============================================================");
	}
}

