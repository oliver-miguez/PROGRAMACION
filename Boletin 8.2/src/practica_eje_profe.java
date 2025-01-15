import java.util.Scanner;
/**
 * Hacer juego del ahorcado
 * 7 turnos
 * Muestra el número de caracteres que tiene la palabra a adivinar con ____
 * Usuario introduce letra
 * Si hay coincidencia con la letra que introdujo el usuario se muestra por pantalla
 * Print con los fallos
 * @author Oliver Miguez Alonso
 */
public class practica_eje_profe {
    /**
     * Metodo principal del programa
     * @param args no usamos
     */
    public static void main(String[] args) {

        String palabraAdivinar = "chorizo";

        System.out.println(tamaño(palabraAdivinar));

    }//end main
    /**
     * Muestra por pantalla el texto con "_"
     * @param texto String original
     */
    public static String tamaño(String texto){
        String newTexto = "";
        for(int i = 0;i < texto.length(); i++){
            newTexto = newTexto + "_";
        }//end for
        return newTexto;
    }//end tamaño

}//end class
