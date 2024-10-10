
import java.util.Scanner;
public  class eje_1{
    public static void main(String[]args){
        float precio_producto ;
        float precio_con_descuento;
        float porcentaje;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuanto vale sin descuento: ");
        precio_producto = entrada.nextFloat();
        System.out.println("Cuanto vale con descuento: ");
        precio_con_descuento = entrada.nextFloat();
        porcentaje = (precio_con_descuento / precio_producto)*100;
        System.out.println("El porcentaje de descuento es "+ porcentaje + "%");

    }
}