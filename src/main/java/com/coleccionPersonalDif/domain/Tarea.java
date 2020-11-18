/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coleccionPersonalDif.domain;

import java.util.Date;

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
          
}
