/**
 * Definición de una clase data
 * @author Oliver Miguez Alonso
 */
public class Data {
    private int dia ;
    private int mes ;
    private int ano ;

    //constructor de la clase
    public Data(int dia, int mes , int ano ){
        setAno(ano);
        setMes(mes);
        setDia(dia);
    }//end Data


    //SETTERS Y GETTERS

    //simplemente, para poder cambiar la fecha a nuestro antojo en la main

    public int getDia() {
        return dia;
    }//end getDia

    public void setDia(int dia) {
        if (dia > 0 && dia < diasMes() + 1) this.dia = dia; //coge el valor diasMes del metodo
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



    //END SETTERS Y GETTERS


    //MÉTODOS

    /**
     * Verifica si coincide que es un año bisiesto
     * @return true si es bisiesto o false si no lo es
     */
    private boolean eBisiesto(){
        if((ano % 4 == 0) && (ano % 100 != 0) ||(ano % 400 == 0)) return  true;
            else return false;
    }//end eBisiesto


    /**
     * Permite incrementar el dia en 1
     */
    private int diasMes(){
        int[]diaMaxMes = {31,28,31,30,31,30,31,31,30,31,30,31}; //dias totales de cada mes
        int diasMes = diaMaxMes [ mes - 1 ];
        if ((eBisiesto() == true) && mes == 2) diasMes = 29;
        return diasMes;
    }//end incrementarDia

    public String toString(){
        return "A data é " + dia+"/"+ mes + "/"+ ano;
    }//end toString

    //FUNCIONES QUE DESEMPEÑA LA CLASE OBJET DE STRING ; TENEMOS QUE DEFINIRLA EN LA CLASE

    /*
     el data que hay de variable es el objeto Data que pertenece a la
     clase que creamos Data, el cual al igual que la clase contiene también el dia el mes y el año

     Compara los valores de las propiedades del objeto , y las compara con las propiedades de otro objeto
     */
    public boolean dataIgual(Data outraData){
        if((dia == outraData.dia) && ( mes == outraData.mes) && ( ano == outraData.ano))return  true;
        else return false;
    }//end dataIgual

//    public boolean compare(Data outraData){
//
//    }//end compare




    public void incrementarDia(){
        if(dia == diasMes()){
            dia = 1;
            incrementarMes();
        }//end if
        else dia++;
    }//end incrementarDia

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

    public void mostrarData(){
        System.out.println(dia+"/"+ mes+ "/"+ ano);
    }//end mostrarData


}//end class
