package br.com.fatecpg.encapsulamento.prog3.model;

public class Produto {
	private String nome;
	private double preco;
	private int qtdEstoque;
	
	public Produto (String nome, double preco, int qtdEstoque) {
		this.nome = nome;
		this.preco = preco;
		this.qtdEstoque = qtdEstoque;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public void setPreco(double preco) {
		if (preco < 0) {
			System.out.println("Não é possível adicionar um produto com valor negativo.");
		}
		else
			this.preco = preco;
	}
	
	public int getQtdEstoque() {
		return this.qtdEstoque;
	}
	
	public void setQtdEstoque(int qtdEstoque) {
		if (qtdEstoque < 0) {
			System.out.println("Não é possível adicionar um produto com quantidades negativas em estoque.");			
		}
		else
			this.qtdEstoque = qtdEstoque;
	}
}
