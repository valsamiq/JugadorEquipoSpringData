package com.daw.basquet.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipoRepository extends JpaRepository<Equipo, Long>{
    Equipo findByName(String name);
    Equipo findByLocation(String location);
}
