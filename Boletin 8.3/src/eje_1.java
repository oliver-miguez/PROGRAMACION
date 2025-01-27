import java.util.Scanner;
/**
 *1.Desenvolver a función que convirta unha palabra en secuencias de I letras. Por exemplo a palabra frigorífico dividida en secuencia de 4 letras quedaría da seguinte forma:
 * frig, rigo, igor, gorí, orif, rifi, ific, fico.
 * A palabra e o número da secuencia o recibirá como parámetro, e devoltará o resultado nunha referencia a un array de Stings.
 * @author Oliver Miguez Alonso
 * @version  1.0
 */
public class eje_1 {
    /**
     * Metodo principal del programa
     * @param args no usamos
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Preguntas realizadas al usuario.
        String palabra = "Frigorífico";
        System.out.println("La palabra es: "+ palabra);

        //Almacena en cuántas veces quiere partir la palabra(de tres letras en tres, de cuatro en cuatro ...)
        System.out.println("En cuántas secuencias quieres dividirla?");
        int secuencias = sc.nextInt();

        //transforma el String a devolver de la función en una nueva variable para usarla en la main
        String palabraDividida = divPalabra(palabra,secuencias);

    }//end main

    /**
     * Divide la palabra según la secuencia decidida
     * @param palabra String original
     * @param secuencia Secuencia en la que se desea dividir la palabra
     */
    public static String divPalabra( String palabra, int secuencia){
        String nuevaPalabra = "";//almacena las palabras divididas
        int pos = 0;//almacenar la posición inicial del nuevo String en cada secuencia

        //Divide la palabra en la secuencia deseada por el usuario
        for ( int i = 0; i < palabra.length(); i++ ){
            nuevaPalabra = palabra.substring(pos,secuencia); //divide la palabra en valor a la secuencia
            System.out.println(nuevaPalabra); //muestra las palabras divididas

            secuencia = secuencia + 1; //para mostrar las letras siguientes de la palabra
            pos ++;//posición inicial con la que muestra la palabra
            if(secuencia > palabra.length()){
                System.out.println("Limite maximo alcanzado");
                break;
            }
        }//end for
        return nuevaPalabra;
    }//end divPalabra

}//end class