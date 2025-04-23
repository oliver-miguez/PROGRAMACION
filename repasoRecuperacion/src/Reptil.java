public class Repti extends Animales implements Cuidable {
    private int temperatura;

    public Repti(String nome, String especie, int edad, String habilidad, int temperatura){
        super(nome, especie, edad, habilidad);
        setTemperatura(temperatura);
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + " temperatura: "+ temperatura;
    }

    @Override
    public String hacerRuido() {
        return "grhhhhh";
    }

    @Override
    public void alimentar(int cantidad) {

    }
}
