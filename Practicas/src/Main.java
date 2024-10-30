import java.util.Scanner;//permite introducir datos por consola

/**
 * Apuntes
 *
 * @author Oliver Miguez Alonso
 */
public class Main {
    /**
     * Método principal del programa
     *
     * @param args no usamos
     */
    public static void main(String[] args) {
        /*
        Activa la funcion obterNome , provocando que te
        pregunte por pantalla tu nombre tal como programamos en la funcion obterNome.
         */
        String nomeEstudante = obterNome();

        saudo(1, "gl");//llama a la funcion saudo que cree
        System.out.println("Benvido " + nomeEstudante);
        saudo(1, "es");
        System.out.println("Bienvenido " + nomeEstudante);
        saudo(1, "in");
        System.out.println("Welcome " + nomeEstudante);


    }//end static void

    /**
     * Sirve para hacer el saludo
     *
     * @param veces  Total de veces que ser repetira el saludo
     * @param idioma Cada una de las opciones de veces
     */
    static void saudo(int veces, String idioma) {
        for (int i = 0; i < veces; i++) {
            System.out.println("ola");
            //Muestra que el idioma es gallego , castellano, ingles , en el static void Main
            if (idioma.equals("gl")) System.out.println("ola");
            else if (idioma.equals("es")) System.out.println("HOLA");
            else if (idioma.equals("in")) System.out.println("HELLo");

        }//end for
    }//end saudo


    //permite crear una funcion que te muestre datos String, en este caso se utiliza para preguntar y almacenar el nombre introducido
    static String obterNome() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe o teu nome: ");
        String nome = sc.next();
        sc.close();
        return nome;

    }//end obterNome


}//end class
