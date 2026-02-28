package br.com.fatecpg.atvpratica.model;

public class Biblioteca {
	private String livros[];
	private int diasAtraso[];
	private double multaPorDia[];
	private String disponibilidade[];
	int qtdLivros;
	
	public Biblioteca(int qtd) {
		this.qtdLivros = qtd;
		livros = new String[qtdLivros];
		diasAtraso = new int[qtdLivros];
		multaPorDia = new double[qtdLivros];
		disponibilidade = new String[qtdLivros];
	}
	
	public void setLivro(int i, String nome, int dias, double multa, String disp) {
		int index = i - 1;
		for (int j = 0; j < this.qtdLivros; j++) {
			this.livros[index] = nome;
			this.diasAtraso[index] = dias;
			this.multaPorDia[index] = multa;
			this.disponibilidade[index] = disp;
		}
	}
	
	public void getLivro() {
		System.out.println("Lista de livros: \n");
		for(int k = 0; k < this.qtdLivros; k++) {
			System.out.println("Nome: " + this.livros[k] + 
							   "\nDias de atraso: " + this.diasAtraso[k] + 
							   "\nMulta diária por atraso: " + this.multaPorDia[k] + "\n");
		}
	}
	
	public void multaAcumulada() {
		System.out.println("-- Multas acumuladas por cada livro:");
		for (int l = 0; l < this.qtdLivros; l++) {
			double multaTotal = this.diasAtraso[l] * this.diasAtraso[l];
			System.out.println("\nNome do livro: " + this.livros[l] + 
								"\nPreço total da multa: " + multaTotal);
		}
	}
	
	public double mediaDiasAtraso() {
		double mediaAtraso = 0;
		for(int m = 0; m < this.qtdLivros; m++) {
			if (this.diasAtraso[m] != 0) {
				mediaAtraso += this.diasAtraso[m];
			}
		}
		return mediaAtraso / this.qtdLivros;
	}
	
	public void emprestarLivro(int i) {
		int index = i - 1;
		
		if (this.disponibilidade[index] == "Indísponível") {
			System.out.println("\nLivro " + this.livros[index] + " não está disponível.");
		}
		
		else {
			System.out.println("\nLivro " + this.livros[index] + " foi pego emprestado.");
			this.disponibilidade[index] = "Indísponível";
		}
	}
	
	public String devolverLivro(int i, int dias) {
		int index = i - 1;
		double multa = 0;
		if (dias > 0) {
			this.diasAtraso[index] += dias;
			multa = this.diasAtraso[index] * this.multaPorDia[index];
			return String.format("\nO livro %s foi devolvido com %d dias de atraso.\nMulta: %.2f", this.livros[index], dias, multa);
		}
		
		else {
			return String.format("\nO livro %s foi devolvido dentro do prazo. \nMulta: %.2f", this.livros[index], multa);
		}
	}
}