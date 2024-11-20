import java.util.Scanner;//para poder introducir cosas por consola
/**
 * Convierte el numero introducido del 0 al 99 en su equivalente en letra
 * @version 1.0
 * @author Oliver Miguez Alonso
 */
public class eje_2 {
    public static void main(String[]args){

        Scanner a = new Scanner(System.in);//Para introducir codigo por pantalla
        int numero;//variable con la que podremos definir decenas y unidades

        System.out.println("Introduce el numero: ");//Te permite escribir por pantalla
        numero = a.nextInt();//Almacena la info introducida por pantalla

        //Definen los valores de las decenas y unidades
        int decena = numero/10; //Extrae el valor de la decena del numero del numero introducido
        int unidades = numero % 10;//Extrae el valor de la unidad del numero introducido
        String decena_guardar  = "";//almacena la decena del numero introducido
        String unidad_guardar = "";//almacena la unidad del numero introducido

        //Discrimina distintas opciones de decenas
        switch (decena){
            case 1  :
                if(unidades == 1) unidad_guardar = "once";
                else if(unidades == 2) unidad_guardar = "doce";
                else if(unidades == 3) unidad_guardar = "trece";
                else if(unidades == 4) unidad_guardar = "catorce";
                else if(unidades == 5) unidad_guardar = "quince";
                else decena_guardar = "dez";
                break;
            case 2 :
                decena_guardar = ("vinte");
                break;
            case 3:
                decena_guardar = ("trinta");
                break;
            case 4:
                decena_guardar = ("corenta");
                break;
            case 5:
                decena_guardar = ("cincuenta");
                break;
            case 6:
                decena_guardar =("sesenta");
                break;
            case 7:
                decena_guardar =("setenta");
                break;
            case 8:
                decena_guardar =("oitenta");
                break;
            case 9:
                decena_guardar =("noventa");
                break;
        }//Switch decenas

        //Discrimina las distintas opciones de las unidades
        switch (unidades){
            case 1:
                if (decena != 1) unidad_guardar = "un";
                break;
            case 2 :
                if (decena != 1) unidad_guardar = "dous";
                break;
            case 3:
                if (decena != 1) unidad_guardar = "tres";
                break;
            case 4:
                if (decena != 1) unidad_guardar = "catro";
                break;
            case 5:
                if (decena != 1) unidad_guardar = "cinco";
                break;
            case 6:
                if(decena==1) unidad_guardar="aseis";
                else unidad_guardar =("seis");
                break;
            case 7:
                if(decena==1) unidad_guardar="asete";
                else unidad_guardar =("sete");
                break;
            case 8:
                if(decena==1) unidad_guardar="aoio";
                else unidad_guardar =("oito");
                break;
            case 9:
                if(decena==1) unidad_guardar="anove";
                else unidad_guardar =("nove");
                break;
        }//Switch unidades

    System.out.println(decena_guardar + unidad_guardar);

    }//static void
}//class