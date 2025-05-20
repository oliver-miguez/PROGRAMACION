public class Deportista1 {
    private String deporte;
    private String clube;
    private String licencia;

    public Deportista1(String deporte, String clube, String licencia){
        setClube(clube);
        setDeporte(deporte);
        setLicencia(licencia);
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getClube() {
        return clube;
    }

    public void setClube(String clube) {
        this.clube = clube;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        try {
            if (licencia.length() != 13) {
                throw new Exception("No puede ni superar ni quedarse por debajo de los 13 dígitos");
            }

            String subcadena = licencia.substring(4, 7); // Extrae 3 caracteres (índices 4 al 6)
            boolean esNumero = false;
            for (char c : subcadena.toCharArray()) {
                if (!Character.isDigit(c)) {
                    esNumero = false;
                }
                else{
                    throw new Exception("Las posiciones 4,5,6 deben ser abreviaturas de deporte");
                }
            }

            String ultimos = licencia.substring(7,licencia.length());
            boolean esLetra = false;
            for (char c : ultimos.toCharArray()) {
                if (Character.isDigit(c)) {
                    esLetra = false;
                }
                else{
                    throw new Exception("Los 6 últimos dígitos tienen que ser números ");
                }
            }
            /*
            if(esLetra == false || esNumero == false){
                System.out.println(licencia);
            }
            */
            this.licencia = licencia;

        }catch (Exception e){
            System.out.println("Error:"+e.getMessage());
        }


    }
}
