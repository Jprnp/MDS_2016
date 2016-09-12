package Interface;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class BlackJack {
	public String[] NAIPE = { "Paus", "Ouros", "Copas", "Espadas" };

	public String[] NIVEL = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei", "As" };

	public final int n = NAIPE.length * NIVEL.length;
	public String[] baralho = new String[n];
	public int counter = 0, playerpts = 0, dealerpts = 0;
	public String carta;

	public void init( ) throws InterruptedException {
		// Inicializa baralho
		for (int i = 0; i < this.NIVEL.length; i++) {
			for (int j = 0; j < this.NAIPE.length; j++) {
				baralho[this.NAIPE.length * i + j] = this.NIVEL[i] + " de " + this.NAIPE[j];
			}
		}

		// Embaralhar
		for (int i = 0; i < this.n; i++) {
			int r = i + (int) (Math.random() * (this.n - i));
			String temp = this.baralho[r];
			this.baralho[r] = this.baralho[i];
			this.baralho[i] = temp;
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

	public String nextCardPlayer() {
		// String carta;
		String ret   = "";
        ret = ret + "Voce Recebe: " + this.baralho[this.counter];
        this.carta = this.baralho[this.counter].split(" de ", 2)[0];
        this.playerpts += getPontos(this.carta, this.playerpts);
        this.counter++;
                
        return ret;
	}

	public String nextCardDealer() {
		// String carta;
		String ret   = "";
        ret = ret + "Dealer Recebe: " + this.baralho[this.counter];
        this.carta = this.baralho[this.counter].split(" de ", 2)[0];
        this.dealerpts += getPontos(this.carta, this.dealerpts);
        this.counter++;

        return ret;
	}

	public static void play() {
		try {
			//File file = new File(name + ".wav");
			java.net.URL url = BlackJack.class.getResource("nconsegue.wav");
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(url));
			clip.start();
//			Thread.sleep(clip.getMicrosecondLength());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, (e.getMessage()));
		}

	}
	
	public static void playWin() {
		try {
			//File file = new File(name + ".wav");
			java.net.URL url = BlackJack.class.getResource("tetra.wav");
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(url));
			clip.start();
//			Thread.sleep(clip.getMicrosecondLength());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, (e.getMessage()));
		}

	}
}
