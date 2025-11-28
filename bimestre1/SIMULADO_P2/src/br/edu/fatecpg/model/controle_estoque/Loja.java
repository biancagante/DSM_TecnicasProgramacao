package br.edu.fatecpg.model.controle_estoque;
import java.util.ArrayList;

public class Loja {
	private ArrayList<Produto> produtos = new ArrayList<>();
	
	public void addProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public void addProduto(String codigo, String nome, int qtd, double preco) {
		Produto produto = new Produto(codigo, nome, qtd, preco);
		produtos.add(produto);
	}
	
	public void removerProduto(Produto produto) {
		produtos.remove(produto);
	}
	
	public int buscarProdutos(String codigo, String nome) {
		int contadorResultado = 0;
		for (Produto produto : produtos) {
			if (produto.getCodigo().equals(codigo) || produto.getNome().equals(nome)) {
				System.out.println(produto.exibirInformacoes());
				contadorResultado++;
			}
		}
		return contadorResultado;
	}
	
	public void exibirProdutos() {
		for (Produto produto : produtos) {
			System.out.println(produto.exibirInformacoes());
		}
	}
	
	public double valorTotalEstoque() {
		double valorTotal = 0;
		for (Produto produto : produtos) {
			valorTotal += produto.calcularValorEstoque();
		}
		return valorTotal;
	}
}
