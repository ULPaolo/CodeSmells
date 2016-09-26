/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sw2;

/**
 *
 * @author Administrator
 */
public class VolumenCubo {
    double lado;

    public VolumenCubo(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
   /* 
    public double  ObtenerVolumen(double lado){
       double resultado; 
       AreaCuadrado a1 = new AreaCuadrado(this.lado);
       resultado = a1.ObtenerArea(lado) * lado;
        System.out.println("El resultado del Volumen es: " + resultado);
       return resultado;
    }
 */ 
    public double  GetVolumen(double lado){
       double resultado; 
       resultado = lado* lado * lado;
        System.out.println("El resultado del Volumen es: " + resultado);
       return resultado;
    }
}
