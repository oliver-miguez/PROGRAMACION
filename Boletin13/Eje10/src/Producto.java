import java.io.Serializable;

public class Producto implements Serializable {
    private String codigoProducto;
    private String nomeProducto;
    private int cantidad;

    public Producto(String codigoProducto, String nomeProducto, int cantidad) {
        this.codigoProducto = codigoProducto;
        this.nomeProducto = nomeProducto;
        this.cantidad = cantidad;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNomeProducto() {
        return nomeProducto;
    }

    public void setNomeProducto(String nomeProducto) {
        this.nomeProducto = nomeProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String toString(){
        return "Codigo: "+ codigoProducto+ " nome: "+ nomeProducto + " cantidad: "+ cantidad;
    }
}
