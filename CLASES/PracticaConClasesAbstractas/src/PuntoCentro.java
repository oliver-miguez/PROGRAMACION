public class PuntoCentro extends Punto_Abstracto{

    public PuntoCentro(){
        super();
    }//end constructor
    public PuntoCentro(double x, double y){
        super(x, y);
    }//end constructor

    //tipo toString
    public String aCadea(){
        return " O punto ten as coordenadas: " + getX() + " e " + getY();
    }//end aCadea

}//end class
