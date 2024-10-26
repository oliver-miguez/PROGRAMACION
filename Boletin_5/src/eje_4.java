/**
 *  Codifica un programa que solicite un número e,
 *  visualice a táboa de multiplicar dese número.
 *  O programa rematara cando prememos o cero.
 * @author  Oliver Miguez Alonso
 * @version 1.0
 */

import java.util.Scanner;//permite utilizar la funcion scanner
public class eje_4 {
    public static void main(String[]args){

        int e;//Define la variable con la que se preguntara por consola

        Scanner sc = new Scanner(System.in);//permite introducir datos por consola
        System.out.println("Introduce un número: ");//Pregunta por consola
        e = sc.nextInt();//Guarda lo introducido por consola

        for (int i = 1; i <= 10; i ++){//alamacena los 10 primero numero para hacer la tabla de multiplicar
            int oper = i * e;//multiplica el numero introducido por cada uno de los 10 numero del for
            System.out.println(oper);//muestra el resultado de las 10 multiplicaciones
        }




    }//end static void
}//end class
