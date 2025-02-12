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
        int diaOriginal = 28;
        int mesOriginal = 2;
        int anoOriginal = 2034;
        String data = diaOriginal+"/"+ mesOriginal+ "/"+ anoOriginal;
        String nuevaData = "";

        //Muestra la data original para comparar y verificar los métodos
        Data nueva = new Data(diaOriginal, mesOriginal, anoOriginal,data);
        System.out.println(nueva.getData());

        //Incrementos



    }//end main
}//end class