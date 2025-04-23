public class Mamifero extends Animales {
    private String dieta;

    public Mamifero(String nome, String especie, int edad, String habilidad, String dieta){
        super(nome, especie, edad, habilidad);
        setDieta(dieta);
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos()+ " dieta: "+ dieta;
    }

    @Override
    public String hacerRuido() {
        return "IUHHHH";
    }
}
