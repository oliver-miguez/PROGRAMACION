/**
 * Escribe unha función que diga si dous números enteiros son amigos.
 * Dous números a e b son amigos si a suma dos divisores propios (distintos del mesmo)
 * de a e igual a b. E biceversa. Para probar pódense usar os números 220 e 284, que son amigos.
 *
 * @author Oliver Miguez Alonso
 * @version 1.0
 */
public class eje_6 {
    /**
     * Método principal del programa
     *
     * @param args no usamos
     */
    public static void main(String[] args) {
        int num1 = 220;
        int num2 = 284;

        amigos(num1, num2);

    }//end static void

    static void amigos(int num1, int num2) {
        int suma=0;

        for (int i = 1 ; i<num1; i++){
            int resto = num1%i;
            if (resto == 0){
                suma = suma + i;
                System.out.println(suma);
            }//end if
        }//end for


    }//end amigos

}//end class
