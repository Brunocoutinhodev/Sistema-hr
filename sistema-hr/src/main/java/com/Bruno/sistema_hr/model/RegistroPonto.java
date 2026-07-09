
package com.Bruno.sistema_hr.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class RegistroPonto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    
    @ManyToOne
   private Freelancer freelancer;
    
    
    private LocalDateTime data_dia;
    
    @Enumerated(EnumType.STRING)
    private TipoRegistro tipo;

    public RegistroPonto() {
       }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Freelancer getFreelancer() {
        return freelancer;
    }

    public void setFreelancer(Freelancer freelancer) {
        this.freelancer = freelancer;
    }

    public LocalDateTime getData_dia() {
        return data_dia;
    }

    public void setData_dia(LocalDateTime data_dia) {
        this.data_dia = data_dia;
    }

    public TipoRegistro getTipo() {
        return tipo;
    }

    public void setTipo(TipoRegistro tipo) {
        this.tipo = tipo;
    }


    
    
    
    
}
