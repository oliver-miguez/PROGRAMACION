import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {
    public static void main(String[] args) {
        String texto = "";
        BufferedReader entrada = null;
        try {
            entrada = new BufferedReader(new FileReader("/home/dam/Escritorio/Recu Progra/StremsJava/src/texto"));
            String linha = entrada.readLine();

            while (linha != null) {
                System.out.println(linha);
                linha = entrada.readLine();
            }//end while
        } catch (IOException c) {
            System.out.println("Erro de entrada ou saida " + c.getMessage());
        } finally {
            if (entrada != null) {
                try {
                    entrada.close();
                } catch (IOException e) {
                    System.out.println("Erro dentro do segundo catch: " + e.getMessage());
                }//end catch
            }//end if
        }//end finally
    }//end main
}//end class