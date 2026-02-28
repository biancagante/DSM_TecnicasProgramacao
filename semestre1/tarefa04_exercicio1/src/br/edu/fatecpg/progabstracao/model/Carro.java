package br.edu.fatecpg.progabstracao.model;

public class Carro {
	public String cor;
	public String modelo;
	public int capacidadeTanque;
	
	public boolean carroLigado = false;
	
	public void ligar() {	
		if (!carroLigado) {
			System.out.println("Você ligou seu carro!");
			carroLigado = true;
		}
		
		else {
			System.out.println("Carro já está ligado.");
		}
	}
	public void acelerar() {
		if(carroLigado) {
		   System.out.println("Vrumm vruum");
		}
		else {
			System.out.println("O carro está desligado, não da para acelerar.");
			this.ligar();
			this.acelerar();
		}
	}
	public void desligar() {
		if (carroLigado) {
			System.out.println("Carro desligado");
			carroLigado = false;
		}
		
		else {
			System.out.println("Carro já está desligado");
		}
	}
	public void buzinar() {
		System.out.println("Fom foooom");
	}
	
	public void frear() {
		if (carroLigado) {
			System.out.println("Freando carro.");
		}
		else {
			System.out.println("O carro nem tá ligado.");
	}
}
}