/**
 * Clase que representa un punto en el plano de carácter abstracto
 * x double
 * y double
 * Métodos que tiene que tener:
 * 1-getX()
 * 2-setX()
 * 3-getY()
 * 4-setY()
 * 5-aCadea() <--- Método abstracto
 *
 * @author Oliver Miguez Alonso
 */
public abstract class Punto_Abstracto {
    //Atributos del objeto
    private double x;
    private double y;

    //CONSTRUCTOR
    public Punto_Abstracto(){
        x = 0;
        y = 0;
    }//end constructor

    public Punto_Abstracto(double x, double y){
        setX(x);
        setY(y);

    }//end constructor

    //SETTERS Y GETTERS

    //X
    public double getX() {
        return x;
    }//end getX

    public void setX(double x) {
        if ( x < 0) this.x = 0;
        else this.x = x;
    }//end setX

    //Y
    public double getY() {
        return y;
    }//end getY

    public void setY(double y) {
        if(x < 0) this.y = 0;
        else this.y = y;
    }//end setY

    //MÉTODO ABSTRACTO DE LA CADENA

    //tipo toString
    public  abstract String aCadea();
}// end class
