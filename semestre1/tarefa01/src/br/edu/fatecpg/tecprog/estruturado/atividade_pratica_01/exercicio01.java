package br.edu.fatecpg.tecprog.estruturado.atividade_pratica_01;
import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		// Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, 
		// exiba "Número negativo".

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int num = scan.nextInt();
		
		if (num > 0) {
			System.out.println("O número é positivo.");
		}
		
		else {
			System.out.println("O número é negativo.");
		}
	}

}
