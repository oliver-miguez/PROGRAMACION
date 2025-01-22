public class Main {
    public static void main(String[] args) {
        Libros quijote = new Libros("Quijote","Cervantes",555,-40,1);
        quijote.setTitulo("ELLLL Quijote");
        quijote.setAutor("El churumbel");

        System.out.println(quijote.getAutor() + " " + quijote.getTitulo());
        if(quijote.venderLibro(5)) System.out.println("Venta realizada");
        else System.out.println("Error en la venta. Hai stock? ");
        quijote.registrarEntradaLibro(10);
        if(quijote.venderLibro(5)) System.out.println("Venta realizada");
        else System.out.println("Error en la venta. Hai stock? ");

        quijote.setPrecio(-15.0);
        System.out.println("O precio e "+ quijote.getPrecio());
    }//end main

}//end class
