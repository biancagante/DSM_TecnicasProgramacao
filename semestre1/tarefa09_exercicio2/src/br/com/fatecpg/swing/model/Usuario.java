package br.com.fatecpg.swing.model;

public class Usuario {
	private String tema;
	private String notificacoes;
	private int volume;
	
	public Usuario(String tema, String notificacoes, int volume) {
		this.tema = tema;
		this.notificacoes = notificacoes;
		this.volume = volume;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String isNotificacoes() {
		return notificacoes;
	}

	public void setNotificacoes(String notificacoes) {
		this.notificacoes = notificacoes;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public String toString() {
		return "Preferências do Usuário \nTema: " + tema + "\nNotificações: " + notificacoes + "\nVolume: " + volume;
	}
}
