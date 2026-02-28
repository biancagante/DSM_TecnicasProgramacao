package br.com.fatecpg.revisaoa.model;

public class Farmacia {
	/*
	 * Implemente métodos para:
			1. Mostrar todos os medicamentos, seus preços e dias restantes para vencimento.
			2. Calcular a média de dias para vencimento de todos os medicamentos.
			3. Identificar quais medicamentos estão próximos de vencer (ex.: menos de 5 dias).
			4. Aplicar automaticamente um desconto de 50% para medicamentos que estão próximos de vencer.
			5. Vender um medicamento, removendo-o do array. 
	*/
	private String[] nomesMedicamentos;
	private int[] diasParaVencimento;
	private double[] precos;
	int qtd;
	
	public Farmacia(int qtd) {
		this.qtd = qtd;
		this.nomesMedicamentos = new String[this.qtd];
		this.diasParaVencimento = new int[this.qtd];
		this.precos = new double[qtd];
	}
	
	public void setNomeMedicamento(String nome, int dias, double preco, int i) {
		i = i - 1;
		this.nomesMedicamentos[i] = nome;
		this.diasParaVencimento[i] = dias;
		this.precos[i] = preco;
	}
	
	public void getMedicamentos() {
		for(int i = 0; i < qtd; i++) {			
			System.out.println(
					"Nome: " + this.nomesMedicamentos[i] + "\n" +
					"Validade: " + this.diasParaVencimento[i] + "\n" +
					"Preço: " + this.precos[i] + "\n"
			);
		}
	}
	
	public void mediaDiasValidade() {
		int totalDias = 0;
		double media = 0;
		for(int i = 0; i < this.qtd; i++) {
			totalDias += this.diasParaVencimento[i];
			media = (totalDias / qtd);
		}
		System.out.println("\nMédia de dias para vencimento: " + media + ".\n");
	}
	
	public void verificaVencimento() {
		double desconto = 0.5;
		for (int i = 0; i < qtd; i++) {
			if (this.diasParaVencimento[i] < 7) {
				this.precos[i] = precos[i] * desconto;
				System.out.println(
					"O medicamento "+ nomesMedicamentos[i] + 
					" está perto de expirar com " + diasParaVencimento[i] + " dias.\n" +
					"Preço com desconto aplicado: " + this.precos[i] + ".\n"
				);
			}
		}
	}
	
	public void venderMedicamento(int i, int qtd) {
		i = i - 1;
		String nome = this.nomesMedicamentos[i];
	    int diasVencimento = this.diasParaVencimento[i];  
	    double precoUnitario = this.precos[i]; 
	    double totalCompra = precoUnitario * qtd;
		
	    System.out.println("Obrigada pela compra de " + nomesMedicamentos[i] + " " + qtd + "x = " + totalCompra + "\n");
	    
		for(int j = i; j < (this.qtd - 1); j++) {
				this.nomesMedicamentos[j] = this.nomesMedicamentos[j + 1];
				this.diasParaVencimento[j] = this.diasParaVencimento[j + 1];
				this.precos[j] = this.diasParaVencimento[j + 1];
		}
		this.nomesMedicamentos[this.qtd - 1] = nome;
		this.diasParaVencimento[this.qtd - 1] = diasVencimento;
		this.precos[this.qtd - 1] = precoUnitario;
		
		this.qtd -= 1;
		
	}
}
