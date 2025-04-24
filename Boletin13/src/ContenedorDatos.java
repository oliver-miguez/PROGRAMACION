import java.util.Arrays;

public class ContenedorDatos<T> implements Taboa<T>{
   //PROPIEDADES
    private T[]taboaFusion;

    //CONSTRUCTOR
    public ContenedorDatos(T[]taboaFusion){
        this.taboaFusion = taboaFusion;
    }

    //MÉTODOS IMPLEMENTADOS

    /**
     * Permite juntar los valores de las dos tablas
     * @return nueva tabla con los nuevos valores
     */
    @Override
    public T xuntarTablas(T[] taboa1, T[] taboa2) {
        taboaFusion = Arrays.copyOf(taboa1,taboa1.length+taboa2.length);// crea un nuevo array con el tamaño de la fusión de ambos array proporcionados
        System.arraycopy(taboa2, 0, taboaFusion, taboa1.length, taboa2.length);
        return taboaFusion;
    }


}

