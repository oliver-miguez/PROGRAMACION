public class ImplementacionCola extends Lista2 implements Cola{

    public ImplementacionCola(){
        super();
    }//end Constructor


    //añade a alguien al final de la cola
    @Override
    public void encolar(int nValor) {
        super.engadirUltimo(nValor);
    }//end encolar

    @Override
    public int desencolar() {
        int valor =  elementoN(0); //coge el primer valor de la lista
        quitarPrimero();
        return valor;
    }
}//end class
