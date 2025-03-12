public class PrazasGaraxe extends Inmoviliaria {
    //PROPIEDADES
    private int ancho;
    private int largo;
    private int numeroPlaza;

    //CONSTRUCTOR
    public PrazasGaraxe(String rua , int numero, String localidade, double prezo, String eAlugada, int ancho, int largo, int numeroPlaza){
        super(rua, numero, localidade, prezo, eAlugada);
        setLargo(largo);
        setAncho(ancho);
        setNumeroPlaza(numeroPlaza);
    }//end constructor

    //GETTERS Y SETTERS

    //Evitaremos tamaños negativos tanto como en el ancho como en el largo
    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        if(ancho < 0) this.ancho = 1;
        else this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        if(largo < 0) this.largo = 1;
        else this.largo = largo;    }

    //Evitaremos un número negativo también en el número total de plazas
    public int getNumeroPlaza() {
        return numeroPlaza;
    }

    public void setNumeroPlaza(int numeroPlaza) {
        if(numeroPlaza < 0 ) this.numeroPlaza = 0;
        else this.numeroPlaza = numeroPlaza;
    }

    //MÉTODOS ABSTRACTOS DE LA CLASE PADRE
    //String rua , int numero, String localidade, double prezo, String eAlugada, int ancho, int largo, int numeroPlaza

    @Override
    public String aCadea() {
        return "A praza de garaxe localizase na rua: "+ getRua()+" de numero :"+ getNumero()+ " na localidade de : "+ getLocalidade()+ " con un precio de :"+ getPrezo()+" ademais esta para : "+ iseAlugada()+ " con un ancho de "+ ancho+ " e un largo de "+ largo;
    }//end aCadea
}//end class
