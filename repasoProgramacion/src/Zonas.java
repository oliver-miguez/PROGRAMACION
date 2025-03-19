public abstract class Zonas {
    private String nombreZona;
    private int capacidadMaxima;

    public Zonas(){
        nombreZona = "zonas";
        capacidadMaxima = 10;
    }

    public Zonas(String nombreZona, int capacidadMaxima){
        setNombreZona(nombreZona);
        setCapacidadMaxima(capacidadMaxima);
    }

    public String getNombreZona() {
        return nombreZona;
    }

    public void setNombreZona(String nombreZona) {
        this.nombreZona = nombreZona;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        if(capacidadMaxima < 0 || capacidadMaxima >  10 ) this.capacidadMaxima = 1;
        else this.capacidadMaxima = capacidadMaxima;
    }

    public abstract boolean espacioLibre();

    public abstract String mostrarInfoZona();
}
