/**
 * Calcula el factorial del numero n
 */
public class eje_factorial_con_funciones {
    /**
     * Método principal del programa
     * @param args no usamos
     */
    public static void main(String[]args){
        int n = 5;//numero a calcular el factoiral
        System.out.println(factorial_recursivo(n));//Muestra el resultado de la operacion de la funcion factorial_recursivo
    }//end main

    /**
     * Calculo del factorial
     * @param n numero a calcular factorial, introducido por consola por el usiario
     * @return devuelve el valor del factorial
     */
    static long factorial_recursivo(int n){

        /*
          Si el valor n es 5, mientras n != 0  calculara el factorial
         */
        long res;
        if (n==0) res = 1;
        else res = n * factorial_recursivo(n-1);
        return res;
    }
}
