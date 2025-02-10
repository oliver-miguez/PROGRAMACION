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
        setVida(vida); //setVida(vida) otra forma de darle valor a "vida" en este caso
        setResistencia(rest);
        setForza(forza);
        setVelocidade(vel);
        setExperiencia(exp);
        this.apariencia = apariencia;
        sethabilidades(habilidades);
        setequipamiento(equipamiento);

    }//end personaxe

    /**
     * Asigna al nombre un valor
     * @param nome nome del personaje
     */
    public void setNome(String nome){
        this.nome = nome;
    }//setNome

    //Los gets no reciben parámetros
    /**
     * @return devuelve el nuevo valor de nombre
     */
    public String getNome(){
        return nome;
    }//end getNome

    /**
     * Asigna un valor de vida
     * @param vida valor introducido
     */
    public void setVida(int vida){
        if(vida >= 0 && vida <= 5) this.vida = vida ;
        else this.vida = 3;
    }//end setVida

    /**
     * @return el nuevo valor de vida
     */
    public int getVida(){
        return vida;
    }//end get vida

    public void setResistencia(int resistencia){
        if(resistencia >=0 && resistencia <=  5) this.resistencia = resistencia;
        else this.resistencia = 0;
    }//setResistencia

    public int getResistencia(){
        return resistencia;
    }//end getResistencia

    public void setForza(int forza){
        if(forza >= 0 && forza <= 5) this.forza = forza;
        else this.forza = 0;
    }//end setForza

    public int getForza(){
        return forza;
    }//end getForza

    public void setVelocidade(int velocidade){
        if(velocidade >= 0 && velocidade <= 5) this.velocidade = velocidade;
        else this.velocidade = 3;

    }//end SetVelocidade

    public int getVelocidade(){
        return velocidade;
    }//end getVelocidade

    public void setExperiencia(int experiencia){
        if(experiencia >= 0 && experiencia <= 5 ) this.experiencia = experiencia;
        else this.experiencia = 0;
    }//setExperiencia

    public int getExperiencia(){
        return experiencia;
    }//end getExperiencia

    public void setApariencia(String apariencia){
        this.apariencia = apariencia;
    }//end setApariencia

    public String getApariencia(){
        return apariencia;
    }//end getApariencia



    /**
     * Habilidades que tiene el personaje
     * @param habilidades propiedad obtenida del objeto de personaje
     */
    public void sethabilidades(String[]habilidades){
        this.habilidades = new String[5];
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

    public String[] getHabilidades(){
        return habilidades;
    }//end getHabilidades

    /**
     * Define el funcionamiento del equipamiento
     * @param equipamiento
     */
    public void setequipamiento(String[]equipamiento){
        this.equipamiento = new String[5];
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

    public String[] getEquipamiento(){
            return equipamiento;
    }//end getEquipamiento

    /**
     * Metodo principal de la clase
     * @param args no usamos
     */
    public static void main(String[]args){
        String[] hab = {"saltar", "disparar", "transformarse","X-ray"};
        String[] equip = {"pistola","katana","lanzallamas", "Ballesta"};
        personaxe mario = new personaxe("Mario bros",5,6,7,8,9,"rojo",hab,equip);
    }//end main


}//end class
