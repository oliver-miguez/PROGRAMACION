public class Punto {
    private double x;
    private double y;

    public Punto(){
        x = 0;
        y = 0;
    }//endPunto
    public Punto(double w){
        setX(w);
        setY(w);
    }//endPunto
    public Punto(int w){
        setX(w);
        setY(w);
    }//endPunto
    public Punto(double x, double y){
        setX(x);
        setY(y);

    }//endPunto
    public Punto(int x, int y){
        setX(x);
        setY(y);
    }//endPunto


    //SETS Y GETS

    public void setX(double x){
        if(x >= 0 ) this.x = x;
        else x = 0;
    }//end setX

    public void setX(int x){//para comprobar que se pueden hacer sets de los mismos valores pero de distintos tipos
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

    public void setY(int y){ //para comprobar que se pueden hacer sets de los mismos valores pero de distintos tipos
        if(y >= 0 ) this.y = y;
        else y = 0;
    }//end setY

    public double getY (){
        return y;
    }//end getY

}//end class
