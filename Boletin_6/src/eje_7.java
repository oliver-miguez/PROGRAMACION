/**
 * Escribe a función que resolva o factorial dun número de forma recursiva.
 * @autor Oliver Miguez Alonso
 * @version 1.0
 */
public class eje_7 {
    /**
     * Método principal de la funcion
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

        /**
         * Si el valor n es 5, mientras n != 0  calculara el factorial
         */
        long res; // resultado
        if (n==0) res = 1; // si al calcular el factoria , n vale 0 , resultado = 1
        else res = n * factorial_recursivo(n-1);// calcula el factorial multiplicando  n por todos los numeros descendientes de este
        return res;//devuleve el resultadao
    }
}