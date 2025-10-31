package br.com.fatecpg.polimorfismo.ex01.model;

public class Veiculo {
	private String modelo;
	private String tipo;
	
	public Veiculo(String modelo, String tipo) {
		this.modelo = modelo;
		this.tipo = tipo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	@Override
	public String toString() {
		return "Modelo: "+ modelo +"\nTipo: " + tipo;
	}
	
	public String mover() {
		return "";
	}
}
