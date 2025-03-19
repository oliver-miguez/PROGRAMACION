public class Main {
    public static void main(String[] args) {
        VehiculoAutonomo vehiculoAutonomo = new VehiculoAutonomo("1234567","23.234,-2.234", "desgastado",2,2,20);
        System.out.println(vehiculoAutonomo.getPosicionActual());
        System.out.println(vehiculoAutonomo.getId());

        System.out.println(vehiculoAutonomo.bateria(1));

    }
}