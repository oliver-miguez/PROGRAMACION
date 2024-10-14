/*te compara si un numero short es mayor a otro numer short*/

import  java.util.Scanner;
public class boletin_3_eje_2{
    public static void main(String[]args){
        short num1;
        short num2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        num1 = entrada.nextShort();
        System.out.println("Introduce o segundo numero:");
        num2 = entrada.nextShort();


        if(num1 > num2){
            System.out.println(num1 + ">" + num2);
        }
        else{
            System.out.println(num2 + ">"+num1);
        }
    }
}
