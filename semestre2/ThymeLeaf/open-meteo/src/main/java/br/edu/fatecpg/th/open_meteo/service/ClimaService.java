package br.edu.fatecpg.th.open_meteo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.edu.fatecpg.th.open_meteo.model.ClimaDados;

@Service
public class ClimaService {
    @Value("${open-meteo.api.url}") private String apiUrl;

    private final RestTemplate restTemplate = new RestTemplate();
    private final ObjectMapper mapper = new ObjectMapper();
    String fusoHorario = "America/Sao_Paulo";

    public ClimaDados obterClima(double lat, double lon)  {
        String uri = UriComponentsBuilder
                        .fromUriString(apiUrl)
                        .queryParam("latitude", lat)
                        .queryParam("longitude", lon)
                        .queryParam("current", "temperature_2m,windspeed_10m,weathercode")
                        .queryParam("timezone", fusoHorario)
                        .toUriString();
                                    
        try {
            String json = restTemplate.getForObject(uri, String.class);
            // System.out.println(json); // teste 
            return mapper.readValue(json, ClimaDados.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
