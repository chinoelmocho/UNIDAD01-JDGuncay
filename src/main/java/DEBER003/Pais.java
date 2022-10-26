/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DEBER003;

/**
 *
 * @author David
 */
public class Pais {
    String nombrePais;
    int numeroContinente;
    String poblacion;
    
    
    public String getNombreContinente(){
        var retorno ="";
        var continente=this.numeroContinente;
        switch(continente){
            case 1:
                retorno="Africano";
                break;
            case 2:
                retorno="Américano";
                break;
            case 3:
                retorno="Antártida";
                break;
            case 4:
                retorno="Asia";
                break;        
            case 5:
                retorno="Europa";
                break;
            case 6:
                retorno="Oceanía";
                break;
            default:
                retorno="Desconocido";
                break;
    }
    return retorno;
    }
    public String getinfoPais(){
        var retorno ="el nombre del pais es "+this.nombrePais+" y esta ubicado en el contiente "
                +this.getNombreContinente()+", con una poblacion de "+this.poblacion;
       return retorno; 
       
    }
}
