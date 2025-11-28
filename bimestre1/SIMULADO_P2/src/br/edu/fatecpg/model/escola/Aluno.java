package br.edu.fatecpg.model.escola;

public class Aluno {
	private String matricula;
	private String nome_completo;
	private int idade;
	private String id_turma;
	
	public Aluno(String matricula, String nome_completo, int idade, String id_turma) {
		this.matricula = matricula;
		this.nome_completo = nome_completo;
		this.idade = idade;
		this.id_turma = id_turma;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome_completo() {
		return nome_completo;
	}

	public void setNome_completo(String nome_completo) {
		this.nome_completo = nome_completo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getId_turma() {
		return id_turma;
	}

	public void setId_turma(String id_turma) {
		this.id_turma = id_turma;
	}
	
	public void adicionarDisciplina(Disciplina disciplina, String nome_disc) {
		disciplina.setNome(nome_disc);
	}
	
	public void removerDisciplina(Disciplina disciplina) {
		
	}
}
