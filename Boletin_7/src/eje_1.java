
/**
 *  Realiza un programa que cree un array chamado “numeros” con 6 numeros aleatorios dun rango de 1 a 50 .
 *  Seguidamente visualiza o array o revés (0 primeiro elemento visualizaráse o último e asi sucesivamente).
 * @author Oliver Miguez Alonso
 * @version 1.0
 */
public class eje_1{
    /**
     * Metodo principal del programa
     * @param args no usamos
     */
    public static void main(String[]args){
        int [] numeros = {2,15,34,45,50}; // crea el array que contiene 6 numeros
        /*
        Crea un nuevo array en el que introduce el array numeros y le da la vuelta
        aplicando la funcion reverseArray
         */
        int [] reversa = reverseArray(numeros);//en el array creado en la funcion reverseArray se le dara los valores del array numeros


        //Muestra los valores que se encuentran dentro del array ya dado la vuelta
        for(int i = 0; i< reversa.length; i++){
            System.out.println(reversa[i]);

        }//end for
    }//end main
    /**
     * Método para invertir un array
     * @param array Array a invertir
     * @return Array invertido
     */
     static int[] reverseArray(int[] array) { //forma de llamar a una funcion para trabajar con arrays
        /*
         crea un nuevo array result que sera el array dado la vuelta, el cual tendra de valor inicial
         el valor del array de numeros
         */
         int[] result = new int[array.length];

         //condición de bucle (`i < array.length`)**: El bucle se repite tantas veces como la longitud del array original
        for (int i = 0; i < array.length; i++) { // i < array.lenght verifica que i sea menor que la longitud del array
            result[i] = array[array.length - 1 - i]; // el array result almacena el array invertido
            //result[0] = array[5-1-0] = array[4] = 50;
            //result[1] = array[5-1-1] = array[3] = 45;
            //result[2] = array[5-1-2] = array[3] = 34;
            //etc


        }
        return result;
    } // end reverseArray
}//end class