import java.util.Arrays;
import java.util.Scanner;
/**
 * Repaso del eje anterior
 * 1-Mostrar tamaño de la palabra oculta "_" v
 * 2-Pedir letra o adivinar v
 * 2.1-Son 7 rondas v
 * 3-Comprobar y mostrar en caso de que sea correcta
 * 4-En caso de error mostrar muñequito
 * (opcional: transformar todas las letras y palabras a minúsculas y despreciar los espacios en blanco
 */
public class repaso_ahoracado {
    public static void main(String[] args) {
        String palabra_oculta  = "casas";

        //Rondas disponibles
        int rondas = 7;

        //Arrays con los que transformaremos el String original
        char[]intermedio = palabra_oculta.toCharArray(); // crea un array con los chars que conforman al String original
        char[]transformador = new char[intermedio.length]; // Crea un char el cual será con el que mostraremos "_" por cada char que tenga el String original

        //Cambia todos los caracteres del String a "_"
        for(int i = 0; i < transformador.length; i++){
            transformador[i] = '_'; // da a cada valor i del array transformador el valor de "_"
        }//end for
        System.out.println(transformador);//muestra la palabra de manera oculta "_"

        //Otra manera de sustituir todos los valores de un array
        Arrays.fill(transformador, '_');
        while ( rondas > 0) {

            //transformamos las funciones creadas para poder trabajar con ellas en la main
            String letra = preguntaLetra();
            String resultado = comprobar(intermedio,transformador,letra);

            //en caso de que la comprobación sea acertada
            if(resultado.equals("acertada")){
                System.out.println(transformador);
                System.out.println("adivinado");
            }//end if

            else if (resultado.equals("palabra acertada")) {
                System.out.println(transformador);

            }//end else if

            //en caso de no acertar
            else{
                rondas--;
                System.out.println("Error "+rondas+" restantes");
            }//end else

            //metodo que otorga la victoria al jugador si adivina la palabra
            if (new String(transformador).equals(palabra_oculta)) {
                System.out.println("¡Has adivinado la palabra!");

            }//end if

            //Metodo para indicar la derrota
            if(rondas <= 0){
                System.out.println("Has perdido");
            }//end if


        }//end while
    }//end main

    /**
     * Pregunta al usuario por la letra o palabra que desa introducir
     * @return devuelve la palabra o la letra que el usuario a introducido
     */
    public static String preguntaLetra(){
        Scanner sc = new Scanner(System.in);
        String letra = "";

        //Comprueba si se ha introducido un dato , y si no se ha introducido te vuelve a preguntar hasta que introduzcas uno
        while(letra.isEmpty()) {
            System.out.println("Introduce la letra o la palabra que quieras: ");
            letra = sc.next();
        }//end while
        return letra;
    }//end preguntaLetra

    /**
     * Comprueba si el valor añadido es correcto y lo muestra por pantalla
     * @return por pantalla la letra si es correcta y su posición o si es la palabra acierto o fallo
     */
    public static String comprobar(char[]intermedio,char[] transformador, String letra){
        boolean acertar = false;
        if(letra.length() == 1) { //en caso de que solo se ha introducido un caracter
            for (int i = 0; i < intermedio.length; i++) {
                if (letra.charAt(0) == intermedio[i]) { //verifica si existe algún valor similar en la tabla al de la letra introducida
                    transformador[i] = letra.charAt(0);//si lo hay sustituye al "_"  del array por la letra
                    acertar = true;
                }//end if


            }//end for
            return acertar ? "acertada":" fallo";
        }//end if


        else {
            //en caso de que el usuario introduzca una palabra y no una letra
            if (letra.equals(new String(intermedio))) { //sabiendo que la letra(en este caso es la palabra) es un string , transforma el array de chars de nuevo en un String y comprueba si son iguales
                for (int i = 0; i < intermedio.length; i++) {
                    transformador[i] = intermedio[i];//como sabiendo que la palabra es igual al desgrose , actualiza el arrayde progreso igualando sus valores al array desglose el cual sabemos que es igual a la palabra
                }
                return "palabra acertada"; //devuelve "palabra acertada en caso de que sea correcto
            } else {
                return "fallo";//en caso de que no se cumpla de que la palabra sea igual al desglose
            }
        }

    }//end comprobar



}//end class
