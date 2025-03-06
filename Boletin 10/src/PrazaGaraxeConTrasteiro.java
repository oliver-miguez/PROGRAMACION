public class PrazaGaraxeConTrasteiro extends PlazaGaraxe{

    //VARIABLES

    private double superficie;


    //CONSTRUCTOR

    public PrazaGaraxeConTrasteiro(String direcion, int numero,String localidade, int prezo, boolean eAluguer, double ancho, double longo,  int numeroPraza, double superficie){
        super(direcion, numero, localidade, prezo, eAluguer, ancho, longo, numeroPraza);
        this.superficie = superficie;
    }//end constructor


    //GETTERS Y SETTERS

    public double getSuperficie() {
        return superficie;
    }//end getSuperficie

    public void setSuperficie(double superficie) {
        this.superficie = Math.abs(superficie);
    }//end setSuperficie


}//end class
