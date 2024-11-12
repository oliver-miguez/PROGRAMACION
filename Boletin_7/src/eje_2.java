/**
 * Carga un array de tipo int, coas notas do módulo de programación, dos 30 alumnos da clase de DAM .
 * Visualiza o numero de 	aprobados e o de suspensos.
 * Calcula e visualiza a nota media da clase.
 * Visualiza a nota mais alta.
 *
 * @author Oliver Miguez Alonso
 * @version 1.0
 */
public class eje_2 {
    /**
     * Metodo principal del programa, con esta funcion visualizamos los calculos realizadas en el resto de funciones
     *
     * @param args no usamos
     */
    public static void main(String[] args) {
        int[] notas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 3, 4, 5, 6, 7, 8, 9, 4, 5, 6, 6, 8, 9, 2, 3, 4, 5, 6, 7}; //almacena la nota de todos los estudiantes
        double[] notas_double = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 3, 4, 5, 6, 7, 8, 9, 4, 5, 6, 6, 8, 9, 2, 3, 4, 5, 6, 7};//valores double para que la media pueda tener decimales

        //llama a las funciones
        notas(notas);
        media(notas_double);
        alta(notas);

    }//end main

    /**
     * Muestra si la nota del alumno es aprobado o suspenso
     *
     * @param array lista de notas de los alumnos
     * @return devuelve valor aprobado o suspenso
     */
    static int[] notas(int[] array) {
        for (int i = 0; i < array.length; i++) { //busca uno por uno los valores que estan dentro del array notas
            if (array[i] < 4) {//si el valor que se encuentra dentro es menor que 4 suspenso
                System.out.println("Suspenso");
            }//end if
            else {//el caso contrario aprobado
                System.out.println("Aprobado");
            }//end else
        }//end for
        return array;

    }//end notas

    /**
     * Calcula la media
     *
     * @param array2 array de notas
     * @return la media
     */
    static double[] media(double[] array2) {
        double suma = 0;//almacenara el total de la suma de todos los valores del array notas
        for (int i = 0; i < array2.length; i++) {//pasa uno por uno por los valores que se encuentran dentro del array notas
            suma = suma + array2[i];//suma todos los valores que tiene el array notas

        }//end for

        //calcula la media
        double media = suma / 30;
        System.out.println("la media es " + media);
        return array2;

    }//end media

    /**
     * Nota mas alta
     *
     * @param array3 datos del array numeros
     * @return la nota mas alta
     */
    static int[] alta(int[] array3) {
        int max = array3[0];//Primero identifica como el valor maximo al primer numero del array numeros
        for (int i = 0; i < array3.length; i++) {//busca uno por uno los valores que hay en el array numeros
            if (array3[i] > max) {//si encuenta un valor en el array mayor a maximo, introduce un nuevo valor maximo
                max = array3[i];//tansforma el nuevo valor en el valor maximo
            }//end if

        }//end for
        System.out.println("la nota mas alta es " + max);
        return array3;
    }//end alta
}//end class
