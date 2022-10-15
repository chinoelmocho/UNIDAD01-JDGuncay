/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TARERA02;

/**
 *
 * @author David
 */
public class Principal {

    public static void main(String[] arga) {
        var empleado1 = new Empleado();
        empleado1.nombre = "Juan David";
        empleado1.costoHoras = 3;
        empleado1.horasTrabajadas = 120;
        empleado1.yearingreso = 2012;

        System.out.println("El empleado " + empleado1.nombre + " \ntiene un ingreso neto es de " + empleado1.calcularIngresos(2022) + "\nEl valor de bonos por horas extras es de " + empleado1.bonoHorasExtra() + "\nEl impuesto neto es de " + empleado1.calcularImpuesto(300, 400, 500) + "\nCon un valor total de " + empleado1.calcularTotal(2022, 300, 400, 500));

    }

}
