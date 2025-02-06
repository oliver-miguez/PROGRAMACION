/**
 * Propiedades que definirán al personaje
 * @author Oliver Miguez Alonso
 */
public class personaxe {
    private String nome;
    private int vida;
    private int resistencia;
    private int forza;
    private int velocidade;
    private int experiencia;
    private String apariencia;
    private String[] habilidades;
    private String[] equipamiento;

    //Proporciona directamente los valores que quieras  al personaje
    public personaxe(){
        nome = "anónimo";
        vida = 3;
        resistencia = 3;
        forza = 3;
        velocidade = 3;
        experiencia = 1;
        apariencia = "Soldado Raso";
        habilidades = new String[5];
        equipamiento = new String[5];
    }//end personaxe

    //para cambiarlos a nuestro antojo
    public personaxe(String nom, int vida, int rest, int forza, int vel, int exp, String apariencia, String[]habilidades, String[]equipamiento){
        nome = nom;
        // el this se utiliza para diferenciar entre el "vida" de la clase y el "vida" de la función, se puede quitar si cambiamos el nombre de "vida" en alguno de ambos campos
        this.vida = vida; //setVida(vida) otra forma de darle valor a "vida" en este caso
    }//end personaxe


}//end class
