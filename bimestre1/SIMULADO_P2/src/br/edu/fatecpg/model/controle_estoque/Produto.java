package br.edu.fatecpg.model.controle_estoque;

public class Produto {
	private String codigo;
	private String nome;
	private int quantidadeEstoque;
	private double preco;
	
	public Produto(String codigo, String nome, int qtd, double preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		atualizarQuantidade(qtd);
	}
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void atualizarQuantidade(int novaQuantidade) {
		this.quantidadeEstoque += novaQuantidade;
		System.out.println("Quantidade em estoque de " + nome + " atualizada para " + quantidadeEstoque);
	}
	
	public double calcularValorEstoque() {
		return (quantidadeEstoque * preco);
	}
	
	public String exibirInformacoes() {
		return ("Código: " + codigo 
				+ " | Produto: " + nome 
				+ " | Preço: " +  preco 
				+ " | Quantidade: " + quantidadeEstoque);
	}
}