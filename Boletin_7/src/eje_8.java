/**
 * crea un array y crea una funcion que  te devuelve los valores pares del array anterior
 */
public class eje_8 {
    /**
     * Metodo principal del programa
     * @param args NO USAMOS !!!
     */
    public static void main(String[] args) {
        int[] numero = new int[10];

        //crea una lista de 10 numeros aleatorios
        System.out.println("Números originales:");
        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int) (Math.random() * 10);
            System.out.println(numero[i]);
        }//end for

        System.out.println("____________________________________");

        //llama a la funcion para obtener los valores pares del array original
        int[] pares = lista_pares(numero);

        //imprime los valores pares del array original equivalente a la lista_par
        System.out.println("Números pares:");
        for (int par : pares) { // Imprime los valores que son distintos de cero
            if (par != 0) {  // Solo imprime los números distintos de cero, para que no imprima aquellos que eran impares
                System.out.println(par);
            }//end if
        }//end for
    }//end main

    /**
     * Crea un array que devuelve solo los valores positivos del primer array
     * @param numero valores del array original
     * @return lista_par
     */

    static int[] lista_pares(int[]numero){

        //crea una nueva lista
        int[]lista_par;
        lista_par = new int[numero.length];
        int pares = 0; // contador de valores pares

        //recorre el array original y añade los valores pares al nuevo array
        for (int num : numero) {
            if (num % 2 == 0) { // Comprueba si es par
                lista_par[pares] = num;// añade el valor al nuevo array, el cual tiene el mismo tamaño que el valor del contador pares
                pares++; // incrementa el contador de valores pares
            }//end if

        }//end for

        return lista_par;
    }//end lista_pares


}//end class
