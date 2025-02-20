public class Hora {


    //PARÁMETROS
    private int horas;


    private int minutos;


    private int segundos;


    //CONSTRUCTOR
    public Hora(int h, int m, int s){
        setHoras(h);
        setMinutos(m);
        setSegundos(s);
    }//end constructor

    //GETTERS Y SETTERS
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        if (horas >= 0 && horas < 24) this.horas = horas;
        else this.horas = 0;
    }


    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if (minutos >= 0 && minutos < 60) this.minutos = minutos;
        else this.minutos = 0;    }


    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if (segundos >= 0 && segundos < 60) this.segundos = segundos;
        else this.segundos = 0;
    }
}//end class
