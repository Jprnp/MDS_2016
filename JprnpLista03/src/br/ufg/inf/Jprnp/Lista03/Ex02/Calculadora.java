package br.ufg.inf.Jprnp.Lista03.Ex02;

public class Calculadora {
	private int num1, num2;
	
	public Calculadora(int num1, int num2) {
		this.setNewNumbs(num1, num2);
	}
	
	public void setNewNumbs(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int getSum() {
		return (this.num1 + this.num2);
	}
	
	public int getMulti() {
		return (this.num1 * this.num2);
	}
	
	public int getSubt() {
		return (this.num1 - this.num2);
	}
	
	public float getDivis() {
		return ((float)this.num1 / (float)this.num2);
	}
}
