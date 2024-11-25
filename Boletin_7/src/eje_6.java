import java.util.Scanner;

/**
 * Sistema que busca dentro de una tabla el numero introducido
 * @author Oliver Miguez Alonso
 */
public class eje_6 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        //tabla con valores ordenados
        int[]numeros = {1,4,7,9,11,23,34,46,59};

        buscar(numeros,sc);

    }//end main
    static void buscar(int[]numeros, Scanner sc){
        System.out.println("Introduce un numero: ");
        int num = sc.nextInt();
        int div = 0;

        for(int i = 0; i < numeros.length; i++){ //accede al array numero
            div = numeros.length / 2;// el numero del medio del array dividido
            //si el numero introducido es mayor que el nuevo numero del medio




        }//end for
        System.out.println("El numero del medio es "+ div);
    }//end buscar


}//end class
  /*
            todo
            dividir array entre 2
            y buscar la posición en la que se encuentra el array central
            descartamos el lado en el que no se encuentre

            dividimos los array entre dos para seguir descartando
            hasta encontrar el valor

            en caso de que no exista lo mencionamos
             */