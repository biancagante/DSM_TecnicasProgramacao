package br.edu.fatecpg.tecprog.estruturado.atividade_pratica_01;
import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		/*
		 	Senha Secreta: Defina uma senha secreta (por exemplo: "Java123"). Use um loop while para pedir ao usuário que insira a senha. 
		 	Se a senha estiver incorreta, continue pedindo a senha e informe ao usuário que a tentativa foi inválida. Se ele acertar, saia do loop
		 	e imprima uma mensagem de sucesso.
		*/
		String senha = "Java123", senhaInserida;
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("Insira a senha para acessar o sistema: ");
			senhaInserida = scan.next();
			
			if (senhaInserida.equals(senha)) {
				System.out.println("Senha correta! Acesso ao sistema liberado.");
				break;
			}
			else {
				System.out.println("Senha incorreta, tente novamente.\n");
			}
		}
	}

}
