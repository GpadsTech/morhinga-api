package br.com.morhinga.controller;

import br.com.morhinga.model.Reservatorio;
import br.com.morhinga.repository.ReservatorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

import java.util.List;

@RestController
@RequestMapping("/api/reservatorios")
@CrossOrigin(origins = "*")
public class ReservatorioController {

    @Autowired
    private ReservatorioRepository repository;

    @GetMapping
    public List<Reservatorio> listarTodos() {
        return repository.findAll();
    }

    @GetMapping("/intervalo")
    public List<Reservatorio> porIntervalo(@RequestParam String inicio, @RequestParam String fim) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dataInicio = sdf.parse(inicio);
        Date dataFim = sdf.parse(fim);
        return repository.findByDataBetween(dataInicio, dataFim);
    }
}
