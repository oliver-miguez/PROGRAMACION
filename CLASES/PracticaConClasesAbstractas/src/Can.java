public class Can extends Mamifero implements Son{

    public Can(String nome, int idade){
        super(nome, idade);
    }
    public String cogerPalo(){
        return "El perro coje el palo";
    }

    @Override
    public void desprazarse() {
        System.out.println("Camiña polo parque");
    }//end desplazarse

    @Override
    public void parir() {
        System.out.println("Si es mamifero");
    }

    @Override
    public void voz() {
        System.out.println("Ehiiiiaaaaa");
    }
}
