public class MontañaRusa implements  Atraccion{
    private int alturaMin;
    private int velozMax;

    public MontañaRusa(int alturaMin, int velozMax){
        setAlturaMin(alturaMin);
        setVelozMax(velozMax);
    }

    public int getAlturaMin() {
        return alturaMin;
    }

    public void setAlturaMin(int alturaMin) {
        if(alturaMin<100) this.alturaMin = 100;
        else this.alturaMin = alturaMin;
    }

    public int getVelozMax() {
        return velozMax;
    }

    public void setVelozMax(int velozMax) {
        if(velozMax <= 0) this.velozMax = 10;
        else this.velozMax = velozMax;
    }

    @Override
    public String deterAtraccion() {
        return "";
    }

    @Override
    public String iniciarAtraccion() {
        return "";
    }

    @Override
    public String mostrarEstado() {
        return "";
    }
}
