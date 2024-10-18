
import  java.util.Scanner;

/**
 * Comprueba si un numero tipo short es mayor o no que otro numero tipo short
 * @version 1.0
 * @author Oliver Migeuz Alonso
 */

public class boletin_3_eje_2{
    public static void main(String[]args){
        //Define los numeros shorts que seran introducidos por consola
        short num1;
        short num2;
        Scanner entrada = new Scanner(System.in);//Pregunta por consola
        System.out.println("Introduce el primer numero: ");
        num1 = entrada.nextShort();//Guarda lo introducido en consola
        System.out.println("Introduce o segundo numero:");
        num2 = entrada.nextShort();

        //Caso de que el numero 1 sea mayor que numero 2
        if(num1 > num2){
            System.out.println(num1 + ">" + num2);
        }
        //Caso contrario
        else{
            System.out.println(num2 + ">"+num1);
        }
    }
}
