/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DEBER003;

/**
 *
 * @author Niko
 */
public class Asignatura {
    
    String nomAsignatura;
    int horasTotales;
    String profesor;
    
    public String getinfoAsignatura(){
        var retorno = " de la materia de "+this.nomAsignatura+" con un total de horas "+this.horasTotales+" con el profesor "+this.profesor;
       return retorno; 
    }
}