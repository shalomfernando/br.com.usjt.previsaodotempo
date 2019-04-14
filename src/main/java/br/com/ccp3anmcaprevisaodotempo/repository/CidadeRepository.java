package br.com.ccp3anmcaprevisaodotempo.repository;

import br.com.ccp3anmcaprevisaodotempo.model.Cidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CidadeRepository extends JpaRepository<Cidades,Long> {

}
