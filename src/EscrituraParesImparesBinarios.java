import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscrituraParesImparesBinarios {

    /*
    TODO
    Extraer los números de la tabla de Escritura Binaria en 2 tablas , Pares y Impares
    */

    public EscrituraParesImparesBinarios(int[]taboa){
        ObjectOutputStream flujoSalidaPares = null;
        ObjectOutputStream flujoSalidaImpares = null;
        try {
            flujoSalidaPares = new ObjectOutputStream(new FileOutputStream("numeros.pares"));
            flujoSalidaImpares = new ObjectOutputStream(new FileOutputStream("numeros.impares"));
        }catch (FileNotFoundException e){
            System.out.println("archivo non encontrado " e.getMessage());
        }catch (IOException e){
            System.out.println("Error de entrada/salida "+ e.getMessage());
        }finally {

        }
    }


}
