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
				System.out.println("\n O TAD �rvore Bin�ria � uma estrutura de dados que conseguimos armazenar \n "
						+ "valores de forma que o elemento armazendo aponta para filhos, com isso conseguimos extrair maior \n "
						+ "desempenho para armazenar e resgatar dados. \n "
						+ "Nesse modelo de �rvore, cada ra�z (como � chamado cada elemento com filhos) dever� sempre ter dois elementos filho. \n "
						+ "Sendo assim, ao inserirmos os elementos na seguindo ordem 1: raiz da �rvore (r), 2: filho esquerdo de 1 (e), 3: filho \n "
						+ "direito de 1 (d). A �rvore obtida no final ser� como essa: \n \n "
						+ "   1 r \n "
						+ "   /\\ \n "
						+ "e 2  3 d\n \n "
						+ "Para instancia-la, basta executar: \n "
						+ "LinkedBinaryTree<E> tree = new LinkedBinaryTree<E>(); \n "
						+ "\n O par�metro E passado para a classe simboliza o tipos dos Valores que ser�o inseridos na �rvore bin�ria. \n "
						+ "Durante nossos exemplos, utilizamos E como Integer. \n");
				continue;
			case 2:
				System.out.println("\n O m�todo addRoot(v) � utilizado para adicionar valor a ra�z �rvore bin�ria. \n "
						+ "Neste exemplo utilizaremos o valor como Integer. \n "
						+ "Considerando uma �rvore bin�ria *tree*, a chamada do m�todo ficar� assim: tree.addRoot(5). \n "
						+ "O m�todo retornar� o elemento inserido ap�s a execu��o. \n "
						+ "Caso a ra�z j� est� preenchida retornar� uma exce��o");
				continue;
			case 3:
				try {
					System.out.println("Digite o valor: ");
					v = s.nextInt();
					System.out.println(this.tree.addRoot(v).element());
				} catch (Exception e) {
					System.out.println("Exce��o: m�todo addRoot da �rvore bin�ria: " + e);
				}
				continue;
			case 4:
				System.out.println("\n O m�todo insertLeft(e, v) � utilizado para adicionar valores a esquerda de um \n "
						+ "determinado elemento da �rvore bin�ria. \n "
						+ "� necess�rio informar uma elemento seguido de um valor. \n "
						+ "Neste exemplo utilizaremos o valor como Integer. \n "
						+ "Considerando uma �rvore bin�ria *tree*, a chamada do m�todo ficar� assim: tree.insertLeft(e, 5). \n "
						+ "O m�todo retornar� o elemento inserido ap�s a execu��o. \n");
				continue;
			case 5:
				try {
					element = findElementBinaryTree();
					System.out.println("Digite o valor: ");
					v = s.nextInt();
					System.out.println(this.tree.insertLeft(element, v).element());
				} catch (Exception e) {
					System.out.println("Exce��o: m�todo insertLeft da �rvore bin�ria: " + e);
				}
				continue;
			case 6:
				System.out.println("\n O m�todo insertRight(e, v) � utilizado para adicionar valores a direita de um \n "
						+ "determinado elemento da �rvore bin�ria. \n "
						+ "� necess�rio informar uma elemento seguido de um valor. \n "
						+ "Neste exemplo utilizaremos o valor como Integer. \n "
						+ "Considerando uma �rvore bin�ria *tree*, a chamada do m�todo ficar� assim: tree.insertRight(e, 5). \n "
						+ "O m�todo retornar� o elemento inserido ap�s a execu��o. \n");
				continue;
			case 7:
				try {
					element = findElementBinaryTree();
					System.out.println("Digite o valor: ");
					v = s.nextInt();
					System.out.println(this.tree.insertRight(element, v).element());
				} catch (Exception e) {
					System.out.println("Exce��o: m�todo insertRight da �rvore bin�ria: " + e);
				}
				continue;
			case 8:
				System.out.println("\n O m�todo remove(e) � utilizado para remover um \n "
						+ "determinado elemento da �rvore bin�ria. \n "
						+ "� necess�rio informar uma elemento. \n "
						+ "Ao remover o elemento, o mesmo ser� substitu�do por seu filho. \n "
						+ "Considerando uma �rvore bin�ria *tree*, a chamada do m�todo ficar� assim: tree.remove(e). \n "
						+ "O m�todo retornar� o valor armazenado ap�s a remo��o. Caso tenha dois filho, ser� retornado uma exce��o \n");
				continue;
			case 9:
				try {
					element = findElementBinaryTree();
					System.out.println(this.tree.remove(element));
				} catch (Exception e) {
					System.out.println("Exce��o: m�todo remove da �rvore bin�ria: " + e);
				}
				continue;
			case 10:
				System.out.println("\n O m�todo attach(e, t1, t2) � utilizado para anexar t1 e t2 como filhos esquerdo\n "
						+ "e direito, respectivamente do elemento e de uma �rvore bin�ria . \n"
						+ "� necess�rio informar uma elemento e dois valores. \n "
						+ "Considerando uma �rvore bin�ria *tree*, a chamada do m�todo ficar� assim: tree.attach(e, 5, 4). \n "
						+ "O m�todo n�o tem retorno. Caso o elemento e n�o seja externo ser� retornado uma exce��o \n");
				continue;
			case 11:
				try {
//					element = findElementBinaryTree();
					
//					this.tree.attach(element, T1, T2);
				} catch (Exception e) {
					System.out.println("Exce��o: m�todo attach da �rvore bin�ria: " + e);
				}
				continue;
			case 12:
				System.out.println("\n O m�todo hasLeft(e) � utilizado identificar se um dado elemento de uma �rvore bin�ria "
						+ "tem filho esquerdo\n "
						+ "� necess�rio informar uma elemento. \n "
						+ "Considerando uma �rvore bin�ria *tree*, a chamada do m�todo ficar� assim: tree.hasLeft(e). \n "
						+ "O m�todo retornar� um booleano. Caso o elemento seja inv�lido ser� retornado uma exce��o \n");
				continue;
			case 13:
				try {
					element = findElementBinaryTree();
					
					System.out.println(this.tree.hasLeft(element));
				} catch (Exception e) {
					System.out.println("Exce��o: m�todo hasLeft da �rvore bin�ria: " + e);
				}
				continue;
			case 14:
				System.out.println("\n O m�todo hasRight(e) � utilizado identificar se um dado elemento de uma �rvore bin�ria "
						+ "tem filho direito\n "
						+ "� necess�rio informar uma elemento. \n "
						+ "Considerando uma �rvore bin�ria *tree*, a chamada do m�todo ficar� assim: tree.hasRight(e). \n "
						+ "O m�todo retornar� um booleano. Caso o elemento seja inv�lido ser� retornado uma exce��o \n");
				continue;
			case 15:
				try {
					element = findElementBinaryTree();
					
					System.out.println(this.tree.hasRight(element));
				} catch (Exception e) {
					System.out.println("Exce��o: m�todo hasRight da �rvore bin�ria: " + e);
				}
				continue;
			case 16:
				System.out.println("\n O m�todo isExternal(e) � utilizado identificar se um dado elemento de uma �rvore bin�ria "
						+ "tem filhos, ou seja, � externo ou n�o\n "
						+ "� necess�rio informar uma elemento. \n "
						+ "Considerando uma �rvore bin�ria *tree*, a chamada do m�todo ficar� assim: tree.isExternal(e). \n "
						+ "O m�todo retornar� um booleano. Caso o elemento seja inv�lido ser� retornado uma exce��o \n");
				continue;
			case 17:
				try {
					element = findElementBinaryTree();
					
					System.out.println(this.tree.isExternal(element));
				} catch (Exception e) {
					System.out.println("Exce��o: m�todo isExternal da �rvore bin�ria: " + e);
				}
				continue;
			case 18:
				System.out.println("\n O m�todo isInternal(e) � utilizado identificar se um dado elemento de uma �rvore bin�ria "
						+ "n�o tem filhos, ou seja, � interno ou n�o\n "
						+ "� necess�rio informar uma elemento. \n "
						+ "Considerando uma �rvore bin�ria *tree*, a chamada do m�todo ficar� assim: tree.isInternal(e). \n "
						+ "O m�todo retornar� um booleano. Caso o elemento seja inv�lido ser� retornado uma exce��o \n");
				continue;
			case 19:
				try {
					element = findElementBinaryTree();
					
					System.out.println(this.tree.isInternal(element));
				} catch (Exception e) {
					System.out.println("Exce��o: m�todo isInternal da �rvore bin�ria: " + e);
				}
				continue;
			case 20:
				System.out.println("\n O m�todo isEmpty() � utilizado identificar se uma �rvore bin�ria est� vazia\n "
						+ "Considerando uma �rvore bin�ria *tree*, a chamada do m�todo ficar� assim: tree.isEmpty(). \n "
						+ "O m�todo retornar� um booleano. \n");
				continue;
			case 21:
				try {
					System.out.println(this.tree.isEmpty());
				} catch (Exception e) {
					System.out.println("Exce��o: m�todo isEmpty da �rvore bin�ria: " + e);
				}
				continue;
			case 22:
				System.out.println("\n O m�todo positions() � utilizado para resgatar todos os elementos uma �rvore bin�ria\n "
						+ "Considerando uma �rvore bin�ria *tree*, a chamada do m�todo ficar� assim: tree.positions(). \n "
						+ "O m�todo retornar� um iterator. \n");
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
					System.out.println("Exce��o: m�todo positions da �rvore bin�ria: " + e);
				}
				continue;	
			default:
				System.out.println("Valor inv�lido");
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
					System.out.println(" O elemento atual n�o possui filho esquerdo");
				}
				
				printElements();
				continue;
			case 2:
				if(this.tree.hasRight(this.currentElement)) {
					this.parentElement = this.currentElement;
					this.currentElement = this.rightChild;
					getChilden(this.currentElement);
				} else {
					System.out.println(" O elemento atual n�o possui filho esquerdo");
				}
				
				printElements();
				continue;
			case 3:
				try {
					this.parentElement = this.currentElement;
					this.currentElement = this.tree.parent(this.currentElement);
					getChilden(this.currentElement);
				} catch (Exception e) {
					System.out.println(" O elemento atual � a ra�z");
				}
				
				printElements();
				continue;
			default:
				System.out.println("Valor inv�lido");
				continue;
			}
		}
		
		this.parentElement = null;
		this.leftChild = null;
		this.rightChild = null;
		return currentElement;
	}
	
	public String isRoot(Position<Integer> el) {
		return this.tree.isRoot(el) ? " (ra�z)" : "";
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
		System.out.println("====================== �rvore Gen�rica =======================");
		System.out.println("� Digite '0' para voltar");
		System.out.println("� Digite '1' para entender a estrutrura de dados �rvore Gen�rica");
		System.out.println("� Digite '2' para entender o m�todo root()");
		System.out.println("� Digite '3' para executar o m�todo root()");
		System.out.println("� Digite '4' para entender o m�todo parent(v)");
		System.out.println("� Digite '5' para executar o m�todo parent(v)");
		System.out.println("� Digite '6' para entender o m�todo children(v:");
		System.out.println("� Digite '7' para executar o m�todo children(v)");
		System.out.println("� Digite '8' para entender o m�todo isInternal(v)");
		System.out.println("� Digite '9' para executar o m�todo isInternal(v)");
		System.out.println("� Digite '10' para entender o m�todo isExternal(v)");
		System.out.println("� Digite '11' para executar o m�todo isExternal(v)");
		System.out.println("� Digite '12' para entender o m�todo isRoot(v)");
		System.out.println("� Digite '13' para executar o m�todo isRoot(v)");
		System.out.println("� Digite '14' para entender o m�todo size()");
		System.out.println("� Digite '15' para executar o m�todo size()");
		System.out.println("� Digite '16' para entender o m�todo isEmpty()");
		System.out.println("� Digite '17' para executar o m�todo isEmpty()");
		System.out.println("� Digite '18' para entender o m�todo replace(v, e)");
		System.out.println("� Digite '19' para executar o m�todo replace(v, e)");
		System.out.println("� Digite '20' para entender o m�todo isEmpty()");
		System.out.println("� Digite '21' para executar o m�todo isEmpty()");
		System.out.println("� Digite '22' para entender o m�todo iterator()");
		System.out.println("� Digite '23' para executar o m�todo iterator()");
		System.out.println("==============================================================");
	}
	
	public static void listOptionsSelectElement() {
		System.out.println("========== �rvore Bin�ria - Sele��o de elemento ===============");
		System.out.println("� Digite '0' para selecionar o elemento atual");
		System.out.println("� Digite '1' para ir para o filho esquerdo do elemento atual");
		System.out.println("� Digite '2' para ir para o filho direito do elemento atual");
		System.out.println("� Digite '3' para ir para o pai do elemento atual");

		System.out.println("==============================================================");
	}
}

