/**
 * Calcula los multiplos de 7 del 1 al 100
 * @author Oliver Miguez Alonso
 * @version 1.0
 */


public class multiplos_de_7_con_for {
    public static void main(String[]args){
        for(int i=100; i >= 1; i--) { //define i como los numeros que van del 1 al 100
            int oper = i*7;//multiplica esos numero por 7 para calcular los multiplos de 7
            System.out.println(oper);//Muestra el resultado por pantalla

        }//cierre del for

    }//cierre del static void

}//cierre del class