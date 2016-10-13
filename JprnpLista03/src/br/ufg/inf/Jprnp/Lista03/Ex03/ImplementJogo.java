package br.ufg.inf.Jprnp.Lista03.Ex03;

import java.io.IOException;

public class ImplementJogo {

	public static void main(String[] args) throws IOException, InterruptedException{
		Jogo jogo = new Jogo();
		
		
		while (jogo.getCount(1) < 3) {
			System.out.println("\nENTER - Proxima Jogada p/ Jog 1");
			System.in.read();
			jogo.jogada(1);
			System.in.skip(1);
			System.out.println("Jogador 1 rolou: " + jogo.getLastRoll());
			Thread.sleep(150);
			System.out.println("Pontos Jog 1: " + jogo.getPontos(1));
			Thread.sleep(150);
		}
		while (jogo.getCount(2) < 3) {
			System.out.println("\nENTER - Proxima Jogada p/ Jog 2");
			System.in.read();
			jogo.jogada(2);
			System.in.skip(1);
			System.out.println("Jogador 2 rolou: " + jogo.getLastRoll());
			Thread.sleep(150);
			System.out.println("Pontos Jog 2: " + jogo.getPontos(2));
			Thread.sleep(150);
		}
		switch (jogo.getWinner()) {
		case 1:
			System.out.println("\nJogador 1 vence!");
			break;
		case 2:
			System.out.println("\nJogador 2 vence!");
			break;
		default:
			System.out.println("\nEmpate!");
		}
		System.exit(0);
	}

}
