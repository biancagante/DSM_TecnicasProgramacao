package br.com.fatecpg.polimorfismo.ex03.model;

public class Produto {
	private String nome;
	private double preco;
	private int qtdEstoque;
	
	public Produto(String nome) {
		this.nome = nome;
	}
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public Produto(String nome, double preco, int qtd) {
		this.nome = nome;
		this.preco = preco;
		this.qtdEstoque = qtd;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	@Override
	public String toString() {
		if (preco != 0) {
			if (qtdEstoque != 0) {
				return "Nome: " + nome + "\nPreço: " + preco + "\nQuantidade em Estoque: " + qtdEstoque + "\n";
			}
			return "Nome: " + nome + "\nPreço: " + preco + "\n";		
		}
		
		else {
			return "Nome: " + nome + "\n";
		}
	}
}
