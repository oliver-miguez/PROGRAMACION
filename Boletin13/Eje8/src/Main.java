import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Facer o mesmo que o exercicio 7 coa intersección, formada polos elementos comúns os dous conxuntos. A chamada a función terá o seguinte formato:
 * static <E> Set <E> interseccion (Set<E> conxunto1, Set<E> conxunto2)
 */
public class Main {
    public static void main(String[] args) {

        Set<Integer> numeros1 = new HashSet<>();
        numeros1.add(1);
        numeros1.add(2);
        numeros1.add(12);
        numeros1.add(10);
        numeros1.add(13);
        numeros1.add(3);
        numeros1.add(21);

        Set<Integer> numeros2 = new HashSet<>();
        numeros2.add(2);
        numeros2.add(1);
        numeros2.add(21);
        numeros2.add(1);
        numeros2.add(12);

        System.out.println(interseccion(numeros1,numeros2));
    }//end main

    /**
     * Busca cuales son los números que se repiten en ambas colecciones
     * @param conxunto1 una colección de datos
     * @param conxunto2 una colección de datos
     * @return una colección de los números comunes entre ellos
     * @param <E> de valores genéricos
     */
    static <E> Set<E> interseccion (Set<E> conxunto1, Set<E> conxunto2){
        Set<E>valoresComunes = new HashSet<>(conxunto1);//crea un Set con los valores de la colección conxunto1
        valoresComunes.retainAll(conxunto2);//recoge los valores que coincidan con los del conxunto2
        return valoresComunes;
    }//end static
}//end class