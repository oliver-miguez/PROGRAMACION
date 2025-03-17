public class Lista2 {
    private Nodo nodoInicial;
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
    public Lista2(Nodo nodoInicial){
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
        Nodo novoNode = new Nodo(nValor, null); //añadimos un nuevo valor al nodo
        if(estaValeira()){ //entonces como la lista está vacía el nodo inicial será el nuevo nodo e aumentará el tamaño de null a 1
            nodoInicial = novoNode;
            tamaño++;
        }//end if
        else{
           Nodo nodoActual = nodoInicial;
           while (nodoActual.getnodoSeguinte() != null){ //recorre la lista hasta llegar al ultimo valor
               nodoActual = nodoActual.getnodoSeguinte(); //añade un valor como ultimo
           }//end while

            nodoActual.setNodoSeguinte(novoNode);
           tamaño++;


        }//end else

    }//end engadirUltimo

    /**
     * Engade un nodo ao principio da lista
     */
    public void engadirPrimeiro(int nValor){
        Nodo newNode = new Nodo(nValor, nodoInicial); //Nodo inicial es el valor que tenemos almacenado en el constructor
        nodoInicial = newNode; //transformamos el primero nodo el el nuevo nodo
        tamaño++; //aumentamos el tamaño para hacer consistente la lista

    }//end engadir Primeiro

    public void quitarPrimero(){
        if(!estaValeira()) {
            nodoInicial = nodoInicial.getnodoSeguinte();
            tamaño--;
        }//end if estaValeira

    }// end quitarPrimero

    public void quitarUltimo(){
        if(!estaValeira()){
            Nodo nodoAnterior = null;

            if(tamaño != 1){
                Nodo nodoActual = nodoInicial;
                while(nodoActual.getnodoSeguinte()!= null){ //verifica que ningun valor de la lista sea null mientras se recorra , cuando sea null se sabe que el anterior es el ultimo
                    nodoAnterior = nodoActual;//almacena la referencia actual
                    nodoActual = nodoActual.getnodoSeguinte(); //transforma el valor actual en el siguiente recorre toda la lista (recorre la lista)
                }//end while
                nodoAnterior.setNodoSeguinte(null); //transforma el ultimo valor en null
            }//end if
            else{
                nodoInicial = null; //porque eliminamos todos los valores que tendria
            }//end else

            tamaño--;
        }//end if
    }//end quitar ultimo


    public void mostrarValores(){
        if(!estaValeira()){
            if (tamaño != 1){
                Nodo nodoActual = nodoInicial;
                while(nodoActual.getnodoSeguinte() != null){ //permite mostrar todos los datos menos el ultimo que no lo detecta
                    System.out.println(nodoActual.getValor());
                    nodoActual = nodoActual.getnodoSeguinte();
                }//end while
                System.out.println(nodoActual.getValor()); //muestra el ultimo nodo
            }//end if
            else{
                System.out.println(nodoInicial.getValor());
            }//end else
        }//end if
    }//end mostrarValores


}//end Lista2

