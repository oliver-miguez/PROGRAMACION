/**
 * Clase padre
 * @author Oliver Miguez Alonso
 */
public abstract class Asociacion {

    //PROPIEDADES

    private String dni;
    private String nombre;

    //CONSTRUCTOR

    public Asociacion(String dni, String nombre) {
        setDni(dni);
        setNombre(nombre);
    }//end constructor

    //GETTERS Y SETTERS


    public String getDni() {
        return dni;
    }//end getDNI

    public void setDni(String dni) {
        this.dni = dni;
    }//end setDNI



    public String getNombre() {
        return nombre;
    }//end getNombre

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//end setNombre

    //METODOS ABSTRACTOS

    public abstract String aCadea();


}//end class
