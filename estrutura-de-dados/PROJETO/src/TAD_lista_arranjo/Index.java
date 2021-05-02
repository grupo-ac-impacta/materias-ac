package TAD_lista_arranjo;

import java.util.Scanner;

public class Index {
	
	public void init() {
		Scanner s = new Scanner(System.in);
		Integer optionSelected = -1;
		ArrayIndexList<Integer> A = new ArrayIndexList<Integer>();
		
		while(optionSelected != 0) {
			listOptions();
			optionSelected = s.nextInt();
			
			switch (optionSelected) {
				case 0:
					break;
				case 1:
					System.out.println("Para adicionar utilize o método Add()");
					continue;
				case 2:
					System.out.println("Digite o índice");
					Integer i = s.nextInt();
					System.out.println("Digite o valor");
					Integer v = s.nextInt();
					A.add(i, v);
					System.out.println(A.toString());
					continue;
				default:
					System.out.println("Valor inválido");
					continue;
			}
		}
	}
	
	public static void listOptions() {
		System.out.println("==================== Lista de Arranjo =====================");
		System.out.println("Digite '0' para voltar");
		System.out.println("Digite '1' para entender o método Add()");
		System.out.println("Digite '2' para executar o método Add()");
		System.out.println("==============================================================");
	}
}
