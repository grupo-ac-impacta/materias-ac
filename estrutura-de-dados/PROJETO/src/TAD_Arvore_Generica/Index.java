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
				System.out.println("\n Uma árvore é um TAD que armazena elementos de maneira\r\n"
						+ "hierárquica. \n "
						+ "\n Exceto o topo, seus elementos têm um pai e zero ou mais elementos\r\n"
						+ "filhos. \n "
						+ "Para instancia-la, basta executar: \n "
						+ "LinkedTree<E> tree = new LinkedTree<E>(); \n "
						+ "\n O parâmetro E passado para a classe simboliza o tipos dos Valores que serão inseridos na árvore binária. \n "
						+ "Durante nossos exemplos, utilizamos E como Integer. \n");
				continue;
			case 2:
				System.out.println("\n O método root() Retorna a raiz da árvore; um erro ocorre se a árvore está vazia.");
				continue;
			case 3:
				System.out.println("\n O método parent(v) Retorna o nodo pai de v; ocorre um erro se v for a raiz.");
				continue;
			case 4:
				System.out.println("\n O método children(v) Retorna uma coleção iterável contendo os filhos do nodo v.");
				continue;
			case 5:
				System.out.println("\n O método isInternal(v) Testa se um nodo v é interno.");
				continue;
			case 6:
				System.out.println("\n O método isExternal(v) Testa se um nodo v é externo.");
				continue;
			case 7:
				System.out.println("\n O método isRoot(v): Testa se um nodo v é a raiz.");
				continue;
			case 8:
				System.out.println("\n O método size() Retorna o número de nodos na árvore.");
				continue;
			case 9:
				System.out.println("\n O método isEmpty() Testa se a árvore tem ou não tem algum nodo.");
				continue;
			case 10:
				System.out.println("\n O método replace(v, e) Retorna o elemento armazenado em v e o substitui por e.");
				continue;
			case 11:
				System.out.println("\n O método iterator() Retorna um iterador de todos os elementos armazenados nos nodos da árvore.");
				continue;
			default:
				System.out.println("Valor inválido");
				continue;
			}
		}
	}


	public static void listOptions() {
		System.out.println("====================== Árvore Genérica =======================");
		System.out.println("• Digite '0' para voltar");
		System.out.println("• Digite '1' para entender a estrutrura de dados Árvore Genérica");
		System.out.println("• Digite '2' para entender o método root()");
		System.out.println("• Digite '3' para entender o método parent(v)");
		System.out.println("• Digite '4' para entender o método children(v:");
		System.out.println("• Digite '5' para entender o método isInternal(v)");;
		System.out.println("• Digite '6' para entender o método isExternal(v)");
		System.out.println("• Digite '7' para entender o método isRoot(v)");
		System.out.println("• Digite '8' para entender o método size()");
		System.out.println("• Digite '9' para entender o método isEmpty()");
		System.out.println("• Digite '10' para entender o método replace(v, e)");
		System.out.println("• Digite '11' para entender o método iterator()");
		System.out.println("==============================================================");
	}

}

