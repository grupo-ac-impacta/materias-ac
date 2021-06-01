package TAD_grafo;

import java.util.Scanner;

public class Index {

	public void init() {
		Scanner s = new Scanner(System.in);
		Integer optionSelected = -1;

		while(optionSelected != 0) {
			listOptions();
			
			System.out.println("Digite: ");
			optionSelected = s.nextInt();

			switch (optionSelected) {
				case 0:
				break;
				case 1:
					System.out.println(" A estrutura de dados Grafo é uma forma de representar relacionamentos que existem\r\n "
							+ "entre pares de objetos, chamados de vértices, juntamente com uma\r\n "
							+ "coleção de conexões entre pares de vértices. Dessa forma, conseguimos criar relacionamentos parecidos\r\n "
							+ "com os apresentados em bando de dados SQL (N..1, N..N) \n "
							+ "\n "
							+ "Considerando que os elementos B, C e D tenham relacionamento com o elemento A. \n "
							+ "Esse relacionamento usando grafo ficaria desta forma: \n "
							+ "\n"
							+ " B -- A -- C \n"
							+ "      | \n"
							+ "      D \n");
					continue;
				case 2:
					System.out.println("O método vertices() retorna uma coleção iterável de todos os vértices do grafo.");
					continue;
				case 3:
					System.out.println("O método edges() retorna uma coleção iterável de todas as arestas do grafo.");
					continue;
				case 4:
					System.out.println("O método incidentsEdges(v) retorna uma coleção das arestas incidentes sob o nodo v.");
					continue;
				case 5:
					System.out.println("O médodo opposite(v,e) retorna o nodo final da aresta e oposto ao nodo v; um erro ocorre se e não é incidente a v.");
					continue;
				case 6:
					System.out.println("O médodo endVertices(e) retorna um arranjo armazenando os vértices finais da aresta e.");
					continue;
				case 7:
					System.out.println("O médodo areAdjacent(v,w) testa se os vértices v e w são adjacentes.");
					continue;
				case 8:
					System.out.println("O médodo replace(v,x) substitui o elemento armazenado no nodo v com x.");
					continue;
				case 9:
					System.out.println("O médodo replace(e, x) substitui o elemento armazenado na aresta e com x.");
					continue;
				case 10:
					System.out.println("O médodo insertVertex(x) insere e retorna um novo nodo armazenando o elemento x.");
					continue;
				case 11:
					System.out.println("O médodo insertEdge(v,w,x) insere e retorna uma nova aresta não dirigida (v, w) e armazena o elemento x.");
					continue;
				case 12:
					System.out.println("O médodo removeVertex(v) remove o vértice v e todas as arestas incidentes e retorna o elemento armazenado em v.");
					continue;
				case 13:
					System.out.println("O médodo removeEdge(e) remove a aresta e e retorna o elemento armazenado em e.");
					continue;
				default:
					System.out.println("Valor inválido");
					continue;
			}
		}
	}

	public static void listOptions() {
		System.out.println("==================== Grafos =====================");
		System.out.println("• Digite '0' para sair");
		System.out.println("• Digite '1' para entender a estrutura de dados Grafos");
		System.out.println("• Digite '2' para entender o método vertices()");
		System.out.println("• Digite '3' para entender o método edges()");
		System.out.println("• Digite '4' para entender o método incidentsEdges(v)");
		System.out.println("• Digite '5' para entender o método opposite(v, e)");
		System.out.println("• Digite '6' para entender o método endVertices(e)");
		System.out.println("• Digite '7' para entender o método areAdjacent(v,w):");
		System.out.println("• Digite '8' para entender o método replace(v,x)");
		System.out.println("• Digite '9' para entender o métodoreplace(e, x)");
		System.out.println("• Digite '10' para entender o método insertVertex(x)");
		System.out.println("• Digite '11' para entender o método insertEdge(v,w,x)");
		System.out.println("• Digite '12' para entender o método removeVertex(v)");
		System.out.println("• Digite '13' para entender o método removeEdge(e)");
		System.out.println("==============================================================");
	}
}