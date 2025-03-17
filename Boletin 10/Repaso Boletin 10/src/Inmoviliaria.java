/**
 * Clase padre abstracta
 */
public abstract class Inmoviliaria {
    //PROPIEDADES
    private String rua;
    private int numero;
    private String localidade;
    private double prezo;
    private String eAlugada; //verificar si e comprada ou alugada

    //CONSTRUCTOR
    public Inmoviliaria(String rua , int numero, String localidade, double prezo, String eAlugada){
        setRua(rua);
        setNumero(numero);
        setLocalidade(localidade);
        setPrezo(prezo);
        seteAlugada(eAlugada);
    }//end constructor

    //GETTERS Y SETTERS

    public String getRua() {
        return rua;
    }//end getRua

    public void setRua(String rua) {
        this.rua = rua;
    }//end setRua

    //Suponemos que el numero no puede ser negativo
    public int getNumero() {
        return numero;
    }//end getNumero

    public void setNumero(int numero) {
        if(numero < 0) this.numero = Math.abs(numero); //convierte en positivo el número
        else this.numero = numero;
    }//end setNumero


    public String getLocalidade() {
        return localidade;
    }//end getLocalidade

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }//end setLocalidade

    //Supongamos un precio mínimo de 100€
    public double getPrezo() {
        return prezo;
    }//end getPrezo

    public void setPrezo(double prezo) {
        if(prezo < 100) this.prezo = 100;
        else this.prezo = prezo;
    }//end setPrezo

    //Verifica si la casa se compro o esta  en alquiler
    public String iseAlugada() {
        return eAlugada;
    }//end geteAlugada

    public void seteAlugada(String eAlugada) {
        if(eAlugada .equals("alugada")) this.eAlugada = "alugada ";
        else this.eAlugada = "comprada";
    }//end seteAlugada

    //MÉTODOS ABSTRACTOS

    //permite visualizar todos los datos introducidos llamando a este método
    public abstract String aCadea();

}//end class
