/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabajo_en_clases1;

/**
 *
 * @author David
 */
public class Asignatura {
      int codigo;
    String nombre;
    int horas;
    String nombredeldocente;
    int costohoras;
    boolean vigente;

    String mostrarinformacion() {
        var informacion = "El nombre de la asignatura es" + this.nombre+" el docente es: "
                + this.nombredeldocente + " la asignatura cuesta: " + this.costohoras+" por hora";
        return informacion;
    }

    double calcularprecio() {
        var Costohorascal = horas * this.costohoras;
        return Costohorascal;
    }
    
}
