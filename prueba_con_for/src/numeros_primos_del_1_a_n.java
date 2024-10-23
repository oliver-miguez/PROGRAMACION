/**
 * Muestra los numero primeros  del uno al numero n
 * @author Oliver Miguez Alonso
 * @version 1.0
 */


import java.util.Scanner; //Permite llamar a la funcion scanner para poder escribir por pantalla
public class numeros_primos_del_1_a_n {
    public static void main(String[] args) {

        int n; //El numero que utilizará para calcular los numeros primos
        Scanner a = new Scanner(System.in);//Crea un nuevo escaner, que te permite introducir texto por consola
        System.out.println("Introduce el numero n: ");//El texto que se introduce

        n = a.nextInt();//almacena lo introducido por consola

        int resto; //para hacer la operacion
        boolean primo;//identifica si es o no primo el numero

        for (int i = 2; i < n; i++) {//si el numero introducido es mayor que i, el programa escribira y gurdara todos los numero del 1 a n
            primo = true;// y los detectara como true , para hacer las operaciones
            for (int j = 2; j < i; j++) {
                resto = i % j;//calcula el resto dividiendolo con el numero j que siempre es menor que i , en caso de no serlo i es primo
                if (resto ==0 ) {
                    primo = false; // es divisible entonces no es primo
                    break;

                }


            }
            if(primo == true) {
                System.out.println(i + " es primo ");//es primo
            }


        }
    }
}