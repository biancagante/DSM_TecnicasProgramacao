package br.edu.fatecpg.th.open_meteo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.fatecpg.th.open_meteo.model.ClimaDados;
import br.edu.fatecpg.th.open_meteo.service.ClimaService;


@Controller
public class ClimaController {
    @Autowired ClimaService serviceClima;

    @GetMapping("/") public String index() {
        return "index";
    }
    
    @GetMapping("/obterClima") public String obterClima(@RequestParam double latitude, @RequestParam double longitude, Model model) {
        ClimaDados resposta = serviceClima.obterClima(latitude, longitude);

        if (resposta == null) {
            model.addAttribute("erro", ("Erro ao obter clima da coordenada\nLatitude: " + latitude + "\nLongitude: " + longitude));
        }

        else {
            model.addAttribute("climaDados", resposta);
        }

        return "respostaClima";
    }
}
