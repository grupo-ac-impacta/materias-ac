package main;

import java.util.ArrayList;

public class Professor extends Pessoa {
	private ArrayList<Disciplina> disciplinas = null;
	
	public Professor(String nome, String nascimento) {
		super(nome, nascimento);
	}

	public ArrayList<Disciplina> getDisciplinas() {
		return this.disciplinas;
	}

	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public void incluirDisciplina(Disciplina disciplina) {
		disciplinas.add(disciplina);
	}
}
