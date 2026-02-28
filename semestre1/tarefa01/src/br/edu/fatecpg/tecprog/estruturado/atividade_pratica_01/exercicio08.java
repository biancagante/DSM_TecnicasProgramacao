package br.edu.fatecpg.tecprog.estruturado.atividade_pratica_01;
import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		// Soma dos Números Ímpares: Peça ao usuário que insira um número inteiro n. Calcule e imprima a soma dos 
		// primeiros n números ímpares. Por exemplo, se o usuário inserir 4, o programa deve calcular a soma de 1 + 3 + 5 + 7 = 16.
		int qtEntradas, numeroInserido, somaImpares;
		somaImpares = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("- Quantos números você deseja inserir? ");
		qtEntradas = scan.nextInt();
		
		for (int i = 1; i <= qtEntradas; i++) {
			System.out.println("Digite o número: ");
			numeroInserido = scan.nextInt();
			
			if (numeroInserido % 2 != 0) {
				somaImpares += numeroInserido;
			}
		}
		
		System.out.println("\nA soma dos ímpares inseridos foi: " + somaImpares);
	}

}
