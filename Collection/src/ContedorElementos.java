import java.util.Arrays;

public class ContedorElementos<T> implements Pila<T> , Fila <T>{
    private T[] obxectos; //array de obxectos xenérico (de cualquier tipo)

    //CONSTRUCTOR
    public ContedorElementos(T[] obxectos){
        this.obxectos = obxectos;
    }

    //MÉTODOS DE LA INTERFAZ

    /**
     * Añade elementos al final de la pila
     * @param novo array de datos
     */
    @Override
    public void apilar(T novo) {
        //crea un array nuevo con los mismo valores que el copiado añadiendo un espacio más
        obxectos = Arrays.copyOf(obxectos, obxectos.length+1);
        //si el length fuera 4 , esto se guardaría en memoria como 0,1,2,3, entonces lo que hace
        //es restarle 1 al length del objeto para atribuir la posición 3 de memoria a "novo", esta guardando "novo" en
        //la última posición del array, básicamente apilando los objetos
        obxectos[obxectos.length-1] = novo;
    }

    /**
     * Quita el último elemento de la pila
     * @return el último elemento de la pila
     */
    @Override
    public T desapilar() {
        T res = null;//resultado
        //Mientras existan elementos en el array
        if (obxectos.length>0){
            //almacena el la variable res el último elemento de la pila
            res = obxectos[obxectos.length-1];
            //crea un array copiado del original en el que se le quita el último valor añadido o existente del array
            obxectos = Arrays.copyOf(obxectos, obxectos.length-1);
        }
        return res;
    }

    /**
     * Añade elementos al final de la fila
     * @param novo array de datos
     */
    @Override
    public void encolar(T novo) {
        apilar(novo); //aplica la misma función que realiza apilar
    }

    /**
     * Quita el primer elemento de la fila
     */
    @Override
    public T desencolar() {
        T res = null;
        //verifica si el array no está vacío
        if(obxectos.length > 0){
            //Inicia el array a 0
            res = obxectos[0];
            //copia en un nuevo array los valores del array obxectos pero desde la posición de memoria 1 (despreciando asi la posición 0) hasta el final del array original
            obxectos = Arrays.copyOfRange(obxectos,1,obxectos.length);
        }
        return res;

    }
}
