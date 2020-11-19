/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coleccionPersonalDif.domain;

import java.util.Comparator;

/**
 *
 * @author user
 */
public class ComparadorAgendaPorDescripcion implements Comparator<Tarea> {

    @Override
    public int compare(Tarea t1, Tarea t2) {
         return t1.getDescripcion().compareTo(t2.getDescripcion());
    }
    
}