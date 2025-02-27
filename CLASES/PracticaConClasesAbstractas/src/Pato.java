public class Pato extends Mamifero{

    //CONSTRUCTOR
    public Pato(String nome, int idade){
        super(nome,idade);
    }//end constructor

    public String tipo(){
        return "pato comun";
    }//end tipo

    @Override
    public void desprazarse() {
        System.out.println("Nada pola auga");
    }//end metodo abstracti

    @Override
    public void parir() {
        System.out.println("Es oviparo");
    }
}
