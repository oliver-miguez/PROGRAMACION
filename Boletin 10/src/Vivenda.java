/**
 * @author Oliver Miguez Alonso
 * @version 1.0
 */
public class Vivenda extends Inmobiliaria {

    private int numeroHabitacions;
    private PlazaGaraxe garaxe;
    private String observacions;
    private String portal;
    private String piso;

    //CONSTRUCTOR

    public Vivenda(String direcion, int numero, String localidade, int prezo, boolean eAluguer, String portal, String piso, int numeroHabitacions, PlazaGaraxe plaza, String observacions) {

        super(direcion, numero, localidade, prezo, eAluguer);
        setNumeroHabitacions(numeroHabitacions);
        this.garaxe = garaxe;
        this.observacions = observacions;
        this.portal = portal;
        this.piso = piso;

    }//end constructor

    //GETTERS Y SETTERS

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getPortal() {
        return portal;
    }

    public void setPortal(String portal) {
        this.portal = portal;
    }

    public String getObservacions() {
        return observacions;
    }

    public void setObservacions(String observacions) {
        this.observacions = observacions;
    }

    public PlazaGaraxe getGaraxe() {
        return garaxe;
    }

    public void setGaraxe(PlazaGaraxe garaxe) {
        this.garaxe = garaxe;
    }

    public int getNumeroHabitacions() {
        return numeroHabitacions;
    }

    public void setNumeroHabitacions(int numeroHabitacions) {
        this.numeroHabitacions = Math.abs(numeroHabitacions);
    }

    //MÉTODOS

    public String toString() {
        //coge el mismo toString de la clase padre Inmobiliaria
        String texto = super.toString() + " no portal " + portal + " e no piso " + piso + " con un total de habitacions: " + numeroHabitacions;
        texto = texto + garaxe.toString();
        return texto;
    }//end toString


    //METODO ABSTRACTO

    public double calcularGanancia() {

        if (iseAluguer()) return getPrezo();
        else return getPrezo() * 0.02;

    }//end calcularGanancias
}//end class
