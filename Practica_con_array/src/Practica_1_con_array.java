/**
 * Codificar unha función que faga unha copia dunha matríz pasada como parámetro e devolte a copia do matríz.
 * devuelve una copia de un array
 */
public class Practica_1_con_array {
    /**
     * Metodo principal del programa
     *
     * @param args no usamos
     */
    public static void main(String[] args) {
        int[] lista = new int[10]; //lista de 10 numeros que clonará el programa
        //genera 10 numeros ramdon y los añade  a la lista
        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int) (Math.random() * 10);
            System.out.println(lista[i]);//muestra la lista
        }//end for
        System.out.println("_____________________________________");
        clonar(lista);
    }//end main

    /**
     * Clona la lista
     *
     * @param lista introduce los valores del array lista
     * @return lista clonada
     */
    static int[] clonar(int[] lista) {
        System.out.println("lista clonada:");
        int[] clonar = lista;
        for (int j = 0; j < clonar.length; j++) {
            System.out.println(clonar[j]);
        }//end for
        System.out.println("_________________________________");
        return clonar;
    }//end clonar

}//end class