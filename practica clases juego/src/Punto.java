public class Punto {
    public double x;
    public double y;

    public Punto(){
        x = 0;
        y = 0;
    }
    public Punto(double w){
        x = w;
        y = w;
    }
    public Punto(int w){
        x = w;
        y = w;
    }
    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }


    //SETERS Y GETERS

    public void setX(double x){
        if(x <= 0 ) this.x = x;
        else x = 0;
    }//end X
    public double getX (){
        return x;
    }

    public void setY(double y){
        if(y <= 0 ) this.y = y;
        else y = 0;
    }//end X
    public double getY (){
        return y;
    }

}//end class
