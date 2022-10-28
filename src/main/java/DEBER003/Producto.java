/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DEBER003;

/**
 *
 * @author David
 */
public class Producto {
     private String tipoProducto;
    private double precioProducto;
    private String numSerie;
    private int cantidad;

    public Producto(String tipoProducto, double precioProducto, String numSerie, int cantidad) {
        this.tipoProducto = tipoProducto;
        this.precioProducto = precioProducto;
        this.numSerie = numSerie;
        this.cantidad = cantidad;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public double getPromociones(){
    var retorno =0.0d;
        switch(this.tipoProducto){
            case "calculadora":
                retorno=0.1;
                break;
            case "lapiz":
                retorno=0.05;
                break;
            case "borrador":
                retorno=0.03;
                break;
            case "cartuchera":
                retorno=0.06;
                break;        
            case "sacapuntas":
                retorno=0.03;
                break;
            case "esfero":
                retorno=0.04;
                break;
            default:
                retorno=0;
                break;
    }
    return retorno;
    }
    
}
