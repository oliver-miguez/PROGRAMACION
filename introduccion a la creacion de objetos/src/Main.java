public class Main {
    public static void main(String[] args) {
        Libros quijote = new Libros("Quijote","Cervantes",555,40,1);

        System.out.println(quijote.autor + " " + quijote.titulo);
        if(quijote.venderLibro(5)) System.out.println("Venta realizada");
        else System.out.println("Error en la venta. Hai stock? ");
        quijote.registrarEntradaLibro(10);
        if(quijote.venderLibro(5)) System.out.println("Venta realizada");
        else System.out.println("Error en la venta. Hai stock? ");
    }//end main

}//end class
