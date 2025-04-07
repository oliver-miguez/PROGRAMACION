import java.io.*;

public class EscrituraParesImpares {
    public EscrituraParesImpares(int[]pares, int[]impares){
        ObjectOutputStream fluxoSaida = null;
        ObjectOutputStream fluxoSaida2 = null;
        try {
            fluxoSaida = new ObjectOutputStream(new FileOutputStream("numeros.datos"));
            fluxoSaida2 = new ObjectOutputStream(new FileOutputStream("numeros.datos2"));

            if ((impares != null) || (pares != null)) {
                for (int impar : impares) {
                    if(impar % 2 != 0){
                        fluxoSaida.writeInt(impar);
                    }
                }
                for (int par: pares){
                    if (par % 2 == 0) {
                        fluxoSaida2.writeInt(par);
                    }
                }
            }
        }catch (FileNotFoundException e){
            System.out.println("Archivo non encontrado "+ e.getMessage());
        }catch (IOException e){
            System.out.println("Erro entrada/Saida "+ e.getMessage());
        }finally {
            if(fluxoSaida != null || fluxoSaida2 != null){
                try {
                    fluxoSaida.close();
                    fluxoSaida2.close();
                }catch (IOException e){
                    System.out.println("Erro entrada/saida "+ e.getMessage());
                }
            }
        }
    }
}
