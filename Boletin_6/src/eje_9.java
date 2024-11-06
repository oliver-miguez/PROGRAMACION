/**
 * Escribe a función que resolva a serie de Fibonaci de forma recursiva.
 *
 * @author Oliver Miguez Alonso
 * @version 1.0
 */
public class eje_9 {
    /**
     * Método principal del programa
     *
     * @param args no usamos
     */
    public static void main(String[] args) {
        int n1=0;
        int n2=1;
        int n3=0;

        System.out.println(fibonaci(n1,n2,n3));
    }//end main

    /**
     * Funcion de calculo de fibonaci
     *
     * @param n1 numero necesario para calculo de fibonaci
     * @param n2 numero necesario para calculo de fibonaci
     * @param n3 numero necesario para calculo de fibonaci
     * @return
     */
    static int fibonaci(int n1, int n2, int n3){
        for(int i=0; i<9; i++){
            n3 = n1+n2;
            n1=n2;
            n2=n3;
        }//end for
        return n1;
    }//end fibonaci

}//end class
