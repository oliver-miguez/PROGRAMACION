/**
 * 1 .Escribir funcións que dada unha cadena de caracteres:
 * Imprima os dous primeiros caracteres.
 * Imprima os tres últimos caracteres.
 * Imprima dita cadea cada dous caracteres. Ex.: recta debería imprimir rca
 * Imprima a cadea nun sentido e en sentido inverso. Ex: reflexo imprime reflexooxelfer.
 * @author Oliver Miguez Alonso
 */
public class eje1 {
    /**
     * Metodo principal del programa
     * @param args no usamos
     */
    public static void main(String[] args) {
        String texto = "Este es un ejercicio de programación";
        int tamanoTexto = texto.length();

        dousPrimeiros(texto);
        System.out.println(otraManeraUltimosTres(texto));
        ultimosTres(texto,tamanoTexto);
        cadeaCadaDousCaracteres(texto);
        imprimir(texto);
    }//end main

    /**
     * Función que imprime los dos primeros caracteres del texto introducido
     * @param texto String inicial
     */
    public static void dousPrimeiros(String texto){
        System.out.println("Imprime los dos primeros numeros");

        int[]posicion = {0,1}; // definimos una lista con las posiciones que queremos que muestre por pantalla

        for(int pos:posicion){ // creamos un for para que solo trabaje con estas posiciones

            /*
            Los distintos casos:
            1-Si la posición es 0, cuando en el for la posición sea 0 muestra el elemento 0 del texto
            2-Si la posición no es 0 solo puede ser 1 , por la lista anteriormente creada
            por lo tanto si es 1 muestra el caracter 1 del texto
             */
            System.out.println(texto.charAt(pos));
        }//end for

        System.out.println("________________________________");
    }//end dous primeiros

    /**
     * Muestra los ultimos tres caracteres del texto introducido
     * @param texto String inicial
     * @param tamanoTexto El numero de caracteres que tiene el String inicial
     */
    public static String ultimosTres(String texto,int tamanoTexto){
        System.out.println("Imprime los ultimos tres caracteres del texto");
        String pedazo = "";

        /*
        Con el tamaño del texto , simplemente creamos tres variables a la cual le restamos 1 , 2 y 3 para
        obtener sus últimas tres posiciones
         */
        int pos1 = tamanoTexto - 1;
        int pos2 = tamanoTexto - 2;
        int pos3 = tamanoTexto - 3;

        //Le damos a pedazo el valor de cada posición , para crear un nuevo String
        pedazo = pedazo + texto.charAt(pos3);
        pedazo = pedazo + texto.charAt(pos2);
        pedazo = pedazo + texto.charAt(pos1);

        System.out.println(pedazo);
        System.out.println("_______________________________________");

        return pedazo;
    }//end ultimosTres

    public static String otraManeraUltimosTres(String texto){
        int tamaño = texto.length();
        return texto.substring(tamaño-3);
    }//end otraManeraUltimosTres

    /**
     * Imprime un caracter y deja otro sin imprimir
     * @param texto String inicial
     */
    static void cadeaCadaDousCaracteres(String texto){
        for(int i = 0; i < texto.length();i++){
            if(i%2 == 0){
                System.out.println(texto.charAt(i));
            }//end if
        }//end for
    }//end cadeaCadaDousCaracteres

    /**
     * Imprime del derecho y del revés el String Inicial
     * @param texto String Inicial
     */
    public static void imprimir(String texto){
        System.out.println(texto);

    }//end imprimir
}//end class
