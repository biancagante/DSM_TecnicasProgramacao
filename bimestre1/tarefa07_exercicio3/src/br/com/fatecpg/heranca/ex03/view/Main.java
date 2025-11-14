package br.com.fatecpg.heranca.ex03.view;
import br.com.fatecpg.heranca.ex03.model.SistemaDeSeguranca;

public class Main {
	public static void main(String[] args) {
		SistemaDeSeguranca teste = new SistemaDeSeguranca("Bia", "12345678");
		teste.login("Grethen", "batatinha");
		System.out.println(teste.logout());
		teste.login("admin", "123");
		System.out.println(teste.logout());
	}
}