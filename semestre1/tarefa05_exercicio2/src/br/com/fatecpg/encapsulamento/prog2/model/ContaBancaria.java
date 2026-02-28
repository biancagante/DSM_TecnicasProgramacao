package br.com.fatecpg.encapsulamento.prog2.model;

public class ContaBancaria {
	private String titular;
	private double saldo;
	
	public ContaBancaria(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void depositar(double valorDeposito) {
		if (valorDeposito <= 0) {
			System.out.println("Não foi possível concluir a transação, pois o depósito é negativo ou zero.");
		}
		else 
			this.saldo = saldo + valorDeposito;
	}
	
	public void sacar(double valorSacado) {
		if (this.getSaldo() <= valorSacado) {
			System.out.println("Não foi possível concluir a transação, pois não há saldo suficiente.");
		}
		else 
			this.saldo = saldo - valorSacado;
	}
}
