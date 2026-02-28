package br.edu.fatecpg.tecprogII.revisao.view;
import java.time.LocalDate;

import br.edu.fatecpg.tecprogII.revisao.model.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("Olá, mundo");
		
		Aluno bianca = new Aluno("Bianca");
		
		Instrutor alessandro = new Instrutor("Alessandro", true);
		
		Treinamento mysql = new Treinamento(1, "Simone", "MySQL para iniciantes", 5);
		
		bianca.setDataInicio(LocalDate.parse("2024-08-01"));
		bianca.setDataFim(LocalDate.parse("2025-03-25"));
		
		System.out.println(bianca.toString());
		mysql.addAluno(bianca);
	}
}
