/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAREA03;

/**
 *
 * @author LAB-2
 */
public class Seleccion {
    String codigoFIFA;
    String nombre;
    String pais;
    String jugadorstelar;
    int participacionEnElMundial;
    Director tecnicosprt;
    
 public String obtienePais(){
    var retorno="Desconocido";
    switch(codigoFIFA){
        case "ECU":
            retorno="Ecuador";
            break;
        case "ARG":
            retorno="Aregentina";
            break;
        case "CHL":
            retorno="Chile";
            break;
        case "HON":
            retorno="Honduras";
            break;
        default :
            break;
    }
    return retorno;

 }
 

}