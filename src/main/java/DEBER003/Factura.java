/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DEBER003;

/**
 *
 * @author David
 */
public class Factura {
     private String numFac;
    private Cliente whoCliente;
    private Producto productoComprado;

    public Factura(String numFac, Cliente whoCliente, Producto productoComprado) {
        this.numFac = numFac;
        this.whoCliente = whoCliente;
        this.productoComprado = productoComprado;
    }

    public String getNumFac() {
        return numFac;
    }

    public Cliente getWhoCliente() {
        return whoCliente;
    }

    public Producto getProductoComprado() {
        return productoComprado;
    }

    public void setNumFac(String numFac) {
        this.numFac = numFac;
    }

    public void setWhoCliente(Cliente whoCliente) {
        this.whoCliente = whoCliente;
    }

    public void setProductoComprado(Producto productoComprado) {
        this.productoComprado = productoComprado;
    }
    
    
    public double getprecio(){
       var catidades=this.productoComprado.getPrecioProducto();
       var descuento=1.0;
       var preciounitario=this.productoComprado.getPrecioProducto();
       if(this.whoCliente.isIfVIP()){
           descuento=0.95;
       }
        var retorno = preciounitario*catidades*descuento;
        retorno= retorno-(retorno*(this.productoComprado.getPromociones()));
       return retorno; 
    }
    public String getinfoFactura(){
        var retorno = "El numero de la factura es "+this.numFac+this.whoCliente.getinfoCliente()+" con un total de "+this.getprecio()+"$";
       return retorno; 
    }
}
