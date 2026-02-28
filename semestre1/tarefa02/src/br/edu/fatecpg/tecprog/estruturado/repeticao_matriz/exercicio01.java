package br.edu.fatecpg.tecprog.estruturado.repeticao_matriz;

public class exercicio01 {

	public static void main(String[] args) {
		// Soma de Matrizes:
		//  Desenvolva um programa que realiza a soma de duas matrizes 3X3, exibindo o resultado no console. 
		int[][] numeros1 = {
				{1, 2, 3}, 
				{4, 5, 6}, 
				{7, 8, 9}
		};
		
		int[][] numeros2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] soma = new int[3][3];
		
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				soma[l][c] = numeros1[l][c] + numeros2[l][c];	
			}
		}
		
		System.out.println("Resultado: ");
		
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.print("[" + soma[l][c] + "]");
			}
			System.out.println();
		}
	}

}
