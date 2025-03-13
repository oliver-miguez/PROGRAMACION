/**
 * Clase padre
 * @author Oliver Miguez Alonso
 */
public abstract class Asociacions {

    //PROPIEDADES

    private String dni;
    private String nombre;

    //CONSTRUCTOR

    public Asociacions(String dni, String nombre) {
        setDni(dni);
        setNombre(nombre);
    }//end constructor

    //GETTERS Y SETTERS


    public String getDni() {
        return dni;
    }//end getDNI

    public void setDni(String dni) {
        char letrasNif[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

        if(dni.length() == 9) {
            int num = Integer.parseInt(dni.substring(0, 8));
            if(dni.charAt(8) == letrasNif[num % 23]) {
                this.dni = dni;
            } else {
                dni = "00000000T"; // valor por defecto
                System.out.println("O nif é incorrecto");
            }//end else
        } else {
            dni = "00000000T"; // valor por defecto
            System.out.println("O nif é incorrecto");
        }//end else

    }//end setDNI



    public String getNombre() {
        return nombre;
    }//end getNombre

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//end setNombre

    //METODOS ABSTRACTOS

    public abstract String aCadea();

    public abstract double gastosIngresos();


}//end class
