import java.util.Scanner;

/**
 * Indica cual de los tres numeros es mayor.
 * @version 1.0
 * @author Oliver Miguez Alonso
 */

public class baletin3_eje_5 {
    public static void main(String[]args){
        Scanner a = new Scanner(System.in);//Para guardar los valores introducidos por consola
        //Define la variables a guardar
        int num1;
        int num2;
        int num3;

        System.out.println("Valor num1: ");//Pregunta por consola
        num1 = a.nextInt();//Guarda lo introducido por consola en este caso el numero 1

        System.out.println("Valor num2: ");
        num2 = a.nextInt();

        System.out.println("Valor num3: ");
        num3 = a.nextInt();

    //En caso de que el numero 1 sea el mayor
        if(num1>num2 || num1>num3){
            if (num2 > num3){
                System.out.println("num1>num2>num3");
            }
            else{
                System.out.println("num1>num3>num2");
            }
        }
        //En caso de que el numero dos sea el mayor
        if(num2>num1 || num2 > num3){
            if(num3 > num1 ){
                System.out.println("num2>num3>num1");
            }
            else{
                System.out.println("num2>num1>num3");
            }
        }



        //En caso de que el numero tres sea el mayor
        if(num3>num2 || num3>num1){
            if (num2 > num1){
                System.out.println("num3>num2>num1");
            }
            else{
                System.out.println("num3>num1>num2");
            }
        }
    }
}
