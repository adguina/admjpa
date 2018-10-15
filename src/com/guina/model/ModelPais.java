
package com.guina.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author agnaldo
 * Implementa java been(Contrutor sem argumento,Serializable,metodos private)
 */
@Entity
@Table(name = "tb001pais")
public class ModelPais implements Serializable{
    @Id
    //gerar o id automaticamente
    @SequenceGenerator(name = "seq_pais", sequenceName = "seq_pais_id",allocationSize = 1)
    @GeneratedValue(generator = "seq_pais",strategy = GenerationType.SEQUENCE) 
    @Column(name = "id_pais", nullable = false)
    private Integer id_pais;
    @Column(name = "nome_pais", nullable = false, length = 50)
    private String nome_pais;
    @Column(name = "iso_pais", nullable = false, length = 3)
    private String iso_pais;

    public ModelPais() {
        
    }
    /**
     * @return the id_pais
     */
    public Integer getId_pais() {
        return id_pais;
    }

    /**
     * @param id_pais the id_pais to set
     */
    public void setId_pais(Integer id_pais) {
        this.id_pais = id_pais;
    }

    /**
     * @return the nome_pais
     */
    public String getNome_pais() {
        return nome_pais;
    }

    /**
     * @param nome_pais the nome_pais to set
     */
    public void setNome_pais(String nome_pais) {
        this.nome_pais = nome_pais;
    }

    /**
     * @return the iso_pais
     */
    public String getIso_pais() {
        return iso_pais;
    }

    /**
     * @param iso_pais the iso_pais to set
     */
    public void setIso_pais(String iso_pais) {
        this.iso_pais = iso_pais;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.id_pais);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ModelPais other = (ModelPais) obj;
        if (!Objects.equals(this.id_pais, other.id_pais)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
