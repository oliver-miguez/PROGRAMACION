/**
 * Clase padre del ejercicio
 * @author Oliver Miguez Alonso
 * @version  1.0
 */
public  abstract class Inmobiliaria {

    private  String rua;
    private int numero;
    private  String localidade;
    private int prezo;
    private boolean eAluguer; //verificar si es comprada o alugada

    public Inmobiliaria(String rua, int numero, String localidade, int prezo, boolean eAluguer){
        this.rua = rua;
        this.numero = numero;
        this.localidade = localidade;
        setPrezo(prezo);
        this.eAluguer = eAluguer;

    }//end constructor Inmobiliaria

    //GETTER Y SETTER

    public String getRua() {
        return rua;
    }//end getRua

    public void setRua(String rua) {
        this.rua = rua;
    }//end serRua



    public int getNumero() {
        return numero;
    }//end getNumero

    public void setNumero(int numero) {
        this.numero = Math.abs(numero); //devuelve siempre un número positivo
    }//end setNumero



    public String getLocalidade() {
        return localidade;
    }//end getLocalidades

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }//end serLocalidades



    public int getPrezo() {
        return prezo;
    }//end getPrezo

    public void setPrezo(int prezo) {
        this.prezo = Math.abs(prezo);
    }//end setPrezo



    public boolean iseAluguer() {
        return eAluguer;
    }//end get eAluguer

    public void seteAluguer(boolean eAluguer) {
        this.eAluguer = eAluguer;
    }//end seteAluguer


    //MÉTODOS

    /**
     * Devuelve el estado de la construcción
     * @return si esta en venta o se aluga
     */
    public String toString(){
        String estado;
        if (eAluguer) estado = "aluguer";
        else estado = "venta";

        String mensaxe =  "O inmoble da rúa "+ rua+ ","+ numero+ " ,"+ localidade+ " ten un prezo  de : "+ prezo;
        return mensaxe;

    }//end toString


    //METODO ABSTRACTO

    public abstract double calcularGanancia();

} //end class
