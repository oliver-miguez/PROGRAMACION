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