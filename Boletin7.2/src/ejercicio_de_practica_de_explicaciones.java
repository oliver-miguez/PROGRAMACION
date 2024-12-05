import javax.management.StandardMBean;
import java.util.Arrays;
import java.util.Scanner;
/**
 * Inserción de un elemento en una lista ordenada
 * si el valor esta en la tabla , no lo introducimo
 * si no esta en la tabla , lo introducimos
 * @author Oliver Miguez Alonso
 */
public class ejercicio_de_practica_de_explicaciones {
    /**
     * Método principal del programa
     * @param args no usamos
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número que quieres añadir al array");
        int num = sc.nextInt();

        //crea el array con los números(array original)
        int[]numero = {2,12,25,36,48};

        //busca la mejor posición para el numero en el array y la guarda en la variable
        int indice = Arrays.binarySearch(numero,num);

    }//end main

    static void insertarNumero (int[]numero,int num){
        int[]nuevaTabla =
    }//end insertarNumero

}//end class
