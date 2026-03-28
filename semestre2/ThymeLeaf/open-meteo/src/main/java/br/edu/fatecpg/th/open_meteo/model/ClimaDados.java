package br.edu.fatecpg.th.open_meteo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClimaDados {
    @JsonProperty("latitude") private double latitude;
    @JsonProperty("longitude") private double longitude;
    @JsonProperty("timezone") private String fusoHorario;
    @JsonProperty("current") private ClimaAtual climaAtual;

    // o jackson databind reclamou que não tinha um construtor vazio 
    public ClimaDados() {}

    public ClimaDados(double lat, double lon, String fuso, ClimaAtual climaAtual) {
        this.latitude = lat;
        this.longitude = lon;
        this.fusoHorario = fuso;
        this.climaAtual = climaAtual;
    }

    public void setLatitude(double lat) {
        this.latitude = lat;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public void setLongitude(double lon) {
        this.longitude = lon;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public void setFusoHorario(String fuso) {
        this.fusoHorario = fuso;
    }

    public String getFusoHorario() {
        return this.fusoHorario;
    }

    public void setClimaAtual(ClimaAtual climaAtual) {
        this.climaAtual = climaAtual;
    }

    public ClimaAtual getClimaAtual() {
        return this.climaAtual;
    }

    @Override
    public String toString() {
        return "ClimaDados{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", fusoHorario='" + fusoHorario + '\'' +
                ", climaAtual=" + climaAtual +
                '}';
    }
}
