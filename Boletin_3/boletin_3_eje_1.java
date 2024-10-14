/* te dice si el numero introducido es positivo */

import  java.util.Scanner;
public class boletin_3_eje_1
{
    public static void main(String[] args) {
        int num;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un numero;");
        num = entrada.nextInt();

        if(num > 0)
            {
            System.out.println("Positivo");
            }

        else
            {
            System.out.println("negativo");
            }




    }
}