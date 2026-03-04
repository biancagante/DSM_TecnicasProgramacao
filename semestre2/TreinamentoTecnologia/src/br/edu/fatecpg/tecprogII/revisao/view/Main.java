package br.edu.fatecpg.tecprogII.revisao.view;
import java.time.LocalDate;

import br.edu.fatecpg.tecprogII.revisao.model.*;

public class Main {

	public static void main(String[] args) {
		Aluno bianca = new Aluno("Bianca");
		
		Instrutor alessandro = new Instrutor("Alessandro", true);
		
		Treinamento mysql = new Treinamento(1, "Simone", "MySQL para iniciantes", 5);
		Treinamento java = new Treinamento(2, alessandro, "Java - curso completo", 50);
		Treinamento banco = new Treinamento(3, "Wagner", "Banco não relacional", 24);
		
		bianca.setDataInicio(LocalDate.parse("2024-08-01"));
		bianca.setDataFim(LocalDate.parse("2025-03-25"));
		
		System.out.println(bianca.toString());
		mysql.addAluno(bianca);
		
		System.out.println(bianca.mesesEntreInicioFim());
		
		java.addAluno(bianca);
		System.out.println(bianca.toString());
		
		banco.addAluno(bianca);
		System.out.println(bianca.toString());
	}
}
