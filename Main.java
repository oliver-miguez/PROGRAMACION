/**
 * Descripción: Escribe una función en Java que reciba una frase como parámetro y realice las siguientes tareas:
 * Cuente el número de vocales (a, e, i, o, u) en la frase, ignorando mayúsculas y minúsculas.
 * Reemplace todas las vocales en la frase con el símbolo '*'.
 * Devuelva la frase modificada y el conteo total de vocales.
 * @author Oliver
 */
public class Main {
    public static void main(String[] args) {
        int contarVocales = contar("hola mundo");
        System.out.println("Total de vocales : "+ contarVocales);

    }//end main
    public static int contar(String frase){
        char[]vocales  = {'a','e','i','o','u'}; //ojo, puede saltar error OutOfBounds debido a que el tamaño de vocales es fijo{5} y el de frase no
        int contadorVocales = 0;
        //para ello debemos crear dos for, el primer para almacenar todos los chars que forman a la frase
        for(int i = 0; i < frase.length(); i++){
            char charFrase = frase.charAt(i);
            //el segundo para trabajar dentro de los valores que permite el array de vocales
            for(int j= 0; j < vocales.length; j++) {
                if (Character.toLowerCase(charFrase) == vocales[j]) {
                    contadorVocales++;
                }//end if
            }//end for
        }//end for
        return contadorVocales;
    }//end contarVocales

}//end class