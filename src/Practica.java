/**
 * Calcular con todos los números del archivo de Texto
 * Repaso de BufferedReader y de FileReader
 * @author Oliver Miguez Alonso
 */

//Imports para poder usar el BufferedReader, FileReader y las Exceptions
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Practica {
    /**
     * Metodo principal del programa
     * @param args No usamos
     */
    public static void main(String[] args) {
        //Comienza por interpretar que no se introduce ningún archivo de texto
        BufferedReader entrada = null;
        try{
            //Variables de calculo
            int suma = 0;
            int media = 0;
            int contador = 0;

            //dirección del archivo de texto
            entrada = new BufferedReader(new FileReader("/home/dam/Escritorio/Recu Progra/StremsJava/src/textoNumeros"));

            //Guarda como String toda la info del archivo de texto
            String linea = entrada.readLine();

            //Si los datos de archivo no son nulos
            while (linea != null) {

                //Crea un array de Strings dividiendo cada grupo de caracteres según el número de espacios en blanco que tengan en el texto
                String[]caracteres = linea.split(" ");

                //Recorremos el array
                for (String caracter : caracteres) {

                    //transforma al array de Strings en un array de integers y los suma / suma de todos los valores
                    suma = suma + Integer.parseInt(caracter);
                    //cuenta cuantos números hay en el array
                    contador++;
                    //cálculo de la media
                    media = suma / contador;

                }//end for

                //Resultados de las operaciones
                System.out.println(media);
                System.out.println(suma);

            }//end while


            // Excepciones en caso de error en el código
        }catch(IOException e){
            System.out.println("Error de entrada o salida: "+ e.getMessage());
        }//end catch
        finally {
            if (entrada != null) {
                try {
                    entrada.close();
                } catch (IOException e) {
                    System.out.println("Erro dentro do segundo catch: " + e.getMessage());
                }//end catch
            }//end if
        }//end finally
    }//end main
} //end class
