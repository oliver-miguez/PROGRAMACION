
import java.util.Scanner;//permite utilizar el scanner

/**
 * Pregunta dos numeros enteros y te dice los numeros que estan entre esos dos numeros
 *
 * @author Oliver Miguez Alonso
 * @version 1.0
 */

public class eje_1 {
    /**
     * Método principal del Programa
     * @param args no usamos
     */
    public static void main(String[] args) {

        Enteros();//Muestra en la funcion main el programa de la funcion Enteros

    }//end static main

    /**
     * Numeros enteros
     */
    static void Enteros() {
        int num1;
        int num2;
        Scanner sc = new Scanner(System.in);//Permite introducir datos por consola
        System.out.println("Numero 1: ");//Pregunta el valor del numero 1
        num1 = sc.nextInt();//almacena los datos introducidos
        System.out.println("Numero 2: ");//Pregunta el valor del numero 2
        num2 = sc.nextInt();//almacena los datos introducidos

        //Muestra los numeros que estan entre el numero 1 y el numero 2
        for (int i = num1 + 1; i < num2; i++) {
            System.out.println(i);
        }//end for


    }//end static Enteros

}//end class
