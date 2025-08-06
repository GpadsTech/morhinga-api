package br.com.morhinga.repository;

import br.com.morhinga.model.SensorDePh;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SensorPhRepository extends MongoRepository<SensorDePh, String> {
    List<SensorDePh> findByDataBetween(String inicio, String fim);
}
