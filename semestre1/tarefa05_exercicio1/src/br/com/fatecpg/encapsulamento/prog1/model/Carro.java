package br.com.fatecpg.encapsulamento.prog1.model;

public class Carro {
	private String marca;
	private String modelo;
	private int ano;
	private double capacidadeTanque;
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getAno() {
		return this.ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public double getCapacidadeTanque() {
		return this.capacidadeTanque;
	}
	
	public void setCapacidadeTanque(double capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
	
	public double calcularValorEncherTanque(double valorGasolina) {
		return valorGasolina * this.capacidadeTanque;
	}
}
