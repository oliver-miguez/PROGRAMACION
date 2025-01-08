/**
 * Transforma os caracteres do String: “ ABCD” a ASCII.
 * @author Oliver Miguez Alonso
 */
public class eje10 {
    public static void main(String[] args) {
        String texto = "ABCD";
        for (int i = 0; i < texto.length(); i++) { //Viaja a trabes de cada caracter del String
            int asciiValue = (int) texto.charAt(i); //Obtiene el numero Ascii correspondiente a cada char del String
            System.out.println("El valor ASCII de '" + texto.charAt(i) + "' es " + asciiValue);
        }//end for
    }//end main
}//end class
