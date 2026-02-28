package br.com.fatecpg.revisaob.model;

/*
 * 8. Supermercado com Descontos

Crie uma classe Supermercado com:
Um array de String chamado nomesProdutos;
Um array de double chamado precos;
Um array de double chamado descontos (percentual de desconto para cada produto).

Implemente métodos para:

1. Listar todos os produtos com seus preços originais e preços com desconto aplicado.
2. Calcular o total da compra com desconto aplicado em todos os produtos.
3. Encontrar qual produto gera a maior economia em valor absoluto (preço × desconto).
4. Comprar um produto (removendo-o do array).
5. Repor um produto (inserindo-o novamente no array).
*/

public class Supermercado {
	private String[] nomesProdutos;
	private double[] precos;
	private double[] descontos;
	int quantidade = 0;
	
	public Supermercado(int qtd) {
		this.quantidade = qtd;
		this.nomesProdutos = new String[qtd];
		this.precos = new double[qtd];
		this.descontos = new double[qtd];
	}
	
	public void setProdutoUnitario(int i, String nome, double preco, double desconto) {
		i -= 1;
		this.nomesProdutos[i] = nome;
		this.precos[i] = preco;
		this.descontos[i] = (desconto / 100);
	}
	
	public void getProdutos() {
		for (int i = 0; i < quantidade; i++) {
			System.out.println("Produto: " + nomesProdutos[i] + 
					"\nPreço original: " + precos[i] + 
					"\nDesconto de " + (int)(descontos[i] * 100) + "% aplicado: " + (precos[i] - (precos[i] * descontos[i])) + "\n"); 
		}
	}
	
	public void calcularTotalCompra() {
		double totalCompra, totalDescontos = 0, totalPrecos = 0;
		for(int i = 0; i < quantidade; i++) {
			totalDescontos += descontos[i];
			totalPrecos += precos[i];
		}
		totalCompra = totalDescontos * totalPrecos;
		System.out.println("Total compra com descontos: " + totalCompra + "\n");
	}
	
	public void maiorEconomiaAbsoluta() {
		double maiorEconomia = 0;
		String nomeProdutoEconomico = "";
		for (int i = 0; i < quantidade; i++) {
			double desconto = precos[i] * descontos[i];
			if (desconto > maiorEconomia) {
				nomeProdutoEconomico = this.nomesProdutos[i];
				maiorEconomia = desconto;
			}
		}
		System.out.println("O produto que obteve a maior economia em absoluto foi " + nomeProdutoEconomico + " com " + maiorEconomia + " reais de desconto.\n");
	}
	
	public void comprarProduto(int index) {
		index -= 1;
		String produto = this.nomesProdutos[index];
		double precoUnitario = this.precos[index];
		double descontoProduto = this.descontos[index];
		
		System.out.println("Compra de " + produto + " no valor de " + (precoUnitario - (precoUnitario * descontoProduto)) + " reais efetuada com sucesso!\n");
		for (int i = index; i < (quantidade - 1); i++) {
			this.nomesProdutos[i] = this.nomesProdutos[i + 1];
			this.precos[i] = this.precos[i + 1];
			this.descontos[i] = this.descontos[i + 1];
		}
		this.nomesProdutos[quantidade- 1] = produto;
		this.precos[quantidade - 1] = precoUnitario;
		this.descontos[quantidade - 1] = descontoProduto;
		this.quantidade -= 1;
	}
	
	public void reporProduto(int index) {
		index -= 1;
		this.quantidade += 1;
		System.out.println("Produto reposto com sucesso.");
		/*
		this.nomesProdutos[index] = nome;
		this.precos[index] = precoUnitario;
		this.descontos[index] = desconto;
		*/
	}
}
