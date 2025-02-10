public class Punto {
    private double x;
    private double y;

    public Punto(){
        x = 0;
        y = 0;
    }//endPunto
    public Punto(double w){
        x = w;
        y = w;
    }//endPunto
    public Punto(int w){
        x = w;
        y = w;
    }//endPunto
    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }//endPunto
    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }//endPunto


    //SETERS Y GETERS

    public void setX(double x){
        if(x >= 0 ) this.x = x;
        else x = 0;
    }//end setX
    public double getX (){
        return x;
    }//end getX

    public void setY(double y){
        if(y >= 0 ) this.y = y;
        else y = 0;
    }//end setY
    public double getY (){
        return y;
    }//end getY

}//end class
