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

    public Estudiante(String nombreEstudiante, String universidad, String sede, String cedula, int numMatricula) {
        this.nombreEstudiante = nombreEstudiante;
        this.universidad = universidad;
        this.sede = sede;
        this.cedula = cedula;
        this.numMatricula = numMatricula;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public String getUniversidad() {
        return universidad;
    }

    public String getSede() {
        return sede;
    }

    public String getCedula() {
        return cedula;
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }
    
    public String getinfoEstudiante(){
        var retorno = "El estudiante "+this.nombreEstudiante+" con numero de cedula "+this.cedula+ " de la universidad "+this.universidad+ " en la sede "+this.sede ;
       return retorno; 
    }
}
