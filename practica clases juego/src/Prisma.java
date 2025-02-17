public class Prisma {


    //Variables
    private double largo;
    private double ancho;
    private double altura;


    //CONSTRUCTOR
    public Prisma( double l){
        setLargo(l);
    }//en Prisma Constructor


    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        if (largo < 0 ) this.largo = 1;
        else this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}//end Prisma class
