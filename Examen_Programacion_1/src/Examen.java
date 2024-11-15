import java.util.Scanner; //nos permite utilizar el scanner en el programa
/**
 * Pide hora , minutos ,segundos, asi como el tiempo que se quiere ampliar
 * A aplicacion mostrara a hora actualizada
 * @author Oliver Miguez Alonso
 * @version 1.0
 */
public class Examen {
    /**
     * Funcion principal del programa
     * @param args no usamos
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//permite introducir datos por consola
        //variable a utilizar
        int hora=0;
        int minutos=0;
        int segundos=0;
        //pregunta por consola y almacena los valores de cada variable que utiliza
        System.out.println("Introduce la hora:");
        hora = sc.nextInt();//Guarda el valor introducido por consola
        System.out.println("Introduce los minutos");
        minutos = sc.nextInt();
        System.out.println("Introduce los segundos");
        segundos = sc.nextInt();

        //Para que la hora inicial no sea erronea
        while(hora <24 || minutos < 61 || segundos < 60) {
            System.out.println("La hora actual sin actualizar es = " + hora + ":" + minutos + ":" + segundos);
            System.out.println("Cuantos segundos deseas ampliar: ");
            int segamp = sc.nextInt();//segundos que se quieren ampliar
            segundos = segundos+segamp; // aumenta el valor de los segundo añadiendo los segundo ampliados

            //para aumentar los minutos en caso de que los segundos sean mayor a 60
            if (segundos >=60){
                minutos = minutos + 1;
                segundos = segundos - 60;
            }//end if

            //para aunmentar las horas en caso de que los minutos sean mayor a 60
            if(minutos >= 60){
                hora = hora +1;
                minutos = minutos-60;
            }//end if
            if(hora >= 24){
                System.out.println("La hora a superado los limites, introduciremos valores dias :");
                int dia=0;
                dia = dia + 1;
                hora = hora - 24;
                System.out.println(dia+" dias;" + hora+" horas;"+ minutos + " minutos;"+ +segundos+"segundos");
            }

            System.out.println("La hora actualizada(sin dias) es: "+ hora +":"+ minutos + ":"+ segundos);

            break;//cierra el programa para que no pregunte infinitamente introducir una nueva hora
        }//end while
        //Para verificar que la hora introducida es correcta
        if(hora >25 || minutos > 61 || segundos > 60){
            System.out.println("Hora no valida");
        }//end if
    }//end main
}//end class