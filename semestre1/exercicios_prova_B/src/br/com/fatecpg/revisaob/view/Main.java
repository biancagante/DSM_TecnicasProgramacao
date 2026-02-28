package br.com.fatecpg.revisaob.view;
import br.com.fatecpg.revisaob.model.Funcionario;
import br.com.fatecpg.revisaob.model.Livro;
import br.com.fatecpg.revisaob.model.Supermercado;

public class Main {

	public static void main(String[] args) {
		System.out.println("PROVA B - Exercício 6");
		Livro novoLivro = new Livro();
		novoLivro.titulo = "Caraval";
		novoLivro.autor = "Stephanie Garber";
		novoLivro.anoPublicacao = 2017;
		System.out.println("Título: " + novoLivro.titulo + "\nAutor(a): " + novoLivro.autor + "\nAno de publicação: " + novoLivro.anoPublicacao + "\n");
		
		System.out.println("\nPROVA B - Exercício 7");
		Funcionario novoFunc = new Funcionario();
		novoFunc.setNome("Alissa");
		novoFunc.setSalario(2500);
		novoFunc.setCargo("Atendente");
		System.out.println("Nome: " + novoFunc.getNome() + "\nSalário: " + novoFunc.getSalario() + "\nCargo: " + novoFunc.getCargo() + ".\n");
		
		System.out.println("\nPROVA B - Exercício 8");
		Supermercado supermercadoUm = new Supermercado(3);
		supermercadoUm.setProdutoUnitario(1, "Molho de tomate", 15, 5);
		supermercadoUm.setProdutoUnitario(2, "Leite", 10, 10);
		supermercadoUm.setProdutoUnitario(3, "Panetonne", 80, 50);
		supermercadoUm.getProdutos();
		supermercadoUm.calcularTotalCompra();
		supermercadoUm.maiorEconomiaAbsoluta();
		supermercadoUm.comprarProduto(2);
		System.out.println("Lista de produtos após a compra: \n");
		supermercadoUm.getProdutos();
		supermercadoUm.reporProduto(2);
		System.out.println("Lista de produtos após repor: \n");
		supermercadoUm.getProdutos();
	}

}
