
public class VehiculoAutonomo {
    private String id; //Identifica a un único vehiculo
    private String posicionActual; //Por ejemplo: "40.4168,-3.7038
    private String estado; //Disponible, En ruta, En Mantenimiento
    private double consumoCombustible; //litros consumidos por km
    private double kilometraje; //total de km
    private int nivelBateria;

    public VehiculoAutonomo(String id, String posicionActual, String estado, double consumoCombustible, double kilometraje, int nivelBateria){
        setId(id);
        setPosicionActual(posicionActual);
        setEstado(estado);
        setConsumoCombustible(consumoCombustible);
        setKilometraje(kilometraje);
        setNivelBateria(nivelBateria);
    }



    public String getId() {
        return id;
    }
    //codigo de 8 cifras unicamente numerico
    public void setId(String id) {

        char[]codigo = id.toCharArray(); //combierte el codigo introducido en un array de chars
        if(codigo.length == 7) {
            for (int i = 0; i < codigo.length; i++) { //recorre el array
                if (!Character.isDigit(codigo[i])) {
                    this.id = "Codigo erroneo, introduzca solo numeros";
                } else {
                    this.id = id;
                }
            }
        }else {
            this.id = "0";
        }
    }


    public String getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(String posicionActual) {
        // Dividimos primero por la coma (para separar latitud y longitud)
        String[] latLong = posicionActual.split(",");

        if (latLong.length == 2) { // Asegurarnos de que tenemos latitud y longitud
            String[] latPartes = latLong[0].split("\\."); // Dividimos latitud por el punto
            String[] longPartes = latLong[1].split("\\."); // Dividimos longitud por el punto

            // Validamos si las partes tienen el formato esperado
            if (latPartes.length == 2 && longPartes.length == 2 &&
                    latPartes[1].length() == 3 && longPartes[1].length() == 3) {

                // Formamos la posición con el formato correcto
                this.posicionActual = latPartes[0] + "." + latPartes[1] + "," +
                        longPartes[0] + "." + longPartes[1];
            } else {
                // Si no cumple con la validación, asignamos un mensaje de error
                this.posicionActual = "Error en el formato de la latitud o longitud";
            }
        } else {
            // Si no hay exactamente una coma para separar latitud y longitud
            this.posicionActual = "Error, formato inválido (debe ser latitud,longitud)";
        }
    }




    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(double consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }


    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        if(nivelBateria <0 || nivelBateria > 100){
            this.nivelBateria = 10;
        }
        else this.nivelBateria = nivelBateria;
    }

    public int bateria(int añadirBateria){
        if(nivelBateria<100){
            nivelBateria += añadirBateria;
            if (nivelBateria > 100){
                nivelBateria = 100;
                return nivelBateria;
            }
            return nivelBateria;
        }
        return 0;
    }


}
