import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

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
        System.out.println(numeros);
        //almacenar los numeros que se borrarán
        Collection<Integer>numBorrables  = new ArrayList<>();
        numBorrables.add(5);
        numBorrables.add(7);
        numeros.removeAll(numBorrables);//elimina todos los números de la lista
        System.out.println(numeros);

        Integer n;
        Iterator<Integer> it = numeros.iterator();
        //Borrará los 3 y los 8 del programa
        for(;it.hasNext();){
            n = it.next();
            if ( n == 3 || n == 8 ){
                it.remove();
            }//end if
        }//end for
        System.out.println(numeros);

    }//end main
}//end class
