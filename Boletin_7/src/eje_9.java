import static java.util.Collections.binarySearch;

/**
 * crea un array que no tiene repeticiones
 * @author Oliver Miguez Alonso
 * @version 1.0
 */
public class eje_9 {
    public static void main(String[] args) {
        // Array original con valores
        int[] taboa = {1, 1, 2, 2, 3, 4, 5, 3, 2, 6, 7, 7};
        sen_repeticion(taboa);
    }

    static int[] sen_repeticion(int[]taboa){
        int[]temporal = new int[0];
        for ( int elemento: taboa){
            if(binarySearch(temporal, elemento) < 0){
                System.out.println("repetido: "+elemento);
                int[]novo = new int[temporal.length+1];
                for(int i = 0 ; i< temporal.length; i++){
                    novo[i] = temporal[i];
                }
                novo[temporal.length]=elemento;
                temporal = novo;
            }
        }
        return  temporal;
    }


}