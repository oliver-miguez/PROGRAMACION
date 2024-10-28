/**
 * Indica los numeros impares del 1 al 9
 * @author Oliver Miguez Alonso
 * @version 1.0
 */
public class Continue {
    public static void main(String[]args){
        int suma = 0;
        for(int i = 0 ; i < 10; i++) {
            if (i % 2 == 0) {
                suma = suma + i;
            }
            else{
                    continue;
                }System.out.println("los pares son "+ i);

        }System.out.println("La suma es "+ suma);


    }//end void
}//end class