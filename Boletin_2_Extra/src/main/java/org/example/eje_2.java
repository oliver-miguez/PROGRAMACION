package org.example;
import  java.util.Scanner;
public class eje_2 {
    public static void main(String[]args){
        double Celsius;
        double Farenheit;
        double kelvin;

         Scanner entrada = new Scanner(System.in);
         System.out.println("Introduce los celsius: ");
         Celsius = entrada.nextDouble();

         Farenheit = (Celsius * 1.8) + 32;
         System.out.println(Farenheit + " farenheit");
         kelvin = 273 + Celsius;
         System.out.println(kelvin+ " kelvin");
    }
}
