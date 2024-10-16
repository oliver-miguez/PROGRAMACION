

import java.util.Scanner;

/**
 * Con la nota de tu examen, te muestra tu resultado, si es aprobado o no
 * @version 1.0
 * @author Oliver Miguez Alonso
 */


public class eje_1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int nota;

        System.out.println("Introduce el valor de tu nota en valores enteros: ");
        nota = a.nextInt();

        //Hacemos switch para ver los diferentes casos , con las diferentes notas, para saber cual es tu resultado
        switch (nota) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("suspenso");
                break;
            case 5:
                System.out.println("Raspado");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7:
            case 8:
                System.out.println("Notable");
                break;
            case 9:
            case 10:
                System.out.println("Aprobado");
                break;
            default:
                System.out.println("Nota no válida");
                break;
        }
    }
}
