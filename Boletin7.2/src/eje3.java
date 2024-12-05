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
        //muestra el menu
        System.out.println("____________________");
        System.out.println("Menu del restaurante");
        System.out.println("____________________");
        mostrarMenu(menu);
        //muestra el pedido
        System.out.println("___________________");
        System.out.println("Pedido del cliente");
        System.out.println("___________________");
        pedido(menu,sc);
    }//end main

    /**
     * Muestra el menu original al usuario antes de realizar el pedido
     * @param menu array original en el que se encuentra todos los datos del menu
     */
    static void mostrarMenu(String[][]menu){
        //accede al array meny
        for(int i = 0; i < menu.length; i++){
            for(int j = 0; j < menu[0].length; j++){
                //muestra los valores que tiene el array menu
                System.out.print(menu[i][j]+ " ");
            }//end for
            System.out.println("\n");
        }//end for
    }//end mostrarMenu

    /**
     * Pide al usuario que realice su pedido, y se lo muestra por pantalla
     * @param menu array inicial del menu
     * @param sc permite introducir datos por consola
     */
    static void pedido(String[][]menu,Scanner sc ){
        //preguntas para almacenar los valores del menu que elige el usuario
        System.out.println("Elige el primer plato: ");
        String primero = sc.next();
        System.out.println("Elige el segundo plato: ");
        String segundo = sc.next();
        System.out.println("Elige postre: ");
        String postre = sc.next();

        //accede al array del menu
        //for(int i = 0; i< menu.length; i++){
          //  for(int j = 0; j< menu[0].length; j++){
            //comprueba si el valor introducido por el usuario se encuentra en el array
            //todo intentar de alguna manera  que compruebe si los valores  introducidos estan en el array y printearlos

            //}//end for
        //}//end for
    }//end pedido

}//end class



