
import java.util.Scanner;//para poder introducir cosas por consola


/**
 * Convierte el numero introducido del 0 al 99 en su equivalente en letra
 * @version 1.0
 * @author Oliver Miguez Alonso
 */

public class eje_2 {
    public static <and> void main(String[]args){

        //Guarda los datos introducidos por consola
        Scanner a = new Scanner(System.in);

       //Guarda el valor de decena
        String numero = "";

        //Guarda el valor de unidades
        String numero2 = "";

        //para guardar los valores introducidos
        int unidad ;
        int decena ;

        //Para preguntar sobre los numero que se van a introducir por consola
        System.out.println("Introduce tu decena del 1-9: ");
        decena = a.nextInt();//para guardar el numero introducido en el anterior System.out.println
        System.out.println("introduce la unidad del 0-9");
        unidad = a.nextInt();

        //Discrimina distintas opciones de decenas
        switch (decena){

            case 1:
                numero = ("diez");
                break;
            case 2 :
                numero = ("veinte");
                break;
            case 3:
               numero = ("treinta");
                break;
            case 4:
                numero = ("cuarenta");
                break;
            case 5:
                numero = ("cincuenta");
                break;
            case 6:
                numero =("sesenta");
                break;
            case 7:
                numero =("setenta");
                break;
            case 8:
                numero =("ochenta");
                break;
            case 9:
                numero =("noventa");
                break;


        }
        //Discrimina distintas opciones de unidades
        switch (unidad){

            case 0:
                numero2 ="cero";
                break;
            case 1:
                numero2 ="uno";
                break;
            case 2:
                numero2 ="dos";
                break;
            case 3:
                numero2 ="tres";
                break;
            case 4:
                numero2 ="cuatro";
                break;
            case 5:
                numero2 ="cinco";
                break;
            case 6:
                numero2 ="seis";
                break;
            case 7:
                numero2 ="siete";
                break;
            case 8:
                numero2 ="ocho";
                break;
            case 9:
                numero2 ="nueve";
                break;
        }


        //para elaborar numero ("once")
        if (numero =="diez" && numero2 == "uno"){
            System.out.println("Once");
        }
        //para elaborar el numero ("doce")
        else if (numero =="diez" && numero2 == "dos"){
            System.out.println("Doce");
        }
        //para elaborar el numero ("trece")
        else if (numero =="diez" && numero2 == "tres"){
            System.out.println("Trece");
        }

        // //para elaborar el numero ("catorce")
        else if (numero =="diez" && numero2 == "cuatro"){
            System.out.println("Catorce");
        }
        //para elaborar el numero ("quince")
        else if (numero =="diez" && numero2 == "cinco"){
            System.out.println("Quince");
        }
        //para elaborar el numero ("diez")
        else if (numero == "diez" && numero2 =="cero"){
            System.out.println("Diez");
        }

        //elabora los casos no especiales
        else
        {
            System.out.println(numero +  numero2);
        }











    }




    }

