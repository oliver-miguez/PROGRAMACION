import com.sun.tools.jconsole.JConsoleContext;

import java.util.*;

/**
 * Aprendiendo ArrayList
 * @author Oliver Miguez Alonso
 */
public class TratamentoDeClientes {
    public static void main(String[] args) {
        List<Cliente> coleccionCliente; //De momento solo lo declaramos como collection y no como list
        coleccionCliente = new ArrayList<>();//creamos un arrayList(cabe calquera tipo de obxeto)

        //Añade al array 3 nuevos clientes, ya que la lista solo permite añadir objetos formato "CLIENTE"
        //el add devuelve true si se añadió o se modificó el tamaño del array a la lista y falso si la lista se mantiene igual y no cambia es decir si no se añade
        coleccionCliente.add(new Cliente("00000000T","Oliver","03/06/2006"));
        coleccionCliente.add(new Cliente("12345678Y","Pepe","02/05/2005"));
        coleccionCliente.add(new Cliente("87654321R","Arturo","01/04/2004"));

        Cliente unCliente = new Cliente("77777777W","Jaime","06/11/2000");//creamos un nuevo cliente
        coleccionCliente.add(unCliente);//lo añadimos al arrayList

        System.out.println("::::::::");

        System.out.println("Variedad De Metodos: ");
        System.out.println(coleccionCliente.toString());//dispone de un toString
        System.out.println(coleccionCliente.size());//Muestra el total de objetos que tiene la colección
        System.out.println(coleccionCliente.isEmpty());//Muestra si está o no vacía
        System.out.println(coleccionCliente.contains(unCliente));//Verifica si contiene un determinado elemento
        //coleccionCliente.remove(unCliente);//elimina el cliente creado que fue añadido al arrayList
        //coleccionCliente.clear();//elimina cualquier elemento que tenga el ArrayList
        Object[]clientes = coleccionCliente.toArray(); //Referencia a cada elemento del array

        System.out.println("::::::::");

        System.out.println("Utilización del sort:");

        Collections.sort(coleccionCliente); //A traves de la clase collections me permite ordenar la lista
        Collections.sort(coleccionCliente, new ComparadorDni()); // Ahora está ordenada por DNI
        int indics = Collections.binarySearch(coleccionCliente,new Cliente("00000000T",null,"01/01/1999"),new ComparadorDni()); //comprueba si el nuevo dni que creamos existe en la lista coleccionCliente
        System.out.println("Inidice del objeto de la lista con mismo dni que el introducido:"+indics);//muestra el índice en el que se encuentra un objeto con el mismo dni

        System.out.println("::::::::");

        System.out.println("Swag y ReplaceAll:");
        Collections.swap(coleccionCliente,0,3); //cambia en la lista la posición 0 con la posición 3
        System.out.println(coleccionCliente);
        Collections.replaceAll(coleccionCliente,coleccionCliente.get(0),new Cliente("010101T","Oliver.M.A","03/06/2006"));//sustituye el la posición 0 todos los datos antiguos por este nuevo cliente
        System.out.println(coleccionCliente);

        System.out.println("::::::::");

        System.out.println("Fill: ");
        Collections.fill(coleccionCliente,new Cliente("11111R","Fernando","01/07/2080"));//cambia todos los valores de la lista por el valor del nuevo cliente
        System.out.println(coleccionCliente);

        System.out.println("::::::::");

        System.out.println("Copia de Listas:");
        List<Cliente>outraLista = new ArrayList<>();
        outraLista.add(new Cliente("43214321R","Paquiño","03/06/2006"));
        Collections.copy(coleccionCliente,outraLista);//copia en outraLista en coleccionCliente
        System.out.println("Lista copiada:"+coleccionCliente);

        System.out.println("::::::::");


        /*
        Es un objeto que permite ir señalando los objetos y nos permite desplazarnos por dentro del collection.
        Para ello disponemos de metodos coo hasNext() para verificar si existen aún objetos dentro del collection
        y next() para ir saltando de objeto en objeto
        Muestra los valores de los objetos del Collection
         */
        System.out.println("Iterator: ");
        Iterator <Cliente> indice = coleccionCliente.iterator();
        //Diferentes métodos para desplazarse por el Collection
        for( ; indice.hasNext();){
            System.out.println(indice.next());//Muestra el cliente siempre que exista un objeto a continuación
        }//end for
        System.out.println("________");
        for (Cliente cli : coleccionCliente){//por cada elemento cliente de la colección de clientes extrae cada objeto
            System.out.println(cli);
        }//end for

        System.out.println("::::::::");

        /*
        2ºOtra forma de hacer Iterator
        System.out.println("_");
        for(Cliente cli : coleccionCliente){
            System.out.println(cli);
            if(cli.dni.equals("00000000T") )coleccionCliente.remove(cli);
        }
        System.out.println(coleccionCliente.toString());

        for(;indice.hasNext();){
            Cliente cli = indice.next();
            System.out.println();
            if(cli.dni.equals("12345678Y")) indice.remove();
        }
        System.out.println(coleccionCliente.toString());
        */
        System.out.println("::::::::");

        System.out.println("TreeSet,ArrayList y algunos metodos");
        Collection<Cliente>outrosClientes = new ArrayList<>();
        outrosClientes.add(new Cliente("1111110T","Paco","03/06/2006"));
        outrosClientes.add(new Cliente("22222222Y","Carlos","02/05/2005"));
        outrosClientes.add(new Cliente("333333333R","Berta","01/04/2004"));
        coleccionCliente.addAll(outrosClientes);
        System.out.println(coleccionCliente.toString());
        System.out.println(coleccionCliente.containsAll(outrosClientes));
        System.out.println(coleccionCliente.toString());
        coleccionCliente.retainAll(outrosClientes);
        System.out.println(coleccionCliente.containsAll(outrosClientes));
        System.out.println(coleccionCliente.containsAll(outrosClientes));
        System.out.println("________");

        //No da opciones de mostrar objetos repetidos
        TreeSet<Cliente> conxuntoClientes = new TreeSet<>();
        conxuntoClientes.add(new Cliente("1111110T","Paco","03/06/2006"));
        conxuntoClientes.add(new Cliente("22222222Y","Carlos","02/05/2005"));
        conxuntoClientes.add(new Cliente("333333333R","Berta","01/04/2004"));
        conxuntoClientes.add(unCliente);
        System.out.println(conxuntoClientes);
        System.out.println(conxuntoClientes.add(unCliente));//no muestra dos veces a "unCliente", solo lo muestra una vez

        System.out.println("::::::::");



    }//end main
}//end class
