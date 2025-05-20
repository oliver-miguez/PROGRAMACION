public class Eje11Academico {
    //PROPIEDADES
    private String nome;
    private int anoAcceso;

    //CONSTRUCTOR
    public Eje11Academico(String nome, int anoAcceso) {
        this.nome = nome;
        this.anoAcceso = anoAcceso;
    }

    public String toString(){
        return "Nome: "+nome +" data: " + anoAcceso;
    }
}
