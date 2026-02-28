package br.com.fatecpg.revisaoc.model;

/*
 * Crie a classe ContaBancaria com os atributos privados: titular (String), numeroConta (int), saldo (double).

Implemente os métodos:
getTitular(), setTitular()
getNumeroConta(), setNumeroConta()
getSaldo(), setSaldo()

No programa principal:
Crie um objeto ContaBancaria
Atribua os valores usando os setters
Exiba os dados usando os getters
*/

public class ContaBancaria {
	private String titular;
	private int numeroConta;
	private double saldo;
	
	public String getTitular() {
		return this.titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public int getNumeroConta() {
		return this.numeroConta;
	}
	public void setNumeroConta(int numeroC) {
		this.numeroConta = numeroC;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
