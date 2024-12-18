public class practica_con_strings {
    public static void main(String[] args) {
        //maneras de crear un String (son iguales)
        String nome = " Manuel";
        String apelido = new String(" Gutierrez");
        System.out.println(nome);
        System.out.println(apelido);

        //manera de contar el numero de caracteres para un String
        System.out.println("A lonxitude de nome é " + nome.length());
        //transforma la variable nome a un string y permite ponerle comillas por consola
        System.out.println("A lonxitude de \"nome\" é "+ nome.length());

        //concatena dos Strings, y crea un nuevo String a partir de la unión de los dos Strings
        String nomeCompleto = nome.concat(apelido);
        System.out.println(nomeCompleto);
    }//end main
}//end class

