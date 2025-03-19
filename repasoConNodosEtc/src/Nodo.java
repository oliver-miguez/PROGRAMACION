public class Nodo {
    private int valor;
    private Nodo nodoSiguiente;

    public Nodo(int valor, Nodo nodoSiguiente){
        setValor(valor);
        setNodoSiguiente(nodoSiguiente);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getNodoSiguiente() {
        return nodoSiguiente;
    }

    public void setNodoSiguiente(Nodo nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }
}
