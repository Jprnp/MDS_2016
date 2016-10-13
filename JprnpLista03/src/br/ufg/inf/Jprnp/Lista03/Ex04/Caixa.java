package br.ufg.inf.Jprnp.Lista03.Ex04;

public class Caixa {
	private int id, qtd;
	private float valor;

	public Caixa(int id, int qtd, float valor) {
		this.id = id;
		this.qtd = qtd;
		this.valor = valor;
	}
	
	public void changeQtd(int qtd) {
		this.qtd = qtd;
	}
	
	public void changeValue(float valor) throws RuntimeException {
		if (valor >= 0) {
			this.valor = valor;
		} else {
			throw new RuntimeException("Valor não pode ser negativo");
		}
	}
	
	public int getId() {
		return this.id;
	}
	
	public int getQtd() {
		return this.qtd;
	}
	
	public float getVal() {
		return this.valor;
	}
}
