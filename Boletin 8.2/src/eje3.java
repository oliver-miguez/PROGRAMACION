import  java.util.Scanner;
/**
 * Modificar as funcións anteriores, para que reciban un parámetro que indique a cantidade máxima de reemplazos ou insercións a realizar.
 * @author Oliver Miguez Alonso
 */
public class eje3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String texto = "ola que hase";

        System.out.println("Introduce el numero de espacios en blanco que deseas remplazar");
        int espacios = sc.nextInt();
        System.out.println("Introduce el caracter con el que lo quieres cambiar");
        String caracter = sc.next();

        System.out.println(espacios(texto,caracter,espacios));


    }//end main

    /**
     * Permite  cambiar el numero de espacios en blanco por el caracter que desea el usuario
     * @param texto
     * @param caracter
     * @param espacios
     * @return
     */
    public static String espacios(String texto,String caracter,int espacios){
         StringBuilder resultado = new StringBuilder();

         int reemplazosRealizados = 0;

         for (int i = 0; i < texto.length(); i++) {
             char c = texto.charAt(i);

             if (c == ' ' && reemplazosRealizados < espacios) {
                 resultado.append(caracter);
                 reemplazosRealizados++;
             }//end if

             else {
                 resultado.append(c);
             }//end else

         } return resultado.toString();
    }//end espacios

}//end class
