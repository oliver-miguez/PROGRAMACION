
package org.example;
import  java.util.Scanner;

/**
 * calcula de grados a farenheit y kelvin
 * @version 1.0
 * @author Oliver Miguez Alonso
 */


public class eje_2 {
    public static void main(String[]args){
        //Define las variables a guardar
        double Celsius;
        double Farenheit;
        double kelvin;

         Scanner entrada = new Scanner(System.in);//Pregunta por consola
         System.out.println("Introduce los celsius: ");
         Celsius = entrada.nextDouble();//Guarda lo introducido

        //Calcula los Farenheit
         Farenheit = (Celsius * 1.8) + 32;
         System.out.println(Farenheit + " farenheit");//Muestra por pantalla el resultado del calculo anterior

        //calcula los kelvin
        kelvin = 273 + Celsius;
         System.out.println(kelvin+ " kelvin");//Muestra el resultado
    }
}
