import java.io.*;

public class LecturaTaboaNumerosBinario {
    public LecturaTaboaNumerosBinario(String rutaFicheiro){
        ObjectInputStream fluxoEntrada = null;
        try{
            fluxoEntrada = new ObjectInputStream(new FileInputStream(rutaFicheiro));
            int num ;
            while (true){
                num = fluxoEntrada.readInt();
                System.out.println(num);
            }
        }catch (FileNotFoundException e){
            System.out.println("Archivo no encontrado "+ e.getMessage());
        }catch (EOFException e){
            System.out.println("Final do ficheiro "+ e.getMessage());
        }catch (IOException e){
            System.out.println("erro entrada/saida "+ e.getMessage());
        }finally {
            if (fluxoEntrada != null){
                try {
                    fluxoEntrada.close();
                }catch (IOException e){
                    System.out.println("Erro de entrada ou saida "+ e.getMessage());
                }
            }
        }
    }
}
