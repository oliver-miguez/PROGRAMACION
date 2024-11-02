import java.util.Scanner;//Nos permite introducir datos por consola


/**
 * Escribe unha función a que se lle pase como parámetros de entrada a cantidade de dias,
 * horas e minutos. A función calculará e devoltará o número de segundos que existen nos datos de entrada.
 * @author Oliver Miguez Alonso
 * @version 1.0
 */

public class eje_4 {
    /**
     * Método principal del programa
     * @param args No usamos
     */
    public static void main (String[]args){
        tiempo();//LLama a la funcion tiempo e inicia todo lo que esta dentro de ella
    }//end static main

    /**
     * Tiempo a segundos
     */
    static void tiempo(){
        Scanner sc = new Scanner(System.in);//Crea y llama a Scanner
        int horas;//almacena el numero de horas introducidas por el usuario
        int min;//almacena el numero de minutos introducidos por el usuario
        int dias;//almacena el numero de dias introducidos poer el usuario

        System.out.println("Introduce el numero de horas: ");
        horas = sc.nextInt();//almacena el numero de horas introducidas
        System.out.println("introduce el numero de dias: ");
        dias = sc.nextInt();//almacena el numero de dias introducidos
        System.out.println("Introduce el numero de minutos: ");
        min = sc.nextInt();//almacena el numero de minutos introducidos

        int hora_segundo = horas * 60 * 60; // calculo de horas a segundos
        int dias_segundo = dias * 24 * 60 * 60; // calculo de dias a segundos
        int min_segundo = min * 60; // calculo de minutos a segundos

        int suma = hora_segundo + dias_segundo + min_segundo; // Suma todos los valores pasados a segundos
        System.out.println("El numero total de segundos es :"+ suma + "s"); // Muestra por pantalla el valor de la variable suma

    }//end static tiempo

}//end class
