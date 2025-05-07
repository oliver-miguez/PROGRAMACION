import java.util.*;

/**
 * Crea listas a las que a cada valor de ella se le da una clave con la que se puede identificar y llamar
 * No repite valores
 * Map es una clase "distinta" a collection, pero tienen cierta relación
 * @author Oliver Miguez Alonso
 */
public class ExemploMap {
    public static void main(String[] args) {
        Map<String,Integer> mapa = new HashMap<>();

        mapa.put("Ana", 25);
        mapa.put("Juan", 30);
        mapa.put("Luis", 28);
        mapa.put("Luis",11);//cambia el valor anterior de Luis y muestra el nuevo

        System.out.println(mapa);
        System.out.println(mapa.get("Ana"));//muestra a partir de la clave "Ana" su valor (25)
        mapa.remove("Ana");//elimina el elemento de clave "Ana"
        System.out.println(mapa);

        System.out.println(mapa.containsKey("Ana"));//comprueba si "mapa" tiene un elemento con la llave "Ana" (false/true)
        if(mapa.containsKey("Juan")) System.out.println("Juan Existe");
        else System.out.println("Juan no existe");
        if(mapa.containsKey("Ana")) System.out.println("Ana existe");
        else System.out.println("Ana no existe");

        System.out.println(mapa.containsValue(11));//muestra si existe el valor en el mapa
        /*
        mapa.clear();//vacía el mapa
        System.out.println(mapa);
        */

        //Vistas
        //Set es una interfaz de las colecciones
        Set<String> claves = mapa.keySet();//conjunto de claves
        System.out.println(claves);

        System.out.println("_________");

        //1º Forma obtener todos los parámetros
        Iterator<String> itClaves;
        for (itClaves = claves.iterator(); itClaves.hasNext();){
            String clave = itClaves.next();
            System.out.println("Clave: "+ clave);
            System.out.println("Valor: "+ mapa.get(clave));
        }

        System.out.println("_________");

        Collection<Integer> valores = mapa.values(); //conjunto de valores
        System.out.println(valores);

        System.out.println("_________");

        //2º Forma obtener todos parámetros
        Set<Map.Entry<String,Integer>> entradas = mapa.entrySet();//lista de entradas (tanto como los valores como las claves, obtenemos un set(una colección de valores)
        System.out.println(entradas);
        Iterator<Map.Entry<String,Integer>>it;//con este iterador nos podemos mover a traves de los elementos de la colección
        for (it = entradas.iterator();it.hasNext();){
            Map.Entry<String,Integer>elemento = it.next();
            System.out.println("Valores:"+elemento.getValue());
            System.out.println("Claves:"+ elemento.getKey());
        }

    }//end main
}//end class
