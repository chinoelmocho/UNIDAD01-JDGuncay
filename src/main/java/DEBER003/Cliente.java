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
    private String nombreCliente;
    private String cedula;
    private String ciudad;
    private String direccion;
    private boolean ifVIP;

    public Cliente(String nombreCliente, String cedula, String ciudad, String direccion, boolean ifVIP) {
        this.nombreCliente = nombreCliente;
        this.cedula = cedula;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.ifVIP = ifVIP;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getCedula() {
        return cedula;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public boolean isIfVIP() {
        return ifVIP;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setIfVIP(boolean ifVIP) {
        this.ifVIP = ifVIP;
    }
    
    public String getinfoCliente(){
        var retorno = " a nombre de "+this.nombreCliente+" con un numero de cedula "+this.cedula+" en la ciudad de "+this.ciudad+ " y su direcion es "+this.direccion;
       return retorno; 
    }
}
