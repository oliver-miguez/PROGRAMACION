import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Crea a aplicación onde se piden por consola números reais ata que se introduce un 0.
 * A medida que se len do teclado, os valores positivos se introducen nunha colección  e os negativos noutra.
 * A aplicación, mostrara as dúas coleccións e as sumas dos elementos de cada unha delas.
 * O fin, eliminaranse das dúas coleccións os elementos maiores de 10 e menores de -10 e se voltan a mostrar.
 */
public class Main {
    public static void main(String[] args) {
        //ArrayList
        Collection<Integer>positivos = new ArrayList<>();
        Collection<Integer>negativos = new ArrayList<>();

        //Sumas
        int sumaPositivos = 0;
        int sumaNegativos = 0;

        //recoge números por consola
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int num = sc.nextInt();

        //añadir números a sus respectivas listas
        while (num != 0) {
            if (num > 0) {
                positivos.add(num);
                sumaPositivos += num;
                System.out.println("Introduce un número:");
                num = sc.nextInt();
            } else {
                negativos.add(num);
                sumaNegativos += num;
                System.out.println("Introduce un número:");
                num = sc.nextInt();
            }
        }//end while

        //mostrar listas
        System.out.println(positivos);
        System.out.println("Suma positivos: "+ sumaPositivos);
        System.out.println(":::");
        System.out.println(negativos);
        System.out.println("Suma negativos: "+ sumaNegativos);

        //eliminación de elementos mayores a 10 y menores a -10
        Iterator<Integer> iteratorPositivo = positivos.iterator();
        Iterator<Integer> iteratorNegativo = negativos.iterator();

        //Valores para recorrer los arrayList con Iterator
        Integer pos;
        Integer neg;

        //eliminación para positivos
        for(;iteratorPositivo.hasNext();){
            pos = iteratorPositivo.next();
            if(pos>10){
                iteratorPositivo.remove();
            }
        }//end for

        //eliminación para negativos
        for(;iteratorNegativo.hasNext();){
            neg = iteratorNegativo.next();
            if(neg<-10){
                iteratorNegativo.remove();
            }
        }//end for

        //Muestra los arrayList con los valores deseados eliminados
        System.out.println("Eliminación de valores ");
        System.out.println("Positivos: "+positivos);
        System.out.println(":::");
        System.out.println("Negativos: "+ negativos);

    }//end main
}//end class