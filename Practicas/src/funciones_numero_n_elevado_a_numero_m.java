/**
 * Muestra el resultado de m elevado a n
 */
public class funciones_numero_n_elevado_a_numero_m {
    /**
     * Método principal del programa
     * @param args no usamos
     */
    public  static void main(String[]args){
        int m = 2;//numero base
        int n = 5;//numero con el que se eleva
        System.out.println(elevar(m,n));//Muestra el resultado calculado en la funcion elevar

    }//end main

    /**
     * Calcula el numero m elevado al numero n
     * @param m numero base
     * @param n numero con el que se eleva la base
     * @return devuelve el  valor del numero ya elevado
     */
    static long elevar(int m, int n){
        long res; //resultado
        if (n==0) res = 1; //si el numero con el que se eleva es 0 , pues como todos los numero si si elevan a 0, su resultado será 1
        else res = m * elevar (m, n-1);//en caso contrario se eleva a n, m^n
        return res;//devuelve el valor de m elevado a n
    }//end elevar
}//end class
