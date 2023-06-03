package br.com.lucarauj.screenmatch.controller;

import br.com.lucarauj.screenmatch.domain.filme.DadosAlteracaoFilme;
import br.com.lucarauj.screenmatch.domain.filme.DadosCadastroFilme;
import br.com.lucarauj.screenmatch.domain.filme.Filme;
import br.com.lucarauj.screenmatch.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/filmes")
public class FilmeController {

    @Autowired
    private FilmeRepository filmeRepository;

    @GetMapping("/formulario")
    public String carregaPaginaFormulario(Long id, Model model) {

        if(id != null) {
            var filme = filmeRepository.getReferenceById(id);
            model.addAttribute("filme", filme);
        }
        return "filmes/formulario";
    }

    @GetMapping
    public String carregaPaginaListagem(Model model) {

        model.addAttribute("lista", filmeRepository.findAll());
        return "filmes/listagem";
    }

    @PostMapping
    @Transactional
    public String cadastraFilme(DadosCadastroFilme dadosCadastroFilme) {

        var filme = new Filme(dadosCadastroFilme);
        filmeRepository.save(filme);
        return "redirect:/filmes";
    }

    @PutMapping
    @Transactional
    public String alteraFilme(DadosAlteracaoFilme dadosAlteracaoFilme) {

        var filme = filmeRepository.getReferenceById(dadosAlteracaoFilme.id());
        filme.atualizaDados(dadosAlteracaoFilme);
        return "redirect:/filmes";
    }


    @DeleteMapping
    @Transactional
    public String removeFilme(Long id) {

        filmeRepository.deleteById(id);
        return "redirect:/filmes";
    }
}
