package main;

public class Torneio {
	private Casa casa1;
	private Casa casa2;
	private Integer pontosCasa1;
	private Integer pontosCasa2;
	
	public Torneio(Casa casa1, Casa casa2) {
		this.casa1 = casa1;
		this.casa2 = casa2;
	}

	public void marcarPonto(Casa casa, Integer quantidade) {
		if(casa == this.casa1) {
			pontosCasa1 += quantidade;
		} else if (casa == this.casa2) {
			pontosCasa2 += quantidade;
		}
	}
	
	public Casa getCasa1() {
		return this.casa1;
	}

	public void setCasa1(Casa casa1) {
		this.casa1 = casa1;
	}

	public Casa getCasa2() {
		return this.casa2;
	}

	public void setCasa2(Casa casa2) {
		this.casa2 = casa2;
	}

	public Integer getPontosCasa1() {
		return this.pontosCasa1;
	}

	public void setPontosCasa1(Integer pontosCasa1) {
		this.pontosCasa1 = pontosCasa1;
	}

	public Integer getPontosCasa2() {
		return this.pontosCasa2;
	}

	public void setPontosCasa2(Integer pontosCasa2) {
		this.pontosCasa2 = pontosCasa2;
	}
}
