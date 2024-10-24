/**
 * Calcula a cantidade de números negativos, positivos e ceros que hai nun grupo de 10 números enteiros.
 * @author Oliver Miguez Alonso
 * @version 1.0
 */

import java.util.Scanner;
public class eje_1 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int numeros_introducidos = 0; //Revisa si solo se introducen 10 numeros
        int numero_entero = 0;//la variable del numero que se introducirá
        int negativo = 0;//para almacenar numeros negativos
        int positivo = 0;//para almacenar numeros positivos
        int cero = 0;//para almacenar los ceros introducidos

        while(numeros_introducidos <= 9){//Para introducir 10 numero enteros
            System.out.println("Introduzca un numero entero:");//Pregunta por consola
            numero_entero = sc.nextInt();//Almacena los datos introducidos

            //cuenta los numeros negativos introducidos
            if(numero_entero < 0 ){

                negativo ++;
            }//end if

            //cuenta los numero positivos introducidos
            else if (numero_entero > 0) {

                positivo ++;
            }//end else if

            //Cuenta los ceros introducidos
            else{
                cero ++;
            }//end else

            numeros_introducidos ++;//Para comprobar que solo se introduzcan 10 numeros enteros
        }

        System.out.println("negativos: "+ negativo + " positivos: " + positivo +" cero: " + cero);//muestra por pantalla el resultado


    }//end static void
}//end class