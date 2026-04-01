package br.edu.fatecpg.th.cadastro_produto.controller;

import br.edu.fatecpg.th.cadastro_produto.model.Produto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProdutoController {
    private static List<Produto> produtos = new ArrayList<>();

    @GetMapping("/")
    public String index() {
        return "redirect:/cadastrar";
    }

    @GetMapping("/cadastrar")
    public String cadastrar(Model model) {
        model.addAttribute("produto", new Produto());
        return "cadastrar";
    }

    @PostMapping("/cadastrar")
    public String cadastrarProduto(@ModelAttribute Produto produto, Model model) {
        if (produto.getPreco() < 0) {
            model.addAttribute("erroPreco", "Valor de preço inserido é inválido");
            return "cadastrar";
        }
        else if (produto.getNome() == null || produto.getNome().isEmpty()) {
            model.addAttribute("erroNome", "Um nome deve ser inserido");
            return "cadastrar";
        }
        else {
            produtos.add(produto);
            return "redirect:/lista";
        }
    }

    @GetMapping("/lista")
    public String exibirLista(Model model) {
        model.addAttribute("produtos", produtos);
        return "lista";
    }

    @GetMapping("/deletar/id")
    public String deletarProduto(int id) {
        produtos.remove(id);
        return "redirect:/lista";
    }

    @GetMapping("/editar/id")
    public String editar(int id, Model model) {
        model.addAttribute("produto", produtos.get(id));
        return "editar";
    }
}
