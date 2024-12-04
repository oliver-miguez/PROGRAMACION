/**
 * Añade valores a un array individual
 */
public class algoritmo_insercion {
    public static void main(String[] args) {

        int[]pila;
        int cabeza = -1;
        pila = new int[5];

        //añade los siguientes valores
        cabeza = apilar(pila,cabeza,5);
        cabeza = apilar(pila,cabeza,6);
        cabeza = apilar(pila,cabeza,10);
        cabeza = apilar(pila,cabeza,15);
        cabeza = apilar(pila,cabeza,20);
        cabeza = apilar(pila,cabeza,30); // este valor no te lo muestra porque sino el array pila desbordaría y daria error

        //muestra los anteriores valores introducidos
        mostrarPila(pila,cabeza);

        //elimina 3 valores de los anteriores del array
        cabeza = desapilar(pila, cabeza);
        cabeza = desapilar(pila, cabeza);
        cabeza = desapilar(pila, cabeza);

        mostrarPila(pila,cabeza);

        //introduce nuevos valores
        cabeza = apilar(pila,cabeza,9);
        cabeza = apilar(pila,cabeza,13);

        mostrarPila(pila,cabeza);

        //si los quita todos de la pila
        cabeza = desapilar(pila, cabeza);
        cabeza = desapilar(pila, cabeza);
        cabeza = desapilar(pila, cabeza);
        cabeza = desapilar(pila, cabeza);

        //la pila muestra que está vacía
        mostrarPila(pila,cabeza);

        //vuelve a añadir valores para comprobar que se añaden bien
        cabeza = apilar(pila,cabeza,9);
        cabeza = apilar(pila,cabeza,13);

        mostrarPila(pila,cabeza);



    }//end main
    public static int apilar(int[]pila, int cab,int num){
        if(cab  < pila.length -1){
            pila[cab+1]= num;
            cab ++;
            System.out.println("numero "+ num+ " apilado");
        }//end if
        else{
            System.out.println("A pila desbordou , numero de valores superado, solo se admiten 5 valores");
        }
        return cab;
    }//end apilar

    /**
     * Muestra los valores de la pila
     */
    static void mostrarPila(int[]pila, int cab){
        if(cab >= 0){
            //(int i = cab ; i >= 0 ; i--) Para mostrar los valores de la tabla al revés
            for (int i = 0; i <= cab ; i++){
                System.out.println("o numero da pila e : "+ pila[i]);
            }//end for
        }//end if
        else{
            System.out.println("Pila baleira");
        }//end else
    } // end mostrarPila

    /**
     * Permite añadir un nuevo valor al array y menciona si la tabla esta o no sobrecargada
     */
    static int desapilar(int[]pila,int cab){

        if(cab >= 0){
            System.out.println("o valor despilado e : "+ pila[cab]);
            cab--;
        }//end if
        else{
            System.out.println("A pila esta baleira");
        }//end else
        return cab;
    }//end desapilar



}//end class
