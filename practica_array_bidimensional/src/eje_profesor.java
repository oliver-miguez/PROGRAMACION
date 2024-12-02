import java.util.Scanner;
/**
 * pregunta dia y hora y devuelve la asignatura que me toca en ese momento
 * @author Oliver Miguez Alonso
 */
public class eje_profesor {
    /**
     * Método principal del programa
     * @param args no usamos
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un dia del 0 al 4");
        int dia = sc.nextInt();
        System.out.println("Introduce la hora del 0 al 6");
        int hora = sc.nextInt();

        //Crea un array con todos las asignaturas de cada día
        String[][]horario = {
                //filas son los dias , columnas son las horas
                {"BD","BD","BD","BD","PRG","PRG","PRG"},
                {"BD","BD","BD","SI","SI","SASP","IPE"},
                {"PROG","PROG","PROG","LMSXI","LMSXI","COD","COD"},
                {"ING","ING","SI","SI","PROG","PROG","PROG"},
                {"COD","LMSXI","LMSXI","SI","SI","IPE","IPE"}
        };
        //verifica  que los valores introducidos sean validos
        if(dia<=4 && hora <=6) {
            System.out.println(horario[dia][hora]);
        }else{
            System.out.println("Datos introducidos no válidos");
        }



    }//end main
}//end class
