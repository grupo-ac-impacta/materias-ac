package main;

import java.util.Random;

/*
 	INTEGRANTES:
 	
	Leandro Damasceno de Lima | RA: 1902792
	Luiz Henrique de Oliveira Contri | RA: 1903312
	Danyllo Henrique Verri Santana | RA: 1601298
	Matheus Nascimento Rodrigues | RA: 1902805
 */

public class ContaBancaria {
	private static int ultimoNumeroConta = 1000; // Último número de conta utilizado

	private String correntista;
	private int numeroConta; // número da conta
	private double saldo; // saldo da conta
	private String senha; // senha da conta
	private double cpmf;

	public ContaBancaria(String correntista, double saldo) {
		ultimoNumeroConta++;
		this.numeroConta = ultimoNumeroConta;
		this.saldo = saldo;
		this.correntista = correntista;
		this.senha = criarSenha();
		this.cpmf = 0;
	}

	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}

	public void sacar(double valor) {
		double descontoCpmf = (valor * 0.25) / 100;
		this.cpmf += descontoCpmf;

		this.saldo = (this.saldo - descontoCpmf) - valor;
	}

	public void transferir(double valor, ContaBancaria contaDestino) throws ContaInvalida {
		if (contaDestino == null)
			throw new ContaInvalida("Conta inválida");

		sacar(valor);
		depositar((valor * 0.25) / 100);
		contaDestino.depositar(valor);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumeroConta() {
		return this.numeroConta;
	}

	private String criarSenha() {
		Random gerador = new Random();

		String senha = "";
		for (int i = 0; i < 6; i++) {
			senha += gerador.nextInt(9 - 0) + 0;
		}

		return senha;
	}

	public String getSenha() {
		return this.senha;
	}

	public double getCpmf() {
		return this.cpmf;
	}

	public String toString() {
		return "Conta de " + this.correntista + " - Saldo de R$ " + this.saldo;
	}
}
