/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coleccionPersonalDif.Index;

import com.coleccionPersonalDif.domain.Agenda;
import com.coleccionPersonalDif.domain.Prioridad;
import com.coleccionPersonalDif.domain.Tarea;
import java.util.Date;

/**
 *
 * @author Manuel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Agenda cuaderno = new Agenda();
        
        Tarea t1 = new Tarea(new Date(11,12,2020), "tocar narices", Prioridad.AHORA, new Date(2020,1,21));
        Tarea t2 = new Tarea(new Date(2020,11,20), "tocar narices", Prioridad.AHORA, new Date(2020,11,21));
        Tarea t3 = new Tarea(new Date(2020,11,20), "tocar narices", Prioridad.AHORA, new Date(2020,11,21));
        Tarea t4 = new Tarea(new Date(2020,11,20), "tocar narices", Prioridad.AHORA, new Date(2020,11,21));
        Tarea t5 = new Tarea(new Date(2020,11,20), "tocar narices", Prioridad.AHORA, new Date(2020,11,21));
        Tarea t6 = new Tarea(new Date(2020,11,20), "tocar narices", Prioridad.AHORA, new Date(2020,11,21));
        Tarea t7 = new Tarea(new Date(2020,11,20), "tocar narices", Prioridad.AHORA, new Date(2020,11,21));
        
        cuaderno.addTareaToDo(t1);
        cuaderno.addTareaToDo(t2);
        cuaderno.addTareaToDo(t3);
        cuaderno.addTareaToDo(t4);
        
        
        cuaderno.completaTarea(t5);
        cuaderno.completaTarea(t6);
        cuaderno.completaTarea(t7);
        
        
        
        cuaderno.mostrarListToDo();
        
        cuaderno.mostrarListDone();
        
    }
    
}
