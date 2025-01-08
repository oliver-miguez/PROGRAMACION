/**
 * Sobre a cadea de texto “ Jeve jeve jeve”, substitúe todas as vocais e pola vogal para dando como resultado “java java java”.
 * @author Oliver Miguez Alonso
 */
public class eje9 {
    public static void main(String[] args) {
        String texto = " Jeve Jeve Jeve";
        // Cambia el valor deseado por el que el usuario desea
        String changeTexto = texto.replace("e","a");
        System.out.println(changeTexto);
    }//end main
}//end class
