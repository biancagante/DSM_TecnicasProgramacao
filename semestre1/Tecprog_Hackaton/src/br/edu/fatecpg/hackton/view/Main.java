package br.edu.fatecpg.hackton.view;
import br.edu.fatecpg.hackton.model.*;

public class Main {

	public static void main(String[] args) {
		ContaCorrente c2 = new ContaCorrente(456, "Marica C", 400, 30);
		ContaCorrente c3 = new ContaCorrente(789, "Bianca", 30, 10);
		System.out.println(c2.toString());
		
		System.out.println(c2.saque(20));
		System.out.println(c2.saque(400));
		System.out.println(c2.saque(10));
		System.out.println(c2.saque(10));
		
		c2.depositar(10);
		System.out.println("------------------------------------------");
		
		System.out.println(c2.transferir(c3, 9));
		System.out.println(c2.getSaldo());
		System.out.println(c3.getSaldo());
		System.out.println(c2.transferir(c3, 12));
		
		System.out.println("------------------------------------------");
		
		ContaPoupanca c4 = new ContaPoupanca(123, "Maria Clara", 300);
		System.out.println(c4.getSaldo());
		c4.depositar(10);
		System.out.println(c2.getSaldo());
		c4.transferir(c2, 20);
		System.out.println(c2.getSaldo());
		System.out.println(c4.getSaldo());
	}

}
