/**
 * crea un programa que te dice cual es el numero mas grande que tiene el array
 */
public class proba_cod {
    public static void main(String[] args) {
        int[] numeros = {2,15,34,45,50}; // crea el array que contiene 5 numeros
        int maximo = numeros[0]; // inicializa el maximo con el primer elemento del array

        // recorre el array y compara cada elemento con el maximo
        for(int i = 1; i < numeros.length; i++){
            if(numeros[i] > maximo){
                maximo = numeros[i];
            }
        }

        // muestra el numero mas grande que hay en el array
        System.out.println("El numero mas grande es: " + maximo);


    }
}