package br.ufg.inf.Jprnp.Lista03.Ex02;

import java.util.Scanner;

public class ImplementCalculadora {

	public static void main(String[] args) throws InterruptedException {
		int num1, num2;
		boolean done = false;
		int op = 0;
		StringBuilder strB = new StringBuilder();
		
		strB.append("\n1 - Realizar soma\n");
		strB.append("2 - Realizar subtracao\n");
		strB.append("3 - Realizar multiplicacao\n");
		strB.append("4 - Realizar divisao\n");
		strB.append("5 - Trocar numeros\n");
		strB.append("6 - Finalizar\n");
		
		String str1 = strB.toString();
		
		strB.delete(0, strB.length());
		
		strB.append("\n1 - Realizar outra operacao\n");
		strB.append("2 - Finalizar\n");
		
		String str2 = strB.toString();
		
		System.out.println("Digite o primeiro numero:");
		num1 = readNum();
		System.out.println("Digite o segundo numero:");
		num2 = readNum();
		
		Calculadora calc = new Calculadora(num1, num2);
		
		while (!done) {
			System.out.println(str1);
			op = readNum();
			
			switch (op) {
			case 1:
				System.out.println("\n" + calc.getSum());
				Thread.sleep(200);
				break;
			case 2:
				System.out.println("\n" + calc.getSubt());
				Thread.sleep(200);
				break;
			case 3:
				System.out.println("\n" + calc.getMulti());
				Thread.sleep(200);
				break;
			case 4:
				System.out.println("\n" + calc.getDivis());
				Thread.sleep(200);
				break;
			case 5:
				System.out.println("\nDigite o primeiro numero:");
				num1 = readNum();
				System.out.println("\nDigite o segundo numero:");
				num2 = readNum();
				
				calc.setNewNumbs(num1, num2);
				break;
			case 6:
				done = true;
				break;
			default:
				System.out.println("Operacao Invalida!");
			}
			op = 0;
			
			if (!done) {
				System.out.println(str2);
				
				op = readNum();
				
				switch (op) {
				case 1:
					break;
				case 2:
					done = true;
					break;
				default:
					System.out.println("Operacao Invalida!");
				}
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
}
