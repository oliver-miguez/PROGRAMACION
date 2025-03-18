/**
 * Clase Padre
 * @author Oliver Miguez Alonso
 */
public abstract class Inmoviliaria {

    //PROPIEDADES
    private String rua;
    private int numero;
    private String localidade;

    //CONSTRUCTOR
    public Inmoviliaria( String rua, int numero, String localidade){
        setRua(rua);
        setNumero(numero);
        setLocalidade(localidade);
    }//end constructor

    //GETTERS Y SETTERS

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if(numero < 0 ) this.numero = 1;
        else  this.numero = numero;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }


    //MéTODOS
    public abstract String aCadea();
    public abstract double importeGanancias();

}//end class
