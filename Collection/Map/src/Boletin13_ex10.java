import java.awt.*; // Importa el paquete AWT (no se está usando en el código actual)
import java.io.*; // Importa clases para la gestión de archivos y serialización
import java.util.Map; // Importa la interfaz Map para la estructura de datos clave-valor
import java.util.Scanner; // Importa Scanner para entrada de datos desde la consola
import java.util.Set; // Importa Set para trabajar con conjuntos de datos únicos
import java.util.TreeMap; // Importa TreeMap, un mapa ordenado por clave

//Todo Hacer con arrayLis

/*
 * Clase que gestiona productos con referencias y cantidades.
 * Utiliza archivos para almacenar los datos mediante serialización.
 * @author Dima Aparicio
 */
public class Boletin13_ex10 {
    Map<String, Integer> existencias; // Declara un mapa donde la clave es la referencia y el valor es la cantidad
    String fichero; // Nombre del archivo donde se guardan los datos

    // Constructor que inicializa el fichero y carga los datos desde el archivo
    public Boletin13_ex10(String fichero) {
        this.fichero = fichero; // Guarda el nombre del fichero en la variable de instancia
        this.existencias = cargarCollection(); // Carga los datos desde el archivo
    }

    /**
     * Método que carga un mapa desde un archivo.
     * Se usa cuando el archivo contiene un Map serializado.
     */
    public Map<String, Integer> cargarMapa() {
        Map<String, Integer> ex = new TreeMap<>(); // Inicializa un nuevo TreeMap vacío
        ObjectInputStream fEntrada = null; // Declara la variable para lectura del archivo

        try {
            fEntrada = new ObjectInputStream(new FileInputStream(fichero)); // Abre el archivo para lectura
            ex = (Map<String, Integer>) fEntrada.readObject(); // Lee el objeto y lo convierte en Map<String, Integer>
        } catch (FileNotFoundException e) {
            System.out.println("Error: archivo no encontrado " + e); // Captura error si el archivo no existe
            ex = new TreeMap<>(); // Asigna un mapa vacío para evitar errores
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error de lectura del objeto " + e); // Captura errores de lectura y conversión de objeto
        } finally {
            try {
                if (fEntrada != null) {
                    fEntrada.close(); // Cierra el flujo de entrada si se abrió correctamente
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el flujo " + e); // Manejo de error al cerrar el flujo
            }
        }
        return ex; // Devuelve el mapa cargado desde el archivo
    }

    /**
     * Método que carga los objetos `Peza` desde un archivo y los convierte en un Map.
     * Se usa un bucle `while` para leer cada objeto hasta el final del archivo.
     */
    public Map<String, Integer> cargarCollection() {
        Map<String, Integer> ex = new TreeMap<>(); // Inicializa el mapa
        ObjectInputStream fEntrada = null; // Declara la variable para lectura del archivo

        try {
            fEntrada = new ObjectInputStream(new FileInputStream(fichero)); // Abre el archivo de entrada

            while (true) { // Bucle infinito para leer cada objeto
                Peza peza = (Peza) fEntrada.readObject(); // Lee un objeto Peza desde el archivo
                if (peza == null) break; // Si el objeto es nulo, rompe el bucle
                ex.put(peza.referencia, peza.cantidad); // Almacena la referencia y cantidad en el mapa
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Error: clase no encontrada " + e); // Captura error si la clase Peza no está disponible
        } catch (FileNotFoundException e) {
            System.out.println("Error: archivo no encontrado " + e); // Captura error si el archivo no existe
        } catch (IOException e) {
            System.out.println("Error de entrada/salida " + e); // Captura error general de lectura de archivo
        } finally {
            try {
                if (fEntrada != null) {
                    fEntrada.close(); // Cierra el flujo de entrada
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el flujo " + e); // Captura error al cerrar el archivo
            }
        }
        return ex; // Devuelve el mapa cargado con objetos Peza
    }

    /**
     * Método para guardar los datos en un archivo mediante serialización.
     */
    public void guardarCollection(Map<String, Integer> existencias) {
        ObjectOutputStream fSalida = null; // Declara el flujo de salida

        try {
            fSalida = new ObjectOutputStream(new FileOutputStream(fichero)); // Abre el archivo para escritura
            Set<String> referencias = existencias.keySet(); // Obtiene las claves del mapa

            for (String s : referencias) { // Recorre cada referencia
                Peza p = new Peza(s, existencias.get(s)); // Crea un objeto Peza con referencia y cantidad
                fSalida.writeObject(p); // Escribe el objeto Peza en el archivo
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: archivo no encontrado " + e); // Captura error si el archivo no existe
        } catch (IOException e) {
            System.out.println("Error de escritura " + e); // Captura error de escritura
        } finally {
            try {
                if (fSalida != null) {
                    fSalida.close(); // Cierra el flujo de salida
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el flujo " + e); // Captura error al cerrar el archivo
            }
        }
    }

    /**
     * Método para registrar un nuevo producto si no existe.
     */
    public boolean altaProducto(String referencia) {
        if (existencias.containsKey(referencia)) return false; // Si ya existe, no se añade
        existencias.put(referencia, 0); // Se añade con cantidad inicial 0/ el puesto 0
        return true;
    }

    /**
     * Método para eliminar un producto del inventario.
     */
    public boolean bajaProducto(String referencia) {
        if (!existencias.containsKey(referencia)) return false; // No existe, no se elimina
        existencias.remove(referencia);
        return true;
    }

    /**
     * Método para modificar el stock de un producto.
     */
    public boolean cambioStock(String referencia, int cantidad) {
        if (!existencias.containsKey(referencia)) return false; // No existe el producto
        existencias.replace(referencia, cantidad); // Se actualiza la cantidad
        return true;
    }

    /**
     * Clase interna que representa una pieza con referencia y cantidad.
     * Implementa `Serializable` para ser guardada en archivo.
     */
    public class Peza implements Serializable {
        String referencia; // Clave del producto
        Integer cantidad; // Cantidad en stock

        public Peza(String referencia, Integer cantidad) {
            this.referencia = referencia; // Inicializa la referencia
            this.cantidad = cantidad; // Inicializa la cantidad
        }
    }

    /**
     * Método principal que gestiona la interacción con el usuario mediante un menú.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Inicializa Scanner para entrada de datos
        Boletin13_ex10 exemplo = new Boletin13_ex10("recambiosOliver.dot"); // Crea una instancia del inventario
        Boletin13_ex10 exemplo2 = new Boletin13_ex10("recambiosManuela.odt"); // Crea otra instancia

        int opcion;
        do { // Menú de opciones en bucle
            System.out.println("1. Alta Producto");
            System.out.println("2. Baja Producto");
            System.out.println("3. Cambio cantidad Producto");
            System.out.println("4. Lista Productos");
            System.out.println("5. Salir");
            System.out.print("Introduce opción: ");
            opcion = sc.nextInt(); // Captura la opción ingresada por el usuario

            switch (opcion) {
                case 1 -> exemplo2.altaProducto(sc.next()); // Agrega un producto
                case 2 -> exemplo2.bajaProducto(sc.next()); // Elimina un producto
                case 3 -> exemplo2.cambioStock(sc.next(), sc.nextInt()); // Modifica stock
                case 4 -> System.out.println(exemplo2.existencias); // Muestra lista de productos
            }
        } while (opcion != 5); // Repite el menú hasta que el usuario elija salir

        exemplo.guardarCollection(exemplo2.existencias); // Guarda los datos al salir
    }
}
