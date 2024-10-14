/*programa para saber el peso y comparar*/
import java.util.Scanner;
public class boletin_3_eje_4 {
    public static void main (String[]args){
            String nom1= "Sonia";
            String nom2 ="Pedro";
            int peso ;
            int peso2;
            Scanner entrada = new Scanner(System.in);
            System.out.println("introduce  peso 1 ");
            peso = entrada.nextInt();
            System.out.println("Introduce el segundo peso");
            peso2 = entrada.nextInt();

            if(peso > peso2){
                System.out.println(nom1 + " pesa mas que "+ nom2 +" y la diferencia es "+ (peso-peso2));
        }
            else{
                System.out.println(nom2 + " pesa mas que "+ nom1 +" y la diferencia es " + (peso2-peso) );
            }
    }

}
