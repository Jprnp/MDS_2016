package br.ufg.inf.Jprnp.Lista03.Ex01;

import java.io.IOException;

public class ImplementLampada {

	public static void main(String[] args) throws IOException, InterruptedException{
		Lampada lamp = new Lampada();
		boolean queimada = false;
		
		while (!queimada) {
			System.out.println("\nENTER - Ligar/Desligar lampada");
			System.in.read();
			try {
				lamp.switchState();
				if (lamp.isOn()) {
					System.out.println("Lampada ligou");
					Thread.sleep(100);
				} else {
					System.out.println("Lampada desligou");
					Thread.sleep(100);
				}
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
				queimada = true;
			}
			System.in.skip(1);
		}
		System.exit(0);
	}

}
