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
        int diaOriginal = 29;
        int mesOriginal = 2;
        int anoOriginal = 2034;
        String data = diaOriginal+"/"+ mesOriginal+ "/"+ anoOriginal;

        //Muestra la data original para comparar y verificar los métodos
        Data nueva = new Data(diaOriginal, mesOriginal, anoOriginal,data);
        System.out.println(nueva.getData());


    }//end main
}//end class