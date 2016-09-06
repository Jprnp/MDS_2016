package blackjack;

import java.util.Scanner;
import java.io.*;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
import javax.swing.JDialog;

public class BlackJack {
	static String[] NAIPE = { "Paus", "Ouros", "Copas", "Espadas" };

	static String[] NIVEL = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei", "As" };

	static final int n = NAIPE.length * NIVEL.length;
	static String[] baralho = new String[n];
	static int counter = 0, playerpts = 0, dealerpts = 0;
	static String carta;
	static final int WT = 1000;

	public static void main(String[] args) throws InterruptedException {
		Scanner leitor = new Scanner(System.in);
		boolean pbust = false, done = false, dbust = false;

		// Inicializa baralho
		for (int i = 0; i < NIVEL.length; i++) {
			for (int j = 0; j < NAIPE.length; j++) {
				baralho[NAIPE.length * i + j] = NIVEL[i] + " de " + NAIPE[j];
			}
		}

		// Embaralhar
		for (int i = 0; i < n; i++) {
			int r = i + (int) (Math.random() * (n - i));
			String temp = baralho[r];
			baralho[r] = baralho[i];
			baralho[i] = temp;
		}

		// Distribuir Cartas

		nextCardPlayer();

		Thread.sleep(WT);

		nextCardDealer();

		Thread.sleep(WT);

		nextCardPlayer();

		Thread.sleep(WT);

		while ((pbust == false) && done == false) {
			System.out.println("Mais uma carta? (S / N)");

			String answer = leitor.nextLine();

			while (true) {
				if (("S".equals(answer)) || ("s".equals(answer))) {
					nextCardPlayer();

					Thread.sleep(WT);

					if (playerpts > 21) {
						System.out.println("Voce estourou! Total de pontos: " + playerpts);
						pbust = true;
					}
					break;
				} else if (("N".equals(answer)) || ("n".equals(answer))) {
					System.out.println("Seu total de pontos: " + playerpts);
					done = true;
					break;
				}
			}
			Thread.sleep(WT);
		}

		System.out.println("*-----------------------------------------------*");
		System.out.println("*---------------- VEZ DO DEALER ----------------*");
		System.out.println("*-----------------------------------------------*");

		Thread.sleep(WT);

		while (dealerpts < 17) {
			nextCardDealer();
			Thread.sleep(WT - 500);
		}
		if (dealerpts > 21) {
			dbust = true;
			System.out.println("Dealer Estourou! Total de Pontos: " + dealerpts);
		}

		Thread.sleep(WT);

		if (dbust && !pbust) {
			System.out.println("Voce Venceu!");
		} else if (!dbust && pbust) {
			System.out.println("Voce Perdeu!");
			play();
		} else if (dbust && pbust) {
			if (playerpts < dealerpts) {
				System.out.println("Voce Venceu!");
			} else {
				System.out.println("Voce Perdeu!");
				play();
			}
		} else {
			if (playerpts > dealerpts) {
				System.out.println("Voce Venceu!");
			} else {
				System.out.println("Voce Perdeu!");
				play();
			}
		}
	}

	public static int getPontos(String carta, int upts) {
		int pts = 0;

		switch (carta) {
		case "Valete":
		case "Dama":
		case "Rei":
			pts += 10;
			break;
		case "As":
			if ((upts + 11) > 21) {
				pts += 1;
			} else {
				pts += 11;
			}
			break;
		default:
			pts += Integer.parseInt(carta);
		}
		return pts;
	}

	public static void nextCardPlayer() {
		// String carta;
		System.out.println("Voce recebe: " + baralho[counter]);
		carta = baralho[counter].split(" de ", 2)[0];
		playerpts += getPontos(carta, playerpts);
		counter++;

		System.out.println("Seu Total: " + playerpts);
	}

	public static void nextCardDealer() {
		// String carta;
		System.out.println("Dealer recebe: " + baralho[counter]);
		carta = baralho[counter].split(" de ", 2)[0];
		dealerpts += getPontos(carta, dealerpts);
		counter++;

		System.out.println("Total Dealer: " + dealerpts);
	}

	public static void play() {
		String name = "nconsegue";
		try {
			File file = new File(name + ".wav");
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(file));
			clip.start();
			Thread.sleep(clip.getMicrosecondLength());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}
}
