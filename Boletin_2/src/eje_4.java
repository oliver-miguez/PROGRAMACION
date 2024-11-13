
import java.util.Scanner;//permite utilizar la funcion scanner
/**Calculo de varias operaciones con dos variable escritas por consola
 *@version 1.1
 * @author Oliver Miguez Alonso
 */
public class eje_4{
    public static void main(String[] args){

        Scanner s=new Scanner(System.in);//Para introducir datos por pantalla
        System.out.println("Dame tu primera variable: ");
        double a;
        a=s.nextLong();

        System.out.println("Dame tu siguiente variable:");
        double b;
        b=s.nextLong();

        //operaciones
        System.out.println("La sume de estos es:"+(a+b));
        System.out.println("La resta de los dos es:"+(a-b));
        System.out.println("El producto entre ellos es: "+a*b);
        System.out.println("Su cociente es:"+a/b);
        s.close();//cierra el escaner
    }
}
