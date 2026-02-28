package br.edu.fatecpg.tecprog.estruturado.atividade_pratica_01;
import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		// Faixa Etária: Receba a idade de uma pessoa e imprima se ela é: menor de idade, adulta
		// ou idosa (use, por exemplo, 18 para adulta e 60 para idosa).
		int idade;
		Scanner scan = new Scanner(System.in);
		System.out.println("Me diga sua idade, por favor: ");
		idade = scan.nextInt();
		
		if (idade < 18 && idade >= 0) {
			System.out.println("Você é menor de idade.");
		}
		else if (idade >= 18 && idade < 60) {
			System.out.println("Você é maior de idade.");
		}
		else if (idade >= 60 && idade < 130) {
			System.out.println("Você está na terceira idade.");
		}
		else {
			System.out.println("A idade inserida não se encaixa em nenhum padrão.");
		}
	}

}
