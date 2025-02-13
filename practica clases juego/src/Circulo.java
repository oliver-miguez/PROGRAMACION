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

        setRadio(r);

    }//end constructor
}//end Circulo
