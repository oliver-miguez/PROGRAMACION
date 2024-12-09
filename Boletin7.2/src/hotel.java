import java.util.Scanner;
/**
 * Tenemos habitaciones y plantas(es simétrico toda planta tiene el mismo número de habitaciones) 4x6 por ejemplo 4 plantas 6 habitaciones
 * 1. Habitación --> registra usuarios (nome) y comprobar que la habitación este vacía (Nº Habitación)
 * 2. Desalojar habitación(check out)
 * 3. Consultar habitaciones vacías
 * @author Oliver Miguez Alonso
 * @version 1.0
 */
public class hotel {
        /**
         * Metodo principal del programa
         * @param args no usamos
         */
        public static void main(String[] args) {

            //permite introducir valores por consola
            Scanner sc = new Scanner(System.in);

            //variable predefinidas
            String nombreRexistrar = "Oliver";
            int piso = 0;

            // crea tabla de habitaciones ocupadas o no
            String[][] habitaciones = {
                    {"libre", "libre", "libre", "libre", "ocupada", "ocupada"},
                    {"ocupada", "ocupada", "ocupada", "libre", "libre", "libre"},
                    {"libre", "libre", "ocupada", "libre", "ocupada", "libre"},
                    {"ocupada", "ocupada", "ocupada", "ocupada", "ocupada", "ocupada"}
            };

            //muestra la tabla al usuario
            for ( int i = 0; i< habitaciones.length;i++){
                System.out.println("Pranta: "+i);
                for(int j = 0; j < habitaciones[0].length;j++){
                    System.out.println("Habitacion: "+j+"  "+habitaciones[i][j]);
                }//end for
                System.out.println("\n");
            }//end for

            //switch con las distintas opciones a escoger
            System.out.println("1-Rexistrarse");
            System.out.println("2-Desaloxar");
            System.out.println("3-Ver habitaciones vacias");
            System.out.println("4-Salir");
            int op = sc.nextInt();

            switch (op){
                case 1:
                    rexistrar(habitaciones,sc);
                    break;

                case 2:
                    desaloxar(habitaciones,sc);
                    break;

                case 3:
                    vacio(habitaciones,sc);
                    break;

                default:
                    System.out.println("Opción no válida");
            }//end switch

        }//end main

        /**
     * Registra a una persona en una habitacion libre
     * @param habitaciones array orignal
     * @param sc Introducir valores por consola
     */
        static void rexistrar(String[][]habitaciones,Scanner sc ) {
        System.out.println("Introduce la habitacion: ");
        int habitacion = sc.nextInt();
        System.out.println("Introduce el piso");
        int piso = sc.nextInt();

        //Para registrar una habitación no ocupada
        if(piso >= 0 && piso <= 3 && habitacion >= 0 && habitacion <= 5){
            if(habitaciones[piso][habitacion].equals("libre")){
                System.out.println("Habitacion Libre");
                System.out.println("Introduce el nombre para registrar: ");
                String nome  = sc.next();
                habitaciones[piso][habitacion] = nome;
                //muestra la tabla al usuario
                for ( int i = 0; i< habitaciones.length;i++){
                    System.out.println("Pranta: "+i);
                    for(int j = 0; j < habitaciones[0].length;j++){
                        System.out.println("Habitacion: "+j+"  "+habitaciones[i][j]);
                    }//end for
                    System.out.println("\n");
                }//end for
            }//end if
            else{
                //habitación ocupada
                System.out.println("Habitaciónn ocupada");
            }
        }//end if

    }//end rexistrar

        /**
     * Desaloxa unha habitación ocupada{
     * @param habitaciones array original
     * @param sc permite introducir datos por consola
     */
        static void desaloxar(String[][] habitaciones, Scanner sc){
        System.out.println("Introduce la habitación: ");
        int habitacion = sc.nextInt();
        System.out.println("Introduce el piso: ");
        int piso = sc.nextInt();


        //si esta ocupada la libera
        if(habitaciones[piso][habitacion].equals("ocupada")){
            System.out.println("Desocupando habitación");
            habitaciones[piso][habitacion] = "libre";
            System.out.println("Habitacion liberada");

            //muestra la tabla al usuario
            for ( int i = 0; i< habitaciones.length;i++){
                System.out.println("Pranta: "+i);
                for(int j = 0; j < habitaciones[0].length;j++){
                    System.out.println("Habitacion: "+j+"  "+habitaciones[i][j]);
                }//end for
                System.out.println("\n");
            }//end for
        }//end if
    }//end desaloxar

        /**
     * Comprueba las habitaciones vacias del piso seleccionado
     * @param habitaciones array original
     */
        static void vacio(String[][] habitaciones,Scanner sc) {
        int contador = 0;
        System.out.println("Introduce el piso: ");
        int piso = sc.nextInt();
        // Comprueba si hay habitaciones libres en el piso elegido
        if (piso >= 0 && piso < habitaciones.length) {
            for (int j = 0; j < habitaciones[piso].length; j++) {
                if (habitaciones[piso][j].equals("libre")) {
                    contador++;
                }//end if
            }//end for
            System.out.println("En el piso " + piso + " hay " + contador + " habitaciones libres");
        }//end if

    }//end vacio

}//end class

