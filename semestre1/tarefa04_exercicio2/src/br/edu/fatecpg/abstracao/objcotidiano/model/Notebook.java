package br.edu.fatecpg.abstracao.objcotidiano.model;

public class Notebook {
	public String sistemaOperacional;
	public String processador;
	public String tipoArmazenamento; // em GB
	public int memoria; // em GB
	public double tamanhoTela;

    public void ligarComputador() {
        System.out.println("O notebook está ligando.");
    }

    public void instalarSoftware() {
        System.out.println("Software instalado no notebook.");
    }

    public void personalizarCaracteristicas() {
        System.out.println("Escolha uma cor tema.");
    }
}
