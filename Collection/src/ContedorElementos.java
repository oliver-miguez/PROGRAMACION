import java.util.Arrays;

public class ContedorElementos<T> implements Pila<T>{
    private T[] obxectos; //array de obxectos xenérico (de cualquier tipo)

    //CONSTRUCTOR
    public ContedorElementos(T[] obxectos){
        this.obxectos = obxectos;
    }

    //MÉTODOS DE LA INTERFAZ
    @Override
    public void apilar(T novo) {
        //crea un array nuevo con los mismo valores que el copiado añadiendo un espacio más
        obxectos = Arrays.copyOf(obxectos, obxectos.length+1);
        //si el length fuera 4 , esto se guardaría en memoria como 0,1,2,3, entonces lo que hace
        //es restarle 1 al length del objeto para atribuir la posición 3 de memoria a "novo", esta guardando "novo" en
        //la última posición del array, básicamente apilando los objetos
        obxectos[obxectos.length-1] = novo;
    }

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
}
