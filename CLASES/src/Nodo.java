public class Nodo {
    private int  valor ;
    private Nodo nodoSeguinte;

    public Nodo(int valor, Nodo nodoSeguinte){
        setValor(valor);
        setNodoSeguinte(nodoSeguinte);

    }//end Lista2

    //GETTERS Y SETTERS
    public int getValor(){
        return valor;
    }
    public void setValor(int valor){
        this.valor = valor;
    }

    public Nodo  getnodoSeguinte(){
        return nodoSeguinte;
    }
    public void setNodoSeguinte(Nodo nodoSeguinte){
        this.nodoSeguinte = nodoSeguinte;
    }



}//end class
