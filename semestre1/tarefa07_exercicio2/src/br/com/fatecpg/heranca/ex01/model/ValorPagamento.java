package br.com.fatecpg.heranca.ex01.model;

public abstract class ValorPagamento {
	private double valor;
	
	public ValorPagamento(double v) {
		this.valor = v;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
