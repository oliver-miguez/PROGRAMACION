/**
 * @author Oliver
 * @version 1.0
 */
public class Main {
    /**
     * Metodo principal del programa
     * @param args No usamos
     */
    public static void main(String[] args) {
       PlazaGaraxe plaza1 = new   PlazaGaraxe("Garcia Borbón", 12, "Vigo",100, true, 4, 5 , 6);
        System.out.println(plaza1);

        Vivenda vivenda1 = new Vivenda("Garcia borbon", 2,"Vigo", 1000, true, "segundo", "Terceiro ", 6,plaza1,"Nada");
        System.out.println(vivenda1);
    }//end static
}//end main
