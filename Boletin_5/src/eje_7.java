/**º
 * Solicita o usuario un número n e debuxa un triángulo de base e altura n.
 * Si o usuario teclea o número 4 o triángulo sería da seguinte forma:
 * @author Oliver Miguez Alonso
 * @version  1.0
 */
import java.util.Scanner;//permite utilizar la funcion scanner
public class eje_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//permite introducir datos por consola
        System.out.println("Introduce un número n: ");
        int n = scanner.nextInt();//guada el numero introducido por consola

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
