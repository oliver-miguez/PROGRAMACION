import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Crear una lista de numero enteiros positivos recollidos por teclado e cando se introduzca -1 finalice
 * Mostrar por pantalla los números con indice par
 * @author Oliver Miguez Alonso
 */
public class ListaEje {
    public static void main(String[] args) {
        //crea una lista para recoger los números
        List<Integer> numerosTodos = new ArrayList<>();
        //crea un Scanner para introducir datos por pantalla
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero positivo, -1 para finalizar");
         int num = sc.nextInt();

         //si el número introducido no es -1
        while (num != -1){
            //verificar si es positivo
            if(num > 0) {
                //añade el número introducido por pantalla a la lista
                numerosTodos.add(num);
            }//end if
            else{
                System.out.println("El numero no es positivo");
            }//end else
            System.out.println("Introduzca un numero , -1 para finalizar");
            num = sc.nextInt();
        }//end while
        System.out.println("Todos los numeros:"+numerosTodos);

        /*
        Aquí se crea un ListIterator para recorrer la lista numerosTodos.
         El ListIterator es una versión mejorada de un iterador que permite avanzar, retroceder y modificar la lista durante la iteración.
         */
        ListIterator<Integer> iterador = numerosTodos.listIterator();
        /*
        Se inicializa un índice en 0 y se empieza un bucle while, que se ejecuta mientras haya elementos en la lista
        (hasNext() devuelve true cuando hay un siguiente elemento).
         */
        int indice = 0;
        while (iterador.hasNext()) {
            //Cada vez que se ejecuta iterador.next(), el iterador avanza al siguiente elemento de la lista.
            iterador.next();

            //Si el índice actual es impar, se usa iterador.remove() para eliminar el elemento.
            if (indice % 2 != 0) { // Si el índice es impar
                iterador.remove();
            }
            indice++;//después de cada iteración se actualiza el índice para indicar la posición actual en la lista
        }
        System.out.println("Numeros de indice par:"+numerosTodos);


    }//end main
}//end class
