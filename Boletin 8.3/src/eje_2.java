import java.util.Arrays;

/**
 * 2. Escribe a función que lea o título e o contido dunha páxina web dun string pasado por parámetro.
 * A aplicación xerará por consola un documento HTML onde o título será un encabezamento (<h1>) e o resto do contido será un parágrafo (<p>).
 * Para facer iso ten a función ten que analizar o texto detectar o primeiro salto de liña, dende o comezo ata el será o título.
 * Dende ese salto de liña ata o final será o parágrafo.
 *
 * @author Oliver Miguez Alonso
 * @version 1.0
 */
public class eje_2 {
    /**
     * Metodo principal del programa
     * @param args no usamos
     */
    public static void main(String[] args) {


    }//end main

    public static String formatearHTML(String texto){
        int posSaltoLinha = texto.indexOf('\n');
        String codigoHtml = "<hyml> \n";
        codigoHtml = codigoHtml + "<h1>"+texto.substring(posSaltoLinha)+ "<\\h1>" + "\n";
        codigoHtml = codigoHtml + "<p>" + texto.substring(posSaltoLinha+1, texto.length()-1) +"<\\p \n>" + "<\\html>";
        codigoHtml = codigoHtml+ "<\\html>";
        return codigoHtml;
    }//end formatear
}//end class

