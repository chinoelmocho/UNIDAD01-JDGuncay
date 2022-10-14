/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabajo_en_clases1;

/**
 *
 * @author PC-12
 */
public class Auto {

    String placa;
    String propietario;
    String marca;
    int año;
    String color;
    float precio;

    public String mostrarinfo() {
        var retorno = "EL auto tiene placa " + this.placa + " y es de maraca " + this.marca + " y el propietario es " + this.propietario+" es del año "+this.año+" de color "+ this.color+" finalmente el valor del auto es de "+this.precio;
        return retorno;
    }

    public String getProvincia() {
        var retorno = "";
        var primeraletra = "";
        primeraletra = this.placa.substring(0,1);
        switch(primeraletra){
            case "A":
                retorno="Azuay";
                break;
            case "F":
                retorno="Pichincha";
                break;
            case "G":
                retorno="Guayas";
                break;
            case "U":
                retorno="Cañar";
            default:
                retorno="Provicia no registrada";
            }
        
        
        
        
        return retorno;

    }

    public String getPAismarca() {
        var retorno =" ";
        if(this.marca.equals("Cherolet")){
             retorno = " USA ";
        }else{if(this.marca.equals("Toyota")) {
             retorno = "Japon";
        }else{if(this.marca.equals("jetour")){
             retorno ="Japon";
        }else{if(this.marca.equals("Mercedes Bens")){
            retorno ="Alemania";
        }else{
            retorno ="No definido";
        }
        }
        }
        }
        
        return retorno;
    }
    public int getNumeroContinente() {
    var marcaPais=this.getPAismarca();
    var retorno=0;
    switch(marcaPais){
        case "USA":
            retorno=2;
                break;
        case "Japon":
            retorno=3;
                   break;
        case "Alemania":
            retorno=4;
        default:
            retorno=0;
}
    
    return retorno;


}
public double calcularIva() {
    var retorno=0.0;
    retorno=(this.precio) * 0.12;
    return retorno;
}
public double calcularDepreciacion(int yearActual) {
    var retorno=0.0d;
    var edad=this.calcularedad(yearActual);
    retorno = this.precio;
    var contador=0;
    while(contador<edad){
        retorno= retorno * 0.9;
        contador+=1;
    }
    
    return retorno;
    
}
/* Calcular e costo de la matricula 0-5 10%*/
public double costodematricula (int yearactual) {
    var retorno=0.0d;
    var edad=this.calcularedad(yearactual);
    if(edad<6){
    retorno=this.precio *0.1;
    }else{if(edad>5 && edad<11){
        retorno=this.precio*0.08;
    }else{if(edad>10 && edad<16){
        retorno=this.precio*0.07;
    }else{if(edad>16){
        retorno=this.precio*0.06;
    }
     
    }}}
   return retorno;
    /* Edad de 0-5 y precios menos de 10000SI Edad 10-15 y precio enos de 10000 a 2000 Edad*/
}

public boolean sepuedeasegurar(int yearactual) {
    var retorno=false;
    var edad=this.calcularedad(yearactual);
    if (edad<=5&&this.precio< 10000){
        retorno=true;
    }else{if(edad>5 && edad<11 && this.precio>=10000 && this.precio<=20000){
        retorno=true;
    }else{if(edad>10 && edad<16 && this.precio>=20000 && this.precio<=30000){
        retorno=true;
    }else{if(edad>16 || this.precio>30000){
        retorno=false;
    }
     
    }}
    }
    return retorno;
    }



public int calcularedad(int yearActual){
    var retorno=0;
    retorno=yearActual- this.año;
    return retorno;

        }


}
