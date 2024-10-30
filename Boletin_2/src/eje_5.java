
import java.util.Scanner;
/**Paso de millas a metros
 *@version 1.1
 * @author Oliver Miguez Alonso
 */
public class Boletin2_5 {
    public static void main(String[] args){

        Scanner s= new Scanner(System.in);//permite introducir datos por pantalla

        System.out.println("Dime en que milla te encuentras?:");//pregunta por consola
        long milla;
        milla=s.nextLong();//almacena el dato

        //operaciones
        double metro=(milla*1.852);
        /*salida del resultado de la operacion*/
        System.out.println("Entonces son "+ metro +" kilometros");
        s.close();//cierra el Scanner
        }//end static void
    }//end class


