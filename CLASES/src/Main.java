/**
 * Clase principal del juego
 * @author Oliver Migeuz Alonso
 */
public class Main {
    public static void main(String[] args) {
        String[]habilidades = {"cavar", "salto olimpico","voar"};
        String[]equipamentos = {"pala", "pertiga","alas", "piedra" , "pau", "verme","serra"};

        personaxe goku =  new personaxe("Dolar",2,4,-15,50,21,"soldado",habilidades,equipamentos);
        System.out.println("A velocidade de goku e : " +goku.getVelocidade()); //consulta a propiedade velocidade en Personaxe


        Centro p1 = new Centro(1,7);
        Centro p2 = new Centro(-15); //como solo permite valores negativos lo iguala a 0

        p1.setX(-10);

        System.out.println("Coordenada x de p1 : " + p1.getX());
        System.out.println("Coordenada x de p2 : " + p2.getX());
        System.out.println("Coordenada x de p2 : " + p2.getY());

        //devuelve verdadero o falso en caso de que sean o no iguales, sin embargo va a dar error aunque cambie el valor de -15 a 0
        System.out.println(p1.equals(p2));

        System.out.println(p1); //utiliza el metodo toString modificado en la propia clase para que nos muestre el resultado de las coordenadas


        //Pruebas con clase círculo
        Circulo circulo1 = new Circulo(5,4,3);

        //utilizar toString directa e indirectamente
        System.out.println(circulo1.toString());
        //System.out.println(circulo1);

        System.out.println("Coordenadas  X de circulo 1: " + circulo1.getX()); //hereda el metodo de getX de la clase punto

        System.out.print("El radio de la circunferencia es: ");
        System.out.println(circulo1.calculoDiametro());

        System.out.print("El area del circulo es :");
        System.out.println(circulo1.calculoArea());

        System.out.print("El perimetro del circulo es :");
        System.out.println(circulo1.calculoPerimetro());


        //PRUEBA DE CLASE CILINDRO

        Cilindro cilindro1 = new Cilindro(2,3,4,5);
        System.out.println(cilindro1.toString());
        System.out.println("O volumen do Cilindro e: " + cilindro1.volumenCilindro());
        System.out.println("A superficie do cilindro e " + cilindro1.calculoSuperficie());



        //PRUEBA contaCorrente

        System.out.println(ContaCorrente.getContadorContas());

        ContaCorrente cont1 = new ContaCorrente(1000,"123R","ES1231231","PEPIÑO",2);
        System.out.println(cont1.sacarDinero());


        ContaCorrente cont2 = new ContaCorrente(2000,"234F", "ES1234123123","PEPIÑA", 1);
        System.out.println(cont2.ingresarDiñeiro());



        ContaCorrente cont3 = new ContaCorrente(3000,"234F", "ES1234123123","PEPIÑA", 1);
        System.out.println(cont3.modificarDatos());

        System.out.println("Total de contas rexistradas: "+ ContaCorrente.getContadorContas());


            Lista2 lista = new Lista2();
            lista.engadirUltimo(5);
            lista.engadirUltimo(7);
            lista.engadirUltimo(-16);
    }//end main
}//end class