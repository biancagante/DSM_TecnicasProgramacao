package br.com.fatecpg.heranca.ex01.view;
import br.com.fatecpg.heranca.ex01.model.Calculadora;

public class Main {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora(2, 3);
		System.out.println("O resultado de " + calc.numero1 + " com " + calc.numero2 + " é:");
		System.out.println("soma: " + calc.soma());
		System.out.println("subtração: " + calc.subtracao());
		System.out.println("multiplicação: " + calc.multiplicacao());
		System.out.println("divisão: " + calc.divisao());
	}
}