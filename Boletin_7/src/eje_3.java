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
        // Almacena las notas de todos los estudiantes
        int[] notas = new int[30];
        // Almacena los nombres de los estudiantes
        String[] nomes = {"Aitana", "Hugo", "Valeria", "Mateo", "Lucía", "Alejandro", "Sofía", "Lucas", "Martina",
                "Daniel", "Paula", "Pablo", "Carla", "Diego", "Alba", "Marcos", "Noa", "Álvaro", "Emma", "Mario",
                "Irene", "Adrián", "Laura", "Javier", "Claudia", "Sergio", "Ana", "Manuel", "Mónica", "David"};

        mostrarAprobados(notas, nomes);

    }//end mais

    /**
     * Muestra los alumnos aprobados
     * @param notas utiliza el array notas
     * @param nomes utiliza el array de nomes
     */
    static void mostrarAprobados(int[] notas, String[] nomes) {
        for (int j = 0; j < nomes.length; j++) { //Busca dentro de los valores del array nomes
            notas[j] = (int) Math.floor(Math.random() * 10.0) + 1;//Para poner dar un valor a la nota de cada estudiante
            if (notas[j] > 5) {//para verificar que solo muestre las notas aprobadas
                System.out.println(nomes[j] + " a sacado: " + notas[j]);
            }//end if
        }//end for


    }//end mostrarAprobados
}//end class