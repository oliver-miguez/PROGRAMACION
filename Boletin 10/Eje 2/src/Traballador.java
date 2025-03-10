public class Traballador extends Asociacion{

    //PROPIEDADES

    private int dataIngrso;

    //CONSTRUCTOR
        public Traballador(String dni, String nombre, int dataIngrso){
            super(dni, nombre);
            setDataIngrso(dataIngrso);
        }//end Constructor


    //GETTERS Y SETTERS

    public int getDataIngrso() {
        return dataIngrso;
    }//end getDataIngreso

    public void setDataIngrso(int dataIngrso) {
        this.dataIngrso = dataIngrso;
    }//end setDataIngreso



    //MÉTODOS ABSTRACTOS

    @Override
    public String aCadea() {
        return getDni()+ getNombre()+ dataIngrso;
    }//end a cadea


}//end class
