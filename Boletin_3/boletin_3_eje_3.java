/*te escribe + si es num positivo, o - si es negativo*/
import java.util.Scanner;
public class boletin_3_eje_3 {
    public static void  main(String[]args){
        int num;

        Scanner entrada = new Scanner(System.in);
        System.out.println("introduce el numero");
        num = entrada.nextInt();

        if(num>0){
            System.out.println("+");
        }
        else{
            System.out.println("-");
        }
    }
}
