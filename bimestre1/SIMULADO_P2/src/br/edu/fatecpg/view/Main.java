package br.edu.fatecpg.view;
import br.edu.fatecpg.model.biblioteca.*;
import br.edu.fatecpg.model.controle_estoque.*;

public class Main {
	public static void main(String[] args) {
		Main app = new Main();
//		app.TesteBiblioteca();
//		app.TestarControleEstoque();
		
	}

	public void TesteBiblioteca() {
		Livro teste = new Livro("Alice nas maravilha", "Fulano", "345124", true);
		System.out.println(teste.realizarEmprestimo());
		System.out.println(teste.realizarEmprestimo());
		System.out.println(teste.devolverLivro());
		System.out.println(teste.devolverLivro());
		System.out.println(teste.exibirInformacoes());
		
		Biblioteca bib = new Biblioteca();
		System.out.println(bib.addLivro(teste));
		System.out.println(bib.addLivro("Sherlock Homes", "Ciclano", "3tfyt3t", true));
		
		System.out.println("--------------------------- BUSCANDO LIVROS ----------------------------");
		bib.buscarLivro("Alice", null);
		bib.buscarLivro(null, "Ciclano");
		teste.realizarEmprestimo();
		
		System.out.println("\n-------------------- LISTAR TODOS OS LIVROS ------------------------");
		bib.getLivros();
		System.out.println("\n-------------------- APENAS LIVROS DISPONÍVEIS ----------------------");
		bib.getLivrosDisponiveis();
	}
	
	public void TestarControleEstoque() {
		Produto novo = new Produto("123", "Vassoura", 3, 20.5);
		Produto segundo = new Produto("567", "Vassoura", 9, 20.5);
//		O método atualizarQuantidade afeta métodos da loja como valorTotalEstoque, atualizando o preço automaticamente
//		segundo.atualizarQuantidade(-15);
		System.out.println("\n"+ novo.exibirInformacoes());
		System.out.println("O valor total do estoque é: R$" + segundo.calcularValorEstoque());
		System.out.println("\n");
		
		Loja lojinha = new Loja();
		lojinha.addProduto(novo);
		lojinha.addProduto(segundo);
		
		System.out.println("------------------- PROCURANDO PELO PRODUTO VASSOURA ---------------");
		int singularOuPlural = lojinha.buscarProdutos(null, "Vassoura");
		
		System.out.println(
				(singularOuPlural > 1 ? "\tForam achados " : "\tFoi achado ")
				+ singularOuPlural  + (singularOuPlural > 1 ? " resultados." : " resultado.")
		);
		
		System.out.println("\n------------- TODOS OS PRODUTOS ------------");
		lojinha.exibirProdutos();
		
		System.out.println("\n -------------- Valor total do estoque ---------------");
		System.out.println(lojinha.valorTotalEstoque());
	}
}
