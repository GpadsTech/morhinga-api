package br.com.morhinga.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.morhinga.model.Pluviometro;
import br.com.morhinga.repository.PluviometroRepository;

@RestController
@RequestMapping("/api/pluviometro")
@CrossOrigin(origins = "*")
public class PluviometroController {

    @Autowired
    private PluviometroRepository repository;

    @GetMapping
    public List<Pluviometro> listarTodos() {
        return repository.findAll();
    }

    @GetMapping("/intervalo")
    public List<Pluviometro> porIntervalo(@RequestParam String inicio, @RequestParam String fim) {
        return repository.findByDataBetween(inicio, fim);
    }
}
