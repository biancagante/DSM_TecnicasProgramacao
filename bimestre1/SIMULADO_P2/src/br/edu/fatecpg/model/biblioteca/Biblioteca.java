package br.edu.fatecpg.model.biblioteca;
import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<Livro> livros = new ArrayList<>();
	
	public String addLivro(String titulo, String autor, String isbn, boolean disp) {
		Livro novoLivro = new Livro(titulo, autor, isbn, disp);
		livros.add(novoLivro);
		return "Livro " + novoLivro.getTitulo() + " adicionado à biblioteca.";
	}
	
	public String addLivro(Livro livro) {
		livros.add(livro);
		return "Livro " + livro.getTitulo() + " adicionado à biblioteca.";
	}
	
	public String removerLivro(Livro livro) {
		livros.remove(livro);
		return "Livro " + livro.getTitulo() + " removido da biblioteca.";
	}
	
	public void buscarLivro(String titulo, String autor) {
		boolean encontrado = false;
		for (Livro livro : livros) {
			if (livro.getTitulo().equals(titulo) || livro.getAutor().equals(autor)) {
				System.out.println(livro.exibirInformacoes());
				encontrado = true;
			}
		}
		if (!encontrado) {			
			System.out.println("Livro não encontrado.");
		}
	}
	
	public void getLivros() {
		for(Livro livro : livros) {
			System.out.println(livro.exibirInformacoes());
		}
	}
	
	public void getLivrosDisponiveis() {
		for(Livro livro : livros) {
			if (livro.isDisponibilidade() == true) {
				System.out.println(livro.exibirInformacoes());
			}
		}
	}
}
