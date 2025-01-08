/**
 * Tenta escribir un metodo,
 * que dado un obxecto da clase String conte diferentes
 * tipos de caracteres.
 * En particular, o metodo deberá imprimir o número de letras,
 * díxitos e espazos en branco da cadea. Tenta facer un programa que escriba o cálculo da cadea:
 * «Ola, son alumno de DAM1, e son programador desde o 2024».
 * @author Oliver Miguez Alonso
 */
public class eje11 {
    public static void main(String[] args) {
        int contadorEspacios = 0;

        String texto = "Ola, son alumno de DAM1, e son programador desde o 2024";

        //Muestra el número total de letras del texto sin contar espacios en blanco ni caracteres especiales como ","
        String texto2 = texto.replace(" ","");
        String texto3 = texto2.replace(",","");
        System.out.println("Muestra el numero de letras sin contar espacios ni carateres especiales: "+ texto3.length());

        //Muestra el número total de dixitos
        System.out.println("El texto tiene un total de "+ texto.length()+" digitos");

        //Muestra el número de espacios del String
        for(int i = 0; i < texto.length();i++){
            if(Character.isWhitespace(texto.charAt(i))){ // Comprueba en cada char del String si es un espacio en blanco
                //si el char en el que se encuentra da true como espacio en blanco lo almacena
                contadorEspacios++;
            }//end if
        }//end for
        System.out.println("El texto tiene "+ contadorEspacios+ " espacios");

    }//end main
}//end class
