/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAREA03;

/**
 *
 * @author LAB-2
 */
public class Jugador {
    String nombre;
    int fechadeNacimeinto;
    String posicion;
    Seleccion equipo;
    
    public String getInfo(){
     return "EL nombre es "+this.nombre+"y nacio el dia: "+this.fechadeNacimeinto +"Esta en en equipo: "+this.equipo.pais +" Con un tecnico "+this.equipo.Tecnico; 
    
    }
    
    
    
}