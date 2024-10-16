//haz un programa que te diga el numero que escribiste segun la decena y unidad introducida
import java.util.Scanner;
public class eje_2 {
    public static <and> void main(String[]args){
        Scanner a = new Scanner(System.in);
        String numero = "";
        String numero2 = "";
        int unidad = 10;
        int decena = 9;
        System.out.println("Introduce tu decena del 1-9: ");
        decena = a.nextInt();
        System.out.println("introduce la unidad del 0-9");
        unidad = a.nextInt();


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
        switch (unidad){

            case 0:
                numero2 =" cero";
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
        if (numero =="diez" && numero2 == "uno"){
            System.out.println("Once");
        }

        else if (numero =="diez" && numero2 == "dos"){
            System.out.println("Doce");
        }

        else if (numero =="diez" && numero2 == "tres"){
            System.out.println("Trece");
        }


        else if (numero =="diez" && numero2 == "cuatro"){
            System.out.println("Catorce");
        }

        else if (numero =="diez" && numero2 == "cinco"){
            System.out.println("Quince");
        }


        else
        {
            System.out.println(numero + "i" + numero2);
        }











    }




    }

