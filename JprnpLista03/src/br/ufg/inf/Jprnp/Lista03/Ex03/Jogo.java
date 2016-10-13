package br.ufg.inf.Jprnp.Lista03.Ex03;

import java.util.ArrayList;

public class Jogo {
	private final int SZ = 3;
	private int ptsJog1 = 0, ptsJog2 = 0, countJog1 = 0, countJog2 = 0;
	private int lastRoll = 0;
	private ArrayList<Dado> dadosJog1 = new ArrayList<Dado>(SZ);
	private ArrayList<Dado> dadosJog2 = new ArrayList<Dado>(SZ);
	
	public Jogo() {
		for (int i = 0; i < SZ; i++) {
			this.dadosJog1.add(new Dado());
			this.dadosJog2.add(new Dado());
		}
	}
	
	public void jogada(int jogador) throws RuntimeException{
		if (jogador == 1) {
			if (this.countJog1 < SZ) {
				this.lastRoll = this.dadosJog1.get(this.countJog1).rollDice();
				this.ptsJog1 += this.lastRoll;
				this.countJog1++;
			} else {
				throw new RuntimeException("Todos os dados para este jogador "
						+ "ja foram jogados");
			}
		} else if (jogador == 2) {
			if (countJog2 < SZ) {
				this.lastRoll = this.dadosJog2.get(this.countJog2).rollDice();
				this.ptsJog2 += this.lastRoll;
				this.countJog2++;
			} else {
				throw new RuntimeException("Todos os dados para este jogador "
						+ "ja foram jogados");
			}
		} else {
			throw new RuntimeException("Jogador Inexistente");
		}
	}
	
	public int getWinner() throws RuntimeException{
		if (!((this.countJog1 == 3) && (this.countJog2 == 3))) {
			throw new RuntimeException("Realizar todas as jogadas antes.");
		} 
		if (this.ptsJog1 > this.ptsJog2) {
			return 1;
		} else if (this.ptsJog2 > this.ptsJog1) {
			return 2;
		} else {
			return 3;
		}
	}
	
	public int getCount(int jogador) throws RuntimeException{
		if (jogador == 1) {
			return this.countJog1;
		} else if (jogador == 2) {
			return this.countJog2;
		} else {
			throw new RuntimeException("Jogador Inexistente");
		}
	}
	
	public int getLastRoll() {
		return lastRoll;
	}
	
	public int getPontos(int jogador) throws RuntimeException {
		if (jogador == 1) {
			return this.ptsJog1;
		} else if (jogador == 2) {
			return this.ptsJog2;
		} else {
			throw new RuntimeException("Jogador Inexistente");
		}
	}
}
