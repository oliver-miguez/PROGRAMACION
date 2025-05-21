import java.util.Arrays;

/**
 * Implementa un metodo xenérico estático o que se lle pasa como parámetro dúas táboas
 * con elementos do mesmo tipo xenerico e devolta unha nova táboa cos elementos de ambas
 * concatenados (os da segunda táboa despois dos da primeira).
 */
public class Main {
    public static void main(String[] args) {
        String[]tabla1 = {"Hola","Mundo"};
        String[]tabla2 = {"Examen","Java"};
        //creamos objeto de tipo Contenedor para valores de String
        Contenedor<String> tablas = new ConcatenarTablas<>();
        //Muestra el array con la concatenación
        System.out.println(Arrays.toString(tablas.concatenar(tabla1,tabla2)));
    }
}