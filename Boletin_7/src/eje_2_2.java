/**
 * Carga un array de tipo int, con las notas del módulo de programación de los 30 alumnos de la clase de DAM.
 * Visualiza el número de aprobados y suspensos.
 * Calcula y visualiza la nota media de la clase.
 * Visualiza la nota más alta.
 *
 * @author Oliver Miguez Alonso
 * @version 1.1
 */
public class eje_2_2 {
    /**
     * Método principal del programa.
     *
     * @param args no usamos
     */
    public static void main(String[] args) {
        int[] notas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 3, 4, 5, 6, 7, 8, 9, 4, 5, 6, 6, 8, 9, 2, 3, 4, 5, 6, 7}; // Almacena las notas de todos los estudiantes

        mostrarAprobadosYSuspensos(notas);
        calcularYMostrarMedia(notas);
        mostrarNotaMasAlta(notas);
    }//end mais

    /**
     * Muestra si la nota del alumno es aprobada o suspendida.
     *
     * @param notas lista de notas de los alumnos
     */
    static void mostrarAprobadosYSuspensos(int[] notas) {
        int aprobados = 0;
        int suspensos = 0;

        for (int nota : notas) {
            if (nota < 5) {
                suspensos++;
            }//end if
            else {
                aprobados++;
            }//end else
        }//end for

        System.out.println("Número de aprobados: " + aprobados);
        System.out.println("Número de suspensos: " + suspensos);
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
