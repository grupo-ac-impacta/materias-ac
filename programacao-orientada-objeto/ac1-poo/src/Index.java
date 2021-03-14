/**
 * Leandro Damasceno de Lima | RA: 1902792
 * Luiz Henrique de Oliveira Contri | RA: 1903312
 * Danyllo Henrique Verri Santana | RA: 1601298
 * Matheus Nascimento Rodrigues | RA: 1902805
 * 
 */
package POO;

import java.util.Scanner;

public class Main {
	// Metodo que inicializa a matriz
	public static char[][] initialize() {
		char[][] board = { { 'F', 'F', 'F' }, { 'F', 'F', 'F' }, { 'F', 'F', 'F' } };

		return board;
	}

	// Método que valida uma dada posição dentro da matriz
	public static boolean step(char M[][], int lin, int col, char gamer) {
		if (M[lin][col] == 'F') {
			M[lin][col] = gamer;
			return true;
		}
		return false;

	}

	// Metodo que recebe a matriz do jogo da velha e retorna um código indicando o
	// estado do jogo
	public static int status(char M[][]) {
		final int[][][] patterns = {
				// COLUNAS
				{ { 0, 0 }, { 1, 0 }, { 2, 0 } }, { { 0, 1 }, { 1, 1 }, { 2, 1 } }, { { 0, 2 }, { 1, 2 }, { 2, 2 } },

				// LINHAS
				{ { 0, 0 }, { 0, 1 }, { 0, 2 } }, { { 1, 0 }, { 1, 1 }, { 1, 2 } }, { { 2, 0 }, { 2, 1 }, { 2, 2 } },

				// DIAGONAIS
				{ { 0, 0 }, { 1, 1 }, { 2, 2 } }, { { 2, 0 }, { 1, 1 }, { 0, 2 } } };

		int winner = 0;
		for (int[][] pattern : patterns) {
			char p1 = M[pattern[0][0]][pattern[0][1]];
			char p2 = M[pattern[1][0]][pattern[1][1]];
			char p3 = M[pattern[2][0]][pattern[2][1]];

			if (p1 == p2 && p1 == p3 && p1 == 'O' && winner == 0)
				winner = 1;
			if (p1 == p2 && p1 == p3 && p1 == 'X' && winner == 0)
				winner = 2;
		}

		if (winner != 0)
			return winner;

		int occupiedPositions = 0;
		for (int l = 0; l < M.length; l++) {
			for (int c = 0; c < M[l].length; c++) {
				if (M[l][c] != 'F')
					occupiedPositions++;
			}
		}

		if (occupiedPositions == 9)
			return 0;

		return -1;
	}

	// Metodo que imprime o tabuleiro
	public static String showBoard(char M[][]) {
		String boardText = "";

		for (int l = 0; l < M.length; l++) {
			boardText += "\n";
			for (int c = 0; c < M[l].length; c++) {
				if (M[l][c] == 'X' || M[l][c] == 'O') {
					boardText += " " + M[l][c] + " ";
				} else {
					boardText += " - ";
				}
			}
		}

		return boardText;
	}

	// Metodo que executa a lógica do jogo
	public static void game() {
		Scanner in = new Scanner(System.in);
		char gamer = 'O';
		int status = -1;
		char[][] board = initialize();
		System.out.println(showBoard(board));

		while (status == -1) {
			System.out.println("Jogador '" + gamer + "' escolha a linha:");
			int lin = in.nextInt();
			System.out.println("Jogador '" + gamer + "' escolha a coluna:");
			int col = in.nextInt();
			if(lin > 2 || col > 2 || lin < 0 || col < 0) {
				System.out.println("Posição inválida. Escolha novamente");
				continue;			
			}
			if (!step(board, lin, col, gamer)) {
				System.out.println("Posição inválida. Tente novamente");
				continue;
			}
			System.out.println(showBoard(board));
			gamer = gamer == 'O' ? 'X' : 'O';
			status = status(board);
		}
		switch (status) {
		case 1:
			System.out.println("O Jogador 'O' venceu.");
			break;
		case 2:
			System.out.println("O Jogador 'X' venceu.");
			break;
		default:
			System.out.println("Ocorreu um empate.");
			break;
		}
		System.out.println("Final do jogo.");
	}

	// Metodo que inicia o jogo
	public static void main(String[] args) {
		game();

	}
}
