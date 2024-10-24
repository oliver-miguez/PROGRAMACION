/**
 * Hace la media de tus 5 examenes
 * @author Oliver Miguez Alonso
 * @version 1.0
 */


import java.util.Scanner;
public class notas_do_while {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);//Para introducir datos por consola
        double nota = 0.0;
        double suma = 0.0;
        double media = 0.0;
        do {//Si ocurre que no pulsamos -1
            System.out.println("Introduce el valor de tu nota, -1 sales :");//Te pregunta por consola
            nota = sc.nextDouble();//guarda el dato introducido
            if(nota!=-1) {
                suma = suma + nota;//para sumar todas las notas introducidas
                media++;//guarda el numero total de notas introducidas
            }//end if
        }while(nota !=-1);
        media= suma/media;//calcula la media
        System.out.println(media);//Muestra el resultado de la media por pantalla



    }
}
