package com.daw.basquet.data;

import javax.persistence.criteria.CriteriaBuilder;

public class EstadisticasPosicion {

    private String posicion;

    private Double numCanastas;
    //private Integer maxCanastas;
    //private Integer minCanastas;

    private Double numRebotes;
    //private Integer maxRebotes;
    //private Integer minRebotes;

    private Double numAsistencias;
    //private Integer maxAsistencias;
    //private Integer minAsistencias;

    public EstadisticasPosicion(String posicion, Double numCanastas, Double numRebotes, Double numAsistencias) {
        this.posicion = posicion;
        this.numCanastas = numCanastas;
        this.numRebotes = numRebotes;
        this.numAsistencias = numAsistencias;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Double getNumCanastas() {
        return numCanastas;
    }

    public void setNumCanastas(Double numCanastas) {
        this.numCanastas = numCanastas;
    }

    public Double getNumRebotes() {
        return numRebotes;
    }

    public void setNumRebotes(Double numRebotes) {
        this.numRebotes = numRebotes;
    }

    public Double getNumAsistencias() {
        return numAsistencias;
    }

    public void setNumAsistencias(Double numAsistencias) {
        this.numAsistencias = numAsistencias;
    }

    @Override
    public String toString() {
        return "EstadisticasPosicion{" +
                "posicion='" + posicion + '\'' +
                ", numCanastas=" + numCanastas +
                ", numRebotes=" + numRebotes +
                ", numAsistencias=" + numAsistencias +
                '}';
    }
}