package br.com.morhinga.repository;

import br.com.morhinga.model.SensorDeSolo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SensorSoloRepository extends MongoRepository<SensorDeSolo, String> {
    List<SensorDeSolo> findByDataBetween(String inicio, String fim);
}
