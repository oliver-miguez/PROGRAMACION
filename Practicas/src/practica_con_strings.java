/**
 * Distintas maneras de utilizar el String y sus métodos y funciones
 * @author Oliver Miguez Alonso
 */
public class practica_con_strings {
    public static void main(String[] args) {
        //maneras de crear un String (son iguales)
        String nome = " Manuel";
        String apelido = new String(" Gutierrez");
        System.out.println(nome);
        System.out.println(apelido);

        //concatena dos Strings, y crea un nuevo String a partir de la unión de los dos Strings
        String nomeCompleto = nome.concat(apelido);
        System.out.println(nomeCompleto);

        //manera de contar el número de caracteres para un String
        System.out.println("A lonxitude de nome é " + nome.length());

        //transforma la variable nome a un string y permite ponerle comillas por consola
        System.out.println("A lonxitude de \"nome\" é "+ nome.length());

        //la primera barra sirve para identificar que el siguiente caracter que es otra barra, lo muestre por pantalla
        //La barra indica que el elemento que la sigue a continuación es un elemento especial
        System.out.println("imprimimos \\texto\\ con contrabarras, \ny un salto de linea");

        //hace un retorno de carro
        System.out.println("Tres tristes tigres \r comen trigo ");

        //deja un espacio
        System.out.println("algo de \ttexto");

        //elminina el espacio que hay entre dos strings en un sout en este caso
        System.out.println("otro texto \bmas");

        //pone un símbolo
        System.out.println("Un texto mas y mas \f");
    }//end main
}//end class

