import java.util.Scanner;//permite utilizar el metodo scanner
/**
 * Calcula la letra de tu NIF introduciendole tu numero de nif
 * @author Oliver Miguez Alonso
 */
public class eje_4 {
    /**
     * Metodo principal del programa/calcula la letra de tu nif
     * @param args no usamos
     */
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);//Permite utilizar el metodo scanner
        //array que almacena las letras que se utilizan para los Nif
        System.out.println("Introduce el numero de tu Nif: ");//pregunta el numero de NIF
        int nif = sc.nextInt();//guarda el numero de NIF introducido por consola
        //crea un array con las letras que se utilizan para los Nif
        String[]letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        if(nif < 1 || nif > 99999999){//para que el nif no supere los 8 digitos
            System.out.println("El numero de NIF no es valido.");//en caso de superarlos tira este SOP
        }//end if
        else{
            int mostrar_letra = (nif % 23);//calcula la la letra que corresponde al numero de NIF
            //Muestra los resultados
            System.out.println("La letra de tu NIF es: " + letras[mostrar_letra]);
            System.out.println(nif+" "+letras[mostrar_letra]);
        }//end else
    }//end main
}//end class
