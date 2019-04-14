package br.com.ccp3anmcaprevisaodotempo.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "cidade")
public class Cidades implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @Column (name = "nome")
    String nome ;
    @Column(name = "latitude")
    int latitude;
    @Column(name = "longitude")
    int longitude;

    @OneToMany (cascade = CascadeType.ALL,mappedBy = "cidades")
    @JoinColumn(name = "id_Cidade")
    private List<Previsaodotempo> previsaodotempos;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public long getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public List<Previsaodotempo> getPrevisaodotempos() {
        return previsaodotempos;
    }

    public void setPrevisaodotempos(List<Previsaodotempo> previsaodotempos) {
        this.previsaodotempos = previsaodotempos;
    }
}
