package br.com.fatecpg.polimorfismo.ex01.model;

public class Carro extends Veiculo {
	public Carro (String modelo, String tipo) {
		super(modelo, tipo);
	}
	
	@Override
	public String mover() {
		return "O carro está dirigindo";
	}
}
