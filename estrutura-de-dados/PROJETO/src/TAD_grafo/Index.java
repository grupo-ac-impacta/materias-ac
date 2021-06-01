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
					System.out.println(" A estrutura de dados Grafo � uma forma de representar relacionamentos que existem\r\n "
							+ "entre pares de objetos, chamados de v�rtices, juntamente com uma\r\n "
							+ "cole��o de conex�es entre pares de v�rtices. Dessa forma, conseguimos criar relacionamentos parecidos\r\n "
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
					System.out.println("O m�todo vertices() retorna uma cole��o iter�vel de todos os v�rtices do grafo.");
					continue;
				case 3:
					System.out.println("O m�todo edges() retorna uma cole��o iter�vel de todas as arestas do grafo.");
					continue;
				case 4:
					System.out.println("O m�todo incidentsEdges(v) retorna uma cole��o das arestas incidentes sob o nodo v.");
					continue;
				case 5:
					System.out.println("O m�dodo opposite(v,e) retorna o nodo final da aresta e oposto ao nodo v; um erro ocorre se e n�o � incidente a v.");
					continue;
				case 6:
					System.out.println("O m�dodo endVertices(e) retorna um arranjo armazenando os v�rtices finais da aresta e.");
					continue;
				case 7:
					System.out.println("O m�dodo areAdjacent(v,w) testa se os v�rtices v e w s�o adjacentes.");
					continue;
				case 8:
					System.out.println("O m�dodo replace(v,x) substitui o elemento armazenado no nodo v com x.");
					continue;
				case 9:
					System.out.println("O m�dodo replace(e, x) substitui o elemento armazenado na aresta e com x.");
					continue;
				case 10:
					System.out.println("O m�dodo insertVertex(x) insere e retorna um novo nodo armazenando o elemento x.");
					continue;
				case 11:
					System.out.println("O m�dodo insertEdge(v,w,x) insere e retorna uma nova aresta n�o dirigida (v, w) e armazena o elemento x.");
					continue;
				case 12:
					System.out.println("O m�dodo removeVertex(v) remove o v�rtice v e todas as arestas incidentes e retorna o elemento armazenado em v.");
					continue;
				case 13:
					System.out.println("O m�dodo removeEdge(e) remove a aresta e e retorna o elemento armazenado em e.");
					continue;
				default:
					System.out.println("Valor inv�lido");
					continue;
			}
		}
	}

	public static void listOptions() {
		System.out.println("==================== Grafos =====================");
		System.out.println("� Digite '0' para sair");
		System.out.println("� Digite '1' para entender a estrutura de dados Grafos");
		System.out.println("� Digite '2' para entender o m�todo vertices()");
		System.out.println("� Digite '3' para entender o m�todo edges()");
		System.out.println("� Digite '4' para entender o m�todo incidentsEdges(v)");
		System.out.println("� Digite '5' para entender o m�todo opposite(v, e)");
		System.out.println("� Digite '6' para entender o m�todo endVertices(e)");
		System.out.println("� Digite '7' para entender o m�todo areAdjacent(v,w):");
		System.out.println("� Digite '8' para entender o m�todo replace(v,x)");
		System.out.println("� Digite '9' para entender o m�todoreplace(e, x)");
		System.out.println("� Digite '10' para entender o m�todo insertVertex(x)");
		System.out.println("� Digite '11' para entender o m�todo insertEdge(v,w,x)");
		System.out.println("� Digite '12' para entender o m�todo removeVertex(v)");
		System.out.println("� Digite '13' para entender o m�todo removeEdge(e)");
		System.out.println("==============================================================");
	}
}