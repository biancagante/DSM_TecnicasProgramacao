package br.com.fatecpg.associacaolistas.model;

public class Calculadora {
	private double a, b;

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Calculadora [a=" + a + ", b=" + b + "]";
	}
	
	public double somar(double a, double b) {
		return (a + b);
	}
	
	public double mutilplicar(double a, double b) {
		return (a * b);
	}
}
