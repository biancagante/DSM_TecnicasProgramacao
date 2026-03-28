package br.edu.fatecpg.th.countries.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.fatecpg.th.countries.model.Pais;
import br.edu.fatecpg.th.countries.service.PaisesService;


@Controller
public class PaisesController {
    @Autowired private PaisesService countryService;

    @GetMapping("/") public String index() { return "index"; }

    @GetMapping("/buscar") public String result(@RequestParam String nome, Model model) {
        Pais country = countryService.buscarPais(nome);

        if (country == null) {
            model.addAttribute("error", "Country not found. Please try again.");
            // return "index"; 
        } 
        
        else {
            model.addAttribute("country", country);
        }

        return "country-info"; 
    }
}
