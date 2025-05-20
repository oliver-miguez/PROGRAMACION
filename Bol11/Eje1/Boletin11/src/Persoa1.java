public class Persoa1 {
    private  String nome;
    private  String direccion;
    private String dni;

    public Persoa1(String nome, String direccion, String dni){
        setDireccion(direccion);
        setDni(dni);
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        try{
            //si el length no es el esperado muestra un Exception
            if(dni.length() != 9){
                throw  new Exception("Introduzca un dni de 9 digitos");
            }
            this.dni = dni;
        }catch (Exception e){
            System.out.println("Error"+e.getMessage());
        }
    }
}
