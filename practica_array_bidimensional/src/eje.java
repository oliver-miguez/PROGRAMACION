import java.util.Scanner;
/**
 * cuenta el numeros de una asignatura introducida
 */
public class eje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige una asignatura: ");
        String op = sc.next();

        int BD;

        String[][]horario = {
                {"BD","BD","BD","BD","PRG","PRG","PRG"},
                {"BD","BD","BD","SI","SI","SASP","IPE"},
                {"PROG","PROG","PROG","LMSXI","LMSXI","COD","COD"},
                {"ING","ING","SI","SI","PROG","PROG","PROG"},
                {"COD","LMSXI","LMSXI","SI","SI","IPE","IPE"}
        };

        //comprueba que el valor op se encuentre dentro del array
        for(String i = 0; horario.length; i++){
            for(String j = 0; horario[0].length; j++){
                if (j == "BD"){
                    BD++;
                }
            }
        }

    }//end main
}//end class
