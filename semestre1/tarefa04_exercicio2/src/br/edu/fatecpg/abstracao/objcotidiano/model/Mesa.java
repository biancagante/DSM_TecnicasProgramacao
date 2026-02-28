package br.edu.fatecpg.abstracao.objcotidiano.model;

public class Mesa {
	public String formato;
	public double altura;
	public double comprimento;
	public double largura;
	public String material;

    public void colocarObjetos() {
        System.out.println("Objetos colocados sobre a mesa.");
    }

    public void comer() {
        System.out.println("Comendo na mesa.");
    }

    public void estudar() {
        System.out.println("Estudando na mesa.");
    }
}
