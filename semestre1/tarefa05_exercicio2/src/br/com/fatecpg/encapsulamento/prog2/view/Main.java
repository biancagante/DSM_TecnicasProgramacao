package br.com.fatecpg.encapsulamento.prog2.view;
import br.com.fatecpg.encapsulamento.prog2.model.ContaBancaria;

public class Main {

	public static void main(String[] args) {
		ContaBancaria meuSaldo = new ContaBancaria("Mariana Costa Ribeiro", 4000);
		System.out.println(meuSaldo.getTitular());
		
		meuSaldo.depositar(200);
		System.out.println(meuSaldo.getSaldo());
		
		meuSaldo.sacar(4500);
		
		meuSaldo.depositar(100);
		System.out.println(meuSaldo.getSaldo());
		
		meuSaldo.sacar(100);
		System.out.println(meuSaldo.getSaldo());
		
		meuSaldo.depositar(-500);
		
		meuSaldo.depositar(0);
		
		meuSaldo.sacar(4200);
		System.out.println(meuSaldo.getSaldo());
	}

}
