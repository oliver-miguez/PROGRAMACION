import java.util.Scanner;
/**
 * 10. Escribe a función que permita validar un contasinal,
 * recibindo o contrasinal como parámetro.
 * O contrasinal ten que cumprir as condicións de mínimo 8 caracteres,
 * o menos unha maiúscula, unha minúscula e un número.
 * A función ten que retornar un booleano especificando si é válida ou non.
 * @author Oliver Miguez Alonso
 */
public class eje10 {
    /**
     * Metodo principal del programa
     * @param args no usamos
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contrasena ; // variable donde almacena la contraseña del usuario
       // char[]arrayContrasena = contrasena.toCharArray(); //crea un array del String contraseña

        //Booleanos para comprobar qsi tiene los requisitos necesarios
        boolean numero = false;
        boolean mayuscula = false;


        //comprueba que la contraseña tenga como mínimo más de 8 caracteres
        do {
            //pregunta al usuario la contraseña
            System.out.println("Introduce una contraseña, mínimo 8 caracteres: ");
            contrasena = sc.next();

            //verifica que no se repita la contraseña
            if(contrasena.length()< 8){
                System.out.println("contraseña no válida");
            }//end if
        }while(contrasena.length()< 8);

        //Impone unas restricciones que debe cumplir la contraseña
        for(int i = 0; i < contrasena.length(); i++){
            if(Character.isUpperCase(contrasena.charAt(i))) { //verifica que sea mayuscula
                mayuscula = true;
            }//end if
            else{
                System.out.println("no ha introducido Mayuscula ");
                break;
            }//end else
            if(Character.isDigit(contrasena.charAt(i))){ //verifica que sea numero
                numero = true;
            }//end if
            else{
                System.out.println("No ha introducido numero");
                break;
            }//end else

        }//end for

        //verifica que el String tenga todas las restricciones cumplidas
        if(mayuscula && numero){
            System.out.println("Contraseña correcta");
        }//end if
    }//end main
}//end class
