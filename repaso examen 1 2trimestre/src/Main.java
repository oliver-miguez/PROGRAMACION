import java.util.Objects;
import  java.util.Scanner;
/**
 * Entrada de usuario:
 *     La aplicación debe permitir al usuario ingresar un texto completo (varias líneas).
 * Operaciones a realizar:
 *     1-Número de palabras: Contar y mostrar el número total de palabras en el texto.
 *     2-Frecuencia de palabras: Mostrar la frecuencia de cada palabra en el texto (sin considerar mayúsculas y minúsculas).
 *     3-Longitud media de palabras: Calcular y mostrar la longitud media de las palabras en el texto.
 *     4-Palabra más larga y más corta: Identificar y mostrar la palabra más larga y la palabra más corta en el texto.
 *     5-Número de oraciones: Contar y mostrar el número total de oraciones en el texto.
 *     6-Longitud media de oraciones: Calcular y mostrar la longitud media de las oraciones en el texto.
 *     7-Palabra más frecuente: Identificar y mostrar la palabra que más se repite en el texto.
 *     8-Generar resumen: Crear un resumen del texto que contenga las primeras tres oraciones.
 * Formato de salida:
 *     La aplicación debe mostrar los resultados de cada operación de manera clara y organizada.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase");
        String frase = sc.nextLine();

        int contadorPalabras = contarPalabras(frase);
        System.out.println("Total de palabras : "+ contadorPalabras);

        frecuencia(frase);

    }//end main

    /**
     * Cuenta el total de palabras de la frase
     * @param frase String original
     * @return total de palabras que forma al String original
     */
    public static int contarPalabras(String frase){
        int contadorPalabras = 1;
        for(int i = 0; i < frase.length(); i++){
            char charFrase = frase.charAt(i);
            if(Character.isWhitespace(charFrase)){
                contadorPalabras++;
            }//end if
        }//end for
        return contadorPalabras;
    }//end contarPala

    /**
     * Comprueba si una palabra se repite varias veces en la oración
     * @return si una palabra se repite , el número de repeticiones y la palbra
     */
    public static void frecuencia(String frase){
        int repeticiones;
        String[]palabras = frase.split(" "); //crea un array formado por las distintas palabras que forman la frase

        //Compara dos arrays iguales , para contar cuantas veces se repite un palabra
        for(int i = 0; i < palabras.length; i ++){
            repeticiones = 0;//Reinicia el contador de repeticiones de palabra para que no guarde el mismo valor para todas las palabras
            for(int j = 0; j < palabras.length; j ++){
                if(Objects.equals(palabras[i], palabras[j])){ //comprueba si se repite alguna de las palabras
                    repeticiones ++;
                }//end if
            }//end for
            System.out.println(palabras[i] + repeticiones); //Muestras la palabra y el número de veces que se repite
        }//end for
    }//end frecuencia



}//end class