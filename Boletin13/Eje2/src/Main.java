import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Ej2.Codificar unha aplicación onde se insertan 100 números enteiros aleatorios entre 1 e 10
 * (ámbolos dous incluidos), poidendo estár repetidos, nunha colección. Despois elimínanse tódolos
 * elementos que valen 5 e 7. Mostrar a colección antes e despois da eliminación.
 *
 * Ej3.Repite o programa do exercicio 2, usando un interador para eliminar os elementos que valen 3 e 8.
 */
public class Main {
    public static void main(String[] args) {
        Collection<Integer>numeros = new ArrayList<>(); //Lista donde se almacenaran los números

        //en cada posición de los 100 números
        for(int i = 0; i < 100 ; i++){
            int num = (int) Math.floor(Math.random()*10+1);//genera un numero aleatorio del 1 al 10
            numeros.add(num);//añade en cada posición de los 100 números un número aleatorio
        }//end for

        System.out.println(numeros); //muestra la lista antes de borrar el 5 y 7

        Collection<Integer>borrar = new ArrayList<>();//lista que almacenará los números que se borrarán
        //números a borrar
        borrar.add(5);
        borrar.add(7);

        numeros.removeAll(borrar);//borra todos los números que tiene la lista borrar

        System.out.println(numeros);//muestra la nueva tabla modificada


        Iterator<Integer>iter = numeros.iterator();//crea un objeto iterator que recorre el arrayList "numeros"
        Integer n; //número que representa todos los números del arrayList

        for(;iter.hasNext();){ //mientras la lista no este vacía
            n = iter.next(); // se le da el valor de la lista a n
            if(n == 3 || n == 8){ //si ese valor es igual a 3 o 8
                iter.remove();//borra el valor del arrayList
            }//end if
        }//end for
        System.out.println(numeros);

    }//end main
}//end class