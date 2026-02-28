package br.com.fatecpg.heranca.ex01.model;

public interface IPagamento {

	// Crie uma interface chamada Pagamento com os seguintes métodos:
	// calcularPagamento(): Sem parâmetros, deve ser implementado para calcular o valor do pagamento.
	// emitirRecibo(): Retorna um recibo detalhado da transação.

	public double calcularPagamento();
	public String emitirRecibo();
}
