package br.edu.fatecpg.tecprog.estruturado.atividade_pratica_01;
import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		// Lista de Nomes: Peça ao usuário para inserir 5 nomes (um de cada vez). Após inserir todos os nomes, peça outro nome e use um loop 
		// for para percorrer a lista e verificar se o 6º(último) nome digitado está presente no array dos 5 nomes informados inicialmente.
		String[] nomes = new String[5];
		String nomePesquisa;
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um nome: ");
			nomes[i] = scan.next();
		}
		
		System.out.println("Agora, digite nome para verificarmos se já está cadastrado: ");
		nomePesquisa = scan.next();

		for (int i = 0; i < 5; i++) {
			if (nomes[i].equalsIgnoreCase(nomePesquisa)) {
				System.out.println("Nome " + nomePesquisa + " repetido na posição: " + i);
			}
		}
	}

}
