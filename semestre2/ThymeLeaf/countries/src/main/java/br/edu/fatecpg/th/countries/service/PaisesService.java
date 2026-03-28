package br.edu.fatecpg.th.countries.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

// import com.fasterxml.jackson.databind.JsonNode;
import tools.jackson.databind.JsonNode;

import br.edu.fatecpg.th.countries.model.Pais;
import tools.jackson.databind.ObjectMapper;

@Service
public class PaisesService {
    @Value("${restcountries.api.url}") private String apiUrl;

    private final RestTemplate restTemplate = new RestTemplate();
    private final ObjectMapper mapper = new ObjectMapper();

    public Pais buscarPais(String nome) {
        String url = apiUrl + nome.replace(" ", "");

        try {
            Pais[] paises = restTemplate.getForObject(url, Pais[].class);

            if (paises != null && paises.length > 0) {
                return paises[0]; 
            } 
            
            else {
                return null; 
            }
        } catch (Exception e) {
            System.out.println("Erro ao buscar país: " + e.getMessage());
            return null;    
        }
    }
}
