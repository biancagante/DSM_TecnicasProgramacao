package br.com.fatecpg.polimorfismo.ex05.view;
import br.com.fatecpg.polimorfismo.ex05.model.*;

public class Main {

	public static void main(String[] args) {
		Conversor conversor = new Conversor();
		System.out.println(conversor.converter(28));
		System.out.println(conversor.converter(4.0));
		System.out.println(conversor.converter("paralelepípedo"));
		
		// Pergunta:
		// Explique como a sobrecarga de métodos permite implementar várias versões do método
		// converter(), mesmo com diferentes tipos de dados e funcionalidades
		
		/*
		 * A sobrecarga permite que o método converter mude sua assinatura para retornar o resultado e cada tipo de conversão pedida, 
		 * assim, o método terá o mesmo nome, mas irá receber parâmetros diferentes  poderá ter uma saída com tipo diferente.*/
	}

}
