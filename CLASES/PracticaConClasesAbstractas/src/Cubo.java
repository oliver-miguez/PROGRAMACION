/**
 * Clase Cubo que hereda de Solido y FiguraGeometrica
 * @author Oliver Miguez Alonso
 */
public class Cubo extends Solido {
    private double lado;

    //Constructor
    public Cubo() {
        super();
        lado = 0;
    }//end constructor

    public Cubo(double x, double y, double l) {
        super(x, y);
        setLado(l);
    }//end constructor

    public double getLado() {
        return lado;
    }//end getLado

    public void setLado(double l) {
        if (l < 0) lado = Math.abs(l);
        else lado = l;
    }//end setLado

    //METODO ABSTRACTO HEREDADO DE PUNTO ABSTRACTO Y FIGURA GEOMÉTRICA Y SOLIDO

    //Metodos abstractos heredados de Solido
    public double calcularVolumen() {
        return Math.pow(lado,3);
    }//end calcularVolumen

    //Metodo abstractos heredados de Figura xeometrica
    public double calcularArea() {
        return 6 * Math.pow(lado,2);
    }//end calcularArea

    //Meto abstracto heredado de Punto_Abstracto
    public String aCadea() {
        return "O cubo ten as coordenadas: " + getX() + " e " + getY() + " e o lado: " + getLado() + " e unha area de: " + calcularArea() + " e un volumen de: " + calcularVolumen();
    }//end aCadea
}//end Class
