import java.util.Scanner;//permite utilizar scanner
/**
 * Deseñar a función eco() a que se lle pasa como parámetro un número n e mostra por pantalla n veces a mensaxe “Ecoo…
 * @author Oliver Miguez Alonso
 * @version 1.0
 */

public class eje_2 {
    public static void main(String[]args){

    eco();

    }//end static main

    static void eco(){
        int n;
        Scanner sc = new Scanner(System.in);//permite introducir datos por consola
        System.out.println("Introduce un numero n: ");
        n = sc.nextInt();//almacena los datos introducidos por consola
        for(int i = 1; i<=n; i++){//repite eco n veces
            System.out.println("ECO...");
        }//end for

    }//end funcion eco


}//end class
