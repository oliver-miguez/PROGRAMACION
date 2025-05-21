import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Deseña a aplicación que solicite por consola números enteiros ata que se introduce o -1.
 * Os números positivos se gardarán nunha colección.
 * O programa mostrará por pantalla os enteiros apuntados cun índice par, multiplicados por 100.
 */
public class Main {
    public static void main(String[] args) {
        //ArrayList
        Collection<Integer> pares = new ArrayList<>();
        Collection<Integer> resultado = new ArrayList<>();

        //pedir datos por consola
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num = sc.nextInt();

        //Distintas acciones que realiza trás añadir un número por pantalla
        while (num != -1){
            if(num > 0){
                if(num % 2 == 0){
                    pares.add(num);
                }
                System.out.println("Introduce un número: ");
                num = sc.nextInt();
            }else{
                System.out.println("Numero negativo no valido");
                System.out.println("Introduce un número: ");
                num = sc.nextInt();
            }
        }//end while

        //Recorre el arrayList de números pares
        Iterator<Integer> iterator = pares.iterator();

        //Mientras tenga valores en el arrayList pares
        while (iterator.hasNext()) {
            resultado.add(iterator.next() * 100);//añadirá valores al arrayList de resultado según los valores que existen en el arrayList pares * 100
        }//end while

        //Muestra el resultado
        System.out.println(resultado);



    }//end main
}//end class