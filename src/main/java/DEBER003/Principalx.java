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
    
    var pais1=new Pais("Ecuador",2,"17.89 millones");
    var provincia1 =new Provincia("Azuay","Somos de agua","Cuenca",15,pais1);
    var ciudad1=new Ciudad("Gualaceo","Gustavo Vera",2448,provincia1);
    
    var pais2=new Pais("Chile",2,"19.21 millones");
    var provincia2 =new Provincia("Region Tarapaca","Ciudad Heroica","Iquique",2,pais2);
    var ciudad2=new Ciudad("Alto Hospicio","Julio Pérez Silva",600,provincia2);
    
    System.out.println(ciudad1.getinfoCiudad());
     System.out.println(ciudad2.getinfoCiudad());
    System.out.println("-------------------------------------------------------------------");
    
   var cliente1=new Cliente("Juan David Guncay Orellana","0106195951","Manuel Guillen y Vazques Correa","Gualaceo",true);
   var producto1 =new Producto("esfero",1.33,"022554",10);
   var factura1=new Factura("N10",cliente1,producto1);
   
   var cliente2=new Cliente("Nicolas Anthoni Cabrera","0103636985","Gran Colombia y Reyes","Cuanca",false);
   var producto2 =new Producto("calculadora",30,"023396",8);
   var factura2=new Factura("N100",cliente2,producto2);
   
   System.out.println(factura1.getinfoFactura());
    System.out.println(factura2.getinfoFactura());
   System.out.println("-------------------------------------------------------------------");        
    
   var estudiante1=new Estudiante("Juan David Guncay Orellana","Universidad Politecnica Saleciana","Cuenca","0106195951",2);
   var asignatura1=new Asignatura("Calculo de Varias variables",210,"Juan Prealta");
   var calificacion1= new Calificacion(20,10,asignatura1,estudiante1);
   
   var estudiante2=new Estudiante("Sancho Panza Master","Universidad del Pacifico","Cuenca","0306969784",3);
   var asignatura2=new Asignatura("Ingles A1",100,"Don Quijote");
   var calificacion2= new Calificacion(100,3,asignatura2,estudiante2);
    System.out.println(calificacion1.getinfoCalificacion());
    System.out.println(calificacion2.getinfoCalificacion());
   
   
    
    
    
    
    
    
    
    }
}
