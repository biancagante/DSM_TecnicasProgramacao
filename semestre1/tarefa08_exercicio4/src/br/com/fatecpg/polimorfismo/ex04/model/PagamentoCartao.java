package br.com.fatecpg.polimorfismo.ex04.model;

public class PagamentoCartao extends Pagamento {
	public String processarPagamento() {
		return "Processando pagamento via cartão de crédito...";
	}
}
