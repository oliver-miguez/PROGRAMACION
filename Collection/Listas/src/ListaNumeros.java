import java.util.ArrayList;
import java.util.List;

public class ListaNumeros {
    public static void main(String[] args) {
        //Creamos un objeto de tipo lista
        List <Integer> listaEnteiros = new ArrayList<>();
        listaEnteiros.add(3);
        listaEnteiros.add(2);
        listaEnteiros.add(1);
        listaEnteiros.add(11);
        listaEnteiros.add(33);
        listaEnteiros.add(3);
        listaEnteiros.add(3);
        System.out.println(listaEnteiros);

        //añade un número en la posición introducida eliminando al anterior número que tenía esa posición
        listaEnteiros.set(3,44);
        //añade uno nuevo en la posición deseada sin eliminar el anterior
        listaEnteiros.add(3,25);
        //añade en la posicion deseada toda una lista de collections
        listaEnteiros.addAll(5, listaEnteiros);
        //Devolta o cuarto elemento xa que empeza desde 0 (método propio de la clase LIST)
        System.out.println(listaEnteiros.get(3));

        System.out.println(listaEnteiros);


    }
}
