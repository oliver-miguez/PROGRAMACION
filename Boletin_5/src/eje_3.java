import java.util.Scanner;
public class eje_3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);//Nos permite introducir datos por consola

        double largo;//para definir lo largo que es el rectangulo
        double ancho; //para definir lo ancho que es el rectangulo
        double oper;
        boolean b;// para definir el valor de lo largo
        boolean b1;//para definir el valor de lo ancho
        do {
            System.out.println("Cuanto vale el largo del rectangulo: ");//pregunta por consola
            largo = sc.nextDouble();//almacena lo introducido por consola
            System.out.println("Cuanto vale el ancho del rectangulo");
            ancho = sc.nextDouble();

            b = largo > 0; // define que largo sea mayor que 0
            b1 = ancho > 0; // define que ancho sea mayor que 0


            if (b == false){ // si el largo no es positivo
                System.out.println("El primer numero no vale, se a introducido un valor negativo");
                break;
            }//end if
            if (b1 == false){ // si el ancho no es positivo
                System.out.println("El segundo numero no vale, se a introducido un valor negativo");
                break;
            }
            oper = largo * ancho; // calculo del area del rectangulo
            System.out.println(oper);//Muestra el resultado de la oper por pantalla

        } while (b == true && b1 == true);//hace el do mientras el ancho y el largo son mayores que 0

    }//end static void
}//end class



