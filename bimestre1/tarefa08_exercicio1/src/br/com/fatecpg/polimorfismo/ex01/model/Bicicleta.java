package br.com.fatecpg.polimorfismo.ex01.model;

public class Bicicleta extends Veiculo{
	public Bicicleta(String modelo, String tipo) {
		super(modelo, tipo);
	}
	
	@Override
	public String mover() {
		return "A bicicleta está pedalando";
	}
}
