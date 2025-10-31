package br.com.fatecpg.polimorfismo.ex03.view;
import br.com.fatecpg.polimorfismo.ex03.model.*;

public class Main {

	public static void main(String[] args) {
		Produto produtoUm = new Produto("Tinta guache preta");
		System.out.println(produtoUm);
		Produto produtoDois = new Produto("Píncel Acrilex", 11.5);
		System.out.println(produtoDois);
		Produto produtoTres = new Produto("Tecido Oxford Azul 1 Metro", 10, 3);
		System.out.println(produtoTres);
		
		// Pergunta: Discuta como a sobrecarga de construtores facilita a criação de objetos com diferentes
		// conjuntos de informações, permitindo flexibilidade na instânciação de objetos.
		/*
		 * A sobrecarga e construtores permite que uma classe tenha diversos métodos construtores, cada um recebendo diferentes 
		 * parâmetros para construir um objeto, assim, os objetos podem ter diferentes informações.*/
	}

}
