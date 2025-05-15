class Main{
    public static void main(String[] args) {
        Persoa1 persoa1 = new Persoa1("Oliver","Ourense","76736838W");

        System.out.println(persoa1.getDireccion());
        System.out.println(persoa1.getDni());
        System.out.println(persoa1.getNome());

        Deportista1 deportista1 = new Deportista1("Futbol","aqui","1234fut123456");
        System.out.println(deportista1.getLicencia());
    }
}