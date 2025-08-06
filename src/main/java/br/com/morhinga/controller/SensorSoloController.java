package br.com.morhinga.controller;

import br.com.morhinga.model.SensorDeSolo;
import br.com.morhinga.repository.SensorSoloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sensores-solo")
@CrossOrigin(origins = "*")
public class SensorSoloController {

    @Autowired
    private SensorSoloRepository repository;

    @GetMapping
    public List<SensorDeSolo> listarTodos() {
        return repository.findAll();
    }

    @GetMapping("/intervalo")
    public List<SensorDeSolo> porIntervalo(@RequestParam String inicio, @RequestParam String fim) {
        return repository.findByDataBetween(inicio, fim);
    }
}
