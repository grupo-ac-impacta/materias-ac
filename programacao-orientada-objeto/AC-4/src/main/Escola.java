package main;

import java.util.ArrayList;

public class Escola {
	private String nome;
	private ArrayList<Casa> casas = null;
	
	public Escola(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Casa> getCasas() {
		return this.casas;
	}

	public void setCasas(ArrayList<Casa> casas) {
		this.casas = casas;
	}

	public void incluirCasa(Casa casa) {
		casas.add(casa);
	}
}
