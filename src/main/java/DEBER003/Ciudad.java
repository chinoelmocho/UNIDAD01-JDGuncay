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
    Pais nomPais;
    
    public String getinfoCiudad(){
        var retorno = "La ciudad de "+this.nombreCiudad+" acargo del alcalde "+this.alcalde
                +" ademas ubicado a una altitud de "+this.Altitud+"m \n"+this.nomProvincia.getinfoProvincia()+"\n"+this.nomPais.getinfoPais();
       return retorno; 
    }
}
