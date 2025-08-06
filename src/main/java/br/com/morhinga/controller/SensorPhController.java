package br.com.morhinga.controller;

import br.com.morhinga.model.SensorDePh;
import br.com.morhinga.repository.SensorPhRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sensores-ph")
@CrossOrigin(origins = "*")
public class SensorPhController {

    @Autowired
    private SensorPhRepository repository;

    @GetMapping
    public List<SensorDePh> listarTodos() {
        return repository.findAll();
    }

    @GetMapping("/intervalo")
    public List<SensorDePh> porIntervalo(@RequestParam String inicio, @RequestParam String fim) {
        return repository.findByDataBetween(inicio, fim);
    }
}
