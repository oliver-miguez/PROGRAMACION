/**
 * Clase que representa a un libro
 * @author Oliver Miguez Alonso
 */
public class Libros {
    //propiedades de clase libro
    //Representa el formato de clase que usaremos(public, private) el tipo (String, int) y el nombre de la clase
    public String titulo;
    public String autor;
    private int numPaginas;
    private double precio;
    private int cantidad;


    public boolean venderLibro(int cantidadVenta){
        if(cantidad >= cantidadVenta){
            actualizarCantidad(-cantidadVenta);
            return true;
        }//end if
    else return false;
    }//end vendeLibro

    public void registrarEntradaLibro(int cantidadEntrada){
        actualizarCantidad(cantidadEntrada);
    }//end comprarLibro

    private  void actualizarCantidad(int cantidadActualizar){
        cantidad = cantidad +cantidadActualizar;
    }//end actualizarCantidad

}//end class