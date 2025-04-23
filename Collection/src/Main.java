public class Main {
    public static void main(String[] args) {
        //Contenedor solo para objetos tipo integer
        //1ºForma
        Contedor<Integer> num = new Contedor<Integer>();
        num.gardar(5);
        System.out.println(num.extraer());
        //Contenedor para Strings
        //2ºForma
        Contedor<String > cad = new Contedor<>();
        cad.gardar("Ola mundo");
        System.out.println(cad.extraer());
        //3ºForma
        Contedor ele = new Contedor();
        ele.gardar(6);
        System.out.println(ele.extraer());

    }
}
