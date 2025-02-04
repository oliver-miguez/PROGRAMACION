/**
 * Escribe un programa en Java que tome una frase y devuelva la misma frase con las palabras en orden inverso.
 */
public class practica {
    public static void main(String[] args) {
        String frase = "Hola mundo";
        inversa(frase);
    }//end main
    public static void inversa(String frase){
        String newFrase ="";
        for(int i = frase.length() - 1; i >= 0; i--){
           char charFrase = frase.charAt(i);
            newFrase += charFrase;
        }//end for
        System.out.println(newFrase);
    }//end inversa
}//end class
