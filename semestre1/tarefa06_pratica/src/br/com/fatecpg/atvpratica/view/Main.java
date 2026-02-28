package br.com.fatecpg.atvpratica.view;
import br.com.fatecpg.atvpratica.model.Biblioteca;
import br.com.fatecpg.atvpratica.model.Loja;
import br.com.fatecpg.atvpratica.model.VideoLocadora;

public class Main {

	public static void main(String[] args) {
		System.out.println("\n============================== 1 ===============================\n");
		Loja lojaUm = new Loja(3);
		lojaUm.setProduto(1, "Teclado", 5, 120);
		lojaUm.setProduto(2, "Mouse", 7, 75);
		lojaUm.setProduto(3, "Mousepad", 3, 15);
		lojaUm.getProdutos();
		System.out.println(lojaUm.produtosDestaque());
		System.out.println("Valor total do estoque é: " + lojaUm.valorTotalEstoque());
		System.out.println(lojaUm.comprarProduto(2, 3));
		System.out.println(lojaUm.reporProduto(2, 2));
		
		System.out.println("\n============================== 2 ==============================\n");
		
		VideoLocadora vLocadoraUm = new VideoLocadora(3);
		vLocadoraUm.setFilmes(1, "Barbie Escola de Princesas", 12, 5);
		vLocadoraUm.setFilmes(2, "Barbie em a Princesa e a Plebeia", 2, 5);
		vLocadoraUm.setFilmes(3, "Barbie: O Filme", 2, 8);
		
		vLocadoraUm.getFilmes();
		
		System.out.println("O faturamento total da locadora se todos os filmes fossem alugados: " + vLocadoraUm.faturamentoTotal());
		System.out.println(vLocadoraUm.filmeMaisAlugado());
		
		System.out.println(vLocadoraUm.alugarFilme(1, 2));
		System.out.println(vLocadoraUm.filmeMaisAlugado()); // teste de devolução
		
		System.out.println(vLocadoraUm.devolverFilme(1, 1));
		System.out.println(vLocadoraUm.devolverFilme(2, 1));
		
		System.out.println(vLocadoraUm.filmeMaisAlugado()); // teste de devolução
		 
		System.out.println("\n============================== 3 ==============================\n");
		
		Biblioteca BibliotecaUm = new Biblioteca(4);		
		BibliotecaUm.setLivro(1, "O Pequeno Príncipe", 1, 0.5, "Indísponível");
		BibliotecaUm.setLivro(2, "Orgulho e Preconceito", 5, 0.75, "Indísponível");
		BibliotecaUm.setLivro(3, "O Senhor dos Anéis: A Sociedade do Anel", 7, 0.5, "Indísponível");
		BibliotecaUm.setLivro(4, "Conectadas", 0, 0.5, "Dísponível");
		BibliotecaUm.getLivro();
		
		BibliotecaUm.multaAcumulada();
		System.out.println("\nA média de dias de atraso é de: " + BibliotecaUm.mediaDiasAtraso());
		
		BibliotecaUm.emprestarLivro(4);
		BibliotecaUm.emprestarLivro(4);
		
		System.out.println(BibliotecaUm.devolverLivro(3, 4));
		System.out.println(BibliotecaUm.devolverLivro(2, 0));
	}

}
