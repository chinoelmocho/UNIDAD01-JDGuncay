/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DEBER003;

/**
 *
 * @author David
 */
public class Estudiante {
    String nombreEstudiante;
    String universidad;
    String sede;
    String cedula;
    int numMatricula;
    
    public String getinfoEstudiante(){
        var retorno = "El estudiante "+this.nombreEstudiante+" con numero de cedula "+this.cedula+ " de la universidad "+this.universidad+ " en la sede "+this.sede ;
       return retorno; 
    }
}
