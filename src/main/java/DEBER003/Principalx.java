/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DEBER003;

/**
 *
 * @author David
 */
public class Principalx {
    public static void main (String[] args){
    var provincia1 =new Provincia();
    provincia1.nomProvincia="Azuay";
    provincia1.lema="Somo de agua";
    provincia1.capital="Cuanca";
    provincia1.subdiviciones=15;
    
    var pais1=new Pais();
    pais1.nombrePais="Ecuador";
    pais1.numeroContinente=2;
    pais1.poblacion="17.89 millnes";
    
    var ciudad1=new Ciudad();
    ciudad1.nombreCiudad ="Gualaceo";
    ciudad1.alcalde="Gustavo Vera";
    ciudad1.Altitud=2448;
    ciudad1.nomProvincia=provincia1;
    ciudad1.nomPais=pais1;
    
    System.out.println(ciudad1.getinfoCiudad());
    System.out.println("-------------------------------------------------------------------");
    
   var cliente1=new Cliente();
   cliente1.nombreCliente="Juan David Guncay Orellana";
   cliente1.cedula="0106195951";
   cliente1.direccion="Manuel Guillen y Vazques Correa";
   cliente1.ciudad="Gualaceo";
   cliente1.ifVIP=true;
   
   var producto1 =new Producto();
   producto1.tipoProducto="esfero";
   producto1.cantidad=10;
   producto1.numSerie="022554";
   producto1.precioProducto=1.33;
  
   var factura1=new Factura();
   factura1.numFac="N10";
   factura1.productoComprado=producto1;
   factura1.whoCliente=cliente1;
   
   System.out.println(factura1.getinfoFactura());
   System.out.println("-------------------------------------------------------------------");        
    
   var estudiante1=new Estudiante();
   estudiante1.cedula="0106195951";
   estudiante1.nombreEstudiante="Juan David Guncay Orellana";
   estudiante1.numMatricula=2;
   estudiante1.sede="Cuenca";
   estudiante1.universidad="Universidad Politecnica Saleciana";
   
   var asignatura1=new Asignatura();
   asignatura1.horasTotales=210;
   asignatura1.nomAsignatura="Calculo de Varias variables";
   asignatura1.profesor="Juan Prealta";
   
   var calificacion1= new Calificacion();
   calificacion1.nomAsignatura=asignatura1;
   calificacion1.nomEstudiante=estudiante1;
   calificacion1.preguntasCorrectas=10;
   calificacion1.totalPreguntas=20;
   
    System.out.println(calificacion1.getinfoCalificacion());
   
   
    
    
    
    
    
    
    
    }
}
