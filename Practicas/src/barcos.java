
/**
 * Programa que imita al juego de los barcos de tocado y hundido
 * para trabajar con array bidimensional
 * Práctica de cod
 * @author Oliver Miguez Alonso
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
        Muestra las coordenadas del tablero
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
     * @param aux_tablero tabla con los mismos valores que el tablero inicial
     */
    static void recorrerTablero(int[][] aux_tablero) {
        /*System.out.println("...");
        aux_tablero[2][2] = 5;
*/
        //recorremos el tablero
        for(int i = 0; i < 5 ; i++){
            for(int j = 0; j < 5; j++){
                if(aux_tablero[i][j] != 0){

                    //Que tipo de nave es
                    switch (aux_tablero[i][j]){
                        case 1:
                            System.out.println("submarino "+ i +":" + j);
                            break;
                        case 2:
                            System.out.println("fragata "+ i +":" + j);
                            break;
                        case 4:
                            System.out.println("Portaaviones "+ i +":" + j);
                            break;
                        default:
                            System.out.println("No se lo que es");
                            break;

                    }//end switch
                }//end if

            }//end for
        }//end for

    }//end recorrerTablero
}//end class

