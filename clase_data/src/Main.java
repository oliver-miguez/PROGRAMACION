/**
 * Clase principal del programa de "data"
 * @author Oliver Miguez Alonso
 */
public class Main {
    /**
     * Función principal del programa
     * @param args no usamos
     */
    public static void main(String[] args) {

        //FECHA ACTUAL
        Data diaDeHoxe = new Data(12,2,2025);
        diaDeHoxe.incrementarDia();
        diaDeHoxe.incrementarMes();
        diaDeHoxe.incrementarAno();
        diaDeHoxe.mostrarData();
        //Incrementos



    }//end main
}//end class