/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DEBER003;

/**
 *
 * @author David
 */
public class Provincia {
    String nomProvincia;
    String lema;
    String capital;
    int subdiviciones;
    
    public String getinfoProvincia(){
        var retorno = "La provincia  "+this.nomProvincia+" con el lema "+this.lema
                +" su capital es "+this.capital+" y cuenta con "+this.subdiviciones+" diviciones.";
       return retorno; 
    }
}
