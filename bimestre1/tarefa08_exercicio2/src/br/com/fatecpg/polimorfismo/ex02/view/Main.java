package br.com.fatecpg.polimorfismo.ex02.view;
import br.com.fatecpg.polimorfismo.ex02.model.*;

public class Main {

	public static void main(String[] args) {
		Calculadora ex1 = new Calculadora();
		System.out.println("Resultado (2 inteiros): " + ex1.somar(2, 2));
		System.out.println("Resultado (3 inteiros): " + ex1.somar(2, 2, 2));
		System.out.println("Resultado (2 números reais): " + ex1.somar(2.5, 2.5));
		
		// Pergunta: Descreva o mecanismo de sobrecarga de métodos e como ele difere da sobrescrita em termos de polimorfismo.
		/*
		 * A sobrecarga irá mudar a assinatura de métodos, onde cada classe filha poderá adicionar diferentes entradas (parâmetros) e 
		 * saídas (retornos), assim, cada classe filha irá receber diferentes dados e poderá retornar um resultado diferente para cada
		 *  classe filha. */
	}

}
