package br.edu.fatecpg.tecprog.estruturado.repeticao_matriz;
import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		// Multiplicação de Matriz por Escalar:
		//   Crie um programa que verifique se um login e senha confere com os dados de uma matriz 6x2.
		Scanner scan = new Scanner(System.in);
		String login, senha;
		boolean acesso = false;
		String[][] matrizLogin = {
				{"Maria C", "001"},
				{"Maria V", "002"},
				{"Bia", "003"},
				{"Milena", "004"},
				{"Edson", "005"},
				{"Salti", "006"},
		};
		
		do {
			System.out.println("Digite seu login: ");
			login = scan.next();
			System.out.println("Digite sua senha:");
			senha = scan.next();
			
			for (int l = 0; l < 6; l++) {
				if (login.equals(matrizLogin[l][0]) && senha.equals(matrizLogin[l][1])) {
					acesso = true;
				}
			}
			
			if (acesso == true) {
				System.out.println("Acesso liberado!");
				break;
			}
			
			else {
				System.out.println("Acesso negado.\n");				
			}
		} while (acesso == false);
		
		scan.close();
	}

}
