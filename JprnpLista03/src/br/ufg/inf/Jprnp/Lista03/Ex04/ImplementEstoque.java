package br.ufg.inf.Jprnp.Lista03.Ex04;

import java.util.Scanner;
/**
 * 
 * @author Jprnp
 * Implementação INCOMPLETA: Falta Exception Handling
 */
public class ImplementEstoque {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		boolean finaliza = false;
		Estoque estoque = new Estoque();
		String menu1, nomeProd, menu2;
		int op, id;
		
		StringBuilder builder = new StringBuilder();
		
		builder.append("\n1 - Adicionar Produto");
		builder.append("\n2 - Remover Produto");
		builder.append("\n3 - Modificar Produto");
		builder.append("\n4 - Balanco Geral");
		builder.append("\n5 - Finalizar\n");
	
		menu1 = builder.toString();
		
		builder.delete(0, builder.length());
		
		builder.append("\n1 - Adicionar Caixa");
		builder.append("\n2 - Remover Caixa");
		builder.append("\n3 - Modificar Caixa\n");
		
		menu2 = builder.toString();
		
		while (!finaliza) {
			nomeProd = "";
			System.out.println(menu1);
			op = readNum();
			
			switch (op) {
			case 1:
				System.out.println("Nome do produto: ");
				nomeProd = read.nextLine();
				estoque.addProduto(nomeProd);
				break;
			case 2:
				System.out.println("Nome do produto: ");
				nomeProd = read.nextLine();
				estoque.delProduto(nomeProd);
				break;
			case 3:
				System.out.println("Nome do produto: ");
				nomeProd = read.nextLine();
				Produto prod;
				prod = estoque.getProduto(nomeProd);
				System.out.println(menu2);
				op = readNum();
				switch (op) {
				case 1:
					System.out.println("Quantidade: ");
					int qtd = readNum();
					System.out.println("Valor: ");
					float val = readNum2();
					int proxCaixa = prod.getNextCaixa();
					prod.addCaixa(qtd, val);
					System.out.println("Id da caixa criada: " + proxCaixa);
					break;
				case 2:
					System.out.println("Id da caixa: ");
					id = readNum();
					prod.delCaixa(id);
					break;
				case 3:
					System.out.println("Id da caixa: ");
					id = readNum();
					Caixa cx = prod.getCaixa(id);
					System.out.println("Nova quantidade: ");
					int newQtd = readNum();
					System.out.println("Novo valor: ");
					float newVal = readNum2();
					cx.changeValue(newVal);
					cx.changeQtd(newQtd);
					break;
				default:
					System.out.println("Operacao Invalida!");
				}
				break;
			case 4:
				System.out.println(estoque.balancoGeral());
				break;
			case 5:
				finaliza = true;
			default:
				System.out.println("Operacao Invalida!");
			}
		}
		
		System.exit(0);
	}
	
	private static int readNum() {
		Scanner read = new Scanner(System.in);
		boolean ok = false;
		int num = 0;
		while (!ok) {
			try {
				num = Integer.parseInt(read.nextLine());
				ok = true;
			} catch (NumberFormatException e){
				System.out.println("Entrar com valor valido!");
			}
		}
		return num;
	}
	
	private static float readNum2() {
		Scanner read = new Scanner(System.in);
		boolean ok = false;
		float num = 0;
		while (!ok) {
			try {
				num = Float.parseFloat(read.nextLine());
				ok = true;
			} catch (NumberFormatException e){
				System.out.println("Entrar com valor valido!");
			}
		}
		return num;
	}
}

