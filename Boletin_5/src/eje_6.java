/**
 *  Realizar o programa que pida un número e como resultado nos de o factorial no número (n!).
 * @author Oliver Miguez Alonso
 * @version 1.0
 */

import java.util.Scanner;//Para poder utilizar la funcion scanner
public class eje_6 {
    public static void main(String[]args){

        int numero;//numero introducido por consola
        int factorial = 1;//para el calculo del factorial
        Scanner sc = new Scanner(System.in);//permite introducir datos por consola
        System.out.print("Introduce un numero: ");
        numero = sc.nextInt();//almacena lo introducido por consola
        for(int j = 1;j<=numero;j++){//si introducimos un cinco muestra 5,4,3,2,1
            factorial= factorial*j;//calcula el valor del factoria 5*4*3*2*1
        }
        System.out.println(factorial);//Muestra el resultado del factorial

    }//end static void
}//end class
