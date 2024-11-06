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

        /* o en caso en el caso del int */
        edades = new int[5];//cambia de nuevo la estructura de la tabla edades
    }
}