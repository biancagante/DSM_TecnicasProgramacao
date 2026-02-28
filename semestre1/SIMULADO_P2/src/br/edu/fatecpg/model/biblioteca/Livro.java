package br.edu.fatecpg.model.biblioteca;

public class Livro {
	private String titulo;
	private String autor;
	private String isbn;
	private boolean disponibilidade;
	
	public Livro(String titulo, String autor, String isbn, boolean disp) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.disponibilidade = disp;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public boolean isDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	
	public String realizarEmprestimo() {
		if (!disponibilidade) {
			return "Livro indisponível.";
		}
		disponibilidade = false;
		return "Livro " + titulo + " foi emprestado.";
	}
	
	public String devolverLivro() {
		if (!disponibilidade) {
			disponibilidade = true;
			return "O livro " + titulo + " foi devolvido com sucesso.";
		}
		return "O livro não foi pego emprestado.";
	}
	
	public String exibirInformacoes() {
		return "Título: " + titulo 
				+ " | Autor: " + autor 
				+ " | ISBN: " +  isbn 
				+ " | Disponível: " + (disponibilidade ? "Sim" : "Não");
	}
}