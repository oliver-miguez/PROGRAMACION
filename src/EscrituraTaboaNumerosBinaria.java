import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscrituraTaboaNumerosBinaria {
    //CONSTRUCTOR
    public EscrituraTaboaNumerosBinaria(int [] taboa){
        ObjectOutputStream fluxoSaida = null;
        try {
            fluxoSaida = new ObjectOutputStream (new FileOutputStream("numeros.dat"));
            if (taboa != null ){
                for(int num: taboa){
                    fluxoSaida.writeInt(num);
                }
            }
        }catch (FileNotFoundException e){
            System.out.println("erro file non encontrado"+ e.getMessage());
        }catch (IOException e){
            System.out.println("Erro entrada/saida" + e.getMessage());
        }finally {
            if (fluxoSaida!= null){
                try {
                    fluxoSaida.close();

                }catch (IOException e){
                    System.out.println("Erro entrada/saida"+ e.getMessage());
                }
            }
        }
    }
}
