package br.com.fatecpg.atvpratica.model;

public class VideoLocadora {
	private String filmes[];
	private int vezesAlugado[];
	private double precosAlugados[];
	private int qtdFilmes;
	
	public VideoLocadora(int qtd) {
		this.qtdFilmes = qtd;
		filmes = new String[qtdFilmes];
		vezesAlugado = new int[qtdFilmes];
		precosAlugados = new double[qtdFilmes];
	}
	
	public void setFilmes(int i, String nmFilme, int qtdVezesAlugado, double vlFilme) {
		int index = i - 1;
		this.filmes[index] = nmFilme;
		this.vezesAlugado[index] = qtdVezesAlugado;
		this.precosAlugados[index] = vlFilme;
	}
	
	public void getFilmes() {
		System.out.println("Lista de filmes: \n");
		for (int i = 0; i < this.qtdFilmes; i++) {
			String infoFilme = String.format("Nome: %s\nQuantidade de vezes alugado: %d\nPreço do filme: %.2f\n", this.filmes[i], this.vezesAlugado[i], this.precosAlugados[i]);
			System.out.println(infoFilme);
		}
	}
	
	public double faturamentoTotal() {
		double valorTotalAlugados = 0;
		for (int j = 0; j < this.qtdFilmes; j++) {
			valorTotalAlugados += this.precosAlugados[j] * this.vezesAlugado[j];
		}
		return valorTotalAlugados;
	}
	
	public String filmeMaisAlugado() {
		int qtdVezesAlugado = 0;
		String nmFilmePopular = "";
		for (int k = 0; k < this.qtdFilmes; k++) {
			if (this.vezesAlugado[k] > qtdVezesAlugado) {
				qtdVezesAlugado = this.vezesAlugado[k];
				nmFilmePopular = this.filmes[k];
			}
		}
		return String.format("\nO filme mais alugado foi: %s que foi alugado %d vezes", nmFilmePopular, qtdVezesAlugado);
	}
	
	public String alugarFilme(int i, int qtd) {
		int index = i - 1;
		this.vezesAlugado[index] += qtd;
		double vlTotalDoAluguel = this.precosAlugados[i - 1] * qtd;
		return String.format("\nO filme %s foi alugado com sucesso.\nValor total da compra: %.2f (%.2f x %d)", this.filmes[i], vlTotalDoAluguel, this.precosAlugados[index], qtd);
	}
	
	public String devolverFilme(int i, int qtd) {
		int index = i - 1;
		this.vezesAlugado[index] -= qtd;
		if (qtd == 1) {			
			return String.format("\nO filme %s foi devolvido com sucesso.", this.filmes[index]);
		}
		else {
			return String.format("\nOs filmes %s(%dx) foram devolvidos com sucesso.", this.filmes[index], qtd);			
		}
	}
}
