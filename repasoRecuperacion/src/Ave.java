public class Ave extends Animales {
    private String capacidadeVoar;

    public Ave(String nome, String especie, int edad, String habilidad, String capacidadeVoar){
        super( nome, especie, edad, habilidad);
        setCapacidadeVoar(capacidadeVoar);
    }

    public String getCapacidadeVoar() {
        return capacidadeVoar;
    }

    public void setCapacidadeVoar(String capacidadeVoar) {
        this.capacidadeVoar = capacidadeVoar;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos()+ " pode voar :"+ capacidadeVoar;
    }

    @Override
    public String hacerRuido() {
        return "gyahhh";
    }
}
