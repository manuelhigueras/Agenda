/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coleccionPersonalDif.domain;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author user
 */
public class Tarea {
    private Date fechaCreacion; 
    private String descripcion;
    private Prioridad niveles;
    private Date fechaRealizacion;

    public Tarea(Date fechaCreacion, String descripcion, Prioridad niveles, Date fechaRealizacion) {
        this.fechaCreacion = fechaCreacion;
        this.descripcion = descripcion;
        this.niveles = niveles;
        this.fechaRealizacion = fechaRealizacion;
    }

    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.niveles = Prioridad.BAJA;
        this.fechaCreacion = new Date(); //fecha sistema
        this.fechaRealizacion = null;
    }
    
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Prioridad getPrioridad() {
        return niveles;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.niveles = prioridad;
    }

    public Date getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(Date fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.fechaCreacion);
        hash = 67 * hash + Objects.hashCode(this.descripcion);
        hash = 67 * hash + Objects.hashCode(this.niveles);
        hash = 67 * hash + Objects.hashCode(this.fechaRealizacion);
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
        final Tarea other = (Tarea) obj;
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        if (!Objects.equals(this.fechaCreacion, other.fechaCreacion)) {
            return false;
        }
        if (this.niveles != other.niveles) {
            return false;
        }
        if (!Objects.equals(this.fechaRealizacion, other.fechaRealizacion)) {
            return false;
        }
        return true;
    }
    
    
       
}
