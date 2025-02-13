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


        Punto p1 = new Punto(1,7);
        Punto p2 = new Punto(-15); //como solo permite valores negativos lo iguala a 0

        p1.setX(-10);

        System.out.println("Coordenada x de p1 : " + p1.getX());
        System.out.println("Coordenada x de p2 : " + p2.getX());
        System.out.println("Coordenada x de p2 : " + p2.getY());

        //devuelve verdadero o falso en caso de que sean o no iguales, sin embargo va a dar error aunque cambie el valor de -15 a 0
        System.out.println(p1.equals(p2));

        System.out.println(p1); //utiliza el metodo toString modificado en la propia clase para que nos muestre el resultado de las coordenadas


        //Pruebas con clase círculo
        Circulo circulo1 = new Circulo(1,2,3);

        System.out.print("El radio de la circunferencia es: ");
        System.out.println(circulo1.calculoDiametro());

        System.out.print("El area del circulo es :");
        System.out.println(circulo1.calculoArea());

        System.out.print("El perimetro del circulo es :");
        System.out.println(circulo1.calculoPerimetro());

    }//end main
}//end class