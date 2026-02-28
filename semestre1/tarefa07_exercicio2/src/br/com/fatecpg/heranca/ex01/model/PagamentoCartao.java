package br.com.fatecpg.heranca.ex01.model;

public class PagamentoCartao extends ValorPagamento implements IPagamento {
	
	// Agora, implemente essa interface em duas classes: PagamentoCartao e PagamentoDinheiro.
	// A classe PagamentoCartao deve incluir uma taxa de 5% sobre o valor do pagamento.

	private double valor;
	private double taxa = 0.05;
	
	public PagamentoCartao(double v) {
		super(v);
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	public double calcularPagamento() {
		return (this.getValor() + (this.getValor() * taxa));
	}
	
	public String emitirRecibo() {
		return "\n==================  RECIBO DE PAGAMENTO  ==================" +
				"\nForma de pagamento: Cartão\nTaxa: " + (int)(this.taxa * 100) + 
				"%\nValor final: " + calcularPagamento()
				+ "\n===========================================================";
	}

}
