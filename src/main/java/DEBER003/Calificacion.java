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
    private int totalPreguntas;
    private int preguntasCorrectas;
    private Asignatura nomAsignatura;
    private Estudiante nomEstudiante;

    public Calificacion(int totalPreguntas, int preguntasCorrectas, Asignatura nomAsignatura, Estudiante nomEstudiante) {
        this.totalPreguntas = totalPreguntas;
        this.preguntasCorrectas = preguntasCorrectas;
        this.nomAsignatura = nomAsignatura;
        this.nomEstudiante = nomEstudiante;
    }

    public int getTotalPreguntas() {
        return totalPreguntas;
    }

    public int getPreguntasCorrectas() {
        return preguntasCorrectas;
    }

    public Asignatura getNomAsignatura() {
        return nomAsignatura;
    }

    public Estudiante getNomEstudiante() {
        return nomEstudiante;
    }

    public void setTotalPreguntas(int totalPreguntas) {
        this.totalPreguntas = totalPreguntas;
    }

    public void setPreguntasCorrectas(int preguntasCorrectas) {
        this.preguntasCorrectas = preguntasCorrectas;
    }

    public void setNomAsignatura(Asignatura nomAsignatura) {
        this.nomAsignatura = nomAsignatura;
    }

    public void setNomEstudiante(Estudiante nomEstudiante) {
        this.nomEstudiante = nomEstudiante;
    }

    
    
    
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
