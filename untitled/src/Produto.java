public class Produto {
    private int codigo;
    private String nombre;
    private double precio;
    private int cantidadStock;

    public Produto(int codigo,String nombre, double precio, int cantidadStock){
        setCodigo(codigo);
        setNombre(nombre);
        setPrecio(precio);
        setCantidadStock(cantidadStock);
    }
    public Produto(){
        codigo= 0;
        nombre = "";
        precio = 0;
        cantidadStock = 0;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if(Integer.toString(codigo).length() == 1){ //Verifica que solo sea un numero
            this.codigo = codigo;
        }
        else this.codigo = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if(precio <= 0 ) this.precio = 10;
        else this.precio = precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        if (cantidadStock < 0) this.cantidadStock = 0;
        else this.cantidadStock = cantidadStock;
    }


    public double aplicarDescuento(double porcentaje){
        if(porcentaje > 0 && porcentaje <= 100){
            precio = precio / porcentaje;
            return precio;
        }
        else {
            return precio;
        }
    }


    public boolean vender(int cantidad){
        if(cantidadStock > 0 ){
            if(cantidad <= cantidadStock){
                cantidadStock -= cantidad;
            }
            return true;
        }

        else{
            return false;
        }
    }


}
