package br.ufg.inf.Jprnp.Lista03.Ex04;

import java.util.ArrayList;

public class Produto {
	private ArrayList<Caixa> caixas = new ArrayList<Caixa>();
	private String nome;
	private int nextCaixa = 1;
	
	public Produto(String nome) {
		this.nome = nome;
	}
	
	public void addCaixa(int qtd, float valor) {
		this.caixas.add(new Caixa(this.nextCaixa, qtd, valor));
		this.nextCaixa++;
	}
	
	public void delCaixa(int id) {
		caixas.removeIf(cx -> cx.getId() == id);	
	}
	
	public String getName() {
		return this.nome;
	}
	
	public ArrayList<Caixa> getCaixas() {
		return this.caixas;
	}
	
	public Caixa getCaixa(int id) throws RuntimeException {
		for (Caixa cx : this.caixas) {
			if (cx.getId() == id) {
				return cx;
			}
		}
		throw new RuntimeException("Caixa nao encontrada");
	}
	
	public int getNextCaixa() {
		return this.nextCaixa;
	}
}
