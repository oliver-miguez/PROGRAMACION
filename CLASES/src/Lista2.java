public class Lista2 {
    private Node nodoInicial;
    private int tamaño;

    /*
    A partir de un nodo vacío
     */
    public Lista2(){
        this.nodoInicial = null; //inicializamos el nodo inicial a null
        tamaño = 0; //inicializamos el tamaño a 0
    }//end Lista2

    /*
    *A partir de un nodo inicial
     */
    public Lista2(Node nodoInicial){
        this.nodoInicial = nodoInicial;
        tamaño = 1;
    }//end Lista2

    //MÉTODOS
    public int getTamaño(){
        return tamaño;
    }

    /**
     * Verifica si la lista está valeira ou non
     * @return valeira ou non
     */
    public boolean estaValeira(){
        if (nodoInicial == null){
            System.out.println("A lista está valeira");
            return true;
        }//end if
        else{
            System.out.println("A lista non está valeira");
            return false;
        }//end else
    }//end estaValeira


    /**
     * Engade un nodo ao final da lista
     */
    public void engadirUltimo(int nValor){
        Node novoNode = new Node(nValor, null); //añadimos un nuevo valor al nodo
        if(estaValeira()==true){ //entonces como la lista está vacía el nodo inicial será el nuevo nodo e aumentará el tamaño de null a 1
            nodoInicial = novoNode;
            tamaño++;
        }//end if
        else{
           Node nodoActual = nodoInicial;
           while (nodoActual.getnodoSeguinte() != null){
               nodoActual = nodoActual.getnodoSeguinte();
           }//end while

            nodoActual.setNodoSeguinte(novoNode);
           tamaño++;


        }//end else

    }//end engadirUltimo

    /**
     * Engade un nodo ao principio da lista
     */
    public void engadirPrimeiron(){

    }//end engadirPrimeiro

    /**
     * Muestra la lista
     */
    public void listar(){
    }//end listar

    /**
     * Obtiene el valor del último nodo
     */
    public  void obterUltimo(){

    }

    /**
     * Obtiene en valor del primero nodo
     */
    public void obterPrimeiro(){

    }


}//end Lista2

