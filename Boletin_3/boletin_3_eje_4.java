
import java.util.Scanner;

/**
 * Compara pesos
 * @version 1.0
 * @author Oliver Miguez Alonso
 */

public class boletin_3_eje_4 {
    public static void main (String[]args){
        //Define las variables a guardar
            String nom1= "Sonia";
            String nom2 ="Pedro";
            int peso ;
            int peso2;
            Scanner entrada = new Scanner(System.in);//Pregunta por consola
            System.out.println("introduce  peso 1 ");
            peso = entrada.nextInt();//Guarda lo introducido por consola
            System.out.println("Introduce el segundo peso");
            peso2 = entrada.nextInt();

            //Caso de que el primer peso sea mayor
            if(peso > peso2){
                System.out.println(nom1 + " pesa mas que "+ nom2 +" y la diferencia es "+ (peso-peso2));
        }
            //Caso de que el segundo peso sea mayor
            else{
                System.out.println(nom2 + " pesa mas que "+ nom1 +" y la diferencia es " + (peso2-peso) );
            }
    }

}
