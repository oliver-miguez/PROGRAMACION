import javax.sound.midi.Soundbank;
import java.util.Scanner;
/**
 * Crear unha táboa (bidimensional) onde as filas sexan días da seman e as columnas as horas do día.
 * Enche a táboa con cadeas que representen actividades, por exemplo: "Matemáticas", "Historia", "Deporte", “Compra”, “Piscina”.
 * Mostra o horario inicial o usuario.
 * Permite o usuario:
 * Cambiar unha actividade por outra.
 * Engadir unha actividade extra nunha posición valeira.
 * Mostra o horario actualizado tras cada modificación.
 *
 * @author Oliver Miguez Alonso
 * @version 1.0
 */
public class eje1 {
    /**
     * Método principal del programa
     * @param args no usamos
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //crea un array filas son días y columnas son las horas
        String[][]axenda = {
                {"Matematicas","Matematicas","Deporte","Piscina","Piscina"},
                {"Historia","Historia","Historia","Compra","Compra"},
                {"Deporte","Deporte","Deporte","Piscina","Compra"},
                {"Matematicas","Historia","Deporte","Compra","Piscina"},
                {"Historia","","Compra","Compra","Piscina"}
        };
        System.out.println("____________________");
        System.out.println("Tabla sin actualizar ");
        System.out.println("____________________");

        //Mostrar los valores del array sin actualizar por pantalla
        for(int i = 0; i< axenda.length;i++){
            for(int j = 0; j< axenda[0].length;j++){
                System.out.print(axenda[i][j] + ",");
            }//end for
            System.out.print("\n");
        }//end for

        //Inicia la función cambiar con la que podremos o no cambiar un valor existente de la tabla
        cambiar(sc,axenda);

        //Inicia la función que cambia valores nulos por datos introducidos por el usuario
        engadir(sc,axenda);

    }//end main

    /**
     * Permite cambiar alguna actividad del array original
     * @param sc permite introducir datos por consola
     * @param axenda array inicial
     */
    static void cambiar(Scanner sc, String[][]axenda){
        System.out.println("__________________________________________________________________");
        System.out.println("Quieres cambiar alguna actividad: Pulsa 1 para si, Pulsa 2 para no");
        System.out.println("__________________________________________________________________");

        int actividad = sc.nextInt();

        if(actividad == 1){
            System.out.println("Introduce el dia: ");
            int dia = sc.nextInt();
            System.out.println("Introduce la hora: ");
            int hora = sc.nextInt();
            System.out.println("Introduce el nombre de la asignatura que quieras añadir: ");
            String nome = sc.next();

            //accede al array , cambia el valor de la hora solicitada por otro
            System.out.println("_________________");
            System.out.println("Tabla actualizada");
            System.out.println("_________________");

            for(int i = 0; i < axenda.length; i ++){
                for(int j = 0; j < axenda[0].length; j++){
                    axenda[dia][hora] = nome;
                    System.out.print(axenda[i][j]+ ",");
                }//end for
                System.out.print("\n");
            }//end for
        }//end if
        else{
            System.out.println("No se cambia ningún valor ya establecido");
        }
    }//end cambiar

    /**
     * Función que añade un valor a un valor nulo
     * @param sc permite añadir valores por consola
     * @param axenda el array original
     */
    static void engadir(Scanner sc, String[][]axenda){
        System.out.println("__________________________________________________________________");
        System.out.println("Desea comprobar si existe algún valor nulo: Pulsa 1 si Pulsa 2 no: ");
        System.out.println("__________________________________________________________________");

        int op = sc.nextInt();
        int contadorNulos = 0;

        //comprueba si existen valores nulos en el array
        if(op == 1){
            for(int i = 0; i< axenda.length; i++ ){
                for(int j = 0; j< axenda[0].length; j++){
                    if(axenda[i][j]==""){
                        contadorNulos++;
                    }//end if
                }//end for
            }//end for
        }//end if
        System.out.println("_________________________________________________");
        System.out.println("hay un total de "+ contadorNulos+ " valores nulos" );
        System.out.println("Desea darle un valor: Pulsa 1 si Pulsa 2 no  ");
        System.out.println("_________________________________________________");
        int op2 = sc.nextInt();

        if(op2 == 1){
            System.out.println("_____________________________________________");
            System.out.println("Introduce el nuevo valor para el nulo: ");
            System.out.println("_____________________________________________");
            String  valor = sc.next();

            //cambia el valor nulo por el nuevo valor
            for(int i = 0; i< axenda.length; i++ ){
                for(int j = 0; j< axenda[0].length; j++){
                    if(axenda[i][j].equals("")){//si es un String la tabla es necesario utilizar la función equals
                        axenda[i][j] = valor;
                    }//end if
                    System.out.print(axenda[i][j]+ ",");

                }//end for
                System.out.print("\n");

            }//end for
        }//end if
    }//end engadir

}//end class