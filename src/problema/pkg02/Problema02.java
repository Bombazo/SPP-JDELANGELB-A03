/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg02;
import java.util.Scanner;
/**
 *
 * @author bomba
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Programa para calcular el volumen de una esfera
        double radio, volumen;
        radio = solicitarRadio();
        volumen = calcularVolumen(radio);
        mostrarVolumen(radio, volumen);
    }
    
    public static double solicitarRadio(){
        double radio;
        System.out.println("Ingrese el radio(EN CM) de la esfera de la cual desea calcular su volumen:");
        Scanner entradaRadio = new Scanner(System.in);
        radio = entradaRadio.nextDouble();
        return radio;
    }
    
    public static double calcularVolumen(double radio){
        double volumen;
        volumen = (((4/3)*(3.1416))*(Math.pow(radio, 3)));
        return volumen;
    }
    
    public static void mostrarVolumen(double radio, double volumen){
        System.out.println("El volumen de una esfera con radio de: " + radio + " centimetros cuadrados " + "es igual a: " + volumen + " centimetros cubicos");
    }
}
