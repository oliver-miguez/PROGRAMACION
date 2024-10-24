/**
 *  Realiza un programa que calcule a suma e o produto dos números comprendidos entre 10 e 90.
 * @author Oliver Miguez Alonso
 * @version  1.0
 */

public class eje_2 {
    public static void main(String[]args)
    {//start static void
        int suma = 0;
        double mult =1.0;
        for(int num = 10; num <= 90; num++){//Almacena todos los numero comprendidos entre el 10 y el 90

            suma = suma + num;//suma
            mult = mult * num;//multiplicacion

        }//end for
        System.out.println("suma "+ suma);//Muestra el resultado de la suma
        System.out.println("Multiplicacion "+ mult );//Muestra el resultado de la multiplicacion
    }//end static void
}//end class
