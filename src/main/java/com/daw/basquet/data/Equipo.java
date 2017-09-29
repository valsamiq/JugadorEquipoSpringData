package com.daw.basquet.data;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
public class Equipo {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String location;
    private LocalDate fechaCreacion;

    public Equipo() {
    }

    public Equipo(String name, String location, LocalDate fechaCreacion) {
        this.name = name;
        this.location = location;
        this.fechaCreacion = fechaCreacion;
    }
}