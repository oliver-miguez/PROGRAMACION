
/**
 * Pregunta dos numeros enteros y te dice los numeros que estan entre esos dos numeros
 *
 * @author Oliver Miguez Alonso
 * @version 1.1
 */
public class otra_manera_de_eje_1 {
    /**
     * Método principal del Programa
     *
     * @param args no usamos
     */
    public static void main(String[] args) {

        int a = 10;
        int b = 4;
        Enteros(a, b);//Muestra en la funcion main el programa de la funcion Enteros

    }//end static main

    /**
     * Numeros enteros
     */
    static void Enteros(int num1, int num2) {

        int aux = num1;
        num1 = num2;
        num2 = aux;

        //Muestra los numeros que estan entre el numero 1 y el numero 2
        for (int i = num1 + 1; i < num2; i++) {
            System.out.println(i);

        }//end for


    }//end static Enteros

}//end class
