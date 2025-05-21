import java.util.Arrays;

/**
 * Administra la concatenación de las tablas
 */
public class ConcatenarTablas <T> implements Contenedor<T> {

    @Override
    public T[] concatenar(T[] tabla1, T[] tabla2) {
        //copia los elementos de tabla1 en un nuevo array con el tamaño de tabla1.length + tabla2.length
        T[]res = Arrays.copyOf(tabla1,tabla1.length+tabla2.length);
        //copia los elementos de la tabla2 desde el indice 0 en la tabla res a partir de la posición tabla1.length con un total de tabla2.length valores
        System.arraycopy(tabla2,0,res,tabla1.length,tabla2.length);
        return res;
    }

}
