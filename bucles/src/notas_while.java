/**
 * Hace la media de tus 5 examenes
 * @author Oliver Miguez Alonso
 * @version 1.0
 */

import java.util.Scanner;//Para poder utilizar la funcion escaner

public class notas_while
{
    public static void main(String[] args)
        {

            int nota;
            int media = 0;
            int suma = 0;

            Scanner a = new Scanner(System.in); //Para permitirnos introducir datos por consola
            System.out.println("Introduce el valor de tu nota, -1 sales :");//Te pregunta por consola
            nota = a.nextInt();//Almacena lo introducido por consola


            while (nota != -1){//Si es -1 sale del while , sino  repite lo que esta dentro
                suma = suma + nota;//para sumar todas las notas introducidas
                media ++;//guarda el numero total de notas introducidas

                System.out.println("Introduce el valor de tu nota, -1 sales :");//Te pregunta por consola
                nota = a.nextInt();//Almacena lo introducido por consola

            }
            media = suma/media;//calcula la media de la nota dividiendo el total de la suma con el total de notas introducidas
            System.out.println(media);//Muestra el resultado por pantalla


    }
}
