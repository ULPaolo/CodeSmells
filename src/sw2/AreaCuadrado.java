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
public class AreaCuadrado {
    double lado;

    public AreaCuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    public double ObtenerArea( double lado){
        double resultado;
        resultado = 1;
        resultado = lado * lado;
        System.out.println("el Area es: " + resultado );
        return resultado;
    }
}
