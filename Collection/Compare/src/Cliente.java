import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Cliente implements Comparable<Cliente> {
    String dni;
    String nome;
    LocalDate dataNacemento; //clase para trabajar con datas

    public Cliente(String dni, String nome, String dataNacemento){
        this.dni = dni;
        this.nome = nome;
        /*
        La clase DateTimeFormatter permite crear un formato de estructura para una data o fecha
        y utilizando el metodo ofPattern es como le damos un formato sencillo siguiendo cierto patrón(especificado en la documentación)
         */
        DateTimeFormatter formatoDatas = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //Proporciona un formato específico a la data que introduciremos
        /*
        El utilizar el metodo parse lo que hacemos es darle a la propiedad "dataNacemento" el formato creado anteriormente
         */
        this.dataNacemento = LocalDate.parse(dataNacemento,formatoDatas);//a la "dataNacemento" se le aplicará el forma creando anteriormente
    }//end constructor

    int edade(){
        return (int) dataNacemento.until(LocalDate.now(),ChronoUnit.YEARS);
    }

    /**
     * Compara dos clientes, si por ejemplo el cliente anteriormente creado tiene una edad mayor mostrará una cosa con respecto a si tiene la misma edad
     * o una edad menor.
     * En coso de que sea un dni el compareTo lo verificará de manera distinta
     * @param outro cliente nuevo con el que se comparará
     * @return
     */
    @Override
    public int compareTo(Cliente outro) {
       int res = 0;
       if(this.edade() > outro.edade()) res = 1;
       if(this.edade() < outro.edade()) res = -1;

       return res;
    }


}//end class