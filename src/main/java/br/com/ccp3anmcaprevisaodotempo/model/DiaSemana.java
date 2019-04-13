package br.com.ccp3anmcaprevisaodotempo.model;

import javax.persistence.*;

@Entity
@Table (name = "tb_Diasemana")
public class DiaSemana {
    @Id
    @Column (name = "ID_SEMANA")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    long id;
    @Column(name = "DIA")
    String DescricaoSemana;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricaoSemana() {
        return DescricaoSemana;
    }

    public void setDescricaoSemana(String descricaoSemana) {
        DescricaoSemana = descricaoSemana;
    }
}
