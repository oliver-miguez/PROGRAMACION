public class Main {
    public static void main(String[] args) {
        //Contenedor solo para objetos tipo integer
        Contedor<Integer> num = new Contedor<Integer>();
        num.gardar(5);
        System.out.println(num.extraer());
    }
}
