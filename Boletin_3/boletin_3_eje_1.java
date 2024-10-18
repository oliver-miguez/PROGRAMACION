

import  java.util.Scanner;

/**
 * Muestra si el numero introducido es positivo
 * @version 1.0
 * @author Oliver Miguez Alonso
 */

public class boletin_3_eje_1
{
    public static void main(String[] args) {
        //Define la variable a guardar
        int num;
        Scanner entrada = new Scanner(System.in);//Pregunta por consola

        System.out.println("Introduce un numero;");
        num = entrada.nextInt();//Guarda el valor preguntado por consola

        //Comprueba si el numero es positivo
        if(num > 0)
            {
            System.out.println("Positivo");//Muestra por pantalla que es positivo
            }
        //En caso de no ser positivo
        else
            {
            System.out.println("negativo");//Muestra por pantalla que es negativo
            }




    }
}