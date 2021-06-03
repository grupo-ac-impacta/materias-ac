package TAD_Arvore_Generica;

import java.util.Scanner;

public class Index {

	
	public void init() {
		
		Scanner s = new Scanner(System.in);
		Integer optionSelected = -1;

		while (optionSelected != 0) {
			listOptions();

			System.out.println("Digite: ");
			optionSelected = s.nextInt();

			switch (optionSelected) {
			case 0:
				break;
			case 1:
				System.out.println("\n Uma �rvore � um TAD que armazena elementos de maneira\r\n"
						+ "hier�rquica. \n "
						+ "\n Exceto o topo, seus elementos t�m um pai e zero ou mais elementos\r\n"
						+ "filhos. \n "
						+ "Para instancia-la, basta executar: \n "
						+ "LinkedTree<E> tree = new LinkedTree<E>(); \n "
						+ "\n O par�metro E passado para a classe simboliza o tipos dos Valores que ser�o inseridos na �rvore bin�ria. \n "
						+ "Durante nossos exemplos, utilizamos E como Integer. \n");
				continue;
			case 2:
				System.out.println("\n O m�todo root() Retorna a raiz da �rvore; um erro ocorre se a �rvore est� vazia.");
				continue;
			case 3:
				System.out.println("\n O m�todo parent(v) Retorna o nodo pai de v; ocorre um erro se v for a raiz.");
				continue;
			case 4:
				System.out.println("\n O m�todo children(v) Retorna uma cole��o iter�vel contendo os filhos do nodo v.");
				continue;
			case 5:
				System.out.println("\n O m�todo isInternal(v) Testa se um nodo v � interno.");
				continue;
			case 6:
				System.out.println("\n O m�todo isExternal(v) Testa se um nodo v � externo.");
				continue;
			case 7:
				System.out.println("\n O m�todo isRoot(v): Testa se um nodo v � a raiz.");
				continue;
			case 8:
				System.out.println("\n O m�todo size() Retorna o n�mero de nodos na �rvore.");
				continue;
			case 9:
				System.out.println("\n O m�todo isEmpty() Testa se a �rvore tem ou n�o tem algum nodo.");
				continue;
			case 10:
				System.out.println("\n O m�todo replace(v, e) Retorna o elemento armazenado em v e o substitui por e.");
				continue;
			case 11:
				System.out.println("\n O m�todo iterator() Retorna um iterador de todos os elementos armazenados nos nodos da �rvore.");
				continue;
			default:
				System.out.println("Valor inv�lido");
				continue;
			}
		}
	}


	public static void listOptions() {
		System.out.println("====================== �rvore Gen�rica =======================");
		System.out.println("� Digite '0' para voltar");
		System.out.println("� Digite '1' para entender a estrutrura de dados �rvore Gen�rica");
		System.out.println("� Digite '2' para entender o m�todo root()");
		System.out.println("� Digite '3' para entender o m�todo parent(v)");
		System.out.println("� Digite '4' para entender o m�todo children(v:");
		System.out.println("� Digite '5' para entender o m�todo isInternal(v)");;
		System.out.println("� Digite '6' para entender o m�todo isExternal(v)");
		System.out.println("� Digite '7' para entender o m�todo isRoot(v)");
		System.out.println("� Digite '8' para entender o m�todo size()");
		System.out.println("� Digite '9' para entender o m�todo isEmpty()");
		System.out.println("� Digite '10' para entender o m�todo replace(v, e)");
		System.out.println("� Digite '11' para entender o m�todo iterator()");
		System.out.println("==============================================================");
	}

}

