/**
 * Clase principal del programa de "data"
 * @author Oliver Miguez Alonso
 */
public class Main {
    /**
     * Función principal del programa
     * @param args no usamos
     */
    public static void main(String[] args) {

        //FECHA ACTUAL
        Data outroDia = new Data(23,4,20253);//como son distintas fecha da que son valores distintos
        Data outraDataMais = new Data(13,3,2026); // como aplica un incremento en diaDeHoxe da que son iguales
        Data diaDeHoxe = new Data(12,2,2025);
        diaDeHoxe.incrementarDia();
        diaDeHoxe.incrementarMes();
        diaDeHoxe.incrementarAno();
        diaDeHoxe.mostrarData();

        System.out.println(diaDeHoxe.toString()); // metodo toString de la clase objet de java

        //para comparar valores iguales de clases distintas
        System.out.println(diaDeHoxe.dataIgual(outroDia));
        System.out.println(diaDeHoxe.dataIgual(outraDataMais));



    }//end main
}//end class