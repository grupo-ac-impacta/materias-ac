package main;

public class Aluno extends Pessoa {
	private String tipo;
	private Casa casa = null;
	private Integer triunfos = 0;
	private Integer mauFeitos = 0;
	
	public Aluno(String nome, String nascimento, String tipo) {
		super(nome, nascimento);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Casa getCasa() {
		return this.casa;
	}

	public void setCasa(Casa casa) {
		this.casa = casa;
	}

	public Integer getTriunfos() {
		return triunfos;
	}

	public void setTriunfos(Integer triunfos) {
		this.triunfos = triunfos;
	}

	public Integer getMauFeitos() {
		return mauFeitos;
	}

	public void setMauFeitos(Integer mauFeitos) {
		this.mauFeitos = mauFeitos;
	}
	
	public void incluirTriunfos(Integer quantidade) {
		this.triunfos += quantidade;
	}

	public void incluirMauFeitos(Integer quantidade) {
		this.mauFeitos += quantidade;
	}
}
