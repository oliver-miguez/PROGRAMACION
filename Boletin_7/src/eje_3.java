import java.util.Scanner;
/**
 * Modifica o programa anterior e engadelle un array cos nomes dos alumnos
 * Visualiza a nota dun alumno determinado.
 * Visualiza unha lista co nome dos alumnos aprobados.
 * Fai unha lista ordenada por orden crecente de notas.
 * Visualiza a nota dun alumno determinado que pides por teclado.
 */
public class eje_3 {
    /**
     * Método principal del programa.
     *
     * @param args no usamos
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Almacena las notas de todos los estudiantes
        int[] notas = new int[30];
        // Almacena los nombres de los estudiantes
        String[] nomes = {"Aitana", "Hugo", "Valeria", "Mateo", "Lucía", "Alejandro", "Sofía", "Lucas", "Martina",
                "Daniel", "Paula", "Pablo", "Carla", "Diego", "Alba", "Marcos", "Noa", "Álvaro", "Emma", "Mario",
                "Irene", "Adrián", "Laura", "Javier", "Claudia", "Sergio", "Ana", "Manuel", "Mónica", "David"};

        //Genera numeros aleatorios que seran los que formen el array  notas
        for (int j = 0; j < nomes.length; j++) {
            notas[j] = (int) Math.floor(Math.random() * 10.0) + 1;
        }//end for

        todos(notas,nomes,sc);
        mostrarAprobados(notas, nomes, sc);
        alumno_individual(notas, nomes, sc);
    }//end mais

    /**
     * Muestra la nota que sacaron todos los alumnos
     * @param notas tabla de notas (valores aleatorios)
     * @param nomes nombre de la tabla nomes
     * @param sc Permite usar Scanner
     */
    static void todos(int []notas,String[]nomes,Scanner sc){
        System.out.println("Nota de todos los alumnos: ");
        for (int j = 0; j < nomes.length; j++) {//Busca dentro de los valores del array nomes
            System.out.println(nomes[j] + " a sacado: " + notas[j]);
        }//end for
    System.out.println("____________________________________________________________________________");
    }//end todos

    /**
     * Muestra los alumnos aprobados
     *
     * @param notas utiliza el array notas
     * @param nomes utiliza el array de nomes
     * @param sc
     */
    static void mostrarAprobados(int[] notas, String[] nomes, Scanner sc) {
        System.out.println("Nota de los alumnos aprobados: ");
        for (int j = 0; j < notas.length; j++) { //Busca dentro de los valores del array nomes
            if (notas[j] > 5) {//para verificar que solo muestre las notas aprobadas
                System.out.println(nomes[j] + " a sacado: " + notas[j]);
            }//end if
        }//end for
        System.out.println("____________________________________________________________________________");
    }//end mostrarAprobados









    /**
     * Muestra la nota de un alumno individualmente
     * @param notas array de notas(generado aleatoriamente)
     * @param nomes array de nombres
     * @param sc Permite usar la funcion scanner
     */
    static void alumno_individual(int[] notas, String[] nomes, Scanner sc) {

        System.out.println("Introduce el nombre de un alumno: ");
        String alumno = sc.next();

        for (int i = 0; i<nomes.length; i++){//entra en el array de nomes
            if (nomes[i].equalsIgnoreCase(alumno)){//compara el nombre que ha introducido con los que hay en el array nomes
                System.out.println("La nota de " + nomes[i] + " es: " + notas[i]);
                /*
                La variable notas puede utilizar el [i] debido a que el array nomes y notas estan relacionados entre si
                Cuando el array nomes vale -> nomes[5] el array notas va a valer siempre notas[5]
                para que coincida el nombre de alumno 5 con la nota 5 que es la del propio alumno
                 */
                break;
            }//end for
        }//end for




    }//end alumno individual







}//end class
