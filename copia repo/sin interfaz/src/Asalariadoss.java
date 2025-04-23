public class Asalariadoss extends Traballadors  {

    //PROPIEDADES

    private double saldo;
    private String cargo;

    //CONSTRUCTOR

    public Asalariadoss(String dni, String nombre, int dataIngrso, int soldo, String cargo){
        super(dni, nombre, dataIngrso);
        setSaldo(soldo);
        setCargo(cargo);
    }//end Asalariados

    //GETTERS Y SETTERS

    public double getSaldo() {
        return saldo;
    }//end getSaldo

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }//end setSaldo

    public String getCargo() {
        return cargo;
    }//end getCargo

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }//end setCargo

    @Override
    public double gastosIngresos() {
        return -saldo -saldo * 15 / 100;
    }
}//end class
