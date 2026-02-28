package br.edu.fatecpg.tecprogII.revisao.model;
import java.util.ArrayList;

public class Treinamento {
	private int id;
	private String nomeInstrutor;
	private String linguagemEnsinada;
	private int cargaHoraria;
	ArrayList<Aluno> alunos = new ArrayList<>();
	
	public Treinamento(int id, String nomeInstrutor, String ling, int horas) {
		this.id = id;
		this.nomeInstrutor = nomeInstrutor;
		this.linguagemEnsinada = ling;
		this.cargaHoraria = definirCargaHoraria(horas);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeInstrutor() {
		return nomeInstrutor;
	}

	public void setNomeInstrutor(String nomeInstrutor) {
		this.nomeInstrutor = nomeInstrutor;
	}

	public String getLinguagemEnsinada() {
		return linguagemEnsinada;
	}

	public void setLinguagemEnsinada(String linguagemEnsinada) {
		this.linguagemEnsinada = linguagemEnsinada;
	}

	@Override
	public String toString() {
		return "Treinamento [id=" + id + ", nomeInstrutor=" + nomeInstrutor + ", linguagemEnsinada=" + linguagemEnsinada
				+ ", cargaHoraria=" + cargaHoraria + "]";
	}
	
	public int definirCargaHoraria(int horas) {
		this.cargaHoraria = horas;
		return this.cargaHoraria;
	}
	
	public boolean verificarUltimoTreinamento(Aluno al) {
		if (al.atualizarContagemHoras(this.cargaHoraria)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void addAluno(Aluno al) {
		if (verificarUltimoTreinamento(al)) {
			alunos.add(al);
		}
		else {
			System.out.println("Aluno não pode participar desse treinamento.");
		}
	}
	
	public void listarAlunos() {
		System.out.println("\nAlunos inscritos no Treinamento " + linguagemEnsinada + " [id " + id + "]" + ":");
		
		if (alunos.size() > 0) {			
			for (Aluno aluno : alunos) {
				System.out.println(aluno.toString());
			}
		}
		else {
			System.out.println("Não possui alunos inscritos.");
		}		
	}
	
	public double calcularMediaAlunos() {
		double media = 0;
		
		for (Aluno aluno : alunos) {
			media += aluno.getNotaFinal();
		}
		return (media / alunos.size());
	}
	
	public void setNotasAlunos(int nota, Aluno al) {
		for (Aluno aluno : alunos) {
			if (al == aluno) {	
				aluno.setNotaFinal(nota);
			}
		}
	}
	
	public boolean verificarDisponibilidade(Instrutor ins) {
		return ins.isDisponibilidade();
	}
}
