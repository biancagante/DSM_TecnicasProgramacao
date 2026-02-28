package br.com.fatecpg.heranca.ex01.model;

public class PagamentoDinheiro extends ValorPagamento implements IPagamento {
	// A classe PagamentoDinheiro deve aplicar um desconto de 10% sobre o valor do pagamento.
	
	private double desconto = 0.1;
	
	public PagamentoDinheiro(double v) {
		super(v);
	}
	
	public double getTaxa() {
		return desconto;
	}

	public void setTaxa(double taxa) {
		this.desconto = taxa;
	}

	public double calcularPagamento() {
		return (this.getValor() - (this.getValor() * desconto));
	}
	
	public String emitirRecibo() {
		return "\n==================  RECIBO DE PAGAMENTO  =================="
				+ "\nForma de pagamento: Dinhero\nDesconto: " + (int)(this.desconto * 100) + "%\nValor final: " + 
				calcularPagamento()
				+ "\n============================================================";
	}
}
