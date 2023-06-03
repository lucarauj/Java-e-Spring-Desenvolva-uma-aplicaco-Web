package br.com.lucarauj.screenmatch.controller;

import br.com.lucarauj.screenmatch.domain.filme.DadosCadastroFilme;
import br.com.lucarauj.screenmatch.domain.filme.Filme;
import br.com.lucarauj.screenmatch.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/filmes")
public class FilmeController {

    @Autowired
    private FilmeRepository filmeRepository;

    @GetMapping("/formulario")
    public String carregaPaginaFormulario() {
        return "filmes/formulario";
    }

    @GetMapping
    public String carregaPaginaListagem(Model model) {
        model.addAttribute("lista", filmeRepository.findAll());
        return "filmes/listagem";
    }

    @PostMapping
    public String cadastraFilme(DadosCadastroFilme dadosCadastroFilme) {
        var filme = new Filme(dadosCadastroFilme);
        filmeRepository.save(filme);

        return "redirect:/filmes";
    }

//    @PutMapping


//    @DeleteMapping
}
