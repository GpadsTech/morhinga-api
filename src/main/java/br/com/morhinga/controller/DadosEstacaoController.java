package br.com.morhinga.controller;

import br.com.morhinga.model.DadosEstacao;
import br.com.morhinga.repository.DadosEstacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dados-estacao")
@CrossOrigin(origins = "*")
public class DadosEstacaoController {

    @Autowired
    private DadosEstacaoRepository repository;

    @GetMapping
    public List<DadosEstacao> listarTodos() {
        return repository.findAll();
    }

    @GetMapping("/intervalo")
    public List<DadosEstacao> porIntervalo(@RequestParam String inicio, @RequestParam String fim) {
        return repository.findByDataBetween(inicio, fim);
    }
}
