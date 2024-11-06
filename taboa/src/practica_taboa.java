public class practica_taboa {
    public static void main(String []args){

        /* Tambien podemos escribirlo como int[]edades = new int [5]*/

        int [] edades;//es interesante si son varios valores dentro de la tabla que tenga un nombre en plural
        edades = new int[5]; // identifca cuantos valores puede tener la tabla edades
        edades[0] = 31;//Introduce los valores a cada unos de los huecos reservados a edades
        edades[1] = 23;
        edades[2] = 56;
        //edades[3] = 12;
        edades[4] = 32;
        System.out.println(edades[1]);//muestra el resultado
        System.out.println(edades[3]);//si no definimos uno de los apartados de edades devuelve valor 0
        //como el valor 3, no tiene valor porque en este caso esta comentado , nos devuelve valor 0

        //otro tipo de tabla
        String [] nomes = {"Manuel","Jose","Rosa","Ana"};
        System.out.println(nomes[1]);//Muestra el elemento que se encuentra en la posicion 1 de la tabla nomes
        /*
        System.out.println(edades[5]);
        no podemos introducir valores que se salgan fuera de los valores de edades
         */


    }//end main
}//end class
