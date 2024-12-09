/**
 * Introduce un numero y te calcula la raiz cuadrada , en caso de que la raiz sea completa te da el valor normal, en caso de ser
 * compleja te da un valor aproximado + resto
 */

import java.util.Scanner;
public class eje_examen_b {
    /**
     * Metodo principal del programa
     * @param args no usamos
     */
    public static void main(String[] args) {

        //introducir datos por consola
        Scanner sc = new Scanner(System.in);    
        int n;
        System.out.println("Introduce un numero: ");
        n = sc.nextInt();

        //calcula la raiz cuadrada
        double raiz = Math.sqrt(n);

        //comprueba si el resultado de la raiz es entero o no
        if (raiz == Math.floor(raiz)) {
            //en caso de ser entero
            System.out.println("La raiz cuadrada de " + n + " es " + (int)raiz);
        } else {
            //en caso de no ser entero
            int raizEntera = (int)Math.floor(raiz);
            int resto = n - (raizEntera * raizEntera);
            System.out.println("La raiz cuadrada de " + n + " es aproximadamente " + raizEntera + " con un resto de " + resto);
        }
        
        sc.close();
    }//end main
}//end class


/**
 * TODO
 *
 *Hacerlo de la manera indicada en el ordinograma de manuel
 */