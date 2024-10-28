/**
 * Codifica un programa que lea o soldo de cada un dos traballadores dunha empresa
 * e obteña o número deles que ganan entre 1000 e 1750 €, ámbolos dous incluídos e,
 * a porcentaxe de traballadores que ganan menos de 1000 €. Tendo en conta que non se
 * coñece con antelación o numero de traballadores da empresa e non se admiten os soldos
 * negativos (utiliza como condición de fin un soldo 0).
 *
 * @author Oliver Miguez Alonso
 * @version 1.1
 */

import java.util.Scanner;//Para poder utilizar la funcion Scanner
public class eje_5 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);//Permite introducir datos por consola

        double traballadores = 0.0;//Para saber el numero total de trabajadores
        double pregunta = 0.0;//Para cerrar el do while en caso de que se supere el numero de trabajadores introducidos por consola
        double soldo;//para almacenar los valores de los sueldos
        double pobre = 0.0; //trabajadores que ganan menos de 1000
        System.out.println("Introduce o numero de traballadores");//Pregunta por consola
        traballadores = sc.nextInt();//guarda los datos introducidos por consola


         do{//hara el do mientras se cumpla el while
             System.out.println("Introduce o valor do teu soldo:");//pregunta el valor del sueldo
             soldo = sc.nextInt();//guada el valor del suelddo introducido
             pregunta ++ ;//identifica el numero total de trabajadores al que le preguntamos su sueldo

             if (soldo>=1000){//Identifica aquellos que ganan mas de mil euros
                 System.out.println(" Este trabajador esta entre los que gana mil o mas de mil euros ");
             }//end if
             else{//si el trabajador no gana mil almacena el numero de trabajadores que ganan menos de 1000
                 pobre ++;
             }


         }while(pregunta != traballadores);//mientras se cumpre que el numero de trabajadores no se supere
        System.out.print("Hay "+ pobre + " trabajadores que ganan menos de 1000€");
        double porcentaje = pobre/traballadores;//calcula el porcentaje de los que ganan menos de 1000 €
        System.out.print("\n El porcentaje de trabajadores que ganan menos de 1000€ es "+ porcentaje + "%");

    }//end static void
}//end class
