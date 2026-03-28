package br.edu.fatecpg.th.countries.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Pais {
    @JsonProperty("name") private Nome nome;
    @JsonProperty("capital") private ArrayList<String> capital;
    @JsonProperty("region") private String regiao;
    @JsonProperty("subregion") private String subRegiao;
    @JsonProperty("population") private long populacao;
    @JsonProperty("area") private double area;
    @JsonProperty("flags") private Bandeira bandeira;

    public Pais(Nome nome, ArrayList<String> capital, String regiao, String subRegiao, long populacao, double area, Bandeira bandeira) {
        this.nome = nome;
        this.capital = capital;
        this.regiao = regiao;
        this.subRegiao = subRegiao;
        this.populacao = populacao;
        this.area = area;
        this.bandeira = bandeira;
    }

    public Nome getNome() {
        return nome;
    }

    public void setNome(Nome nome) {
        this.nome = nome;
    }

    public ArrayList<String> getCapital() {
        return capital;
    }

    public void setCapital(ArrayList<String> capital) {
        this.capital = capital;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getSubRegiao() {
        return subRegiao;
    }

    public void setSubRegiao(String subRegiao) {
        this.subRegiao = subRegiao;
    }

    public long getPopulacao() {
        return populacao;
    }

    public void setPopulacao(long populacao) {
        this.populacao = populacao;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Bandeira getBandeira() {
        return bandeira;
    }

    public void setBandeira(Bandeira bandeira) {
        this.bandeira = bandeira;
    }

    @Override
    public String toString() {
        return "Pais {" +
                "nome=" + nome +
                ", capital='" + capital + '\'' +
                ", regiao='" + regiao + '\'' +
                ", subRegiao='" + subRegiao + '\'' +
                ", populacao=" + populacao +
                ", area=" + area +
                ", bandeira='" + bandeira + '\'' +
                '}';
    }
}
