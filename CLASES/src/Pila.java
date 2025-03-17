public class Pila extends Lista2 implements Cola{

    public Pila(){
        super();
    }//end Constructor


    //añade a alguien al final de la cola
    @Override
    public void encolar(int nValor) {
        super.engadirUltimo(nValor);
    }//end encolar

    @Override
    public int desencolar() {

    }
}//end class
