
/**
 * Programa que imita al juego de los barcos de tocado y hundido
 * para trabajar con array bidimensional
 * Práctica de cod
 */
public class barcos {
    public static void main(String[] args) {

        int[][] tablero;

        //coordenadas de los barcos, donde hay un uno hay un trozo de barco
        tablero = new int[][]{
                {4,4,4,4,0},
                {0,0,0,0,0},
                {0,0,0,0,2},
                {0,0,0,0,2},
                {0,0,1,0,0}
        };

        recorrerTablero(tablero);

        /*
        Muestra lass corder
        //coordenadas de la cuadrícula donde están los barcos
    int i = 0;
    int j = 0;

    //te enseña todas las coordenadas por pantalla
    do{
        do{
            System.out.println(tablero[i][j]);
            j++;
        }while(j<5);
        i++;
        j=0;
    }while(i<5);

*/

    }//end main

    /**
     * Función que recorre el tablero
     * @param tablero array inicial
     */
    private static void recorrerTablero(int[][] tablero) {
    }//end recorrerTablero
}//end class

