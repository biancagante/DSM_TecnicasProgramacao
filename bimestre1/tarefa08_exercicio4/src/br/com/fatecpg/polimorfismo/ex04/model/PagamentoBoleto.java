package br.com.fatecpg.polimorfismo.ex04.model;

public class PagamentoBoleto extends Pagamento{
	public String processarPagamento() {
		return "Processando pagamento boleto bancário...";
	}
}
