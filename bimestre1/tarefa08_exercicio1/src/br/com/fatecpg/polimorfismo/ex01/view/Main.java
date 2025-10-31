package br.com.fatecpg.polimorfismo.ex01.view;
import br.com.fatecpg.polimorfismo.ex01.model.*;

public class Main {
	public static void main(String[] args) {
		Carro carro = new Carro("Golf", "Hatchback");
		System.out.println(carro.mover());
		
		Bicicleta bicicleta = new Bicicleta("SuperSix EVO", "Race");
		System.out.println(bicicleta.mover());
		
		// Pergunta: Explique como a sobrescrita de métodos permite comportamentos diferentes para objetos da mesma hierarquia
		/*
		 * A sobrescrita de métodos permite que a classe filha reescreva o comportamento herdado da classe pai, utilizando da mesma 
		 * assinatura do método definido na classe pai e a anotação @Override para definir a reescrita do método. 
		 * */
	}
}
