package br.com.fatecpg.heranca.ex03.model;

public interface IAutenticavel {
	// Crie uma interface chamada Autenticavel com os seguintes métodos:
	// login(String usuario, String senha): Verifica se o login e a senha estão corretos.
	// logout(): Faz o logout do usuário.
	public boolean login(String usuario, String senha);
	public String logout();
}
