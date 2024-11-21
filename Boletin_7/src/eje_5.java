import com.sun.source.tree.BreakTree;

import java.util.Scanner;
/**
 * crea una funcion que reciba dos parametros , tipo tabla, y dar un valor , buscar si existe valor en la tabla ,si existe dentro de la
 * muestra el indice, por ejemplo , si el numero 3 esta dentro del array y tiene las posicion 0, devuelve el valor 0
 * , si no , muestra -1.
 */
public class eje_5 {
    /**
     * metodo principal del programa
     * @param args no usamos
     */
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in); //permite utilizar el metodo scanner
        int[]numeros = new int[10]; // crea en el array de los numeros

        //bucle para introducir numeros ramdom(solo con numeros del 1 al 10
        for (int j = 0; j < numeros.length; j++) {
            numeros[j] = (int) Math.floor(Math.random() * 10.0) + 1;
        }//end for
        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }//end for
        System.out.println("_______");
        indice(numeros,sc);
    }//end main

    /**
     * Funcion que pregunta por el numero y devuelve indice o -1
     * @param numeros para acceder a los valores del array
     * @param sc permite utilizar el metodo scaner
     * @return indice o -1
     */
    static void indice(int[] numeros, Scanner sc) {
        System.out.println("Introduce un numero: ");
        int num = sc.nextInt();
        boolean encontrado = false;
        //en el caso de que este dentro del array
        for (int i = 0; i < numeros.length; i++) {
            if (num == numeros[i]) {
                System.out.println("El numero introducido tiene indice " + i);
                encontrado = true;

            }//end if
        }//end for
        //en el caso de que no exista el numero en el array
        if (!encontrado) {
               System.out.println("-1");
        }//end if

    }//end indice

}//end class
