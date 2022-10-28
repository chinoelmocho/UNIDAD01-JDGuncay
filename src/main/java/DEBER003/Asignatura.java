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
    
    private String nomAsignatura;
    private int horasTotales;
    private String profesor;

    public Asignatura(String nomAsignatura, int horasTotales, String profesor) {
        this.nomAsignatura = nomAsignatura;
        this.horasTotales = horasTotales;
        this.profesor = profesor;
    }

    public String getNomAsignatura() {
        return nomAsignatura;
    }

    public int getHorasTotales() {
        return horasTotales;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setNomAsignatura(String nomAsignatura) {
        this.nomAsignatura = nomAsignatura;
    }

    public void setHorasTotales(int horasTotales) {
        this.horasTotales = horasTotales;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }
    
    
    
    public String getinfoAsignatura(){
        var retorno = " de la materia de "+this.nomAsignatura+" con un total de horas "+this.horasTotales+" con el profesor "+this.profesor;
       return retorno; 
    }
}