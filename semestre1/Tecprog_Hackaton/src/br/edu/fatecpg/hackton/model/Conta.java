package br.edu.fatecpg.hackton.model;

public class Conta {
	private int conta;
	private String titular;
	private double saldo;
	
	public Conta(int conta, String titular, double saldo) {
		super();
		this.conta = conta;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "Conta=" + conta + ", titular=" + titular + ", saldo=" + saldo + "]";
	}
	
//	public String saque(double valor) {
//		if (valor > this.saldo) {
//			return "Saldo insufiente";
//		}
//		else {
//			double sacado = saldo - valor;
//			return "Seu saldo é de: " + sacado;
//		}
//	}
	
	public void depositar(double valor) {
		this.saldo += valor;
		System.out.println("Valor de " + valor + " depositado com sucesso!");
	}
	
	public String transferir(Conta conta, double valor) {
		if (valor < this.saldo) {
			double valorTransferir = conta.getSaldo() + valor;
			this.saldo -= valor;
			conta.setSaldo(valorTransferir);
			return "Valor de " + valor + " transferido para " + conta.getTitular();
		}
		else {
			return "Você tem um saldo menor que o valor que deseja transferir.";
		}
	}
}
