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
        Scanner sc = new Scanner(System.in); //Alamacena datos introducidos por consola
        System.out.println("Introduce la hora 1: ");
        int hora1 = sc.nextInt(); //Almacena el dato de hora 1 introduucido por consola
        System.out.println("Introduce el minuto 1 : ");
        int minuto1 = sc.nextInt(); //Almacena el dato de minuto 1 introduucido por consola
        System.out.println("Introduce la hora 2 : ");
        int hora2 = sc.nextInt(); //Almacena el dato de hora 2 introduucido por consola
        System.out.println("Introduce el minuto 2: ");
        int minuto2 = sc.nextInt(); //Almacena el dato de minuto 2 introduucido por consola

        System.out.println(diferenciaMin());
    } //end static void main

    static int diferenciaMin (int hora1, int minuto1, int hora2, int minuto2){
       int total_minutos1 = hora1*60 + minuto1;//minutos total 1
       int total_minuto2 = hor2*60 + minuto2;//minutos total 2
       return total_minutos1 - total_minuto2; // Devuelve el resultado del total 1 y total 2
    }//end static int
} //end class
