package br.edu.fatecpg.tecprog.estruturado.repeticao_matriz;
import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		/* 
		 	Transposição de Matriz:
			  Desenvolva um código que realiza a transposição de uma matriz (as colunas viram linhas e as linhas viram colunas). 
			  Peça aos usuários para inserirem os elementos da matriz, exibindo a matriz transposta no console.
		*/
		Scanner scan = new Scanner(System.in);
		String[][] palavras = new String[2][2];
		String[][] reverso = new String[2][2];
		
		for (int l = 0; l < 2; l++) {
			for (int c = 0; c < 2; c++) {
				System.out.println("Digite uma palavra: ");
				palavras[l][c] = scan.nextLine();
			}
		}
		
		for (int l = 0; l < 2; l++) {
			for (int c = 0; c < 2; c++) {
				reverso[c][l] = palavras[l][c];
			}
		}
		
		for(String[] linha : reverso) {
			for(String coluna : linha) {
				System.out.print(coluna + " |");
			}
			System.out.println();
		}
	}

}
