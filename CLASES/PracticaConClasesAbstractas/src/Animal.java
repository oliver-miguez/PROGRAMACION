public abstract class Animal {

    private String nome;


    private int idade;

    //Constructor
    public  Animal(String nome , int idade){
        setNome(nome);
        setIdade(idade);
    } //end constructor


    //GETTERS Y SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade <= 0) this.idade = 1;
        else this.idade = idade;
        if (idade > 100) this.idade = 99;
        else this.idade = idade;
    }//end setIdade



    //METODOS
    public void comer(){
        System.out.println("Esta Comiendo");
    }//end comer

    public void durmir(){
        System.out.println("Esta Durmiendo");
    }//end durmir

    //METODO ABSTRACTO
    public abstract void desprazarse();


}//end class
