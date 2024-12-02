import java.util.Scanner;
/**
 * cuenta el numeros de una asignatura introducida
 */
public class eje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige una asignatura: ");
        String op = sc.next();

        String[][]horario = {
                {"BD","BD","BD","BD","PRG","PRG","PRG"},
                {"BD","BD","BD","SI","SI","SASP","IPE"},
                {"PROG","PROG","PROG","LMSXI","LMSXI","COD","COD"},
                {"ING","ING","SI","SI","PROG","PROG","PROG"},
                {"COD","LMSXI","LMSXI","SI","SI","IPE","IPE"}
        };

        //comprueba que el valor op se encuentre dentro del array
        boolean encontrado = false;
        for (String[] fila : horario) {
            for (String valor : fila) {
                if (valor == op) { encontrado = true; break; } }
        }

    }//end main
}//end class
