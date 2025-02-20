public class Hora {
    //PARÁMETROS
    enum FormatoHora {DOCE, VINTECATRO} //Fuerza a la variable a tener uno de los dos valors

    private  FormatoHora formato;
    private int horas;
    private int minutos;
    private int segundos;


    //CONSTRUCTOR
    public Hora(int h, int m, int s , String formato){
        setFormato(formato);
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

    public FormatoHora getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        if(formato.toUpperCase().equals("DOCE")||formato.toUpperCase().equals("VINTECATRO")){
            this.formato = FormatoHora.valueOf(formato);
        }
        else {
            if (formato.equals("12")){
                this.formato = FormatoHora.DOCE;
            }
            else this.formato = FormatoHora.VINTECATRO;
        }
    }

    @Override
    public String toString(){
        String cadeaHora;
        if(formato == FormatoHora.VINTECATRO){
         cadeaHora = ("A hora é: "+ horas+ ":"+ minutos+ ":"+ segundos);
        }//end if
        else {
            if (horas > 11) cadeaHora = ("A hora é: "+ (horas - 12)+ ":"+ minutos+ ":"+ segundos+"PM");
            else cadeaHora = ("A hora é: "+ horas+ ":"+ minutos+ ":"+ segundos + "AM");
        }//end else
        return cadeaHora;
    }//toString

}//end class
