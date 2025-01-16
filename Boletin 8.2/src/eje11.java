import java.util.Scanner;

/**
 * 11. Escribe a función que permita formatear de nomes.
 * A función ten que eliminar os espazos en branco e poñer en maiúsculas o nome e apelido pasado como parámetro.
 * Finalmente retornará unha cadea co nome e apelidos co formato solicitado.
 * @author Oliver Miguez Alonso
 */
public class eje11 {
    /**
     * Metodo principal del programa
     * @param args no usamos
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //datos introducido por consola
        String nome;

        //pregunta y almacena el nombre introducido
        System.out.println("Introduce tu nombre y apellido: ");
        nome  = sc.next();

        //transforma el String del nombre a mayusculas
        nome = nome.toUpperCase().trim(); //transforma en mayusculas y quita los espacios en blanco
        System.out.println(nome);







    }//end main
}//end class
