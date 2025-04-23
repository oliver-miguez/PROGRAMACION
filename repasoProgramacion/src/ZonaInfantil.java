public class ZonaInfantil extends Zonas implements MenoresIdade {
    private int edadMaximaPermitida;

    public ZonaInfantil(String nombreZona, int capacidadMaxima, int edadMaximaPermitida){
        super(nombreZona, capacidadMaxima);
        setEdadMaximaPermitida(edadMaximaPermitida);
    }

    public int getEdadMaximaPermitida() {
        return edadMaximaPermitida;
    }

    public void setEdadMaximaPermitida(int edadMaximaPermitida) {
        if(edadMaximaPermitida < 10) this.edadMaximaPermitida = 10;
        else this.edadMaximaPermitida = edadMaximaPermitida;
    }

    @Override
    public boolean espacioLibre() {
        if (getCapacidadMaxima() > 10) return false; //si no hay espacio libre
        else return true; // si hay espacio libre
    }

    @Override
    public String mostrarInfoZona() {
        return "A zona ten nome "+ getNombreZona()+ " con unha capacidade maxima de "+ getCapacidadMaxima()+ " e unha idade minima requerida de "+ edadMaximaPermitida ;
    }

    @Override
    public String menoresIdade() {
        return "A atraccion esta dirixida a xente menor de idade";
    }

    @Override
    public String descripcion() {
        return "Breve Descripcion";
    }
}
