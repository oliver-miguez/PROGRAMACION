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
        //Frases a revisar
        String palabra1 = "Hola que tal";
        String palabra2 = "Muy bien y tu que tal";

        contarPalabra(palabra1,palabra2);

        System.out.println("____________");

        //crea variables en las que almacena el número de caracteres de cada frase
        int caracteres1 = contarCaracteres(palabra1);
        int caracteres2 = contarCaracteres2(palabra2);

        //muestra el número de caracteres de cada frase
        System.out.println("La frase 1 tiene "+ caracteres1+ " caracteres");
        System.out.println("La frase 1 tiene "+ caracteres1+ " caracteres");
        System.out.println("____________");

        //Inicializa una función que indica cúal de las dos oraciones es más grande
        maisLonga(caracteres1,caracteres2);
    }//end main

    /**
     * Cuenta el número de palabras que tiene cada oración
     *
     * @param palabra1 String original
     * @param palabra2 String original 2
     */
    public static void contarPalabra(String palabra1, String palabra2){
        int espacios = 1; //almacena el número de espacios que tiene una frase +1 para contar el total de palabras por las cual se forma
        int espacios2 = 1; //para la segunda palabra

        //recorre por cada uno de los chars del String original 1
        for(int i = 0; i < palabra1.length(); i++){
            char newTexto = palabra1.charAt(i);//comprueba cada uno de los char que conforman al string original
            if(Character.isSpaceChar(newTexto)) {//si el char encontrado es un espacio en blanco
                espacios ++; // aumenta el contador de palabras
            }//end if
        }//end for

        //recorre el String original 2
        for(int i = 0; i < palabra2.length();i++){
            char newTexto2 = palabra2.charAt(i);
            if(Character.isSpaceChar(newTexto2)){
                espacios2 ++;
            }//end if
        }//end for

        System.out.println("La primera frase se conforma por "+ espacios + " palabras");
        System.out.println("La segunda frase se conforma por "+ espacios2 + " palabras");

    }//end contarPalabras

    /**
     * Cuenta el número de caracteres que tiene cada String
     * @param palabra1 String original 1
     * @return el número de caracteres
     */
    public static int contarCaracteres(String palabra1){
        int caracteres1 = 0; // cuenta el número de caracteres que tiene el String 1

        //Permite recorrer el String 1 para contar el número de caracteres que tiene
        for(int i = 0; i < palabra1.length(); i++){
            caracteres1 ++;
        }//end for
        return  caracteres1;
    }//end contar Caracteres

    /**
     * Cumple la misma función que la anterior pero para el segundo String
     * @param palabra2 String original 2
     * @return  el número de caracteres
     */
    public static int contarCaracteres2(String palabra2){
        int caracteres2 = 0; // caracteres del segundo String
        for(int i = 0; i < palabra2.length(); i++){
            caracteres2 ++;
        }//end for
        return  caracteres2;
    }//end contarCaracteres2

    /**
     *Comprueba cúal de las frases es más larga que la otra
     * @param caracteres1 número total de caracteres del String 1
     * @param caracteres2  número total de caracteres del String 2
     */
    public static void maisLonga(int caracteres1, int caracteres2){
        if (caracteres1 > caracteres2){
            System.out.println("La primera frase es la más grande");
        }//end if
        else{
            System.out.println("La segunda frase es la más grande");
        }//end else
    }//end maisLonga

}//end class
