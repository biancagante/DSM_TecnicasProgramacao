package br.edu.fatecpg.hackton.model;
 
public class ContaCorrente extends Conta {
	private double limiteChequeEspecial;
	double saldoTotal;
	
	public ContaCorrente(int conta, String titular, double saldo, double limite) {
		super(conta, titular, saldo);
		this.limiteChequeEspecial = limite;
		saldoTotal = getSaldo() + limiteChequeEspecial;
		setSaldo(saldoTotal);
	}
	
	public double getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}
 
	@Override
	public String toString() {
		return "ContaCorrente limiteChequeEspecial=" + limiteChequeEspecial  + super.toString() ;
	}
 
	
	public String saque(double valor) {
		if (valor > getSaldo()) {
			return "Saldo insufiente";
		}
		else {	
			double novoSaldo = getSaldo() - valor;
			limiteChequeEspecial  = valor - limiteChequeEspecial;
			setSaldo(novoSaldo);
			return "Seu saldo é de: " + getSaldo();
		}
	}

	public void depositar(double valor) {
		
//		if()
//		.saldo += valor;
		System.out.println("Valor de " + valor + " depositado com sucesso!");
		
	}
}