/**
 * Como ver los valores de un array bidimensional
 */
public class Practica_con_array_bidimensional {
    /**
     * Método principal del programa
     * @param args no usamos
     */
    public static void main(String[] args) {

        //forma común de crear un array bidimensional
        boolean [][]asientos = {
            {true,true,true,false},
            {false,true,true,false},
            {false,true,false,false},
            {false,false,false,false}
        };

        //recorre el array bidimensional
        //el valor U es libre y el valor x es ocupado
        for (int fila  = 0; fila < asientos.length; fila++){
            for(int columna = 0; columna < asientos[0].length; columna++){//para mirar que hay dentro de la primera fila
                if(asientos[fila][columna] == true){
                    System.out.print("U");
                }else{
                    System.out.print("x");
                }
            }//end for
            System.out.print("\n"); // muestra la matriz dividida en sus distintas columnas y filas

        }//end for

      /*
        otro método para hacerlo

        boolean[][]asientos;//creamos una matriz
        asientos = new boolean[4][4]; //le damos un valor a nuestra raíz, tiene tamaño de 4x4

        una forma de darle valores a cada uno de los elementos de la matriz

        asientos[0][0] = true;
        asientos[0][1] = true;
        asientos[0][2] = true;
        asientos[0][3] = false;
        asientos[1][0] = false;
        asientos[1][1] = true;
        asientos[1][2] = true;
        asientos[1][3] = false;
       */

    }//end main
}//end class