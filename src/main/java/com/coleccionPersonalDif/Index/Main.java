/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coleccionPersonalDif.Index;

import com.coleccionPersonalDif.domain.Agenda;
import com.coleccionPersonalDif.domain.Prioridad;
import com.coleccionPersonalDif.domain.Tarea;
import java.text.DateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Manuel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Date f1 = new Date(121,5,13);
        
        Agenda cuaderno = new Agenda();

        Tarea t1 = new Tarea(f1, "Fecha 1", Prioridad.AHORA, f1);
        Tarea t2 = new Tarea(f1, "Fecha 2", Prioridad.ALTA, f1);
        Tarea t3 = new Tarea(f1, "Fecha 3", Prioridad.BAJA, f1);
        Tarea t4 = new Tarea(f1, "Fecha 4", Prioridad.MEDIA, f1);
        Tarea t5 = new Tarea(f1, "Fecha 5", Prioridad.MEDIA, f1);
        Tarea t6 = new Tarea(f1, "Fecha 6", Prioridad.ALTA, f1);
        Tarea t7 = new Tarea(f1, "Fecha 7", Prioridad.AHORA, f1);
        Tarea t8 = new Tarea(f1, "Fecha 7", Prioridad.BAJA, f1);
        
        cuaderno.addTareaToDo(t1);
        cuaderno.addTareaToDo(t2);
        cuaderno.addTareaToDo(t3);
        cuaderno.addTareaToDo(t4);
        
        System.out.println("-----------------------------------");
        System.out.println("-------ORDENA POR PRIORIDAD--------");
        System.out.println("-----------------------------------");
        cuaderno.compare(t1, t2);
        cuaderno.compare(t3, t4);
        cuaderno.compare(t5, t6);
        cuaderno.compare(t7, t8);
        
        cuaderno.completaTarea(t5);
        cuaderno.completaTarea(t6);
        cuaderno.completaTarea(t7);
        
        cuaderno.mostrarListToDo();
        cuaderno.mostrarListDone();
        
        System.out.println("-----------------------------------");
        System.out.println("-------ORDENA POR Prioridad-Descripcion--------");
        System.out.println("-----------------------------------");
        
        cuaderno.comparePrioridadDescripcion(t1, t2);
        cuaderno.comparePrioridadDescripcion(t3, t4);
        cuaderno.comparePrioridadDescripcion(t5, t6);
        cuaderno.comparePrioridadDescripcion(t7, t8);
        
        cuaderno.mostrarListToDo();
        cuaderno.mostrarListDone();
        
        
        cuaderno.mostrarListToDo();
        
        cuaderno.mostrarListDone();
        
        Date f = new Date();
        DateFormat df = DateFormat.getDateInstance();
        System.out.println("Fecha " + df.format(f));
        
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.LONG, Locale.FRANCE);
        System.out.println("Fecha " + df2.format(f));
        
        //Locale france = new Locale("fr");
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG, Locale.ITALIAN);
        System.out.println("Fecha " + df3.format(f));
        
        Locale l = new Locale("zh","HK");
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.LONG, l);
        System.out.println("Fecha " + df4.format(f));
        
        DateFormat df5 = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT);
        System.out.println("Fecha " + df4.format(f));
        
    }
    
}
