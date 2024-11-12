
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
     *
     * @param args no usamos
     */
    public static void main(String[] args) {

        enteros();//Muestra en la funcion main el programa de la funcion Enteros

    }//end static main

    /**
     * Numeros enteros
     */
    static void enteros() {
        int num1;
        int num2;
        Scanner sc = new Scanner(System.in);//Permite introducir datos por consola
        System.out.println("Numero 1: ");//Pregunta el valor del numero 1
        num1 = sc.nextInt();//almacena los datos introducidos
        System.out.println("Numero 2: ");//Pregunta el valor del numero 2
        num2 = sc.nextInt();//almacena los datos introducidos

        /*
        Si en el caso de que en el for el numero 1 sea el mayor de los dos numeros , cambia su valor con el numero 2
         */
        if(num1>num2){
            int axuliar = num1; //para modificar el numero uno sin perder su valor inicial
            num1 = num2; // Transforma el valor de num1 al valor mas pequeño que es num 2
            num2 = axuliar; //le damos el valor de numero uno inicial al numero dos para transformalo en el numero mayor

        }//end if

        //Muestra los numeros que estan entre el numero 1 y el numero 2
        for (int i = num1 + 1; i < num2; i++) {
            System.out.println(i);
        }//end for


    }//end static Enteros

}//end class