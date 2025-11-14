package br.com.fatecpg.polimorfismo.ex04.view;
import br.com.fatecpg.polimorfismo.ex04.model.PagamentoBoleto;
import br.com.fatecpg.polimorfismo.ex04.model.PagamentoCartao;

public class Main {

	public static void main(String[] args) {
		PagamentoCartao pagCartao = new PagamentoCartao();
		System.out.println(pagCartao.processarPagamento());
		PagamentoBoleto pagBoleto = new PagamentoBoleto();
		System.out.println(pagBoleto.processarPagamento());
		
		// Pergunta: Como o polimorfismo por sobrescrita facilita a implementação de diferentes formas de pagamento dentro de um 
		// sistema sem alterar o código da classe base?
		/*
		 * Cada tipo de pagamento recebe e retorna informações diferentes, mas a finalidade de todos é realizar um pagamento, portanto, 
		 * o polimorfismo de spbrescrita permite a reutilização de um método, o adaptando conforme as necessidades das classes filhas. 
		 * Se não fosse aplicado o polimorfismo, seria necessário criar a classe processarPagamento() em cada tipo de pagamento. */
	}

}
