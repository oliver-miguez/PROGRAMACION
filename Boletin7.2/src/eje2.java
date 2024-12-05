import java.util.Scanner;
/**
 * crea un mapa con distintas salas, y si encuentras las coordenadas de la sala tesoro ganas
 * @author  Oliver Miguez Alonso
 * @version 1.0
 */
public class eje2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //crea un mapa 3x3
        String[][]mapa = {
                {"dungeon","cofre","boss"},
                {"enemigo","tesoro","dungeon"},
                {"secreto","selva","jungla"}
        };
        entrarHabitacion(mapa,sc);
    }//end main

    /**
     * Funcion con la que puedes moverte a lo largo de las salas
     *
     * @param mapa array original
     * @param sc   permite introducir datos por consola
     */
    static void entrarHabitacion(String[][]mapa,Scanner sc) {

        //Instrucciones e introduccion de las primeras coordenadas
        System.out.println("Para acceder a la sala tendras que introducir coordenada x e y ");
        System.out.println("Las cuales tienen valores del 0 al 2");
        System.out.println("Elige la primera coordenada: ");
        int coordenada1 = sc.nextInt();
        System.out.println("Elige la segunda coordenada: ");
        int coordenada2 = sc.nextInt();

        //muestra el valor que tienen las coordenadas introducidas
        System.out.println(mapa[coordenada1][coordenada2]);//muestra la posicion de las coordenadas

        //Mientras el valor no sea tesoro no ganas y te sigue preguntando coordenadas
        while(!mapa[coordenada1][coordenada2].equals("tesoro")){
            System.out.println("No encuentras lo que necesitas en esta sala, sigue buscando");
            System.out.println("Elige la primera coordenada: ");
            coordenada1 = sc.nextInt();
            System.out.println("Elige la segunda coordenada: ");
            coordenada2 = sc.nextInt();

            //muestra el valor que tienen las coordenadas introducidas
            System.out.println(mapa[coordenada1][coordenada2]);//muestra la posicion de las coordenadas
        }//end while
        //Si las coordenadas introducidas son las del tesoro ganas
        if(mapa[coordenada1][coordenada2].equals("tesoro")){
            System.out.println("VICTORIA!!!");
        }//end if
    }//end entrarHabitacion

}//end class
