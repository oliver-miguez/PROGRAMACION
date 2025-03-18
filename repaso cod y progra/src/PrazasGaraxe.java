public class PrazasGaraxe extends Inmoviliaria {
    //PROPIEDADES
    private String vendeseOuAlugase;
    private int ancho;
    private int largo;
    private int numPlaza;
    private double prezo;

    public PrazasGaraxe(String rua, int numero, String localidade, String vendeseOuAlugase, int ancho, int largo, int numPlaza, double prezo){
        super(rua, numero, localidade);
        setVendeseOuAlugase(vendeseOuAlugase);
        setAncho(ancho);
        setLargo(largo);
        setNumPlaza(numPlaza);
        setPrezo(prezo);
    }


    public String getVendeseOuAlugase() {
        return vendeseOuAlugase;
    }

    public void setVendeseOuAlugase(String vendeseOuAlugase) {
        if (vendeseOuAlugase == "vendese") this.vendeseOuAlugase = "vendese";
        else if (vendeseOuAlugase == "alugase") this.vendeseOuAlugase = "alugase";
        else this.vendeseOuAlugase ="vendese ou alugase ? ";
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        if(ancho < 0 ) this.ancho = 1;
        else this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        if(largo < 0 ) this.largo = 1;
        else this.largo = largo;
    }

    public int getNumPlaza() {
        return numPlaza;
    }

    public void setNumPlaza(int numPlaza) {
        this.numPlaza = numPlaza;
    }

    public double getPrezo() {
        return prezo;
    }

    public void setPrezo(double prezo) {
        if (prezo < 100.0) this.prezo = 100.0;
        else this.prezo = prezo;
    }


    @Override
    public String aCadea() {
        return "Texto el cual devolveria todo";
    }

    @Override
    public double importeGanancias() {
        if(vendeseOuAlugase == "vendese"){
            return prezo*0.3;
        } else if (vendeseOuAlugase == "alugase") {
            return prezo;
        }else{
            return 0.0;
        }

    }
}//end class
