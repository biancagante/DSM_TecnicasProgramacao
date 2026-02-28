package br.edu.fatecpg.tecprog.estruturado.atividade_pratica_01;
import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		// Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
		int numEscolhido;
		Scanner scan = new Scanner(System.in);
		System.out.println("Para calcularmos a tabuada digite um número: ");
		numEscolhido = scan.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(numEscolhido + "x" + i + "=" + (numEscolhido * i));
		}
	}

}
