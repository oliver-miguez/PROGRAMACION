import java.util.Scanner; //permite introducir datos por consola

/**
 * Deseña unha función a que se lle pasan as horas e minutos de dous intantes de tempo co seguinte prototipo:
 * static int diferenciaMin (int hora1, int minuto1, int hora2, int minuto2)
 * A función devoltará a diferencia en minutos que existen entre os dous instantes de tempo.
 * @author Oliver Miguez Alonso
 * @version 1.0
 */
public class eje_5 {
    /**
     * Método principal del progama
     * @param args no usamos
     */
    public static void main(String[]args){
    } //end static void main

    static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2){
        Scanner sc = new Scanner(System.in); //Alamacena datos introducidos por consola
        System.out.println("Introduce la hora 1: ");
        hora1 = sc.nextInt(); //Almacena el dato de hora 1 introduucido por consola
        System.out.println("Introduce el minuto 1 : ");
        minuto1 = sc.nextInt(); //Almacena el dato de minuto 1 introduucido por consola
        System.out.println("Introduce la hora 2 : ");
        hora2 = sc.nextInt(); //Almacena el dato de hora 2 introduucido por consola
        System.out.println("Introduce el minuto 2: ");
        minuto2 = sc.nextInt(); //Almacena el dato de minuto 2 introduucido por consola

        return ();

    }

} //end class
