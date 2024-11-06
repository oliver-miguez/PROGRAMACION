/**
 * COMO USAR LA TABLA EN JAVA
 * @author Oliver Miguez Alonso
 * @version 1.0
 */
public class taboas {
    /**
     * Método principal del programa
     * @param args no usamos
     */
    public static void main(String[] args) {
        int[]edades = {1,2,3,4,5};//Tabla que tiene valores ya integrados, reservados en la memoria, 5 valores almacenados
        String[]nomes;//Indica que existira una tabla de nomes pero que aun no esta formada, ni tiene un espacio reservado en memoria
        nomes = new String[5];//Indica el tamaño de la tabla, reserva ya un espacion en la memoria, almacena 5 strings
        nomes[0]="Oliver"; //intrdcue el valor dentro de la tabla en la posicion 0
        nomes[1]="Miguez";//introduce el valor dentro de la tabla en la posicion 1
        /*podemos introducir valores hasta el 4, del 0 al 4 */



         /*
         Sin embargos con tablas ya hechas como la tabla de edades , no hace falta definir entre corchetes la cantidad de entidades que
         usara , debido a que el IDE ya detecta y cuenta cuantos valores tiene ya introducidos
          */

        /* o en caso en el caso del int */
        edades = new int[5];//cambia de nuevo la estructura de la tabla edades
    }
}