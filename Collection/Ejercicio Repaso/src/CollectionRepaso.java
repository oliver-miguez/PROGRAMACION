import java.util.ArrayList;
import java.util.Collection;

/**
 * Crea una collection de 100 números aleatorios del 0 al 10 que filtre y elimine de la collection todos los números que sean iguales a 5 o 7
 * @author Oliver Miguez Alonso
 */
public class CollectionRepaso {
    public static void main(String[] args) {
        //crea el arrayList de los 100 números
        Collection<Integer> numeros = new ArrayList<>();
        //añade en las 100 posiciones un número aleatorio del 1 al 10
        for(int i = 0; i < 100; i++){
            numeros.add((int) (Math.random()*10+1));
        }//end for
    }//end main
}//end class
