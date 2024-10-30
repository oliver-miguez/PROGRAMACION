import java.util.Scanner;

/**
 * Realizar unha función que mostre a área dun cubo segundo se lle especifique.
 * Para distinguir o caso se lle pasará a opción cun número 1 (área) ou 2 (volume).
 * Ademáis, hai que pasarlle a lonxitude do lado.
 * @author Oliver Miguez Alonso
 * @version 1.0
 */

public class eje_3 {
    public static void main(String[]args){
        int num;
        System.out.println("1-Calcula area del cubo");
        System.out.println("2-Calcula el volumen del cubo");
        if(num==1){
            area();
        } else if (num == 2) {
            volumen();
        }


    }//end static main

    static void area(){
        int a;//longitud del lado del cuadrado
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el valor del lado del cubo");
        a = sc.nextInt();
        int area=(6 * a * a);
        System.out.println(area);
        sc.close();

    }//end area
    static  void  volumen(){
        int b;// lado del cubo
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor del lado del cubo: ");
        b = sc.nextInt();
        int volumen = b*b*b;
        System.out.println(volumen);
    }

}//end class
