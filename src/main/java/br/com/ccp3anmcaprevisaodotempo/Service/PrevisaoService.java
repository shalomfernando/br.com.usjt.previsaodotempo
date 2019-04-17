package br.com.ccp3anmcaprevisaodotempo.Service;

import br.com.ccp3anmcaprevisaodotempo.model.Cidades;
import br.com.ccp3anmcaprevisaodotempo.model.Previsaodotempo;
import br.com.ccp3anmcaprevisaodotempo.repository.PrevisaodotempoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrevisaoService {

    @Autowired
    PrevisaodotempoRepository pr;

    public Previsaodotempo BuscarNome(String nome) {
        Previsaodotempo previsaodotempo = pr.findAllByCidades_Nome(nome);
        return previsaodotempo;
    }

    public Previsaodotempo BuscarLocal(int latitude, int longitude) {
        Previsaodotempo previsaodotempo = pr.findAllByCidades_LatitudeAndAndCidades_Longitude(latitude, longitude);
        return previsaodotempo;
    }

}
