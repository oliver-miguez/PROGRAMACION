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
        resistencia = rest;
        this.forza = forza;
        velocidade =vel;
        experiencia = exp;
        this.apariencia = apariencia;
        this.habilidades = new String[5];
        sethabilidades(habilidades);
        this.equipamiento = new String[5];
        setequipamiento(equipamiento);

    }//end personaxe

    /**
     * Habilidades que tiene el personaje
     * @param habilidades propiedad obtenida del objeto de personaje
     */
    public void sethabilidades(String[]habilidades){
        int numHabilidades = habilidades.length; //Cuenta el total de habilidades que tiene en total el personaje
        //si superan el valor de 5 que fue el que le proporcionamos en en array, solo cogerá los 5 primeros valores

        //verifica que solamente pueda tener hasta cinco habilidades
        if (numHabilidades > 5){
            numHabilidades = 5;
        }//end if

        for(int i = 0; i < numHabilidades; i++){
            this.habilidades[i] = habilidades[i];
        }//end for

    }//end setHabilidades

    /**
     * Define el funcionamiento del equipamiento
     * @param equipamiento
     */
    public void setequipamiento(String[]equipamiento){
        int numEquipamientos = equipamiento.length; //Cuenta el total de habilidades que tiene en total el personaje
        //si superan el valor de 5 que fue el que le proporcionamos en en array, solo cogerá los 5 primeros valores

        //verifica que solamente pueda tener hasta cinco habilidades
        if (numEquipamientos > 5){
            numEquipamientos = 5;
        }//end if

        for(int i = 0; i < numEquipamientos; i++){
            this.equipamiento[i] = equipamiento[i];
        }//end for
    }//end setEquipamiento

    public static void main(String[]args){
        String[] hab = {"saltar", "disparar", "transformarse","X-ray"};
        String[] equip = {"pistola","katana","lanzallamas", "Ballesta"};
        personaxe mario = new personaxe("Mario bros",5,6,7,8,9,"rojo",hab,equip);
    }//end main


}//end class
