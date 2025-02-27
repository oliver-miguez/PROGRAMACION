public abstract class Mamifero extends Animal{
    public Mamifero(String nome, int ideade){
        super(nome,ideade);
    }

    @Override
    public abstract void desprazarse();
    public abstract void parir();
}
