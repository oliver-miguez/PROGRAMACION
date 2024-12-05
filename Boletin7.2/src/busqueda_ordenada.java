import java.util.Arrays;//permite usar las funciones de la librería arrays

/**
 * Como hacer una busqueda ordenada
 * @author Oliver Miguez Alonso
 */
public class busqueda_ordenada {
    /**
     * Metodo principal del programa
     * @param args no usamos
     */
    public static void main(String[] args) {

        //tabla de números para encontrar de manera ordenada
        int[]numeros = {8,13,15,19,56,57,61};

        //crea una variable que en el array números buscará un número
        int indice = Arrays.binarySearch(numeros, 30); //indice = -5
        System.out.println(indice);
        if(indice>=0) System.out.println("Existe na táboa");
        else System.out.println("Non existe");

        /*copiar array*/

        //copia un array entero
        int[]num2 = Arrays.copyOf(numeros, numeros.length);

        //copia los números que se encuentran desde la posición 1 hasta la posición 5 : en este caso --> 13,15,19,56
        int[]num3 = Arrays.copyOfRange(numeros,1,5);
        for(int n: num3 ) System.out.println(n);


    }//end main
}//end class
