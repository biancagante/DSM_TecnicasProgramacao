package br.com.fatecpg.encapsulamento.prog3.view;
import br.com.fatecpg.encapsulamento.prog3.model.Produto;

public class Main {

	public static void main(String[] args) {
		Produto novoProduto = new Produto("Mochila da Hello Kitty", 85, 3);
		
		System.out.println("Produto: " + novoProduto.getNome() + ".");
		System.out.println("Preço: R$" + novoProduto.getPreco());
		System.out.println("Quantidade em estoque: " + novoProduto.getQtdEstoque());
		
		novoProduto.setPreco(95);
		System.out.println("\nPreço: R$" + novoProduto.getPreco());
		novoProduto.setQtdEstoque(1);
		System.out.println("Quantidade em estoque: " + novoProduto.getQtdEstoque() + ".\n");
		
		novoProduto.setPreco(-3);
		novoProduto.setQtdEstoque(-2);
	}

}
