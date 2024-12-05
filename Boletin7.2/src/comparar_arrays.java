/**
 * Comparar tablas
 * @author Oliver Miguez Alonso
 */
public class comparar_arrays {
    public static void main(String[] args) {
        //declara las tablas que se compararan
        int[]a = {1,2,3,4,5};
        int[]b = {1,2,3,4,5};

        //llama a la función para ver si son o no iguales
        //en este caso si son iguales muestra true, si no, aplica los métodos de la función
        if(compararTablas(a, b) == true) System.out.println("true");

    }//end main

    /**
     * compara dos arrays
     * @param a Uno de los dos arrays
     * @param b Uno de los dos arrays
     * @return true o false dependiendo si son o no iguales
     */
    static boolean compararTablas(int[]a,int[]b){
        //si de primera el tamaño de los arrays es distinto devuelve falso
        if(a.length != b.length){
            System.out.println("false");
            return false;
        }//end if
        //en caso contrario
        else {
            //definimos un booleano igual para cuando sean los arrays iguales devuelve el valor igual que es true
            boolean igual = true;

            //accedemos al array para comprobar sus valores
            for (int i = 0; i < a.length; i++) {
                //comparamos los valores de a con los valores de b
                if (a[i] != b[i]) {
                    //si son distintos devuelve false
                    System.out.println("false");
                    return false;
                }//end if

            }//end for
            return igual;
        }//end else

    }//end compararTablas
}//end class
