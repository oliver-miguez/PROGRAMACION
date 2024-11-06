/**
 * Escribe a función que resolva a serie de Fibonaci de forma recursiva.
 *
 * @author Oliver Miguez Alonso
 * @version 1.0
 */
public class eje_9 {
    /**
     * Método principal del programa.
     *
     * @param args no usamos
     */
    public static void main(String[] args) {
        int n1 = 0;
        System.out.println(n1);//muestra el 0 al iniciar la sucesion
        int n2 = 1;
        System.out.println(n2);//muestra el 1 al inicialr la sucesion
        int n3;

        for (int i = 0; i < 9; i++) { // realiza el método varias veces

            //operaciones
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(n3);//muestra el resultado
        }//end for

    }//main

}//end class