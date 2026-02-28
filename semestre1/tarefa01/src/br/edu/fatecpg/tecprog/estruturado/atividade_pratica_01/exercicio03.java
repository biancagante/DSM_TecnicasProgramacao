package br.edu.fatecpg.tecprog.estruturado.atividade_pratica_01;
import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		// Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. 
		// Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
		int opcEscolhida;
		double lado, areaQuadrado, raio, areaCirculo;
		Scanner scan = new Scanner(System.in);
		System.out.println("┌───────────────────────────────────┐");
		System.out.println("│ Escolha abaixo:                   │");
		System.out.println("│ 1. Calcular a área do quadrado    │");
		System.out.println("│ 2. Calcular a área do círculo     │");
		System.out.println("└───────────────────────────────────┘");
		opcEscolhida = scan.nextInt();
		
		switch (opcEscolhida) {
			case 1:			
				System.out.println("\n - Digite o tamanho do lado: ");
				lado = scan.nextDouble();
				areaQuadrado = lado * lado;
				System.out.println("A área do quadrado é: " + areaQuadrado);
				break;
			case 2:
				System.out.println("\n- Digite o raio da circunferência: ");
				raio = scan.nextDouble();
				areaCirculo = 3.14 * (raio * raio);
				System.out.println("A área do círculo é: " + areaCirculo);
				break;
			default:
				System.out.println("\n- O número digitado não corresponde a nenhuma das opções disponíveis.");
				break;
		}
	}

}
