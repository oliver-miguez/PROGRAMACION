package org.example;
import  java.util.Scanner;
public class eje_3 {
    public static void main(String[]args){
        int Billete_100;
        int Billete_20;
        int Billete_5;
        int Moneda;
        int Total;

        Scanner a = new Scanner(System.in);
        System.out.println("cuantos de 100 tienes :");
        Billete_100 = a.nextInt();
        System.out.println("cuantos de 20 tienes :");
        Billete_20 = a.nextInt();
        System.out.println("cuantos de 5 tienes :");
        Billete_5 = a.nextInt();
        System.out.println("cuantoas monedas de un euro: ");
        Moneda = a.nextInt();

        Total = Billete_100*100 + Billete_20 * 20 +Billete_5 *5 +Moneda*1;
        System.out.println(Total +" €");
    }
}
