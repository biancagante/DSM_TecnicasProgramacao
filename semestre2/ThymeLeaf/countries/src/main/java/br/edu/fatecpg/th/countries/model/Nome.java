package br.edu.fatecpg.th.countries.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Nome {
    @JsonProperty("common") private String comum;
    @JsonProperty("official") private String oficial;

    public Nome(String comum, String oficial) {
        this.comum = comum;
        this.oficial = oficial;
    }

    public void setComum (String comum) {
        this.comum = comum;
    }

    public String getComum() {
        return this.comum;
    }

    public void setOficial(String oficial) {
        this.oficial = oficial;
    }

    public String getOficial() {
        return this.oficial;
    }

    @Override
    public String toString() {
        return "Nome {" +
                "comum='" + comum + '\'' +
                ", oficial='" + oficial + '\'' +
                '}';
    }
}
