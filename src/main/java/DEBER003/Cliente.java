/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DEBER003;

/**
 *
 * @author David
 */
public class Cliente {
    String nombreCliente;
    String cedula;
    String ciudad;
    String direccion;
    boolean ifVIP;
    
    public String getinfoCliente(){
        var retorno = " a nombre de "+this.nombreCliente+" con un numero de cedula "+this.cedula+" en la ciudad de "+this.ciudad+ " y su direcion es "+this.direccion;
       return retorno; 
    }
}
