package br.com.fatecpg.revisaoa.model;

public class Aluno {
	// Crie uma classe Aluno com os atributos privados: nome, matricula, notaFinal. Implemente os métodos: getNome(), setNome(), getNotaFinal(), 
	// setNotaFinal() etc. No programa principal: Use os métodos para definir e exibir as informações do aluno. 
	private String nome;
	private int matricula;
	private double notaFinal;
	
	public Aluno(String nome, int matricula, double nota) {
		this.nome = nome;
		this.matricula = matricula;
		this.notaFinal = nota;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getMatricula() {
		return this.matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public double getNotaFinal() {
		return this.notaFinal;
	}
	
	public void setNotaFinal(double nota) {
		this.notaFinal = nota;
	}
}
