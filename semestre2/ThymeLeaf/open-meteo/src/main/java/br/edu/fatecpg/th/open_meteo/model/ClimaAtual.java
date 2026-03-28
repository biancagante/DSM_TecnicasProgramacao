package br.edu.fatecpg.th.open_meteo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClimaAtual {
    @JsonProperty("temperature_2m") private double temperatura;
    @JsonProperty("windspeed_10m") private double velocidadeVento;
    @JsonProperty("weathercode") private int clima;

    // jackson tb reclamou aqui
    public ClimaAtual() {}

    public ClimaAtual(double temp, double velocidade, int clima) {
        this.temperatura = temp;
        this.velocidadeVento = velocidade;
        this.clima = clima;
    }

    public void setTemperatura(double temp) {
        this.temperatura = temp;
    }

    public double getTemperatura() {
        return this.temperatura;
    }

    public void setVelocidadeVento(double velocidade) {
        this.velocidadeVento = velocidade;
    }

    public double getVelocidadeVento() {
        return this.velocidadeVento;
    }

    public void setClima(int clima) {
        this.clima = clima;
    }

    public int getClima() {
        return this.clima;
    }

    @Override
    public String toString() {
        return "ClimaAtual{" +
                "temperatura=" + temperatura +
                ", velocidadeVento=" + velocidadeVento +
                ", clima=" + clima +
                '}';
    }
}
