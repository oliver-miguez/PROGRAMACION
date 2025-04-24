import java.util.ArrayList;
import java.util.Collection;

/**
 * Aprendiendo ArrayList
 * @author Oliver Miguez Alonso
 */
public class TratamentoDeClientes {
    public static void main(String[] args) {
        //De momento solo lo declaramos como collection y no como list
        Collection<Cliente> coleccionCliente;
        //creamos un arrayList
        coleccionCliente = new ArrayList<>();
        //Añade al array 3 nuevos clientes, ya que la lista solo permite añadir objetos formato "CLIENTE"
        //el add devuelve true si se añadió o se modifico el tamaño del array a la lista y falso si la lista se mantiene igual y no cambia es decir si no se añade
        coleccionCliente.add(new Cliente("00000000T","Oliver","3/06/2006"));
        coleccionCliente.add(new Cliente("12345678Y","Pepe","2/05/2005"));
        coleccionCliente.add(new Cliente("87654321R","Arturo","1/04/2004"));

        //creamos un nuevo cliente
        Cliente unCliente = new Cliente("77777777W","Jaime","6/11/2000");
        coleccionCliente.add(unCliente);//lo añadimos al arrayList

        //elimina el cliente creado que fué añadido al arrayList
        coleccionCliente.remove(unCliente);
        //elimina cualquier elemento que tenga el ArrayList
        coleccionCliente.clear();
    }
}//end class
