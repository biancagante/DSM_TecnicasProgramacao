package br.edu.fatecpg.abstracao.objcotidiano.model;

public class Cadeira {
	public String material;
	public String cor;
	public double comprimento;
	public double altura;
	public double largura;

    public void sentar() {
        System.out.println("Você se sentou na cadeira.");
    }

    public void empilharCadeiras() {
        System.out.println("Cadeiras empilhadas com sucesso.");
    }

    public void apoiarItens() {
        System.out.println("Itens apoiados na cadeira.");
    }
}
