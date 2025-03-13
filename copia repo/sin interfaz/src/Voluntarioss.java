public class Voluntarioss extends Traballadors{

    //PROPIEDADES

    private  int edad;
    private  String profesion;
    private int hora;
    private String trabajo;

    //CONSTRUCTOR

    public Voluntarioss(String dni, String nombre, int dataIngreso, int edad, String profesion, int hora, String trabajo){
        super(dni, nombre, dataIngreso);
        setEdad(edad);
        setProfesion(profesion);
        setHora(hora);
        setTrabajo(trabajo);

    }//end constructor

    //GETTERS Y SETTERS

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    @Override
    public String aCadea() {
        return edad+" " + profesion+" "+ hora+" "+ trabajo;
    }//end aCadea

    @Override
    public double gastosIngresos() {
        return -3;
    }
}//end class
