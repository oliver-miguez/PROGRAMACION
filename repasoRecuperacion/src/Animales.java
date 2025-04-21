public  abstract class Animales extends Zoologico {
    private String especie;
    private int edad;
    private String habilidad;

    public Animales(String nome, String especie, int edad, String habilidad){
        super(nome);
        setEdad(edad);
        setEspecie(especie);
        setHabilidad(habilidad);

    }//end constructor

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if((this.edad < 0 )&& (this.edad > 100 )) this.edad = 2;
        else this.edad = edad;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + "edad: "+ edad +" especie: "+ especie+ " habilidades "+ habilidad;
    }

    //METODO ABSTRACTO
    public abstract String hacerRuido();

}//end class
