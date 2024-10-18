import java.util.Scanner;

/**
 * Calcula el porcentaje del descuento
 * @version 1.0
 * @author Oliver Miguez Alonso
 */

public  class eje_1{
    public static void main(String[]args){
        //Define las variables a guardar
        float precio_producto ;
        float precio_con_descuento;
        float porcentaje;

        Scanner entrada = new Scanner(System.in);//Pregunta por consola
        System.out.println("Cuanto vale sin descuento: ");
        precio_producto = entrada.nextFloat();//Guarda por consola
        System.out.println("Cuanto vale con descuento: ");
        precio_con_descuento = entrada.nextFloat();

        //Calcula el porcentaje
        porcentaje = (precio_con_descuento / precio_producto)*100;
        //Muestra el resultado del calculo
        System.out.println("El porcentaje de descuento es "+ porcentaje + "%");

    }
}
