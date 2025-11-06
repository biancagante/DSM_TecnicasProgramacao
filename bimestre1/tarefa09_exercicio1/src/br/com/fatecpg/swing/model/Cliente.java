package br.com.fatecpg.swing.model;

public class Cliente {
	private String nome;
	private int idade;
	private String sexo;
	
	public Cliente(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		if (idade == 1)
			return nome + " tem " + idade + " ano e é do sexo " + sexo + ".";
		else 
			return nome + " tem " + idade + " anos e é do sexo " + sexo + ".";
	}
}
