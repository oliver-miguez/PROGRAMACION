
/**
 * Programa que imita al juego de los barcos de tocado y hundido
 * para trabajar con array bidimensional
 * Práctica de cod
 */
public class barcos {
    public static void main(String[] args) {

        int[][] barcos;

        //coordenadas de los barcos, donde hay un uno hay un trozo de barco
        barcos = new int[][]{
                {1,1,1,1,0},
                {0,0,0,0,0},
                {0,0,1,1,0},
                {0,0,0,0,0},
                {0,1,0,0,0}
        };

        //coordenadas de la cuadrícula donde están los barcos
    int i = 0;
    int j = 0;

    //te enseña las coordenadas por pantalla
    do{
        do{
            System.out.println(barcos[i][j]);
            j++;
        }while(j<5);
        i++;
        j=0;
    }while(i<5);



    }//end main
}//end class

