package br.edu.fatecpg.tecprogII.revisao.model;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Aluno {
	private String nome;
	private double notaFinal;
	private int horas;
//	private int meses;
	private LocalDate dataInicio;
	private LocalDate dataFim;
	
	public Aluno (String nome) {
		this.nome = nome;
		//this.notaFinal = nota;
		//this.horas = horas;
		//this.meses = meses;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDate getDataFim() {
		return dataFim;
	}

	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", notaFinal=" + notaFinal + ", horas=" + horas + ", inicio=" + dataInicio + ", fim=" + dataFim + "]";
	}
	
	public boolean atualizarContagemHoras(int horas) {
		if (this.horas + horas < 80) {			
			this.horas += horas;
			return true;
		}
		else {
			System.out.println("Limite de carga horária ultrapassado. Carga orária atual: " + this.horas);
			return false;
		}
	}
	
	public boolean tempoExpirado() {
		if (dataInicio == null || dataFim == null) return false;
		
		if (horas > 80 && mesesEntreInicioFim() > 2) {
			horas = 0;
			dataInicio = null;
			dataFim = null;
			return true;
		}
		return false;
	}
	
	public long mesesEntreInicioFim() {
		return ChronoUnit.MONTHS.between(dataInicio, dataFim);
	}
}
