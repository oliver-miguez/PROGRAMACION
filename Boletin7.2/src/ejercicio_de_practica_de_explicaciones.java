import java.util.Arrays;
import java.util.Scanner;
/**
 * Inserción de un elemento en una lista ordenada
 * si el valor esta en la tabla , no lo introducimos
 * si no esta en la tabla , lo introducimos
 * @author Oliver Miguez Alonso
 */
public class ejercicio_de_practica_de_explicaciones {
    /**
     * Método principal del programa
     * @param args no usamos
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número que quieres añadir al array");
        int num = sc.nextInt();

        //crea el array con los números(array original)
        int[]numero = {2,12,25,36,48};

        //busca la mejor posición para el número en el array y la guarda en la variable
        int indice = Arrays.binarySearch(numero,num);

        // Si el número no está en el array, binarySearch devuelve un valor negativo
        if (indice < 0) {
            // Calcula la posición donde debería insertarse el num
            indice = -indice - 1;
        }//end if

        //llama a la función con la que crea la nueva tabla
        crearNuevaTabla(numero,num,indice);

    }//end main

    /**
     * Crea una nueva tabla la cual dispone de un espacio más que la tabla original para introducir el nuevo número
     * @param numero array original
     */
    static void crearNuevaTabla (int[]numero,int num,int indice){
        //le da al nuevo array un espacio más que el array original para incluir en num
        int[]nuevaTabla = new int[numero.length+1];
        //llama a la función que integra el num en la nueva tabla
        añadirNumTabla(nuevaTabla,num,indice,numero);
    }//end insertarNumero

    /**
     * Añade el num a la nueva tabla
     * @param nuevaTabla tabla de la función crearNuevaTabla
     * @param num numero introducido por el usuario
     * @param indice posición adecuada para el num
     */
    static void añadirNumTabla(int[]nuevaTabla,int num,int indice,int[] numero){
        //accede al array y introduce en la posición índice el num
        for(int i = 0; i < nuevaTabla.length; i++){
            //da a la posición índice del array el valor de num
            nuevaTabla[indice] = num;
            //System.out.println(nuevaTabla[i]);
        }//end for

        //llamamos a la función que copia los números del array original
        copiarNumeros(numero,nuevaTabla);
    }//end añadirNumTabla


    //todo REVISAR COMO HACER PARA COPIAR LOS NÚMEROS DEL ARRAY ORIGINAL PARA CADA CASO DISTINTO DE NUM
    /**
     * Copia los números del array original y los añade en sus posiciones respectivas en el nuevo array
     * @param numero array original
     * @param nuevaTabla tabla que incluye el num(numero introducido por el usuario)
     */
    static void copiarNumeros(int[]numero,int[]nuevaTabla){
        //copia los números del array original
        nuevaTabla = Arrays.copyOf(numero,nuevaTabla.length);
        //accedemos a la nueva tabla para ver si copió los valores
        for(int i = 0; i < nuevaTabla.length;i++){
            System.out.println(nuevaTabla[i]);
        }//end for
    }//end copiarNumeros
}//end class
