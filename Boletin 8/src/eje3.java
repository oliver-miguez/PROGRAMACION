/**
 * Invertir o texto: “Java dende 0”
 * @author oliver miguez alonso
 */
public class eje3 {
    public static void main(String[] args) {
        String texto = "java desde 0";

        // Esta será la cadena invertida, primero está vacía
        String invertida = "";

        // Recorremos la original del final al inicio
        for (int indice = texto.length() - 1; indice >= 0; indice--) {

            // Y vamos concatenando cada carácter a la nueva cadena
            invertida += texto.charAt(indice);
        }//end for

        System.out.println("Cadena invertida: " + invertida);

    }//end main
}//end class
