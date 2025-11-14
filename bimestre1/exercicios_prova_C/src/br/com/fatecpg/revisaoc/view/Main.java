package br.com.fatecpg.revisaoc.view;
import br.com.fatecpg.revisaoc.model.Celular;
import br.com.fatecpg.revisaoc.model.ContaBancaria;
import br.com.fatecpg.revisaoc.model.PostoCombustivel;

public class Main {

	public static void main(String[] args) {
		System.out.println("PROVA C - Exercício 6");
		Celular novoCelular = new Celular();
		novoCelular.marca = "Samsung";
		novoCelular.modelo = "M13";
		novoCelular.preco = 1200;
		System.out.println("Marca: " + novoCelular.marca + "\nModelo: " + novoCelular.modelo + "\nPreço: " + novoCelular.preco);
		
		System.out.println("\nPROVA C - Exercício 7");
		ContaBancaria novaConta = new ContaBancaria();
		novaConta.setTitular("Breno");
		novaConta.setNumeroConta(56787323);
		novaConta.setSaldo(150);
		System.out.println("Titular: " + novaConta.getTitular() + "\nNúmero da Conta Bancária: " + novaConta.getNumeroConta() + "\nSaldo: " + novaConta.getSaldo());
		
		System.out.println("\nPROVA C - Exercício 8");
		PostoCombustivel novoPosto = new PostoCombustivel(2);
		novoPosto.setCombustiveis(1, "Gasolina", 5.89, 12);
		novoPosto.setCombustiveis(2, "Etanol", 4.29, 10);
		novoPosto.listarCombustiveis();
		System.out.println("\nValor total: " + novoPosto.valorTotal());
		novoPosto.destaquesEstoque();
		novoPosto.venderCombustivel(2, 8);
		novoPosto.abastecerBomba(2, 2);
		novoPosto.listarCombustiveis();
	}

}
