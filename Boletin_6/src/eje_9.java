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
        int n1=0;
        System.out.println(n1);//muestra el 0 al iniciar la sucesion
        int n2=1;
        System.out.println(n2);//muestra el 1 al inicialr la sucesion
        int n3=0;

        System.out.println(fibonaci(n1,n2,n3));//Muestra la sucesion
    }//end main

    /**
     * Funcion de calculo de fibonaci
     *
     * @param n1 numero necesario para calculo de fibonaci
     * @param n2 numero necesario para calculo de fibonaci
     * @param n3 resultado
     * @return retorna el resultado n3
     */
    static int fibonaci(int n1, int n2, int n3){
        for (int i = 0; i < 9; i++) { // realiza el método varias veces

            //operaciones
            n3 = n1 + n2;
            n1=n2;
            n2=n3;
            System.out.println(n3);
        }//end for
        return n3;
    }//end fibonaci

}//end class
