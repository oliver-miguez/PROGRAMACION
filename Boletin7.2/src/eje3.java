import javax.swing.text.Style;
import java.util.Scanner;
/**
 * Crea un menu de comida, se lo enseña al usuario y el usuario realiza su pedido
 * @author Oliver Miguez Alonso
 * @version 1.0
 */
public class eje3 {
    /**
     * Metodo principal del programa
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //menu de un restaurante
        String[][]menu = {
                {"ensalada","sopa","lentejas","pincho"},
                {"filete","pescado","chuleta","bacalao"},
                {"helado","te","cafe","tarta"}
        };
        System.out.println("Menu del restaurante");
        System.out.println("____________________");
        mostrarMenu(menu);
        System.out.println("Pedido del cliente");
        System.out.println("___________________");
        pedido(menu,sc);
    }//end main

    static void mostrarMenu(String[][]menu){
        for(int i = 0; i < menu.length; i++){
            for(int j = 0; j < menu[0].length; j++){
                System.out.print(menu[i][j]+ " ");
            }//end for
            System.out.println("\n");
        }//end for
    }//end mostrarMenu

    static void pedido(String[][]menu,Scanner sc ){
        System.out.println("Elige el primer plato: ");
        String primero = sc.next();
        System.out.println("Elige el segundo plato: ");
        String segundo = sc.next();
        System.out.println("Elige postre: ");
        String postre = sc.next();

        for(int i = 0; i< menu.length; i++){
            for(int j = 0; j< menu[0].length; j++){


            }//end for
        }//end for
    }//end pedido

}//end class



