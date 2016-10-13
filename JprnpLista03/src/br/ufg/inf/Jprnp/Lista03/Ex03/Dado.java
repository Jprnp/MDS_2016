package br.ufg.inf.Jprnp.Lista03.Ex03;

import java.util.Random;

public class Dado {
	private Random ger;
	
	public Dado() {
		this.ger = new Random();
	}
	
	public int rollDice() {
		return this.ger.nextInt(6) + 1;
	}
}
