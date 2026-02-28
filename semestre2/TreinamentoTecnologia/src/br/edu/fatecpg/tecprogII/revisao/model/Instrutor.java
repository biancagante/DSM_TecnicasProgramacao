package br.edu.fatecpg.tecprogII.revisao.model;

public class Instrutor {
	private String nome;
	private boolean disponibilidade;
	
	public Instrutor(String nome, boolean disp) {
		this.nome = nome;
		this.disponibilidade = disp;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	@Override
	public String toString() {
		return "Instrutor [nome=" + nome + ", disponibilidade=" + disponibilidade + "]";
	}
	
}
