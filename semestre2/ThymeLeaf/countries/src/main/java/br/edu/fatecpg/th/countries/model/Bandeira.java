package br.edu.fatecpg.th.countries.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class Bandeira {
    @JsonProperty("png") private String png;
    @JsonProperty("svg") private String svg;
    @JsonProperty("alt") private String alt;

    public Bandeira(String png, String svg, String alt) {
        this.png = png;
        this.svg = svg;
        this.alt = alt;
    }

    public String getPng() {
        return png;
    }

    public void setPng(String png) {
        this.png = png;
    }

    public String getSvg() {
        return svg;
    }

    public void setSvg(String svg) {
        this.svg = svg;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    @Override
    public String toString() {
        return "Bandeira {" +
                "png='" + png + '\'' +
                ", svg='" + svg + '\'' +
                ", alt='" + alt + '\'' +
                '}';
    }
}
