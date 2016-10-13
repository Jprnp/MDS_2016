package br.ufg.inf.Jprnp.Lista03.Ex01;

public class Lampada {
	private boolean state;
	private int counter;
	
	public Lampada() {
		this.state = false;
		this.counter = 0;
	}
	
	public void switchState() throws RuntimeException {
		if ((counter < 30) || this.state) {
			this.state = !this.state;
		
			if (this.state == true) {
				counter++;
			}
		} else if (!this.state) {
			throw new RuntimeException("Lampada Queimada");
		}
	}
	
	public boolean isOn() {
		return this.state;
	}
}
