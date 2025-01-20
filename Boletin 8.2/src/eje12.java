/**
 * Crear a función que permíta realizar un análisis simple de texto.
 * O analizador ten  a función de contar palabras, caracteres e encontrar a palabra mais longa. Mostrar os resultados por pantalla.
 * @author Oliver Miguez Alonso
 */
public class eje12 {
    /**
     * Metodo principal del programa
     * @param args no usamos
     */
    public static void main(String[] args) {
        String palabra1 = "Oye como va mi ritmo";
        String palabra2 = "Jamón serrano";
        int contador_palabra1 = 0;
        int contador_palabra2 = 0;
        System.out.println(contarCaracteres(palabra1,palabra2,contador_palabra1));
    }//end main

    /**
     * Permite contar cuantos caractetes tiene cada palabra
     * @param palabra1 String 1 original
     * @param palabra2 String 2 original
     * @param contador1 contador de letras de la primera palabra
     * @return devuelve por pantalla cuantos caracteres tiene cada palabra
     */
    public static int contarCaracteres(String palabra1 , String palabra2, int contador1){
        //letras de la primera palabra
        for(int i = 0; i < palabra1.length(); i++){
            contador1 ++;
        }//end for
        return contador1;
    }//end contarCaracteres


}//end class
