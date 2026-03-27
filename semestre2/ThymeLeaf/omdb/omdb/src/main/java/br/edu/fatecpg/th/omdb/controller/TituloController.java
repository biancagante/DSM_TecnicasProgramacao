package br.edu.fatecpg.th.omdb.controller;

import br.edu.fatecpg.th.omdb.model.Titulo;
import br.edu.fatecpg.th.omdb.service.OmdbService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TituloController {
    @Autowired private OmdbService omdbService;

    @GetMapping("/") public String index() { return "index"; }

    @GetMapping("/buscar") public String buscar(@RequestParam String titulo, Model model) {
        Titulo resultado = omdbService.buscarPorTitulo(titulo);

        if (resultado == null) {
            model.addAttribute("erro", "O título " + titulo + " não está disponível.");
        }
        else {
            model.addAttribute("titulo", resultado);
        }
        return "resultado";
    }
}
