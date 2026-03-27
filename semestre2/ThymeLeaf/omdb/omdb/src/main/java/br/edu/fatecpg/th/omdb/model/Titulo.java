package br.edu.fatecpg.th.omdb.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Titulo {
    @JsonProperty("Title") private String titulo;
    @JsonProperty("Year") private String ano;
    @JsonProperty("Genre") private String genero;
    @JsonProperty("Director") private String diretor;
    @JsonProperty("Plot") private String plot;
    @JsonProperty("Type") private String tipo;
    @JsonProperty("Poster") private String poster;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    @Override
    public String toString() {
        return "Titulo{" +
                "titulo='" + titulo + '\'' +
                ", ano='" + ano + '\'' +
                ", genero='" + genero + '\'' +
                ", diretor='" + diretor + '\'' +
                ", plot='" + plot + '\'' +
                ", tipo='" + tipo + '\'' +
                ", poster='" + poster + '\'' +
                '}';
    }
}
