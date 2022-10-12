/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabajo_en_clases1;

/**
 *
 * @author David
 */
public class Principal {
    public static void main(String [] arga) {
    var progra = new Asignatura();
    progra.codigo=4752;
    progra.costohoras=6;
    progra.horas=200;
    progra.nombre="Programacion orientada a objetos ";
    progra.nombredeldocente="Mauricio Ortiz Ochoa";
    progra.vigente=true;
    System.out.println(progra.mostrarinformacion());
    System.out.println(progra.calcularprecio());
            
    
    var progra2 = new Asignatura();
    progra2.codigo=4152;
    progra2.costohoras=5;
    progra2.horas=100;
    progra2.nombre="Educacion fisica ";
    progra2.nombredeldocente="Pedro Mauricio";
    progra2.vigente=true;
    System.out.println(progra2.mostrarinformacion());
    System.out.println(progra2.calcularprecio());
    
    var progra3 = new Asignatura();
    progra3.codigo=2514;
    progra3.costohoras=7;
    progra3.horas=160;
    progra3.nombre="Calculo diferencial ";
    progra3.nombredeldocente="Ochoa Avila Juan";
    progra3.vigente=true;
    System.out.println(progra3.mostrarinformacion());
    System.out.println(progra3.calcularprecio());
 
    System.out.println("\n \n \n \n");
    
    var auto1 = new Auto();
    auto1.marca="Toyota";
    auto1.placa="ABC25";
    auto1.propietario="Peres Juanito";
    System.out.println(auto1.mostrarinfo());
    System.out.println("El carro es de "+auto1.getPAismarca());
    
    var auto2 = new Auto();
    auto2.marca="jetour";
    auto2.placa="ABC25";
    auto2.propietario="Peres Juanito";
    System.out.println(auto2.mostrarinfo());
    System.out.println("El carro es de "+auto2.getPAismarca());
    
    var auto3 = new Auto();
    auto3.marca="Mercedes Bens";
    auto3.placa="ABC25";
    auto3.propietario="Peres Juanito";
    System.out.println(auto3.mostrarinfo());
    System.out.println("El carro es de "+auto3.getPAismarca());
    }   
}
