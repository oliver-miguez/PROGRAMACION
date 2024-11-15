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
        System.out.println("Nota de un alumno individual: ");
        System.out.println("Introduzca el nombre del alumno: ");
        String alumnos = sc.next();

        for (int i = 0; i < nomes.length; i++) { //busca dentro de la tabla nomes
            if (nomes[i].equalsIgnoreCase(alumnos)) { //verifica si el nombre introducido en alumnos es igual al nombre del array nomes
                /*
                Aunque no usemaos el parametro i con notas en el for, en este caso se podria usar debido a
                que nomes y notas contienen una relacion paralela, ya que el nombre que muestra el array
                de notas debe coincidir con el array de nomes
                Ej: notas[5] y nomes[5] tienen que coincidir para que
                a la hora de mostrar el nombre del alumno y la nota de este mismo se corresponda con
                el espacio que ambos dos comparten en los arrays, en este caso el espacio 5
                 */
                System.out.println(nomes[i] + " ha sacado: " + notas[i]);
                return;//te muestra solo la nota y el nombre del alumno  sin mostrar el resto
            }//end if
            else{
                System.out.println("Nombre no encontrado");
                return;//muestra una vez el system anterior sin escribirlo tantas veces como numero introducido por consola
            }//end else
        }//end for
    }//end alumno_individual

    /**
     * Ordena de mayor a menor las notas y nombre de los alumnos
     * @param notas array de notas (generado aleatoriamente)
     * @param nomes array de nombres
     * @param sc permite utilizar la funcion scanner
     */
    static  void ordenar(int[] notas, String[] nomes, Scanner sc){
        /*
        todo
        ordenar de mayor a menor las notas y los nombres
        Idea:
        guardar en una variable max las notas mas altas, y cuando tenga las notas mas altas , mostrar el resto
        posiblemente utilizando un i-- en el for que accede a las notas
         */
    }//end ordenar
}//end class
