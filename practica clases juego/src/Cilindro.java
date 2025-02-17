public class Cilindro extends Circulo{


    private double altura;

    //CONSTRUCTOR
    public Cilindro(double x, double y, double r,double h) {
        super(x, y, r);
        altura = h;
    }//end cilindro


    public double getAltura() {
        return altura;
    }//end get

    public void setAltura(double altura) {
        this.altura = altura;
    }//End set

    /**
     * Calcula el volumen del cilindro
     * @return el volumen
     */
    public double volumenCilindro(){
        double volumen = calculoArea() * altura;
        return volumen;
    }//end cilindro
}//end class
