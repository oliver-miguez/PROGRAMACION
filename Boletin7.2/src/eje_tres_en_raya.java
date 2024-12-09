import java.util.Scanner;
/**
 * Crea el juego del 3 en raya
 * @author Oliver Miguez Alonso
 */
public class eje_tres_en_raya {
    /**
     * Método principal del programa
     *
     * @param args no usamos
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //crea el tablero del 3 en raya con todos los valores vacíos
        String[][] tablero = {
                {"vacio", "vacio", "vacio"},
                {"vacio", "vacio", "vacio"},
                {"vacio", "vacio", "vacio"}
        };

        introducirValores(tablero, sc);
    }//end main

    /**
     * Permite introducir X o O
     *
     * @param tablero array inicial
     */
    static void introducirValores(String[][] tablero, Scanner sc) {
        System.out.println("Primer turno X ");
        String valor = "x";
        String valor2 = "O";
        System.out.println("_______________");
        System.out.println("Introduce la fila en la que quieres colocar tu figura: ");
        int fila = sc.nextInt();
        System.out.println("Introduce la columna en la que quieres colocar tu figura: ");
        int columna = sc.nextInt();

        if (fila >= 0 && fila < tablero.length && columna >= 0 && columna < tablero[0].length) {
            if (tablero[fila][columna].equals("vacio")) {
                tablero[fila][columna] = valor;
            }

            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[0].length; j++) {
                    System.out.print(tablero[i][j] + "  ");
                }//end for
                System.out.print("\n");
            }//end for
        } else {
            System.out.println("Índice fuera de los límites del tablero.");
        }//end else
    }//end introducirValores
}//end class
