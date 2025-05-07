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


    }//end main
}//end class
