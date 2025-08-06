package br.com.morhinga.repository;

import br.com.morhinga.model.Reservatorio;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;
import java.util.List;

public interface ReservatorioRepository extends MongoRepository<Reservatorio, String> {
    List<Reservatorio> findByDataBetween(Date inicio, Date fim);
}
