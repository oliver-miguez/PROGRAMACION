public class Vivenda extends Inmoviliaria implements  calculoImporte {
    //PROPIEDADES
    private int numeroHabitacions;
    private String prazaGaraxe;
    private String observacions;

    //CONSTRUCTOR
    public Vivenda(String rua , int numero, String localidade, double prezo, String eAlugada, int numeroHabitacions, String prazaGaraxe, String observacions){
        super(rua, numero, localidade, prezo, eAlugada);
        setPrazaGaraxe(prazaGaraxe);
        setNumeroHabitacions(numeroHabitacions);
        setObservacions(observacions);

    }//end constructor

    //GETTERS Y SETTERS

    //Evitaremos numeros negativos de habitacions
    public int getNumeroHabitacions() {
        return numeroHabitacions;
    }

    public void setNumeroHabitacions(int numeroHabitacions) {
        if(numeroHabitacions < 0 ) this.numeroHabitacions = Math.abs(numeroHabitacions);
        else this.numeroHabitacions = numeroHabitacions;
    }

    public String getPrazaGaraxe() {
        return prazaGaraxe;
    }

    public void setPrazaGaraxe(String prazaGaraxe) {
        this.prazaGaraxe = prazaGaraxe;
    }

    public String getObservacions() {
        return observacions;
    }

    public void setObservacions(String observacions) {
        this.observacions = observacions;
    }

    //MÉTODOS ABSTRACTOS


    @Override
    public String aCadea() {
        return "O numero total de habitacions é: "+ numeroHabitacions+ " a praza de garaxe e : "+ prazaGaraxe+ " as observacions son: "+ observacions;
    }


    @Override
    public double calculadoraImporte() {
        return getPrezo() * 0.02;
    }
}//end class
