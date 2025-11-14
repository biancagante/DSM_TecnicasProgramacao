package br.com.fatecpg.encapsulamento.prog1.view;
import java.util.Scanner;

import br.com.fatecpg.encapsulamento.prog1.model.Carro;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Carro meuCarro = new Carro();
		System.out.println("Olá! Insira as informações sobre seu veículo abaixo para calcularmos o valor necessário para encher o tanque de gasolina:");

		System.out.println("\nMarca: ");
		meuCarro.setMarca(scan.nextLine());
		
		System.out.println("Modelo: ");
		meuCarro.setModelo(scan.nextLine());
		
		System.out.println("Ano: ");
		meuCarro.setAno(scan.nextInt());
		scan.nextLine();
		System.out.println("Capacidade do Tanque: ");
		meuCarro.setCapacidadeTanque(scan.nextDouble());
		
		System.out.println("Agora me informe quando é o valor da gasolina (00,00): ");
		double valorTotal = meuCarro.calcularValorEncherTanque(scan.nextDouble());
		scan.close();
		
		System.out.println("O valor total é: " + valorTotal);
	}

}
