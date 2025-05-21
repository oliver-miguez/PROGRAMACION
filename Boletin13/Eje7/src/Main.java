import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Implementar un método estático que faga a unión de dous conxuntos de elementos xenéricos.
 * A unión é un novo conxunto con tódolos elemento que pertenzas, o menos, a un do dosu conxuntos. A chamada a función terá o seguinte formato:
 * static <E> Set <E> union (Set<E> conxunto1, Set<E> conxunto2)
 */
public class Main{
    public static void main(String[] args) {

        Set<Integer> numeros1 = new HashSet<>();
        numeros1.add(10);
        numeros1.add(2);
        numeros1.add(3);

        Set<Integer> numeros2 = new HashSet<>();
        numeros2.add(4);
        numeros2.add(5);
        numeros2.add(6);

        System.out.println(union(numeros1,numeros2));



    }//end main

    /**
     * Unión de dos conjuntos de tipo genérico
     * @param conxunto1 primera colección de valores
     * @param conxunto2 segunda colección de valores
     * @return Una colección de los valores de los dos conjuntos
     * @param <E> valores de carácter genérico
     */
    static <E> Set<E> union (Set<E> conxunto1, Set<E> conxunto2) {
        Set<E> conxuntoTotal = new HashSet<>(conxunto1);//crea un set con los elementos especificos de conxunto1
        conxuntoTotal.addAll(conxunto2);//añade todos los elementos del conxunto2
        return conxuntoTotal; //retorna la colección con los valores de los dos conxuntos
    }//end static

}//end class
