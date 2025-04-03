import java.io.IOException;

public class FileReader {
    public static void main(String[] args) {
        String texto = "";
        java.io.FileReader entrada = null;
        try {
            entrada = new java.io.FileReader("/home/dam/Escritorio/Recu Progra/StremsJava/src/texto");
            int caracter;
            caracter = entrada.read();

         while (caracter != -1) {

            texto = texto + (char) caracter;
            caracter = entrada.read();
         }
        }catch (IOException e){
            System.out.println("Erro de entrada / saida "+ e.getMessage());
        }finally {
            if(entrada != null){
                try {
                    entrada.close();
                }catch (IOException e){
                    System.out.println("Erro dentro do primeiro try:"+ e.getMessage());
                }
            }
        }
        System.out.println("O texto do ficheiro é: \n"+ texto);

    }
}
