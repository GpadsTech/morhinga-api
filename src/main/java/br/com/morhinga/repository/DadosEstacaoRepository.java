package br.com.morhinga.repository;

import br.com.morhinga.model.DadosEstacao;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface DadosEstacaoRepository extends MongoRepository<DadosEstacao, String> {
    List<DadosEstacao> findByDataBetween(String inicio, String fim);
}
