package br.com.fatecpg.heranca.ex01.view;
import br.com.fatecpg.heranca.ex01.model.PagamentoCartao;
import br.com.fatecpg.heranca.ex01.model.PagamentoDinheiro;

public class Main {
	public static void main(String[] args) {
		// No final, crie uma classe de teste que simule o pagamento de R$100,00 com as duas formas de pagamento, 
		// calculando o valor final e emitindo um recibo.
		PagamentoCartao pagC = new PagamentoCartao(100);
		System.out.println("Valor calculado: " + pagC.calcularPagamento());
		System.out.println(pagC.emitirRecibo());
		
		PagamentoDinheiro pagD = new PagamentoDinheiro(100);
		System.out.println("\nValor calculado: " + pagD.calcularPagamento());
		System.out.println(pagD.emitirRecibo());
	}
}
