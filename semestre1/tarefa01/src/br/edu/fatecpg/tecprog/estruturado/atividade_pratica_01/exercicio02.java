package br.edu.fatecpg.tecprog.estruturado.atividade_pratica_01;
import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		// Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, se 
		// o primeiro é maior ou o segundo é maior.
		int num1, num2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		num1 = scan.nextInt();
		System.out.println("Digite o segundo número: ");
		num2 = scan.nextInt();
		
		if (num1 > num2) {
			System.out.println("O número " + num1 + " é maior que o número " + num2 + ".");
		}
		
		else if (num1 == num2) {
			System.out.println("Os números digitados são iguais.");
		}
		
		else {
			System.out.println("O número " + num2 + " é maior que o número " + num1 + ".");
		}
	}

}
