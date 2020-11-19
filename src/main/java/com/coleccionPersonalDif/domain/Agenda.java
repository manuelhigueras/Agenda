/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coleccionPersonalDif.domain;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


/**
 *
 * @author user
 */
public class Agenda implements Comparator<Tarea>{
   private Set<Tarea> toDoList;
   private Set<Tarea> doneList;
   
//   static{
//        Tarea t1 = new Tarea(, "Fecha 1", Prioridad.AHORA, );
//        Tarea t2 = new Tarea(, "Fecha 2", Prioridad.AHORA, );
//        Tarea t3 = new Tarea(, "Fecha 3", Prioridad.AHORA, );
//        Tarea t4 = new Tarea(, "Fecha 4", Prioridad.AHORA, );
//        Tarea t5 = new Tarea(, "Fecha 5", Prioridad.AHORA, );
//        Tarea t6 = new Tarea(, "Fecha 6", Prioridad.AHORA, );
//        Tarea t7 = new Tarea(, "Fecha 7", Prioridad.AHORA, );
//   }
   
    public Agenda() {
        this.toDoList = new HashSet<Tarea>();
        this.doneList = new HashSet<Tarea>();
    }
   
   public void addTareaToDo(Tarea objetivo){
       this.toDoList.add(objetivo);
   }
   
   public void pasarTareaToDoADone(Tarea t){
       toDoList.remove(t);
       t.setFechaRealizacion(new Date());
       doneList.add(t);
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
          System.out.println("-----------------------FINAL-----------------------------");
      }
      System.out.println("----------------------------------------------------");
    }
   
    private String fechaFormateada(Date d){
        DateFormat df = DateFormat.getDateTimeInstance();
        return df.format(d);
    }
   
   public void mostrarListDone(){
        System.out.println("--------------------------mostrarListDone--------------------------");
        for(Tarea listo: this.doneList){
            System.out.println("Fecha de Creacion:"+listo.getFechaRealizacion());
            System.out.println("Prioridad:"+listo.getPrioridad());
            System.out.println("Descripcion:"+listo.getDescripcion());
            System.out.println("Fecha de Realizacion:"+listo.getFechaRealizacion());
            System.out.println("-----------------------FINAL-----------------------------");
        }
   }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Agenda other = (Agenda) obj;
        if (!Objects.equals(this.toDoList, other.toDoList)) {
            return false;
        }
        if (!Objects.equals(this.doneList, other.doneList)) {
            return false;
        }
        return true;
    }
    
    @Override
    public int compare(Tarea o1, Tarea o2) {
         return o1.getPrioridad().compareTo(o2.getPrioridad());
    }
    
    public int comparePrioridadDescripcion(Tarea o1, Tarea o2) {
        if(o1.getPrioridad().ordinal() == o2.getPrioridad().ordinal())
            //return o1.getDescripcion().equals(o2.getDescripcion());
            return o1.getDescripcion().compareTo(o2.getDescripcion());
        else
            return o1.getPrioridad().ordinal() - o2.getPrioridad().ordinal();
    }
    
    public int compareFechaCreacionFinalizacion(Tarea o1, Tarea o2) {
         if(o1.getFechaCreacion() == o2.getFechaCreacion() )
             return o1.getFechaRealizacion().compareTo(o2.getFechaRealizacion());
         else
             return o1.getFechaCreacion().compareTo(o2.getFechaCreacion());
    }

    public Set<Tarea> getToDoList() {
        return toDoList;
    }

    public void setToDoList(Set<Tarea> toDoList) {
        this.toDoList = toDoList;
    }

    public Set<Tarea> getDoneList() {
        return doneList;
    }

    public void setDoneList(Set<Tarea> doneList) {
        this.doneList = doneList;
    }
    
    public Tarea buscarTareaPorDescripcion(String descripcion) throws AgendaException{
       ArrayList<Tarea> lista = new ArrayList<Tarea>();
       lista.addAll(toDoList);
       Collections.sort(lista, new ComparadorAgendaPorDescripcion());
       int posicion = Collections.binarySearch(lista, new Tarea(descripcion), new ComparadorAgendaPorDescripcion());
       if(posicion < 0){
             throw new AgendaException("No encontró una tarea en lista ToDo con la " + "descripción " + descripcion);
        }else{
             return lista.get(posicion);
        }
    }
    
}
