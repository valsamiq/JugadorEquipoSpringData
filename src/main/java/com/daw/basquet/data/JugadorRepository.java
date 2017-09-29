package com.daw.basquet.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.time.LocalDate;
import java.util.List;

public interface JugadorRepository extends JpaRepository<Jugador, Long> {
    //List<Jugador> findByNombre(String nombre);
    //List<Jugador> findByNumCanastasGreaterThanEqual(Integer numCanastas);
    List<Jugador> findByNumCanastasBetween(Integer min, Integer max);
    List<Jugador> findByNombreContaining(String nombre);
    List<Jugador> findByPosicion(String posicion);
    List<Jugador> findByFechaNacimientoBefore(LocalDate fechaNacimiento);

    @Query("select new com.daw.basquet.data.EstadisticasPosicion (j.posicion, avg(j.numAsistencias), avg(j.numAsistencias), avg(j.numAsistencias)) " +
    "from Jugador j group by j.posicion")
    List<EstadisticasPosicion> AvgCanastasAndAvgAndNumAsistenciasAndNumRebotesGroupBOrderByPosicion();
    //List<Jugador> findBy

    List<Jugador> findByEquipoName(String nombre);
    List<Jugador> findByEquipoNameAndPosicion(String equipo, String posicion);

    List<Jugador> findTopByEquipoNameOrderByNumCanastasDesc(String equipo);

}