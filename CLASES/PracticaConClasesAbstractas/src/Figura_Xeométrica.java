/**
 * Clase que representa un círculo.
 * Métodos que tiene:
 * 2-Calcular Area  <--- Método abstracto
 * 3-Calcular Perimetro
 * 4-aCadea <--- Método abstracto
 * @author Oliver Miguez Alonso
 */
public  abstract class Figura_Xeométrica extends Punto_Abstracto {

    public Figura_Xeométrica(){
        super();
    }//end constructor

    public Figura_Xeométrica(double x, double y){
        super(x, y);
    }//end constructor

    //un perimetro en principio es indefinido
    public double calcularPerimetro(){
        //mientras no se defina devuelve 0
        return 0.0;
    }//end calcularPerimetro

    public abstract double calcularArea();

}//end class
