package br.com.ccp3anmcaprevisaodotempo.repository;

import br.com.ccp3anmcaprevisaodotempo.model.Cidades;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ccp3anmcaprevisaodotempo.model.Previsaodotempo;


public interface PrevisaodotempoRepository extends JpaRepository<Previsaodotempo, Long> {

    Previsaodotempo findAllByCidades_LatitudeAndAndCidades_Longitude (int latitude,int longetude);
    Previsaodotempo findAllByCidades_Nome(String nome);


}
