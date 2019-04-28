package br.com.ccp3anmcaprevisaodotempo.Service;

import br.com.ccp3anmcaprevisaodotempo.model.Previsaodotempo;
import br.com.ccp3anmcaprevisaodotempo.repository.PrevisaodotempoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.Future;

@Service
public class PrevisaoService {

    private final PrevisaodotempoRepository repository;
    @Autowired
    public PrevisaoService(PrevisaodotempoRepository repository){
        this.repository = repository;
    }


    public Future <List<Previsaodotempo>> BuscarNomeFutu(String nome) {
        return repository.findAllByCidades_NomeIgnoreCase(nome);
    }

    public Future <Previsaodotempo> BuscarLocalFutu(int latitude, int longitude) {
        Future <Previsaodotempo> previsaodotempo = repository.findAllByCidades_LatitudeAndAndCidades_Longitude(latitude, longitude);
        return previsaodotempo;
    }

    public List<Previsaodotempo> buscarNomeCidadeQuery(String nome){
        return  repository.buscarCidadePorNome(nome);
    }
    public List<Previsaodotempo> buscarPorLocaQuery(int latitude, int longitude){
        return repository.buscarPorLatitudeELongitude(longitude,latitude);
    }

    public Previsaodotempo BuscarNome(String nome){
        return repository.buscarNome(nome);
    }

    public Previsaodotempo BuscarLocal3(int latitude,int longitude){
        return repository.BuscarLocal3(latitude,longitude);
    }

}
