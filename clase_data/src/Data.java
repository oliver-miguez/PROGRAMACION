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

    /*
    SETTERS Y GETTERS
     */
    public int getDia() {
        return dia;
    }//end getDia

    public void setDia(int dia) {
        this.dia = dia + 1; //aumenta en uno el dia
    }//end setDia

    public int getMes() {
        return mes;
    }//end getMes

    public void setMes(int mes) {
        this.mes = mes + 1;
    }//end setMes

    public int getAno() {
        return ano;
    }//end getAno

    public void setAno(int ano) {
        this.ano = ano + 1;
    }//end setAno


    public String getData() {
        return data;
    }//end getData

    public void setData(String data) {
        this.data = data;
    }//end setData

    /*
    END SETTERS Y GETTERS
     */
}//end class
