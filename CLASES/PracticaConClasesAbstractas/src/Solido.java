/**
 * Clase abstracta que representa un sólido geométrico.
 * Métodos que tiene:
 * 1-Calcular Volumen  <--- Método abstracto
 * @author Oliver Miguez Alonso
 */
public abstract class Solido  extends  Figura_Xeométrica{
    public Solido(){
        super();
    }//end constructor

    //provienen de la clase Punto_Abstracto / Figura Xeométrica
    public Solido(double x, double y){
        super(x, y);
    }//end constructor

    public abstract double calcularVolumen();
}//end class
