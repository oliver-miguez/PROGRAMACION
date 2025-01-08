/**
 * Transforma a cadea de texto “ javeros” a maiúsculas.
 * Garda o valor na variable e posteriormente convértea novamente a minúsculas.
 * @author Oliver Miguez Alonso
 */
public class eje7 {
    public static void main(String[] args) {
        String textoInicial = " javeros";
        String textoMayuscula = textoInicial.toUpperCase(); // Transforma el texto a letras mayúsculas
        System.out.println(textoMayuscula);
        String textoMinuscula = textoMayuscula.toLowerCase(); // Transforma el texto a letras minúsculas
        System.out.println(textoMinuscula);
    }//end main
}//end class
