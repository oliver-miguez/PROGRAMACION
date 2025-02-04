/**
 * Escribe un programa en Java que tome una frase y cuente el número de vocales y consonantes en ella.
 * Ignora los espacios y otros caracteres no alfabéticos.
 */
public class practica_2 {
    public static void main(String[] args) {
        contar("Hola mundo");
        consonantes("Hola mundo");
    }//end main

    public static void contar(String frase){
        int contadorVocales = 0;
        char[]vocales = {'a','e','i','o','u'};
        for(int i = 0 ; i < frase.length(); i ++){

            char charFrase = frase.charAt(i);

            for(int j = 0 ; j < vocales.length; j ++){
                if(Character.toLowerCase(charFrase) == vocales[j]){
                    contadorVocales++;
                }//end if


            }//end for
        }//end for
        System.out.println("Total de vocales : "+ contadorVocales);

    }//end contar
    public static void consonantes(String frase){
        char[]vocales = {'a','e','i','o','u'};

        int contadorConsonantes = 0;

        for (int i = 0; i < frase.length(); i++) {

            char charFrase = frase.charAt(i);

            boolean esVocal = false;

            for (int j = 0; j < vocales.length; j++) {

                if (charFrase == vocales[j]) {
                    esVocal = true;
                    break;
                }//end if
            }//end for
            if (Character.isLetter(charFrase) && !esVocal) {
                contadorConsonantes++;
            }//end if
        }//end for
        System.out.println(contadorConsonantes);
    }//end consola
}//end class
