public class proba {
    public static void main(String[]args){

        /*
        Las tablas no son iguales ,debido a que el programa no se fija en su contenido sino en su
        posicion en la memoria, por ello nos da que son distintas
         */
        int[]t1 = {1,2,3};
        int[]t2 = {1,2,3};
        if(t1==t2){
            System.out.println("iguais");
        }
        else{
            System.out.println("distinto");
        }
        //tabla bidimensional
        int[][] taboa2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
                {17, 18, 19, 20}
        };
        System.out.println(taboa2[0].length);//cuenta el numero de valores que hay en cada array dentro del array bidimensional,ejemplo: 4
        System.out.println(taboa2.length);//cuenta el numero de arrays que tiene el array bidimensional, ejemplo: 5

    }
}
