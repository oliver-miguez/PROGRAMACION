import java.util.Scanner;//para poder introducir cosas por consola
/**
 * Convierte el numero introducido del 0 al 99 en su equivalente en letra
 * @version 1.0
 * @author Oliver Miguez Alonso
 */
public class prueba_eje_2 {
    public static void main(String[] args) {

        //Guarda los datos introducidos por consola
        Scanner a = new Scanner(System.in);

        //Guarda el valor de decena
        String decenas_guardar = "";

        //Guarda el valor de unidades
        String unidades_guardar = "";



        //para guardar los valores introducidos
        int unidad;
        int decena;

        //Para preguntar sobre los numero que se van a introducir por consola
        System.out.println("Introduce tu decena del 1-9: ");
        decena = a.nextInt();//para guardar el numero introducido en el anterior System.out.println
        System.out.println("introduce la unidad del 0-9");
        unidad = a.nextInt();

// guardar el valor de las decenas
        switch (decena){
            //si la decena es 0
            case 0:
                if(decena==0){
                    decena =0;
                    System.out.println("cero");
                    break;
                }
            case 1: // casos especiales
                if (decena == 1)
                {
                    if(unidad == 1){
                        System.out.println("Once");
                    }
                    if(unidad == 2){
                        System.out.println("Doce");
                    }

                    if(unidad == 3){
                        System.out.println("Trece");
                    }
                    if (unidad == 4){
                        System.out.println("Catorce");
                    }
                    if(unidad == 5){
                        System.out.println("Quince");
                    }


                    else{
                        if (decena !=0) {
                            decenas_guardar = ("Diez");
                        }
                        else{
                            System.out.println(unidades_guardar);
                        }
                    }

                }
                break;

                //para explicar los multiplos de diez
            case 2:
                decenas_guardar = ("Veinte");
                break;
            case 3:
                decenas_guardar = ("Trenta");
                break;

            case 4:
                decenas_guardar = ("Cuarenta");
                break;

            case 5:
                decenas_guardar = ("Cincuenta");
                break;
            case 6:
                decenas_guardar = ("Sesenta");
                break;
            case 7:
                decenas_guardar = ("Setenta");
                break;
            case 8:
                decenas_guardar = ("Ochenta");
                break;
            case 9:
                decenas_guardar = ("Noventa");
                break;



            }//swich decena


 // guardar el valor  de la unidades
        switch (unidad){

            case 1:
                if (decena != 0){//para la unidad de un numero que tenga decena
                    unidades_guardar = ("iuno");
                }
                else{
                    System.out.println("uno");//para un numero que no tenga decena, solo la unidad
                }
                break;

                case 2:
                if (decena != 0){
                    unidades_guardar = ("idos");

                }
               else{
                   System.out.println("dos");
                }
                break;

            case 3:
                if (decena != 0){
                    unidades_guardar = (" itres");
                }
                else{
                    System.out.println("tres");
                }
                break;

            case 4:
                if (decena != 0){
                    unidades_guardar = ("icuatro");
                }
                else{
                    System.out.println("cuatro");
                }
                break;

            case 5:
                if (decena != 0){
                    unidades_guardar = ("icinco");
                }
                else{
                    System.out.println("cinco");
                }
                break;

            case 6:
                if (decena != 0){
                    unidades_guardar = ("iseis");
                }
                else{
                    System.out.println("seis");
                }
                break;

            case 7:
                if (decena != 0){
                    unidades_guardar = ("isiete");
                }
                else{
                    System.out.println("siete");
                }
                break;

            case 8:
                if (decena != 0){
                    unidades_guardar = ("iocho");
                }
                else{
                    System.out.println("ocho");
                }
                break;

            case 9:
                if (decena != 0){
                    unidades_guardar = ("inueve");
                }
                else{
                    System.out.println("nueve");
                }
                break;
        }//swich unidad

        //Print del resultado
        System.out.println(decenas_guardar + unidades_guardar);

    }//public class

}//class