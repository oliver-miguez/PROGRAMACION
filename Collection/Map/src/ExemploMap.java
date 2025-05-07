import java.util.HashMap;
import java.util.Map;

/**
 * Crea listas a las que a cada valor de ella se le da una clave con la que se puede identificar y llamar
 * No repite valores
 * @author Oliver Miguez Alonso
 */
public class ExemploMap {
    public static void main(String[] args) {
        Map<String,Integer> mapa = new HashMap<>();

        mapa.put("Ana", 25);
        mapa.put("Juan", 30);
        mapa.put("Luis", 28);

        System.out.println(mapa);


    }//end main
}//end class
