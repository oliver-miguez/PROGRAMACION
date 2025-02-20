
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
        this.numElementos = 0;
    }

    // OBTENER NÚMERO DE ELEMENTOS
    public int obterNumeroDeElementos() {
        return numElementos; //Devuelve el número de elementos de la lista (tamaño del array)
    }//end obterNumeroDeElementos

    // INSERTAR NÚMERO AL FINAL DE LA LISTA
    public void insertarNumeroFinal(int numero) {
        int[] nuevaTaboa = new int[numElementos + 1]; //crea una nueva tabla con un elemento más que la original
        System.arraycopy(taboa, 0, nuevaTaboa, 0, numElementos); //crea un nuevo array a partir de otro array copiando los elementos de uno a otro
        nuevaTaboa[numElementos] = numero;
        taboa = nuevaTaboa;
        numElementos++;
    }

    // INSERTAR NÚMERO AL PRINCIPIO DE LA LISTA
    public void insertarNumeroPrincipio(int numero) {
        int[] nuevaTaboa = new int[numElementos + 1];
        System.arraycopy(taboa, 0, nuevaTaboa, 1, numElementos);
        nuevaTaboa[0] = numero;
        taboa = nuevaTaboa;
        numElementos++;
    }

    // INSERTAR NÚMERO EN UN ÍNDICE ESPECÍFICO
    public void insertarNumeroEnIndice(int indice, int numero) {
        if (indice < 0 || indice > numElementos) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        int[] nuevaTaboa = new int[numElementos + 1];
        System.arraycopy(taboa, 0, nuevaTaboa, 0, indice);
        nuevaTaboa[indice] = numero;
        System.arraycopy(taboa, indice, nuevaTaboa, indice + 1, numElementos - indice);
        taboa = nuevaTaboa;
        numElementos++;
    }

    // OBTENER ELEMENTO POR ÍNDICE
    public int obterElementoPorIndice(int indice) {
        if (indice < 0 || indice >= numElementos) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        return taboa[indice];
    }

    // BUSCAR NÚMERO EN LA LISTA
    public int buscarNumero(int numero) {
        for (int i = 0; i < numElementos; i++) {
            if (taboa[i] == numero) {
                return i;
            }
        }
        return -1;
    }

    // MOSTRAR ELEMENTOS DE LA LISTA
    public void mostrarElementos() {
        for (int i = 0; i < numElementos; i++) {
            System.out.print(taboa[i] + " ");
        }
        System.out.println();
    }
}