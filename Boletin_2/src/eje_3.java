
import java.util.Scanner;//Permite utilizar escaner
/**Cambiar de dolares a euros
 *@version 1.1
 * @author Oliver Miguez Alonso
 */
public class eje_3{
    public static void main(String[] args){


        Scanner s=new Scanner(System.in);//permite introducir datos por consola

        System.out.println("Cuantos euros quieres cambiar a dólares?:"); //Pregunta por pantalla
        int dinero;//almacena los datos introducidos
        dinero=s.nextInt();


        double dolares = dinero*(1.11);//cambio a dolares

        System.out.println("Tienes "+ dolares  +" $");//muestra el resultado


        s.close();//cierra el Scanner




    }//end static void
}//end class
