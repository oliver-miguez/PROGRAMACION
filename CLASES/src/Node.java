public class Node {
    private int  valor ;
    private Node nodoSeguinte;

    public Node(int valor, Node nodoSeguinte){
        setValor(valor);
        nodoSeguinte(nodoSeguinte);

    }//end Lista2

    //GETTERS Y SETTERS
    public int getValor(){
        return valor;
    }
    public void setValor(int valor){
        this.valor = valor;
    }

    public Node  getnodoSeguinte(){
        return nodoSeguinte;
    }
    public void nodoSeguinte(Node nodoSeguinte){
        this.nodoSeguinte = nodoSeguinte;
    }



}//end class
