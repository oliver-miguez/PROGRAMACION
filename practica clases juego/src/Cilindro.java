public class Cilindro extends Circulo{


    private double altura;

    //CONSTRUCTOR
    public Cilindro(double x, double y, double r,double h) {
        super(x, y, r);
        setAltura(h);
    }//end cilindro


    public double getAltura() {
        return altura;
    }//end get

    public void setAltura(double h) {
        if( h < 0 ) altura = 0; // si el valor de h es negativo lo transforma a 0 en caso contrario lo deja en positivo
        else  altura = h;
    }//End set

    /**
     * Calcula el volumen del cilindro
     * @return el volumen
     */
    public double volumenCilindro(){
        return calculoArea() * altura;
    }//end cilindro


    public double calculoSuperficie(){
        return 2 * super.calculoArea() + super.calculoPerimetro() * altura;

    }//end calculoArea

    public String toString(){

    }//end toString

}//end class
