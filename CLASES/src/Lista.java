
/*
-Construcotr con taboa con 0 elementos
-obter numero de elementos
-insertar numero o final da lista
-insertar numero o principio da lista
-insertar numero en lugar da lista  especificado por un indice
-obter un elemento especificado por un indice
buscar un numero na lista devoltando o indice do primeiro luganr onde se encontre
-devvoltara -1 si non o encontra
-mostra elementos da lista por consola
 */
public class Lista {

    // VARIABLES
    private int[] taboa;
    private int numElementos;

    // CONSTRUCTOR
    public Lista() {
        this.taboa = new int[0]; //Inicializa el array a 0 elementos
    }

    // OBTENER NÚMERO DE ELEMENTOS
    public int numeroDeElementos() {
        return taboa.length;
    }//end obterNumeroDeElementos




    // INSERTAR NÚMERO AL FINAL DE LA LISTA
    public void insertarNumeroFinal(int numero) {
        int[] nuevaTaboa = new int[numElementos + 1];
        System.arraycopy(taboa, 0, nuevaTaboa, 0, taboa.length); //crea un nuevo array a partir de otro array copiando los elementos de uno a otro

        /*lista = Arrays.copyOf(lista, lista.length + 1); //Otra forma de hacerlo*/
        //lista = Arrays.copyOf(lista, numElementos + 1); //Otra forma de hacerlo

        taboa [taboa.length] = numero;
    }//end insertarNumeroFinal




    public int retirarElemento(){
        if (taboa.length == 0) return -1;
        else{
            int[] nuevaTaboa = new int[numElementos - 1];
            System.arraycopy(taboa, 0, nuevaTaboa, 0, taboa.length - 1);
            return taboa[taboa.length - 1];

        }//end else
    } //end retirarElemento

}