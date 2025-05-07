import com.sun.tools.jconsole.JConsoleContext;

import java.util.*;

/**
 * Aprendiendo ArrayList
 * @author Oliver Miguez Alonso
 */
public class TratamentoDeClientes {
    public static void main(String[] args) {
        //De momento solo lo declaramos como collection y no como list
        Collection<Cliente> coleccionCliente;
        //creamos un arrayList(cabe calquera tipo de obxeto)
        coleccionCliente = new ArrayList<>();
        //Añade al array 3 nuevos clientes, ya que la lista solo permite añadir objetos formato "CLIENTE"
        //el add devuelve true si se añadió o se modificó el tamaño del array a la lista y falso si la lista se mantiene igual y no cambia es decir si no se añade
        coleccionCliente.add(new Cliente("00000000T","Oliver","03/06/2006"));
        coleccionCliente.add(new Cliente("12345678Y","Pepe","02/05/2005"));
        coleccionCliente.add(new Cliente("87654321R","Arturo","01/04/2004"));

        //creamos un nuevo cliente
        Cliente unCliente = new Cliente("77777777W","Jaime","06/11/2000");
        coleccionCliente.add(unCliente);//lo añadimos al arrayList

        //dispone de un toString
        System.out.println(coleccionCliente.toString());
        //Muestra el total de objetos que tiene la colección
        System.out.println(coleccionCliente.size());
        //Muestra si está o no vacía
        System.out.println(coleccionCliente.isEmpty());
        //Verifica si contiene un determinado elemento
        System.out.println(coleccionCliente.contains(unCliente));
        //elimina el cliente creado que fue añadido al arrayList
        //coleccionCliente.remove(unCliente);
        //elimina cualquier elemento que tenga el ArrayList
        //coleccionCliente.clear();
        //Referencia a cada elemento del array
        Object[]clientes = coleccionCliente.toArray();


        /*
        Es un objeto que permite ir señalando los objetos y nos permite desplazarnos por dentro del collection.
        Para ello disponemos de metodos coo hasNext() para verificar si existen aún objetos dentro del collection
        y next() para ir saltando de objeto en objeto
        Muestra los valores de los objetos del Collection
         */
        Iterator <Cliente> indice = coleccionCliente.iterator();
        //Diferentes métodos para desplazarse por el Collection
        for( ; indice.hasNext();){
            System.out.println(indice.next());//Muestra el cliente siempre que exista un objeto a continuación
        }//end for
        System.out.println("________");
        for (Cliente cli : coleccionCliente){//por cada elemento cliente de la colección de clientes extrae cada objeto
            System.out.println(cli);
        }//end for
/*
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
*/        System.out.println("________");

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

        //metodos de collections
        /*
        TODO
        lo trae mañana el profe
        System.out.println(coleccionCliente);
        Collections.sort(coleccionCliente, new ComparadorDni());
        */


    }//end main
}//end class
