package br.com.morhinga.repository;

import br.com.morhinga.model.Pluviometro;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PluviometroRepository extends MongoRepository<Pluviometro, String> {
    List<Pluviometro> findByDataBetween(String inicio, String fim);
}
