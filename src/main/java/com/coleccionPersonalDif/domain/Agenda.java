/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coleccionPersonalDif.domain;

import java.util.Date;
import java.util.Set;

/**
 *
 * @author user
 */
public class Agenda {
   private Set<Tarea> toDoList;
   private Set<Tarea> doneList;
    
   public void addTareaToDo(Tarea objetivo){
       this.toDoList.add(objetivo);
   }
   
   public void completaTarea(Tarea objetivo){
       this.doneList.add(objetivo);
   }
   
   public void mostrarListToDo(){
       System.out.println("--------------------------mostrarListToDo--------------------------");
      for(Tarea objetivo: this.toDoList){
          System.out.println("Fecha de Creacion:"+objetivo.getFechaRealizacion());
          System.out.println("Prioridad:"+objetivo.getPrioridad());
          System.out.println("Descripcion:"+objetivo.getDescripcion());
          System.out.println("Fecha de Realizacion:"+objetivo.getFechaRealizacion());
      }
      System.out.println("----------------------------------------------------");
    }
   
   public void mostrarListDone(){
        System.out.println("--------------------------mostrarListDone--------------------------");
        for(Tarea listo: this.doneList){
            System.out.println("Fecha de Creacion:"+listo.getFechaRealizacion());
            System.out.println("Prioridad:"+listo.getPrioridad());
            System.out.println("Descripcion:"+listo.getDescripcion());
            System.out.println("Fecha de Realizacion:"+listo.getFechaRealizacion());
        }
        System.out.println("----------------------------------------------------");
   }
   
}
