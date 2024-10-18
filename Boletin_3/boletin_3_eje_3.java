
import java.util.Scanner;

/**
 * te escribe + si es num positivo, o - si es negativo
 * @version 1.0
 * @author Oliver Miguez Alonso
 */

public class boletin_3_eje_3 {
    public static void  main(String[]args){
        //Define el numero que sera guardado
        int num;

        Scanner entrada = new Scanner(System.in);//Pregunta por consola
        System.out.println("introduce el numero");
        num = entrada.nextInt();//Guarda lo introducido por consola

        //Muestra el caso del positivo
        if(num>0){
            System.out.println("+");
        }
        //Muestra el caso del negativo
        else{
            System.out.println("-");
        }
    }
}
