/**
 * Clase padre del ejercicio
 * @author Oliver Miguez Alonso
 */
public  class Biblioteca {
    //PROPIEDADES
    private String ismb;
    private String anoPublicacion;
    private boolean estado; //Disponible o Prestado
    private String titulo;

    //CONSTRUCTOR
    public Biblioteca(String ismb, String anoPublicacion, boolean estado, String titulo){
        setEstado(estado);
        setIsmb(ismb);
        setTitulo(titulo);
        setAnoPublicacion(anoPublicacion);
    }//end constructor


    //GETTERS Y SETTERS

    //separado por cinco grupos de digitos separados por un guion
    public String getIsmb() {
        return ismb;
    }

    //verifica el formato del isbm --> Suponiendo que el tamaño será de 17 separado cada 3 dígitos por un '-'
    public void setIsmb(String ismb) {
        //Verifica que tenga tamaño 17
        if(ismb.length() != 17){
            System.out.println("Vuelva a Introducir el ISMB , solo puede tener 17 caracteres numericos separados cada 3  dijitos por un '-' ");
        }//end if

        if(ismb.length() == 17) {
            char[] caracteres = ismb.toCharArray(); // crea un array de chars del String
            for (int i = 0; i < caracteres.length; i++) { //recorre el array
                if (i ==3 || i ==7 ||i == 11 ||i == 15) { //Verificar si las posiciones donde se encuentran los guiones son tienen o no un guión
                    if (caracteres[i] != '-') {
                        System.out.println("ERROR, te has equivocado en las posiciones de los guiones, vuélvelas a colocar ");
                        return; //sale del método si los guiones son erroneos
                    }//end if

                    else{
                        if (!Character.isDigit(caracteres[i])) { //verifica que el resto de valores sean números
                            System.out.println("ERROR, todos los valores deben de ser números excepto '-' ");
                            return;
                        }//end if

                        else{
                            this.ismb = ismb;
                            System.out.println(ismb);
                        }//end else
                    }//end else
                }//end if
            }//end for

        }//end if

    }//end isbm



    public String getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(String anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}//end clase
