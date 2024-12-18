/**
 * Desmenuza o String “Java” mostrándoo por pantalla carácter a carácter.
 * @author oliver miguez alonso
 */
public class eje2 {
    public static void main(String[] args) {
        String java = "java";
        String[]tabla = java.split("");
        for(String tab:tabla){
            System.out.println(tab);
        }
    }//end main
}//end class
