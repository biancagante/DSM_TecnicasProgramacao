package br.com.fatecpg.polimorfismo.ex05.model;

public class Conversor {
	public int converter(int celsius) {
		return (celsius + 9/5) + 32;
	}
	
	public double converter(double km) {
		return km * 1.6093;
	}
	
	public String converter(String palavra) {
		return palavra.toUpperCase();
	}
}
