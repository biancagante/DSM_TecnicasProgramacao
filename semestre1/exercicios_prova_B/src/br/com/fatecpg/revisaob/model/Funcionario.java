package br.com.fatecpg.revisaob.model;

/*
 * Objetivo: Aplicar encapsulamento usando get e set
Descrição: Crie uma classe Funcionario com os atributos privados: nome, salario, cargo.

Implemente os métodos:
getNome(), setNome()
getSalario(), setSalario()
getCargo(), setCargo()

No programa principal:
Crie um objeto Funcionario
Use os setters para definir os valores
Use os getters para exibir os dados do funcionário
*/

public class Funcionario {
	private String nome;
	private double salario;
	private String cargo;
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getCargo() {
		return this.cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
