import java.util.Scanner;

public class ContaBancaria {
    private int numeroCuenta;
    private String titular;
    private double soldo;
    private  int cantidad;

    public ContaBancaria(int numeroCuenta, String titular, double soldo, int cantidad){
        setSoldo(soldo);
        setTitular(titular);
        setNumeroCuenta(numeroCuenta);
        setCantidad(cantidad);
    }
    public ContaBancaria(){
        numeroCuenta= 123;
        titular = "Oliver";
        soldo = 1000.0;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSoldo() {
        return soldo;
    }

    public void setSoldo(double soldo) {
        this.soldo = soldo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if(cantidad <= 0 ) this.cantidad = 10;
        else this.cantidad = cantidad;
    }
}
