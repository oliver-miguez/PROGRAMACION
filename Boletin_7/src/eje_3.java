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

        mostrarAprobadosYSuspensos(notas,nomes);
        calcularYMostrarMedia(notas);
        mostrarNotaMasAlta(notas);
    }//end mais

    /**
     * Muestra si la nota del alumno es aprobada o suspendida.
     *
     * @param notas lista de notas de los alumnos
     */
    static void mostrarAprobadosYSuspensos(int[] notas, String[] nomes) {
        for(int j = 0; j< nomes.length;j++){
            notas[j] = (int) Math.floor(Math.random() * 10.0) + 1;
            System.out.println(nomes[j] + " a sacado: "+ notas[j]);
        }//end for


    }//end mostrarAprobadosYSuspensos









    /**
     * Calcula y muestra la media de las notas.
     *
     * @param notas array de notas
     */
    static void calcularYMostrarMedia(int[] notas) {
        double suma = 0;

        for (int nota : notas) {
            suma += nota;
        }//end for

        double media = suma / notas.length;
        System.out.println("La media es: " + media);
    }//end calcularYMostrarMedia

    /**
     * Muestra la nota más alta.
     *
     * @param notas datos del array de notas
     */
    static void mostrarNotaMasAlta(int[] notas) {
        int max = notas[0];

        for (int nota : notas) {//crea una variable numero  tipo int para cada uno de los valores que se encuentran en el array numeros
            if (nota > max) {//en caso de que algun numero sea mayor a max , este se convertira en el nuevo max
                max = nota;
            }//end if
        }//end for

        System.out.println("La nota más alta es: " + max);
    }//en mostrarNotasMasAlta
}//end class