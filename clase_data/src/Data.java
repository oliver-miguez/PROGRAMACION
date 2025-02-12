/**
 * Definición de una clase data
 * @author Oliver Miguez Alonso
 */
public class Data {
    private int dia ;
    private int mes ;
    private int ano ;
    private String data;

    //constructor de la clase
    public Data(int dia, int mes , int ano , String data){
        setDia(dia);
        setMes(mes);
        setAno(ano);
        setData(data);
    }//end Data


    //SETTERS Y GETTERS

    //simplemente, para poder cambiar la fecha a nuestro antojo en la main

    public int getDia() {
        return dia;
    }//end getDia

    public void setDia(int dia) {
        int[]diaMes = {31,28,31,30,31,30,31,31,30,31,30,31}; //dias totales de cada mes
        int diasMax = diaMes [ mes - 1 ];
        if ((eBisiesto() == true) && mes == 2) diasMax = 29;
        if (dia > 0 && dia < diasMax + 1) this.dia = dia;
        else this.dia = 1;
    }//end setDia


    public int getMes() {
        return mes;
    }//end getMes

    public void setMes(int mes) {
        if(mes > 0 && mes < 13) this.mes = mes;
        else this.mes = 1 ;
    }//end setMes


    public int getAno() {
        return ano;
    }//end getAno

    public void setAno(int ano) {
        if(ano >= 0) this.ano = ano;
        else this.ano = 0;
    }//end setAno


    public String getData() {
        return data;
    }//end getData

    public void setData(String data) {
        this.data = data;
    }//end setData

    //END SETTERS Y GETTERS



    //MÉTODOS

    /**
     * Verifica si coincide que es un año bisiesto
     * @return true si es bisiesto o false si no lo es
     */
    private boolean eBisiesto(){
        if((ano % 4 == 0) && (ano % 100 == 0) ||(ano % 400 == 0)) return  true;
            else return false;
    }//end eBisiesto


    /**
     * Permite incrementar en 1 el mes
     */
    public void incrementarMes(){
        if ( mes == 12){
            mes = 1;
            incrementarAno();
        }//end if
        else{
            mes ++;
        }//end else
    }//end incrementarMes

    /**
     * Aumenta en 1 el año
     */
    public void incrementarAno(){
        ano++;
    }//end incrementarAno



}//end class
