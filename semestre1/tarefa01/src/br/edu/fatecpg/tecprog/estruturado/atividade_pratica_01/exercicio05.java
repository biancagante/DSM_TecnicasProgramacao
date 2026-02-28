package br.edu.fatecpg.tecprog.estruturado.atividade_pratica_01;
import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		// Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
		int numEntrada;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ímpar ou par? Digite um número para saber: ");
		numEntrada = scan.nextInt();
		
		if (numEntrada % 2 == 0) {
			System.out.println("O número digitado é par!");
		}
		else {
			System.out.println("O número digitado é ímpar!");
		}
	}

}
