/**
 * Distintas operaciones que se pueden realizar con un círculo
 * @author Oliver Miguez Alonso
 */
public class Circulo extends Punto{ //crea una clase circulo que hereda todo de la clase punto



    //declaración de propiedades
    private double radio;

    //CONSTRUCTOR
    //Para definir al constructor necesitamos los variables de la superclase "Punto"
    public Circulo (double x, double y, double r){

        super (x, y); //inicializa una superclase, hace referencia a la clase que hereda --> this.Punto(x,y)

        radio = r; // ¡OJO VA A DAR ERROR DE HERENCIA! Una buena técnica, que evita problemas es usar get y set (esto es una práctica)

    }//end constructor

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Permite calcular el diámetro del circulo
     * @return el diámetro
     */
    public double  calculoDiametro(){
        double diametro = radio * 2;
        return  diametro;
    }//endCalculoDiametro

    /**
     * Calculo del area del circulo
     * @return el area
     */
    public double calculoArea(){
        double area = Math.PI * Math.pow(radio, 2) ;
        return area;
    }//end calculoArea

    /**
     * Calcula el perimetro del circulo
     * @return el perimetro
     */
    public double calculoPerimetro(){
         double perimetro = calculoDiametro() * Math.PI;
         return perimetro;
    }//end calculoPerimetro

    public String toString(){
        return "O centro do circulo é : "+ super.toString() +" \n O radio é " + radio; //el super.toString coge el toString de la clase "Punto"
    }//end toString





}//end Circulo
