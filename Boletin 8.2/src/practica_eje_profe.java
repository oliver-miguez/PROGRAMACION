import java.util.Scanner;

/**
 * Hacer juego del ahorcado
 * 7 turnos
 * Muestra el número de caracteres que tiene la palabra a adivinar con ____
 * Usuario introduce letra o bien palabra si desea adivinar
 * dos metodos : 1- si introduce letra, muestra si existe la letra, si existe la muestra y no suma ronda si no existe suelta un error y suma una ronda
 * 2-si es palabra , si la adivina , muestra toda la palabra , si no es igual salta error y salta una ronda
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
        //Palabra que el usuario debe adivinar
        String palabraAdivinar = "chorizo";
        // transforma el String de palabraAdivinar en un array de chars
        char[] desglose = palabraAdivinar.toCharArray();
        //Para comprobar el prograso que lleva el usuario, ej: c_o___o si lleva este proceso como cualquier otro de los casos que se puede tener
        char[] progreso = new char[desglose.length];//le da el mismo tamaño que el array de chars para que tenga el mismo tamaño que el String original
        //Otorga a todos los valores char del progreso el valor de "_" para próximamente modificarlo
        for (int i = 0; i < progreso.length; i++) {
            progreso[i] = '_';
        }//end for

        //Muestra por pantalla la palabra con "_"
        System.out.println(tamaño(palabraAdivinar));

        int turnos = 7;//total de turnos que tiene el jugador

        while (turnos > 0) {
            String letra = letra();//pregunta y alamacena la letra o la palabra al usuario
            String resultado = comprobar(desglose, progreso, letra); //Muestra la actualización del array de progreso

            /*
            como "resultado" es una variable que llama a la función comprobar , si en la función comprobar se da que la letra es "acertada"
            quiere decir que la letra si esta en el String original , entonces actualiza el progreso
            */
            if (resultado.equals("acertada")) {
                System.out.println(progreso);
                /*
                Si se da que el usuario introduce una palabra en vez de una letra , comprobará en la función comprobar si la
                palabra es igual a "palabra acertada" e igual al resultado que es la palabra oculta , mostrará que has ganado
                 */
            } else if (resultado.equals("palabra acertada")) {
                System.out.println("¡Has adivinado la palabra!");
                break;
                //Reduce los turnos cuando el usuario tiene algún tipo de fallo
            } else {
                turnos--;
                System.out.println("Te quedan " + turnos + " turnos.");
                System.out.println(progreso);
            }
            //Da la victoria cuando el progreso que estamos actualizando es igual a la palabra original
            if (new String(progreso).equals(palabraAdivinar)) {
                System.out.println("¡Has adivinado la palabra!");
                break;
            }
        }

        if (turnos == 0) {
            System.out.println("¡Se te acabaron los turnos! La palabra era: " + palabraAdivinar);
        }

    }//end main

    /**
     * Muestra por pantalla el texto con "_"
     * @param texto String original
     */
    public static String tamaño(String texto){
        String newTexto = "";
        for(int i = 0;i < texto.length(); i++){
            newTexto = newTexto + "_";
        }//end for
        return newTexto;
    }//end tamaño

    /**
     * Pide la letra con la que el usuario intentará adivinar la palabra
     * @return letra o palabra con la que el usuario quiere adivinar
     */
    public static String letra(){
        Scanner sc = new Scanner(System.in);
        String letra = "";
        do{
            System.out.println("Introduce una letra o palabra para adivinar:");
            letra = sc.next();
        }while (letra.isEmpty());
        return letra;
    }//end letra

    /**
     * Muestra si la palabra o la letra introducida es correcta y actualiza el progreso
     *
     * @param desglose Array de caracteres de la palabra a adivinar
     * @param progreso Array de caracteres que muestra el progreso
     * @param letra o palabra introducida por el usuario
     * @return Muestra por pantalla si la letra es correcta o si la palabra es correcta
     */
    public static String comprobar(char[] desglose, char[] progreso, String letra){
        //comprueba si es una letra o una palabra
        if (letra.length() == 1) { //si es una letra...
            boolean acertada = false; // crea una variable con la que comprobara si existe o no el la palabra original
            for (int i = 0; i < desglose.length; i++) { //recorre el array de chars
                if (desglose[i] == letra.charAt(0)) { //comprueba si en el array de chars existe alguna letra igual a la Letra introducida por el usuario
                    progreso[i] = letra.charAt(0); //Si existe un letra que es igual a algún char del original, actualiza el array progreso
                    acertada = true; // y le da el valor de verdadero, es decir que si existe en el array original
                }
            }
            return acertada ? "acertada" : "fallo"; //devuelve acertada si está correcta y fallo si es falsa
        } else {
            //en caso de que el usuario introduzca una palabra y no una letra
            if (letra.equals(new String(desglose))) { //sabiendo que la letra(en este caso es la palabra) es un string , transforma el array de chars de nuevo en un String y comprueba si son iguales
                for (int i = 0; i < desglose.length; i++) {
                    progreso[i] = desglose[i];//como sabiendo que la palabra es igual al desgrose , actualiza el arrayde progreso igualando sus valores al array desglose el cual sabemos que es igual a la palabra
                }
                return "palabra acertada"; //devuelve "palabra acertada en caso de que sea correcto
            } else {
                return "fallo";//en caso de que no se cumpla de que la palabra sea igual al desglose
            }
        }
    }//end comprobar

}//end class
