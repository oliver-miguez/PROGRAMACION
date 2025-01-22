/**
 * Clase que representa a un libro
 * @author Oliver Miguez Alonso
 */
public class Libros {
    //propiedades de clase libro
    //Representa el formato de clase que usaremos(public, private) el tipo (String, int) y el nombre de la clase
    private String titulo;
    private String autor;
    private int numPaginas;
    private double precio;
    private int cantidad;

    //Inicializa todas las propiedades de libro
    public Libros(String tit, String aut, int  pax, double prez, int cant){
        titulo = tit;
        autor = aut;
        numPaginas = pax;
        precio = prez;
        cantidad = cant;
    }//end libros

    /* Forma de permitir utilizar las funciones privadas de "libro"*/

    //actúa de la misma manera que el getAutor
    public String getTitulo(){
        return titulo;
    }//end getTitulo

    //como el valor es privado, el metodo get permite acceder a sus valores
    public String getAutor(){
        return autor;
    }//end getAutor

    public int getNumPaginas(){
        return numPaginas;
    }//end getNumPaginas

    public double getPrecio(){
        return precio;
    }//end getPrecio

    public int getCantidad(){
        return cantidad;
    }//end getCantidad

    /* end forma de utilizar funciones privadas*/

    /*SETTERS ! Deben de ser siempre públicos y no devuelven nunca nada*/
    //Los setters permiten cambiar los valores de las funciones de libro

    //En este caso para cambiar el valor de titulo
    public void setTitulo(String novoTitulo){
        titulo = novoTitulo;
    }//end setTitulo

    public void  setAutor(String novoAutor){
        autor = novoAutor;
    }//end setAutor

    public void  setNumPaginas(int novoNumPax){
        if(novoNumPax > 0) numPaginas = novoNumPax;
        else System.out.println("O numero de páxinas debe ser maior a 0");
    }//end setNumPaginas

    public void setPrecio(double novoPrecio){
        if(precio > 0 ) precio = novoPrecio;
        else System.out.println("O precio ten que ser maior a 0");
    }//end setPrecio
    public void setCantidad(int novaCantidad){
        if(cantidad > 0)cantidad = novaCantidad;
        else System.out.println("A cantidade ten que ser menor a 0");
    }//end setCantidad

    /*End setters*/


    //función para vender libros
    public boolean venderLibro(int cantidadVenta){
        if(cantidad >= cantidadVenta){
            actualizarCantidad(-cantidadVenta);
            return true;
        }//end if
    else return false;
    }//end vendeLibro

    //función para registrar la cantidad libros nuevos añadidos al stock
    public void registrarEntradaLibro(int cantidadEntrada){
        actualizarCantidad(cantidadEntrada);
    }//end comprarLibro

    //registra la cantidad de libros nuevos llegados al stock
    private  void actualizarCantidad(int cantidadActualizar){
        cantidad = cantidad +cantidadActualizar;
    }//end actualizarCantidad

}//end class