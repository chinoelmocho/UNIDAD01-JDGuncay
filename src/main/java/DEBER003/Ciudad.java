/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DEBER003;

/**
 *
 * @author David
 */
public class Ciudad {
    String nombreCiudad;
    String alcalde;
    double Altitud;
    Provincia nomProvincia;
    public Ciudad(String nombreCiudad, String alcalde, double Altitud, Provincia nomProvincia) {
        this.nombreCiudad = nombreCiudad;
        this.alcalde = alcalde;
        this.Altitud = Altitud;
        this.nomProvincia = nomProvincia;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public String getAlcalde() {
        return alcalde;
    }

    public double getAltitud() {
        return Altitud;
    }

    public Provincia getNomProvincia() {
        return nomProvincia;
    }


    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public void setAlcalde(String alcalde) {
        this.alcalde = alcalde;
    }

    public void setAltitud(double Altitud) {
        this.Altitud = Altitud;
    }

    public void setNomProvincia(Provincia nomProvincia) {
        this.nomProvincia = nomProvincia;
    }

    
    public String getinfoCiudad(){
        var retorno = "La ciudad de "+this.nombreCiudad+" acargo del alcalde "+this.alcalde
                +" ademas ubicado a una altitud de "+this.Altitud+"m \n"+this.nomProvincia.getinfoProvincia();
       return retorno; 
    }
}
