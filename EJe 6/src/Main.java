import java.util.*;

/**
 * Codifica a aplicación que inserte nunha lista un conxunto de números enteiros entre 1 e 10. A partires desta lista crear:
 * Un conxunto cos elementos da lista sen repetir.
 * Un conxunto cos elementos repetidos.
 * Un conxunto cos elementos que só aparecen unha vez (únicos).
 */
public class Main {
    public static void main(String[] args) {
        //ArrayList
        Collection<Integer> numeros = new ArrayList<>(); //almacena todos los números generados
        Collection<Integer> nonRepetidos = new ArrayList<>();

        //Generar números en cada posición del arrayList
        for(int i = 0; i < 20; i++){
            int num = (int) Math.random()*10+1;
            numeros.add(num);
        }//end for

        //Lista sin repetir
        Set<Integer> noRepetir = new HashSet<>();
        //recorrer la lista de todos los números
        Iterator<Integer> it = numeros.iterator();
        while (it.hasNext()){
            Integer n = it.next();
            nonRepetidos.add(n);
        }
        System.out.println(nonRepetidos);
    }//end main
}//end class
