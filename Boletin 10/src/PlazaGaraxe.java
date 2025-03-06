/**
 * Verifica que unha praza de garaxe teña ou non Trasteiro e mostra a súa superfície
 * @author Oliver Miguez Alonso
 * @version 1.0
 */
public class PlazaGaraxe extends Inmobiliaria {

    //VARIABLES

    private double ancho;
    private double longo;
    private double numeroPraza;


    //CONSTRUCTOR

    public PlazaGaraxe(String direcion, int numero,String localidade, int prezo, boolean eAluguer, double ancho, double longo,  int numeroPraza){
        super(direcion,numero,localidade,prezo,eAluguer);
        setAncho(ancho);
        setLongo(longo);
        setNumeroPraza(numeroPraza);
    }//end Constructor


    //GETTERS SETTERS

    public double getAncho() {
        return ancho;
    }//end getAncho

    public void setAncho(double ancho) {
        this.ancho = Math.abs(ancho);
    }//end setAncho



    public double getLongo() {
        return longo;
    }//end getLongo

    public void setLongo(double longo) {
        this.longo = Math.abs(longo);
    }//end setLongo



    public double getNumeroPraza() {
        return numeroPraza;
    }//end set gerNumeroPraza

    public void setNumeroPraza(double numeroPraza) {
        this.numeroPraza = Math.abs(numeroPraza);
    }//end setNumeroPraza



    //METODO ABSTRACTO

    public double calcularGanancia() {
        if(iseAluguer()) return getPrezo(); //en caso de alugarse
        else return getPrezo() * 0.02 ; // en caso de venderse
    }//end calcularGanancia

}//end class
