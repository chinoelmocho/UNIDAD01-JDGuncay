/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DEBER003;

/**
 *
 * @author David
 */
public class Calificacion {
    int totalPreguntas;
    int preguntasCorrectas;
    Asignatura nomAsignatura;
    Estudiante nomEstudiante;

    public String passMateria() {
        var retorno = "";
        var nota=(this.preguntasCorrectas*10)/this.totalPreguntas;
        if(nota<7 && this.nomEstudiante.numMatricula<3){
          retorno=" Perdio la materia con derecho a una nueva matricula";
        
        }
        if(nota>=7){
        retorno=" Paso la materia";
        
        }
        if(nota<7 && this.nomEstudiante.numMatricula>=3){
        
        retorno=" Perdio la materia sin derecho a repetirla";
        }
        return retorno; 

    }

    public String getinfoCalificacion() {
        var retorno = this.nomEstudiante.getinfoEstudiante()+this.nomAsignatura.getinfoAsignatura()+"\n "+this.passMateria();
        return retorno;
    }
}
