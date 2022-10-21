/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEMANA02;

import java.util.Scanner;

/**
 *
 * @author PC-12
 */
public class Principal2 {

    public static void main(String[] args) {
        /*var a = 0;
        while (a < 10) {
            System.out.println("a " + a);
            a += 1;
        }
        System.out.println(" Ingrese numeros");
        var lectura = new Scanner(System.in);
        var numero = lectura.nextInt();
        while (numero < 10) {
            System.out.println(" Ingrese numeor valido");
            lectura = new Scanner(System.in);
            numero = lectura.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("XD \n");
        }
        var numeros = new int[5];
        numeros[0] = 7;
        numeros[1] = 9;
        numeros[2] = 4;
        numeros[3] = 11;
        numeros[4] = 3;
        for (int i = 0; i < 5; i++) {
            System.out.println("posicion "+(i+1)+": "+numeros[i]);
        }
        var decimalList = new double[3];
        decimalList[0] = 1.3;
        decimalList[1] = 1.6;
        decimalList[2] = 1.9;
        for (int i = 0; i < 3; i++) {
            System.out.println("posicion "+(i+1)+": "+decimalList[i]);
        }
        System.out.println(" Ingrese la dimensión del arreglo ");
        var dimension = new Scanner(System.in);
        var valor = dimension.nextInt();
        var num = new int[valor];
        var x = valor;
        var variable = 0;
        for (int i = 0; i < num.length; i++) {
            System.out.println("Ingrese el valor de la posicion " + (i + 1) + ": ");
            var leer = new Scanner(System.in);
            variable = leer.nextInt();
            num[i] = variable;
        }
        System.out.println("Los numeros ingresados son: ");
        for (int i = 0; i < x; i++) {
            System.out.println(num[i]);}*/
 /*
                    
        var lectura = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas que tendra la matriz");
        var file = lectura.nextInt();
        System.out.println("Ingrese el numero de columnas que tendra la matriz");
        var columnas = lectura.nextInt();
        var matriz = new int[file][columnas];
        for (int i = 0; i < file; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Ingrese el valor de la pocicion [" + (i + 1) + "]" + "[" + (j + 1) + "]");
                var x = new Scanner(System.in);
                matriz[i][j] = x.nextInt();
            }
        }
        for (int i = 0; i < file; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.print("\n");
        }
    }*/

        var arreglo1 = new Arreglo();
        var arreglo2 = new Arreglo();
        var vector1 = arreglo1.crearVector(5);
        System.out.println("El vector 1 es: ");
        for (int i = 0; i < vector1.length; i++) {
            System.out.print(vector1[i]+" ");
        }
        System.out.print("\n");
        var vector2 = arreglo2.crearVector(5);
        System.out.println("El vector 2 es: ");
        for (int i = 0; i < vector2.length; i++) {
            System.out.print(vector2[i]+" ");
        }
        System.out.print("\n");
        var sumax = new Arreglo();
        var suma1 = sumax.sumaVector(vector1, vector2);
        System.out.println("El vector resultante es: ");
        for (int i = 0; i < vector2.length; i++) {
            System.out.print(suma1[i]+" ");
        }
        System.out.print("\n");
        var arreglo3 = new Arreglo();
        var arreglo4 = new Arreglo();
        var matriz1 = arreglo3.crearMatriz(5, 5);
        for (int k = 0; k < vector1.length; k++) {
            for (int m = 0; m < vector1.length; m++) {
                
            System.out.print(matriz1[k][m]+" ");
        }
            System.out.print("\n");
        }
        System.out.print("\n");
        var matriz2 = arreglo4.crearMatriz(5,5);
        for (int l = 0; l < vector2.length; l++) {
            for (int n = 0; n < vector2.length; n++) {
            System.out.print(matriz2[l][n]+" ");
            }
            System.out.print("\n");
        }
        var sumay = new Arreglo();
        var suma2 = sumax.sumaMatriz(matriz1, matriz2);
        System.out.println("La matriz resultante es: \n");
        for (int i = 0; i < vector2.length; i++) {
            for (int j = 0; j < vector2.length; j++) {
            System.out.print(suma2[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}