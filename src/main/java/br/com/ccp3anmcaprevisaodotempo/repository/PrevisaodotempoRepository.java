package br.com.ccp3anmcaprevisaodotempo.repository;

import br.com.ccp3anmcaprevisaodotempo.model.Cidades;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ccp3anmcaprevisaodotempo.model.Previsaodotempo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.Future;

public interface PrevisaodotempoRepository extends JpaRepository<Previsaodotempo, Long> {


//    Previsaodotempo findAllByCidades_LatitudeAndAndCidades_Longitude (int latitude,int longetude);
//
//    Previsaodotempo findAllByCidades_NomeIgnoreCase(String nome);




    // Aula 1. Escreva os seguintes métodos de busca usando o mecanismo de construções de query do
    //Spring Data. Todos eles devem executar de forma assíncrona

    @Async
    public Future <Previsaodotempo > findAllByCidades_LatitudeAndAndCidades_Longitude(int latitude,int longetude);

    @Async
    Future < List <Previsaodotempo> > findAllByCidades_NomeIgnoreCase (String nome);

//    @Async
//    public Future< Previsaodotempo > findAllByCidades_NomeIgnoreCase(String nome);

    //2. Escreva os métodos do Exercício 1 usando a anotação Query no repositório do Spring
    //Data

    @Query ("SELECT p from Previsaodotempo p join p.cidades c on c.id = p.cidades where upper(c.nome) = upper(:nome)  ")
    public List<Previsaodotempo> buscarCidadePorNome(String nome);

    @Query ("SELECT p from Previsaodotempo p JOIN p.cidades c on c.id = p.cidades where :latitude = c.latitude and :longitude = c.longitude")
    public List<Previsaodotempo> buscarPorLatitudeELongitude(int longitude, int latitude);

}
