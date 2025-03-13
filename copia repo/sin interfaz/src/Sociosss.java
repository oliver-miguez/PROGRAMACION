public class Sociosss extends Asociacions{

    //PROPIEDADES

    private String direccion;
    private String provincia;
    private int dataAlta;
    private int cuota;

    //CONSTRUCTOR

    public Sociosss(String dni, String nombre, String direccion, String provincia, int dataAlta, int cuota){
        super(dni, nombre);
        setDireccion(direccion);
        setProvincia(provincia);
        setDataAlta(dataAlta);
        setCuota(cuota);

    }//end Constructor

    //GETTERS Y SETTERS

    public String getDireccion() {
        return direccion;
    }//end getDiereccion

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }//end setDireccion



    public String getProvincia() {
        return provincia;
    }//end getProvincia

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }//end setProvincia



    public int getDataAlta() {
        return dataAlta;
    }//end getData

    public void setDataAlta(int dataAlta) {
        this.dataAlta = dataAlta;
    }//end setData



    public int getCuota() {
        return cuota;
    }//end getCuota

    public void setCuota(int cuota) {
        this.cuota = cuota;
    }//end setCuota

    //METODOS ABSTRACTOS

    @Override
    public String aCadea() {
        return "O dni do socio e :"+ getDni()+" o nome e :"+ getNombre()+ " a direccion e : "+ direccion+ " a provincia e : "+ provincia+ " a data alta e :"+ dataAlta+ " a cuota e : "+ cuota;
    }

    @Override
    public double gastosIngresos() {
        return cuota;
    }
}//end class