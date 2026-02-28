package br.com.fatecpg.atvpratica.model;

public class Loja {
	private String nomesProdutos[];
	private int quantidadeEstoque[];
	private double precosProdutos[];
	
	private int qtd;
	
	public Loja(int qtd) {
		this.qtd = qtd;
		
		nomesProdutos = new String[qtd];
		quantidadeEstoque = new int[qtd];
		precosProdutos = new double[qtd];
	}
	
	public void setProduto(int i, String nome, int qtd, double preco) {
		int index = i - 1;
		this.nomesProdutos[index] = nome;
		this.quantidadeEstoque[index] = qtd;
		this.precosProdutos[index] = preco;
	}
	
	public void getProdutos() {
		for (int j = 0; j < this.qtd; j++) {
			System.out.println(
					"Nome Produto: " + this.nomesProdutos[j] + "\n" + 
					"Preço Produto: " + this.precosProdutos[j] + "\n" + 
					"Quantidade Produto: " + this.quantidadeEstoque[j] + "\n"
            );
		}
	}
	
	public String produtosDestaque() {
		double menorPreco = Double.MAX_VALUE, maiorPreco = 0;
		
		for (int k = 0; k < this.qtd; k++) {
			if (this.precosProdutos[k] > maiorPreco) {
				maiorPreco = this.precosProdutos[k];
			}
			
			if (this.precosProdutos[k] < menorPreco) {
				menorPreco = this.precosProdutos[k];
			}
		}
		
		return String.format("Maior preço de produto: %.2f\nMenor preço de produto: %.2f", maiorPreco, menorPreco);
	}
	
	public double valorTotalEstoque() {
		double vlTotal = 0;
		
		for (int l = 0; l < this.qtd; l++) {
			vlTotal += this.precosProdutos[l] * this.quantidadeEstoque[l];
		}
		
		return vlTotal;
	}
	
	public String comprarProduto(int i, int qtd) {
		if (this.quantidadeEstoque[i - 1] >= qtd) {
			this.quantidadeEstoque[i - 1] -= qtd;
			return String.format("\nObrigada pela compra de %s %dX!", this.nomesProdutos[i], qtd);
		}
		
		else {
			return "\nQuantidade excedeu!";
		}
	}
	
	public String reporProduto(int i, int qtd) {
		this.quantidadeEstoque[i - 1] = qtd;
		return "Obrigada pela devolução.";
	}
}
