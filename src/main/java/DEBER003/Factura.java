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
     String numFac;
    Cliente whoCliente;
    Producto productoComprado;
    
    
    public double getprecio(){
       var catidades=this.productoComprado.cantidad;
       var descuento=1.0;
       var preciounitario=this.productoComprado.precioProducto;
       if(this.whoCliente.ifVIP){
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
