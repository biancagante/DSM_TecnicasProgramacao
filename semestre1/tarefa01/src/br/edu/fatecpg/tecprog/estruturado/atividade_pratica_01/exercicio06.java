package br.edu.fatecpg.tecprog.estruturado.atividade_pratica_01;
import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		// Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
		int numEntrada, fatorial;
		Scanner scan = new Scanner(System.in);
		System.out.println("Para calcularmos o fatorial digite um número: ");
		numEntrada = scan.nextInt();
		fatorial = 1;
		
		for (int i = numEntrada; i >= 1; i--) {
			fatorial *= i;
		}
		System.out.println("Fatorial de " + numEntrada + " é: " + fatorial);
	}
}