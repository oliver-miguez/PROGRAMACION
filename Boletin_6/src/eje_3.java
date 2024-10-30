import java.util.Scanner;

/**
 * Realizar unha función que mostre a área dun cubo segundo se lle especifique.
 * Para distinguir o caso se lle pasará a opción cun número 1 (área) ou 2 (volume).
 * Ademáis, hai que pasarlle a lonxitude do lado.
 *
 * @author Oliver Miguez Alonso
 * @version 1.1
 */

public class eje_3 {
    /**
     * Método principal del programa
     * @param args no usamos
     */
    public static void main(String[] args) {
        int num = 0;

        Scanner sc = new Scanner(System.in);//permite introducir datos por consola
        System.out.println("1-Calcula area del cubo, 2-Calcula el volumen del cubo");
        num = sc.nextInt();//almacena el dato

        //menu de opciones
        if (num == 1) {
            area();
        } else if (num == 2) {
            volumen();
        }

    }//end static main

    /**
     * Area
     */
    static void area() {
        int a = 0;//longitud del lado del cuadrado
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el valor del lado del cubo");
        a = sc.nextInt();
        int area = (6 * a * a);//calcula el area
        System.out.println("area igual a " + area);
        sc.close();

    }//end area

    /**
     * Valumen
     */
    static void volumen() {
        int b = 0;// lado del cubo
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor del lado del cubo: ");
        b = sc.nextInt();
        int volumen = b * b * b;//calcula el volumen
        System.out.println("volumen igual a " + volumen);
    }//end volumen

}//end class
