package org.example;
import  java.util.Scanner;

/**
 * Muestra el numero exacto de billetes y monedas utilizados
 * @version 1.0
 * @author Oliver Miguez Alonso
 */

public class eje_4 {
    public  static  void  main(String[]args){
        //Define variable que sera introducida por pantalla
        int Dinero;
        Scanner a = new Scanner(System.in);//Guarda la variable
        System.out.println("cual es tu dinero: ");//Permite introducir un dato por consola
        Dinero = a.nextInt();

        // Calculos para identificar cuantos billetes de cada tipo usa
        int num1 = Dinero/100;
        int Billete1 = Dinero - (num1 *100);
        int num2 = Billete1/20;
        int Billete2 = Billete1  - (num2 *20);
        int num3 = Billete2/5;
        int Billete3 = Billete2 - (num3*5);
        int num4 = Billete3/1;
        int Billet4 = Billete3 -(num4*1);


        //Muestra por pantalla cuantos billetes usó
        System.out.println("Billetes 100 :"+ num1+ ", Billetes 20: "+ num2 + ", Billetes 5:"+ num3+ ", Monedas: "+ num4);
    }
    }
