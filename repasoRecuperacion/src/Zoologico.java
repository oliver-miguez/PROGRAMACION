/**
 * Clase padre
 */
public class Zoologico {
    //PROPIEDADES
    private String nome;

    //CONSTRUCTOR
    public Zoologico(String nome){
        setNome(nome);
    }//end constructor

    //SETTERS Y GETTERS


    public String getNome() {
        return nome;
    }//end getNome

    public void setNome(String nome) {
        this.nome = nome;
    }//end setNome

    //MÉTODOS
    public String mostrarDatos(){
        return "O nome é: "+ getNome();
    }//end mostrarDatos

}//end class
