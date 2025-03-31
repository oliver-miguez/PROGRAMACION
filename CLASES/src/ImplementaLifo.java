public class ImplementaLifo  extends Lista2 implements Lifo{

    public ImplementaLifo(){
        super();
    }


    public void apilar( int novoNum) {
        engadirUltimo(novoNum);
    }


    @Override
    public void apilar() {

    }

    public int desapilar() {
        //Coge el ultimo elemento de la lista
       int valor =  elementoN(getTamaño()-1);  //Por ejeemplo si queremos desapilar el indice 3, si tenemos una lista con tres elemento elemento(0) elemento(1) elemento(2) a 3 tenemos que eliminarle 1 para que coja el valor 2
        //lo desapila borrandolo
        quitarUltimo();
        return valor;
    }
}
