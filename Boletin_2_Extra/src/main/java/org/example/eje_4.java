//te dice el numero exacto de billetes utilizados para completar el valor introducido
package org.example;
import  java.util.Scanner;
public class eje_4 {
    public  static  void  main(String[]args){
        int Dinero;
        Scanner a = new Scanner(System.in);
        System.out.println("cual es tu dinero: ");
        Dinero = a.nextInt();


        int num1 = Dinero/100;
        int Billete1 = Dinero - (num1 *100);
        int num2 = Billete1/20;
        int Billete2 = Billete1  - (num2 *20);
        int num3 = Billete2/5;
        int Billete3 = Billete2 - (num3*5);
        int num4 = Billete3/1;

        int Billet4 = Billete3 -(num4*1);



        System.out.println("Billetes 100 :"+ num1+ ", Billetes 20: "+ num2 + ", Billetes 5:"+ num3+ ", Monedas: "+ num4);
    }
    }
