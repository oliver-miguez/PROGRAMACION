/**
 * Clase cuadrado que es concreta a parti de una clase abstracta que es figura geométrica
 */
public class Cuadrado extends Figura_Xeométrica{
    private double lado;

    //Constructor
    public Cuadrado(double l){
        super(); //las coordenadas x e y serán igual a 0 en este constructor
        setLado(l);
    }//end constructor

    public Cuadrado(double x, double y, double l){
        super(x, y); //le podremos dar a x e y los valores que queramos
        setLado(l);
    }//end constructor

    public double getLado(){
        return lado;
    }//end getLado

    public void setLado(double l){
        if(l < 0) lado = Math.abs(l); //si el lado es negativo se le asigna el valor absoluto,asegura siempre un valor positivo
        else lado = l;
    }//end setLado

    @Override
    public double calcularPerimetro(){
        return lado * 4;
    }//end calcularPerimetro

    public double calcularArea(){
        return lado * lado;
    }//end calcularArea


    //IMPLEMENTA EL MÉTODO ABSTRACTO DE LA CLASE PADRE PARA QUE PUEDA FUNCIONAR LA CLASE CUADRADO
    //COMO ES ABSTRACTA LA CLASE PADRE , Y EL MÉTODO aCadea() ES ABSTRACTO EN LA CLASE PADRE, TENEMOS QUE IMPLEMENTARLO EN LA CLASE HIJA OBLIGATORIAMENTE

    public String aCadea(){
        return "O cuadrado ten as coordenadas: " + getX() + " e " + getY() + " e o lado: " + getLado() + " e unha area de: " + calcularArea();
    }//end aCadea

}//end class
