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
    private Enum prioridad;
    private String fechaRealizacion;

    public Tarea(Date fechaCreacion, String descripcion, String prioridad, String fechaRealizacion) {
        this.fechaCreacion = fechaCreacion;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
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

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(String fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }
          
}
