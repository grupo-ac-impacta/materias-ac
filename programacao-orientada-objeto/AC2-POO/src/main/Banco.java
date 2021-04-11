package main;

import java.util.Scanner;

/*
	INTEGRANTES:
	
	Leandro Damasceno de Lima | RA: 1902792
	Luiz Henrique de Oliveira Contri | RA: 1903312
	Danyllo Henrique Verri Santana | RA: 1601298
	Matheus Nascimento Rodrigues | RA: 1902805
*/

public class Banco {
	public static Scanner entrada;

	public static ContaBancaria selecionaConta(ContaBancaria[] contas, int tipoAcao) {
		String[] textos = { "O deposito será efetuado na conta de qual cliente? (0 a " + (contas.length - 1) + "): ",
				"Qual a origem da transferência? (0 a " + (contas.length - 1) + "): ",
				"Qual o destino da transferência? (0 a " + (contas.length - 1) + "): ",
				"O saque será efetuado na conta de qual cliente? (0 a \" + (contas.length - 1) + \"): ", };

		boolean clienteValido = false;
		int indiceConta = -1;

		while (!clienteValido) {
			mostrarInfo(contas);
			System.out.print(textos[tipoAcao]);

			indiceConta = entrada.nextInt();
			if (indiceConta >= 0 && indiceConta < contas.length) {
				clienteValido = true;
			} else {
				System.out.println("Índice de cliente inválido!");
			}
		}

		return contas[indiceConta];
	}

	public static void mostrarInfo(ContaBancaria[] contas) {
		System.out.println("\nContas de todos os clientes:");
		for (int i = 0; i < contas.length; i++) {
			System.out.println("[" + i + "]" + contas[i].toString());
		}
		System.out.println("");
	}

	public static void interacaoSacar(ContaBancaria[] contas) {
		ContaBancaria conta = selecionaConta(contas, 3);

		System.out.print("Qual o valor do saque? ");
		double saque = entrada.nextDouble();
		conta.sacar(saque);
		System.out.println("Saque finalizado.\n");
	}

	public static void interacaoDepositar(ContaBancaria[] contas) {
		ContaBancaria conta = selecionaConta(contas, 0);

		System.out.print("Qual o valor do deposito? ");
		double deposito = entrada.nextDouble();
		conta.depositar(deposito);
		System.out.println("Deposito finalizado.\n");
	}

	public static void interacaoTransferir(ContaBancaria[] contas) throws ValorInvalido, ContaInvalida {
		ContaBancaria contaOrigem = selecionaConta(contas, 1);
		ContaBancaria contaDestino = selecionaConta(contas, 2);

		if (contaOrigem == contaDestino)
			throw new ContaInvalida("Não é possível transferir para a mesma conta");

		System.out.print("Qual o valor da transferência? ");
		double valor = entrada.nextDouble();
		if (valor < 0)
			throw new ValorInvalido("O valor mínimo para transferência é 0.1");

		contaOrigem.transferir(valor, contaDestino);
		System.out.println("Transferência finalizado.\n");
	}

	public static void main(String[] args) {
		ContaBancaria[] contas = new ContaBancaria[5];
		contas[0] = new ContaBancaria("Marcos", 1000.00);
		contas[1] = new ContaBancaria("Júlia", 250.00);
		contas[2] = new ContaBancaria("João", 2500.00);
		contas[3] = new ContaBancaria("Roberto", 3000.00);
		contas[4] = new ContaBancaria("Janaína", 4500.00);

		entrada = new Scanner(System.in);
		boolean sair = false;

		while (!sair) {
			System.out.println("Escolha uma operação:");
			System.out.println("(1) mostrar informações de todas as contas");
			System.out.println("(2) sacar");
			System.out.println("(3) depositar");
			System.out.println("(4) transferir");
			System.out.println("(5) sair");
			System.out.print("Opção escolhida: ");
			int escolha = entrada.nextInt();
			System.out.println();

			switch (escolha) {
			case 1:
				mostrarInfo(contas);
				break;
			case 2:
				interacaoSacar(contas);
				break;
			case 3:
				interacaoDepositar(contas);
				break;
			case 4:
				interacaoTransferir(contas);
				break;
			case 5:
				sair = true;
				break;
			default:
				System.out.println("Opção inválida!");
			}
			System.out.println();
		}
		System.out.println("Fim do programa!");
	}
}
