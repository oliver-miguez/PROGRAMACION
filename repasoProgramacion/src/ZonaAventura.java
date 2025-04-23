public class ZonaAventura extends Zonas implements MenoresIdade {
    private String nivelDificultad;

    public ZonaAventura(String nombreZona, int capacidadMaxima, String nivelDificultad) {
        super(nombreZona, capacidadMaxima);
        setNivelDificultad(nivelDificultad);
    }

    public String getNivelDificultad() {
        return nivelDificultad;
    }

    //TODO Transformar todas las letras a minuscula y que pueda detectar con mayusculas y con minusculas
    public void setNivelDificultad(String nivelDificultad) {
        if (nivelDificultad.equals("Dificil")) {
            this.nivelDificultad = nivelDificultad;
        } else if (nivelDificultad.equals("Medio")) {
            this.nivelDificultad = nivelDificultad;
        } else if (nivelDificultad.equals("Facil")) {
            this.nivelDificultad = nivelDificultad;
        } else {
            this.nivelDificultad = "Erro no nivel , introduzca nova dificultade Dificil,Medio,Facil ";
        }
    }

    @Override
    public boolean espacioLibre() {
        if (getCapacidadMaxima() > 10) return false;
        else return true;
    }

    @Override
    public String mostrarInfoZona() {
        return getNombreZona()+ " "+ getCapacidadMaxima() +" " + nivelDificultad;
    }

    @Override
    public String menoresIdade() {
        return "Todas as idades ";
    }

    @Override
    public String descripcion() {
        return "Breve Descripcion ";
    }
}
