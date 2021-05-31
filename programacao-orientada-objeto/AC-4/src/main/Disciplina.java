package main;

import java.util.ArrayList;

public class Disciplina {
	private String nome;
	private String ementa;
	private ArrayList<Aluno> alunos = null;
	
	public Disciplina(String nome, String ementa) {
		this.nome = nome;
		this.ementa = ementa;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmenta() {
		return this.ementa;
	}

	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}

	public ArrayList<Aluno> getAlunos() {
		return this.alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	public void incluirAluno(Aluno aluno) {
		alunos.add(aluno);
	}
}
