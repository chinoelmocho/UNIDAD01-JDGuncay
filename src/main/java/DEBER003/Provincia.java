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
    private String nomProvincia;
    private String lema;
    private String capital;
    private int subdiviciones;
    private Pais paisorigen;

    public Provincia(String nomProvincia, String lema, String capital, int subdiviciones,Pais paisorigen) {
        this.nomProvincia = nomProvincia;
        this.lema = lema;
        this.capital = capital;
        this.subdiviciones = subdiviciones;
        this.paisorigen=paisorigen;
    }

    public String getNomProvincia() {
        return nomProvincia;
    }

    public String getLema() {
        return lema;
    }

    public String getCapital() {
        return capital;
    }

    public int getSubdiviciones() {
        return subdiviciones;
    }

    public void setNomProvincia(String nomProvincia) {
        this.nomProvincia = nomProvincia;
    }

    public void setLema(String lema) {
        this.lema = lema;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setSubdiviciones(int subdiviciones) {
        this.subdiviciones = subdiviciones;
    }
    
    public String getinfoProvincia(){
        var retorno = "La provincia  "+this.nomProvincia+" con el lema "+this.lema
                +" su capital es "+this.capital+" y cuenta con "+this.subdiviciones+" diviciones."+"\n"+this.paisorigen.getinfoPais();
       return retorno; 
    }
}
