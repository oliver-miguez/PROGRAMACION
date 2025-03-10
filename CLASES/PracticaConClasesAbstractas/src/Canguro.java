public class Canguro extends Mamifero implements Comunicacion{


    public Canguro(String nome, int ideade) {
        super(nome, ideade);
    }

    @Override
    public void parir() {

    }

    @Override
    public void desprazarse() {
        System.out.println("Corre");
    }//end desplazarse

    @Override
    public void ronroneo() {
        System.out.println("iuhhh");
    }

    @Override
    public void voz() {
        System.out.println("GHRR");
    }
}//end class
