public class otro_9 {
    public static void main(String[] args) {
        int n1 = 0;
        System.out.println(n1);//muestra el 0 al iniciar la sucesion
        int n2 = 1;
        System.out.println(n2);//muestra el 1 al inicialr la sucesion
        int n3;
        int elementos = 10;
        int j = 0;
        recursiva("hola");
        for (int i = 0; i < elementos; i++) { // realiza el método varias veces

            //operaciones
            n3 = fibonaci(n1,n2);
            n1 = n2;
            n2 = n3;
        }//end for

    }//main
    static  void recursiva(String mgs){
        System.out.println(mgs);
        if (mgs.length()<10) recursiva(mgs + ".");

    }//end recursiva

    /**
     * Realiza el calculo de fibonaci
     * @param a numero para calcular fibonaci
     * @param b numero para calcular fibonaci
     * @return resultado de la operacion
     */
    static int fibonaci(int a, int b){
        int suma = a+ b;
        System.out.println(suma);
        return suma;
    }//end fibonaci.

}//end class