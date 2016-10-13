package br.ufg.inf.Jprnp.Lista03.Ex04;

import java.util.ArrayList;

public class Estoque {
	private int qtdProds;
	ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	public void addProduto(String nomeProd) {
		this.produtos.add(new Produto(nomeProd));
		qtdProds++;
	}
	
	public void delProduto(String nomeProd) {
		produtos.removeIf(px -> px.getName().equals(nomeProd));
	}
	
	public String balancoGeral() {
		StringBuilder builder = new StringBuilder();
		ArrayList<Caixa> caixas = new ArrayList<Caixa>();
		float valTot = 0;
		
		for (Produto prod : produtos) {
			caixas = prod.getCaixas();
			builder.append("\nProduto: ");
			builder.append(prod.getName());
			builder.append("\n");
			builder.append("\n");
			
			for (Caixa cx : caixas) {
				builder.append("Caixa: ");
				builder.append(cx.getId());
				builder.append("\nQtd de Itens: ");
				builder.append(cx.getQtd());
				builder.append("\nValor: ");
				builder.append(cx.getVal());
				builder.append("\n");
				valTot += (cx.getVal() * cx.getQtd());
			}
		}
		
		builder.append("\nValor Total: ");
		builder.append(valTot);
		
		return builder.toString();
	}
	
	public int getQtdProds() {
		return this.qtdProds;
	}
	
	public Produto getProduto(String nome) throws RuntimeException{
		for (Produto prod : this.produtos) {
			if (prod.getName().equals(nome)) {
				return prod;
			}
		}
		throw new RuntimeException("Produto nao encontrado");
	}
}
