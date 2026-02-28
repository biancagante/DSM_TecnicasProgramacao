package br.edu.fatecpg.model.escola;

public class Disciplina {
	private String nome;
	private double nota;
	
	public Disciplina(String nome, double nota) {
		super();
		this.nome = nome;
		this.nota = nota;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getNota() {
		return nota;
	}
	
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public void exibirInformacoes() {
		System.out.println("Disciplina: " + nome + " | Nota: " + nota);
	}
}