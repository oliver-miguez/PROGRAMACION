public class Traballador extends Asociacion{

    //PROPIEDADES

    private int dataIngreso;

    //CONSTRUCTOR
        public Traballador(String dni, String nombre, int dataIngreso){
            super(dni, nombre);
            setDataIngreso(dataIngreso);
        }//end Constructor


    //GETTERS Y SETTERS

    public int getDataIngrso() {
        return dataIngreso;
    }//end getDataIngreso

    public void setDataIngreso(int dataIngrso) {
        this.dataIngreso = dataIngrso;
    }//end setDataIngreso



    //MÉTODOS ABSTRACTOS

    @Override
    public String aCadea() {
        return getDni()+ " " + getNombre()+ " " + dataIngreso;
        // return super.aCadea + dataIngreso <--- Otra forma de hacerlo
    }//end a cadea


}//end class
