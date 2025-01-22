/**

 * Crear a función que permíta realizar un análisis simple de texto.
 * O analizador ten  a función de contar palabras, caracteres e encontrar a palabra mais longa. Mostrar os resultados por pantalla.
 * @author Oliver Miguez Alonso
 * @version 1.1
 */
public class eje12 {
    /**
     * Metodo principal del programa
     * @param args no usamos
     */
    public static void main(String[] args) {
        String texto = "Hola que tal te encuentras";//texto a analizar
        String[]palabras = texto.split(" "); // crea un string que guarda cada palabra del String original por separado

        //Permite contar el total de palabras
        contarPalabra(palabras);

        //Permite identificar cuál es la palabra más larga
        palabraLonga(palabras);

        //Cuenta el total de letras que tiene el String
        int letras = contarLetras(texto);
        System.out.println("Tiene "+ letras + " letras");
    }//end main

    /**
     * Permite contar el número total de palabras del String
     * @param palabras Array original
     */
    public static void contarPalabra(String[]palabras){
        System.out.println("Numero de palabras: " + palabras.length); //Cuenta el número de palabras que tiene el array original almacenadas
    }//end contarPalabra

    /**
     * Verifica y muestra cual es la palabra más larga
     * @param palabra Array original
     */
    public static void palabraLonga(String[]palabra){
        String palabraMaisLonga = ""; //Identifica que la primera palabra sea nula para poder almacenar poco a poco la palabra más larga
        for(int i = 0; i < palabra.length;i++){
            if(palabra[i].length() > palabraMaisLonga.length()){ //cuando encuentra una palabra más larga la almacena
                palabraMaisLonga = palabra[i];
            }//end if
        }//end for
        System.out.println("A palabra máis longa e: "+ palabraMaisLonga);
    }//end palabraLonga

    /**
     * Cuenta el total de letras que tiene la frase
     * @param texto String original
     */
    public static int contarLetras(String texto){
        int caracteres1 = 0; // cuenta el número de caracteres que tiene el String 1

        //Permite recorrer el String 1 para contar el número de caracteres que tiene
        for(int i = 0; i < texto.length(); i++){
            caracteres1 ++;
        }//end for
        return  caracteres1;
    }//end contarLetras
}//end class
