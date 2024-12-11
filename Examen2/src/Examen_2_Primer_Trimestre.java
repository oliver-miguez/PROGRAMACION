import java.util.Scanner;//permite utilizar el scanner en el programa

/**
 * Xestion de libros
 * crea un array con todos los libros (20)
 * 1.Mostrar libros
 * 2.Engadir libros
 * 3.Eliminar libros
 * @author Oliver Miguez Alonso
 */
public class Examen_2_Primer_Trimestre {
    /**
     * Función principal del programa
     * @param args no usamos
     */
    public static void main(String[] args) {
        //permite utilizar el Scanner para introducir datos por consola
        Scanner sc = new Scanner(System.in);

        //variable opciones para trabajar con distintas opciones en el menu
        int op = 0;

        //crea la tabla de libros
        String[]libros = new String[20];

        //da el valor baleiro de principio a todos los valores puesto que la tabla está vacía
        for(int i = 0; i< libros.length;i++){
            libros[i] = ("baleiro");
        }//end for

        //crea un menu con las distintas opciones
        while(op != 4) {
            System.out.println("Elija una opción");
            System.out.println("1.Introducir Libro");
            System.out.println("2.Mostrar Lista de libros");
            System.out.println("3.Eliminar libro");
            System.out.println("4.salir");
            op = sc.nextInt();

            //cada una de las opciones del menu
            switch (op) {
                case 1://introducir libro
                    introducirLibro(libros, sc);
                    break;
                case 2://Mostrar Libros
                    mostrarLibros(libros);
                    break;
                case 3://Eliminar libros
                    elminiarLibros(libros,sc);
                    break;

                case 4://salir
                    System.out.println("Cerrando Programa");

                default:
                    if(op>4 || op<1){
                        System.out.println("Número no válido");
                    }//end if

            }//end switch
        }//end while

    }//end main

    /**
     * Permite introducir el titulo del libro en el array
     * @param libros array original de libros
     * @param sc permite introducir valores por consola
     * @return true si el valor se introdujo correctamente o false si no se introdujo correctamente
     */
    static boolean introducirLibro(String[]libros,Scanner sc){

        System.out.println("Introduce el nombre del libro: ");
        String nome = sc.next();

        System.out.println("Introduce la posición el la que lo quieres guardar 0-19");
        int x = sc.nextInt();
                //si el dato no está vacía te devuelve que está ocupado
                if (libros[x] != "baleiro") {
                    System.out.println("valor ya ocupado,elija otra posición que sea baleira");
                    return false;
                }//end if
                else {
                    libros[x] = nome;
                    return true;
                }//end else
    }//end introducirLibro

    /**
     * Muestra la tabla de libros
     * @param libros array original
     */
    static void mostrarLibros(String[]libros){
        for(int i = 0 ; i < libros.length;i++){
            System.out.println(libros[i]);
        }//end for
    }//end mostrarLibros

    /**
     * Elimina un libro de la posición deseada del array
     * @param libros array original de libros
     * @param sc permite introducir datos por consola
     * @return devuelve valor true si lo elimina correctamente, o false si no
     */
    static boolean elminiarLibros(String []libros,Scanner sc){
        System.out.println("Introduce la coordenada donde esta el libro que quieres eliminar");
        int x = sc.nextInt();

        libros[x] = ("baleiro");
        if(libros[x]=="baleiro") {
            return true;
        }//end if
        else {
            return false;
        }
    }//end eliminarLibros
}//end class