package br.edu.fatecpg.tecprog.streamlambda.model;

public class Funcionario {
    // Criação da Classe Funcionario
    private String nome;
    private String depto;
    private double salario;
    private int anosServico;

    public Funcionario(String nome, String depto, double salario, int anos) {
        this.nome = nome;
        this.depto = depto;
        this.salario = salario;
        this.anosServico = anos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public String getDepto() {
        return depto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setAnosServico(int anos) {
        this.anosServico = anos;
    }

    public int getAnosServico() {
        return anosServico;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", depto='" + depto + '\'' +
                ", salario=" + salario +
                ", anosServico=" + anosServico +
                '}';
    }
}
