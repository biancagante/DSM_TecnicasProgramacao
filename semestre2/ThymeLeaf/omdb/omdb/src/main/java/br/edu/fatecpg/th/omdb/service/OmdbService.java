package br.edu.fatecpg.th.omdb.service;

import br.edu.fatecpg.th.omdb.model.Titulo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;

@Service
public class OmdbService {
    @Value("${omdb.api.key}") private String apiKey;
    @Value("${omdb.api.url}") private String apiUrl;

    private RestTemplate restTemplate = new RestTemplate();
    private ObjectMapper mapper = new ObjectMapper();

    public Titulo buscarPorTitulo(String entradaTitulo) {
//        String url = UriComponentsBuilder
//                .fromUriString(apiUrl)
//                .queryParam("?t=",  entradaTitulo)
//                .queryParam("&apikey=",  apiKey)
//                .queryParam("&plot=", "full")
//                .build()
//                .toUriString();

        String url = apiUrl + "?t=" + entradaTitulo.replace(" ", "+") + "&apikey=" + apiKey + "&plot=full";

        String json = restTemplate.getForObject(url, String.class);

        try {
            JsonNode node = mapper.readTree(json);

            if (node.path("Response").asText().equals("False")) {
                return null;
            }

            return mapper.readValue(json, Titulo.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
