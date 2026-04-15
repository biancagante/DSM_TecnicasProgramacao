package br.edu.fatecpg.th.cadastro_produto.model;

public class Produto {
    private String nome;
    private double preco;
    private String categoria;
    private String descricao;
    private int estoque;

    public Produto() {
    }

    public Produto(String nome, double preco, String categoria, String descricao, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.descricao = descricao;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", descricao=" + descricao +
                ", preco=" + preco +
                ", categoria='" + categoria + '\'' +
                ", quantidade em estoque=" + estoque +
                '}';
    }
}
