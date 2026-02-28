package br.edu.fatecpg.abstracao.objcotidiano.model;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Relogio {
	public String modelo;
	public String materialCaixa;
	public String materialPulseira;
	public String corPulseira;
	public double tamanhoPulseira;
	
	DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("HH:mm:ss");
	String dataFormatada = LocalDateTime.now().format(formatoData);
	
	public void verHoras() {
		System.out.println(dataFormatada);
	}
	public void ajustarHora() {
		System.out.println("Escolha um fuso horário.");
	}
	public void carregarBateria() {
		System.out.println("Carregando bateria.");		
	}
}