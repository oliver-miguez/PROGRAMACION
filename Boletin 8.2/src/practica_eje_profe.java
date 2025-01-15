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

    /**
     * Pide la letra con la que el usuario intentará adivinar la palabra
     * @return letra o palabra con la que el usuario quiere adivinar
     */
    public static String letra(){
        Scanner sc = new Scanner(System.in);
        String letra = "";
        do{
            System.out.println("Introduce una letra");
            letra = sc.next();
        }while (letra.isEmpty());
        return letra;
    }//end letra



}//end class
