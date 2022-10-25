/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAREA03;

/**
 *
 * @author LAB-2
 */
public class Principal03 {
    public static void main(String[] args){
        
    var Ecuador =new Seleccion();
    Ecuador.codigoFIFA="S324";
    Ecuador.nombre="Ernesto de la cruz";
    Ecuador.pais="ECU";
    Ecuador.participacionEnElMundial=10;
    Ecuador.Tecnico="Victos Salamanca";
    
    var enner=new Jugador();
    enner.nombre ="Benito Juares";
    enner.posicion="Defensa";
    enner.fechadeNacimeinto=1998;
    enner.equipo= Ecuador;
    System.out.println(enner.getInfo());
    
    var juan=new Jugador();
    juan.nombre="Jefeson Perez";
    juan.posicion="Frontal";
    juan.fechadeNacimeinto=1988;
    juan.equipo= Ecuador;
    System.out.println(juan.getInfo());
    
    var pedro=new Jugador();
    pedro.nombre="Ernesto";
    pedro.posicion="Delantero";
    pedro.fechadeNacimeinto=1993;
    pedro.equipo= Ecuador;
    System.out.println(pedro.getInfo());
    
    
    
    
    }
}