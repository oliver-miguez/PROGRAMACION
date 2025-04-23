public class Lista {
    private Nodo nodoInicial;
    private int tamaño;

    public Lista(){
        nodoInicial= null;
        tamaño = 1;
    }

    public Lista(Nodo nodoInicial, int tamaño){
        setNodoInicial(nodoInicial);
        setTamaño(tamaño);
    }

    public Nodo getNodoInicial() {
        return nodoInicial;
    }

    public void setNodoInicial(Nodo nodoInicial) {
        this.nodoInicial = nodoInicial;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    /**
     * Comprueba si la lista tiene algun dato dentro de ella
     * @return true or false
     */
    public boolean estaValeira(){
        if(nodoInicial == null){
            System.out.println("Esta valeira");
            return true;
        }
        else{
            System.out.println("Ta chea");
            return false;
        }
    }

    public void engadirultimo(int nValor){
        
    }



}
