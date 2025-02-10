/**
 * Clase principal del juego
 * @author Oliver Migeuz Alonso
 */
public class Main {
    public static void main(String[] args) {
        String[]habilidades = {"cavar", "salto olimpico","voar"};
        String[]equipamentos = {"pala", "pertiga","alas", "piedra" , "pau", "verme","serra"};

        personaxe goku =  new personaxe("Dolar",2,4,-15,50,21,"soldado",habilidades,equipamentos);
        System.out.println("A velocidade de goku e : " +goku.getVelocidade()); //consulta a propiedade velocidade en Personaxe
    }//end main
}//end class