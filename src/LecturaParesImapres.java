import java.io.*;

public class LecturaParesImapres {
    public LecturaParesImapres(String rutaFicheiro, String rutaFicheiro2){
        ObjectInputStream fluxoEntradaPares = null;
        ObjectInputStream fluxoEntradaImpares = null;
        try{
            fluxoEntradaPares = new ObjectInputStream(new FileInputStream(rutaFicheiro));
            fluxoEntradaImpares = new ObjectInputStream(new FileInputStream(rutaFicheiro2));
            int par ;
            int impar;
            while (true){
                par = fluxoEntradaPares.readInt();
                impar = fluxoEntradaImpares.readInt();
                System.out.println(par);
                System.out.println(impar);
            }
        }catch (FileNotFoundException e){
            System.out.println("Archivo no encontrado "+ e.getMessage());
        }catch (EOFException e){
            System.out.println("Final do ficheiro "+ e.getMessage());
        }catch (IOException e){
            System.out.println("erro entrada/saida "+ e.getMessage());
        }finally {
            if (fluxoEntradaPares != null || fluxoEntradaImpares != null){
                try {
                    fluxoEntradaPares.close();
                    fluxoEntradaImpares.close();
                }catch (IOException e){
                    System.out.println("Erro de entrada ou saida "+ e.getMessage());
                }
            }
        }
    }
}
