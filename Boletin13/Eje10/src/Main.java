import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

/**
 * Crear unha aplicación para xestionar as existencias dunha tenda de repostos de automóbiles.
 * Cada produto identifícase por un código alfanumérico. A aplicación permitirá:
 * Dar de alta produtos.
 * Dar de baixa produtos.
 * Actualizar a cantidade de produtos.
 * Visualizar produtos e cantidades.
 * Os datos se manterán nun ficheiro, que se actualizará o pechar o programa.
 */
public class Main {
    /**
     * Maneja el menu de opciones y almacena todos los productos que se quieren registrar
     * @param args no usamos
     */
    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int op = 0;
        do {
            System.out.println("1.Dar de alta productos");
            System.out.println("2.Dar de baixa productos");
            System.out.println("3. Actualizar cantidade de producto");
            System.out.println("4.visualizar productos y cantidades");
            System.out.println("5.Cerrar programa");
            op = sc.nextInt();

            switch (op){
                case 1 -> altaProductos(productos);
                case 2 -> baixaProductos(productos);
                case 3 -> actualizar(productos);
                case 4 -> System.out.println(productos);
                case 5 ->{
                    guardarProductos(productos);
                    System.out.println("Cerrando");
                    //cargarProductos(productos);
                }
                default -> System.out.println("Opcion no valida");
            }//end switch

        }while(op != 5);
    }//end main

    /**
     * Permite dar de alta productos
     * @param productos arrayList que recoge todos los productos
     */
    static List<Producto> altaProductos(List<Producto> productos){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre del producto: ");
        String nombre = sc.nextLine();
        System.out.println("Codigo producto: ");
        String codigo = sc.nextLine();
        System.out.println("Cantidad: ");
        int cantidad = sc.nextInt();

        Producto producto = new Producto(codigo,nombre,cantidad);
        productos.add(producto);
        return productos;

    }//end altaProductos

    /**
     * Da de baja a los productos de la lista en base al codigo
     * @param productos arrayList
     */
    static void baixaProductos(List<Producto> productos){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el codigo del producto a eliminar:");
        String codigos = sc.nextLine();
        //quita de la lista productos aquellos objetos de tipo producto(la clase producto si el codigo introducido es el mismo que el del producto registrado
        productos.removeIf(producto -> producto.getCodigoProducto().equals(codigos));

    }//baixaProducto

    /**
     * Actualiza los datos de algún producto añadido a la lista
     * @param productos arrayList
     */
    static void actualizar(List<Producto> productos){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el codigo del producto a modificar");
        String codigo = sc.nextLine();
        System.out.println("Introduce un nuevo nombre al producto");
        String nuevoNombre = sc.nextLine();
        System.out.println("Introduce un nuevo codigo al producto");
        String nuevoCodigo = sc.nextLine();
        System.out.println("Introduce una nueva cantidad de producto");
        String nuevaCantidad = sc.nextLine();

        for (Producto producto : productos){
            if (producto.getCodigoProducto().equals(codigo)){
                producto.setCodigoProducto(nuevoCodigo);
                producto.setNomeProducto(nuevoNombre);
                producto.setCodigoProducto(nuevoCodigo);
            }//end if
        }//end for

    }//end actualizar

    /**
     * Guarda los productos en un archivo
     * @param productos arrayList
     */
    static void guardarProductos(List<Producto> productos){
        ObjectOutputStream fluxoSaida = null;
        try {
            fluxoSaida = new ObjectOutputStream(new FileOutputStream("productos.dat"));
        }catch (IOException e){
            System.out.println("erro de entrada/saida"+ e.getMessage());
        }finally {
            try {
                fluxoSaida.close();
            }catch (IOException e){
                System.out.println("erro:"+e.getMessage());
            }
        }
    }//end guardarProductos

    /**
     * Muestra los datos del archivo
     * @param productos arrayList
     */
    static void cargarProductos(List<Producto>productos){
        ObjectInputStream fluxoEntrada = null;
        try {
            fluxoEntrada = new ObjectInputStream(new FileInputStream("productos.dat"));
                Producto producto = (Producto) fluxoEntrada.readObject();
            // Mostrar productos en pantalla
            System.out.println("Lista de productos guardados:");
            for (Producto producto1 : productos) {
                System.out.println(producto1);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }//end cargarProductos


}//end class