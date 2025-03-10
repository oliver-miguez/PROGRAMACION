public class Asalariados extends Traballador {

    //PROPIEDADES

    private String saldo;
    private String cargo;

    //CONSTRUCTOR

    public Asalariados(String dni, String nombre, int dataIngrso, String soldo, String cargo){
        super(dni, nombre, dataIngrso);
        setSaldo(soldo);
        setCargo(cargo);
    }//end Asalariados

    //GETTERS Y SETTERS

    public String getSaldo() {
        return saldo;
    }//end getSaldo

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }//end setSaldo

    public String getCargo() {
        return cargo;
    }//end getCargo

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }//end setCargo



}//end class
