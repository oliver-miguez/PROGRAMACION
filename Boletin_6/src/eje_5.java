/**
 * Deseña unha función a que se lle pasan as horas e minutos de dous intantes de tempo co seguinte prototipo:
 * static int diferenciaMin (int hora1, int minuto1, int hora2, int minuto2)
 * A función devoltará a diferencia en minutos que existen entre os dous instantes de tempo.
 *
 * @author Oliver Miguez Alonso
 * @version 1.0
 */
public class eje_5 {
    /**
     * Método principal del progama
     *
     * @param args no usamos
     */
    public static void main(String[] args) {
        int hora1 = 1;
        int hora2 = 2;
        int minuto1 = 20;
        int minuto2 = 30;

        //Integra la función diferencia para mostrar el resultado de la diferencia del tiempo

        int diferencia = diferenciaMin(hora1, minuto1, hora2, minuto2);//crea la funcion diferencia para poder mostrar el resultado
        System.out.println("La diferenica es " + diferencia);


    } //end static void main


    /**
     * Funcion que calcula la diferencia de las horas
     *
     * @param hora1   valor de la hora 1
     * @param minuto1 valor del minuto 1
     * @param hora2   valor de la hora 2
     * @param minuto2 valor del minuto 1
     * @return devuelve la diferencia
     */
    static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2) {

        int total_minutos1 = hora1 * 60 + minuto1;//minutos total 1
        int total_minuto2 = hora2 * 60 + minuto2;//minutos total 2
        return total_minuto2 - total_minutos1; // Devuelve el resultado de la diferencia
    }//end static int
} //end class
