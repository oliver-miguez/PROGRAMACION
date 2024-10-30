import java.util.Scanner;

/**
 * Hace la suma de 10 numeros y si es 999 acaba el programa y te muestra la suma
 * @author  Oliver Miguez Alonso
 * @version 1.0
 */
public class eje_8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        int sum=0;

        for(int i=1;i<10;i++){//te pide que introduzcas 10 numeros

            do {//Si el numero introducido es 999 te muestra la suma de los numeros introducidos

                System.out.println("Dame un numero: ");//pregunta por consola
                n1 = sc.nextInt();//almacena lo introducido

                sum=sum+n1;//operacion de suma

                if (n1>=999){//Si es 999 muestra la suma y corta el programa
                    System.out.println(sum);
                    break;
                }//end if

                else{
                    break;
                }//end else

            }while (i++<10); //end Do

        }//end for

    }//end static void
}//end class