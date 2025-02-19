import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class ContaCorrente {

    //Atributos del objeto

    private int soldo;
    private String nomeTitular;
    private String numeroConta;
    private  String nif;
    public static int contadorContas = 0;


    //CONSTRUCTOR
    public ContaCorrente(int s, String n, String nC, String nT, int cC){
        setSoldo(s);
        setNif(n);
        setNumeroConta(nC);
        setNomeTitular(nT);
        contadorContas++;
    }//end constructor

    //GETTERS Y SETTERS
    public int getSoldo() {
        return soldo;
    }
    public void setSoldo(int soldo) {
        if(soldo < 0) this.soldo = 0;
        else this.soldo = soldo;
    }



    public String getNomeTitular() {
        return nomeTitular;
    }
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }



    public static int getContadorContas() {
        return contadorContas;
    }
    public static void setContadorContas(int contadorContas) {
        ContaCorrente.contadorContas = contadorContas;
    }


    public String getNif() {
        return nif;
    }
    public void setNif(String nif) {
        char letrasNif[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

        if(nif.length() == 9 ) {
            int num = Integer.parseInt(nif.substring(0,9));
            if(nif.charAt(8) == letrasNif[num%23]){
                this.nif = nif;
            }//end if
            else nif = "00000000T"; //valor por defecto
            System.out.println("O nif e incorrecto");
        }//end if
        else{
            nif = "00000000T"; //valor por defecto
            System.out.println("O nif e incorrecto");
        }//end else

    }//end setnif


    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }



    //METODOS

    /**
     * Permite sacar dinero que se tenga ingresado
     * @return El total de dinero que se quiere retirar
     */
    public int sacarDinero(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Canto diñeiro desexa retirar da sua conta (escribelo por pantalla): ");
        int retirar = sc.nextInt();

        int calculo = soldo - retirar;
        if(calculo > 0){
            System.out.println("Retirouse: " + retirar);
            System.out.println("Diñeiro restante:");
            return  calculo;
        }//end if
        else{
            System.out.println("No tienes tanto dinero para retirar");
            return  soldo;
        }//end else
    }//end sacarDinero

    /**
     * Permite ampliar a cantidade de diñero que tes na conta(ingresar)
     * @return a nova cantidade de cartos que tes
     */
    public int ingresarDiñeiro(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Canto queres ingresar (introduce os datos por pantalla:");
        int ingresar = sc.nextInt();
        int novoSoldo = 0;
        if(ingresar > 0) {
             novoSoldo = soldo + ingresar;
            System.out.println("Diñeiro actual:");
            return novoSoldo;
        }//end if
        else{
            System.out.println("No puedes ingresar esa cantidad ");
            System.out.println("Diñeiro actual:");
            return soldo;
        }

    }//end ingresarDiñeiro

    /**
     * Permite cambiar datos como o nome do titular e mais o nif
     * @return os novos datos cambiados
     */
    public String modificarDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce o novo nome do titular: ");
        String novoTitular = sc.next();

        System.out.println("Introduce o novo nif: ");
        String novoNif = sc.next();

        String datos ="";

        nomeTitular = novoTitular;
        if (novoNif.length() <= 9) {
            nif = novoNif;
            datos = novoTitular + " "+ novoNif;
            return datos;

        }//end if
        else System.out.println("Hay datos non correctos, recorda son 9 dixitos de nif");
        return "Tente mais tarde a modificacion";
    }//end modificarDatos


}//end ContaCorrente
