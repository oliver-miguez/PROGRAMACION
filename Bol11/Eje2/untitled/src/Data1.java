/**
 * Verifica si la data introducida es correcta
 */
public class Data1 {
    private int dia;
    private int mes;
    private int ano;

    public Data1(int dia, int mes, int ano){
        setAno(ano);
        setMes(mes);
        setDia(dia);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        try{
            if (dia == 28 || mes == 2){
                System.out.println("bisiesto");
                this.dia = dia;
            }else if (dia == 28 || mes != 2){
                if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
                    System.out.println("Tiene 31 dias este mes");
                    this.dia = dia;
                }else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
                    System.out.println("Tiene 30 dias");
                    this.dia = dia;
                }
            }
            if(dia > 31){
                throw new Exception("Dia erroneo");
            }else{
                System.out.println("Dia correcto");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public int getMes() {
        return mes;
    }

    /**
     * Mes no puede ser mayor a 12
     * @param mes introducido
     */
    public void setMes(int mes) {
        try{
            if(mes <= 12){
                System.out.println("Mes introducido correcto");
                this.mes = mes;
            }else{
                throw new Exception("Mes incorrecto");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        try{
            if (ano > 2999){
                throw new Exception("Ano erroneo");
            } else if (ano < 1000) {
                throw new Exception("Ano erroneo");
            } else{
                System.out.println("Ano correcto");
                this.ano = ano;
            }
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }

    }

    public String aCadea(){
        return "La fecha es:"+getDia()+"/"+ getMes()+"/"+getAno();
    }

}
