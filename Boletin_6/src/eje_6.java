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

        amigos1(num1);
        amigos2(num2);

    }//end static void

    /**
     * Calcula la suma de los divisores del numero 1
     * @param num1 numero introducido por el usuario
     */
    static void amigos1(int num1) {
        int suma = 0;

        //calcula los divisores y los va sumando
        for (int i = 1; i < num1; i++) {//Todos los numeros del 1 a 220
            int resto = num1 % i;//calcula los divisores del 220
            if (resto == 0) {//si el numero es divisor...
                suma = suma + i;//suma el divisor
            }//end if
        }//end for

        System.out.println(suma);//muestra el resultado de la suma de los divisores

    }//end amigos

    /**
     * Calcula la suma de los divisores del numero 2
     * @param num2 numero introducido por el usuario
     */
    static void amigos2(int num2) {
        int suma = 0;

        //calcula los divisores y los va sumando
        for (int i = 1; i < num2; i++) {//Todos los numeros del 1 a 220
            int resto = num2 % i;//calcula los divisores del 220
            if (resto == 0) {//si el numero es divisor...
                suma = suma + i;//suma el divisor
            }//end if
        }//end for

        System.out.println(suma);//muestra la suma de los divisores

    }//end amigos 2

}//end class
