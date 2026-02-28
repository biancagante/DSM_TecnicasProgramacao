package br.edu.fatecpg.abstracao.objcotidiano.model;

public class Celular {
	public String marca;
	public int memoria; // em GB
	public double polegadaTela;
	public String sistemaOperacional;
	public String cor;

    public void ligar() {
        System.out.println("O celular está ligando.");
    }

    public void instalarAplicativos() {
        System.out.println("Aplicativo instalado no celular.");
    }

    public void tirarFoto() {
        System.out.println("Foto salva na galeria.");
    }
}
