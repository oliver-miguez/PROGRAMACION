/**
 *Codificar unha función que faga unha copia dunha matríz pasada como parámetro e devolte a copia do matríz.
 */
public class Practica_1_con_array {
    /**
     * Metodo principal del programa
     * @param args no usamos
     */
    public static void main(String[] args) {

        int[] lista = new int[10]; //lista de 10 numeros que clonará el programa

        //genera 10 numeros ramdon y los añade  a la lista
        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int) (Math.random() * 10);
        }//end for

        System.out.println("_____________________________________");

        clonar(lista);

        //comprueba para saber si son una misma lista o si son distintas
        if(lista == clonar(lista)){
            System.out.println("Las listas son la misma");
        }//end if
        else{
            System.out.println("Son listas distintas");
        }//end else


    }//end main

    /**
     * Clona la lista
     *
     * @return retorna la nueva lista clonar
     */
    static int[] clonar(int[] lista) {
        //nuevo array, que copiara el array
        int[] clonar;
        clonar = new int[lista.length];//coge el mismo tamaño que el array lista

        //entra en la lista clonar , para igualar todos los valores con los del array lista
        for (int j = 0; j < clonar.length; j++) {
            clonar[j]=lista[j];//da a la lista clonar , los valores del array lista
            System.out.println(clonar[j]);

        }//end for
        System.out.println("_______________________________________");
        return clonar;


    }//end clonar

}//end class