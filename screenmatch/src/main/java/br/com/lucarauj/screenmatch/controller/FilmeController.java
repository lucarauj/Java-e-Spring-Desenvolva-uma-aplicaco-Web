package br.com.lucarauj.screenmatch.controller;

import br.com.lucarauj.screenmatch.domain.filme.DadosCadastroFilme;
import br.com.lucarauj.screenmatch.domain.filme.Filme;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/filmes")
public class FilmeController {

    private List<Filme> filmes = new ArrayList<>();

    @GetMapping("/formulario")
    public String carregaPaginaFormulario() {
        return "filmes/formulario";
    }

    @GetMapping
    public String carregaPaginaListagem(Model model) {
        model.addAttribute("lista", filmes);
        return "filmes/listagem";
    }

    @PostMapping
    public String cadastraFilme(DadosCadastroFilme dadosCadastroFilme) {
        var filme = new Filme(dadosCadastroFilme);
        filmes.add(filme);

        System.out.println(filmes);

        return "filmes/formulario";
    }

//    @PutMapping


//    @DeleteMapping
}
