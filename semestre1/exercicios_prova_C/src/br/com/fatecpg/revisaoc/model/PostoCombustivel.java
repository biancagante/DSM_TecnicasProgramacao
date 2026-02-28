package br.com.fatecpg.revisaoc.model;

/*
 * 8. Posto de Combustível com Controle de Bombas

Crie uma classe PostoCombustivel com:

Um array de String chamado tiposCombustivel (ex.: Gasolina, Etanol, Diesel);
Um array de double chamado precosLitro;
Um array de int chamado litrosDisponiveis.

Implemente métodos para:

1. Exibir todos os combustíveis com seus preços por litro e quantidade disponível.
2. Calcular o valor total em estoque (preço × litros disponíveis).
3. Descobrir qual combustível está com o maior estoque e qual com o menor estoque.
4. Vender combustível (diminuindo a quantidade em estoque).
5. Reabastecer a bomba de combustível (aumentando a quantidade em estoque).
*/
public class PostoCombustivel {
	private String[] tiposCombustivel;
	private double[] precosLitro;
	private int[] litrosDisponivel;
	int quantidade = 0;
	
	public PostoCombustivel(int qtd) {
		this.quantidade = qtd;
		this.tiposCombustivel = new String[quantidade];
		this.precosLitro = new double[quantidade];
		this.litrosDisponivel = new int[quantidade];
	}
	
	public void setCombustiveis(int i, String tipo, double preco, int litros) {
		i -= 1;
		this.tiposCombustivel[i] = tipo;
		this.precosLitro[i] = preco;
		this.litrosDisponivel[i] = litros;
	}
	
	public void listarCombustiveis() {
		for(int i = 0; i < quantidade; i++) {
			System.out.println("\nTipo de combustível: " + this.tiposCombustivel[i] + 
					"\nPreço por Litro: " + this.precosLitro[i] + 
					"\nQuantidade disponível: " + this.litrosDisponivel[i]
			);
		}
	}
	
	public double valorTotal() {
		double valorTotal = 0, precosAcumulados = 0, litrosDisp = 0;
		for(int i = 0; i < quantidade; i++) {
			precosAcumulados += this.precosLitro[i];
			litrosDisp += this.litrosDisponivel[i];
		}
		valorTotal = precosAcumulados * litrosDisp;
		return Math.round(valorTotal);
	}
	
	public void destaquesEstoque() {
		int maior = 0, menor = Integer.MAX_VALUE;
		String maiorT = " ", menorT = " ";
		for(int i = 0; i < quantidade; i++) {
			if (this.litrosDisponivel[i] < menor) {
				menor = this.litrosDisponivel[i];
				menorT = this.tiposCombustivel[i];
			}
			if (this.litrosDisponivel[i] > maior) {
				maior = this.litrosDisponivel[i];
				maiorT = this.tiposCombustivel[i];
			}
		}
		System.out.println("O combustível com menor estoque é " + menorT + " com " + menor + " litros.");
		System.out.println("O combustível com maior estoque é " + maiorT + " com " + maior + " litros.");
	}
	
	public void venderCombustivel(int index, int qtd) {
		index -= 1;		
			if (qtd > this.litrosDisponivel[index]) {
				System.out.println("\nNão há litros suficientes.");
			}
			else {
				this.litrosDisponivel[index] -= qtd;
				System.out.println("\nLitros após venda: " + this.litrosDisponivel[index]);
			}
		
	}
	
	public void abastecerBomba(int index, int qtd) {
		index -= 1;
			this.litrosDisponivel[index] += qtd;
			System.out.println("\nLitros após abastecimento: " + this.litrosDisponivel[index]);
	}
}
