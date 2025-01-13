import java.util.Scanner;
/**
 * Hacer juego del ahorcado
 * 7 turnos
 * Muestra el número de caracteres que tiene la palabra a adivinar con ____
 * Usuario introduce letra
 * Si hay coincidencia con la letra que introdujo el usuario se muestra por pantalla
 * Print con los fallos
 * @author Oliver Miguez Alonso
 */
public class practica_eje_profe {
    /**
     * Metodo principal del programa
     * @param args no usamos
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String palabraAdivinar = "chorizo";
        System.out.println(mostrar(palabraAdivinar));

    }//end main

    /**
     * Muestra por pantalla cuantas letras tiene sin decirte que letras son
     * @param palabraAdivinar String Original
     * @return devuelve el numero necesario de caracteres para adivinar la palabra
     */
    public static String mostrar(String palabraAdivinar){
        String textoNuevo = "";
        for(int i = 0; i < palabraAdivinar.length(); i++ ){
            textoNuevo = textoNuevo + "_";
        }//end for
        return textoNuevo;
    }//end mostrar

    /**
     * Devuelve la letra introducida por el usuario para que no introduzca un valor vacio
     * @return devuelve un valor NO vacio
     */
    public static String devolver(){
        Scanner sc =new Scanner(System.in);
        String letra = "";
        do{
            System.out.println("Introduce una letra:");
            letra = sc.next();
            }while(letra.isEmpty());
        return letra;

    }//end devolver

    public static String comprobarLetra(String letra, String palabraAdivinar){
        for (int i = 0; i < palabraAdivinar.length();i++ ){
            if(palabraAdivinar.charAt(i)==letra){
                palabraAdivinar.setChar
            }
        }//end for
    }//end comprobar letra
}//end class
