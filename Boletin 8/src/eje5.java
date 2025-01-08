/**
 * Conta as vocais e as consoantes do String “java java java”. OLLO COS ESPAZOS!
 * @author Oliver Miguez Alonso
 */
public class eje5 {
    public static void main(String[] args) {
        String texto = "java java java";
        // Eliminar los espacios
        String textoSinEspacios = texto.replace(" ", "");
        // Contar los caracteres
        int numeroDeCaracteres = textoSinEspacios.length();
        System.out.println("Número de caracteres (sin contar espacios): " + numeroDeCaracteres);
    }//end main
}//end class
