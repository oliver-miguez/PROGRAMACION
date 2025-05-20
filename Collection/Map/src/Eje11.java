import java.util.*;

/**
 * Os membros da Real Academia da Lengua ocupan sillóns coas letras do abecedario español.
 * Cando un sillón queda vacante noméase un novo académico para ocupalo.
 * Implementar a clase Academico, con atributos como o nome e ano de ingreso. O criterio natural de ordeación será por nome.
 * Crear o programa onde créanse cinco obxectos Academico, que se insertan nun mapa no que a clave é a letra do
 * sillón que ocupan e o valor un obxecto da clase Academico. Para iso implementar o método estático
 * static boolean nuevoAcademico (Map<Character, Academico> academia, Academico novo, Character letra)
 * onde se fai a inserción despois de comprobar que o caracter pasado como parámetro non é unha letra do abecedario.
 * Facer varios listados dos académicos:
 * Sen letra, por orde de nome, por ano de ingreso.
 * Con letra, por orde de letra (clave), nome e data de ingreso.
 * 	Lembrar que, en código unicode, as maiúsculas va antes que as minúsculas.
 */
public class Eje11{
    public static void main(String[] args) {
        //Mapa que almacena todos los objetos válidos creados
        Map<Character,Eje11Academico> mapa  = new TreeMap<>();

        //Añade objetos al mapa
        nuevoAcademico(mapa,new Eje11Academico("Oliver",2006),'a');
        nuevoAcademico(mapa,new Eje11Academico("Pedro",2006),'c');
        nuevoAcademico(mapa,new Eje11Academico("Javier",2006),'b');
        nuevoAcademico(mapa,new Eje11Academico("Raul",2006),'e');
        nuevoAcademico(mapa,new Eje11Academico("Fernando",2006),'d');

        //Muestra el mapa
        System.out.println(mapa.toString());


    }//end main

    /**
     * Verificar si la letra introducida en el objeto a añadir al mapa es valida
     * @param academia mapa
     * @param novo Objeto academia (nombre,ano nacemento)
     * @param letra valor de la letra (la key del map)
     * @return true o false dependiendo si la letra es o no válida
     */
    static boolean nuevoAcademico (Map<Character, Eje11Academico> academia, Eje11Academico novo, Character letra) {
        //Verificar si la llave introducida es una letra
        if(Character.isLetter(letra)){
            academia.put(letra, novo);//añade al mapa la key y el valor de Académico
            System.out.println("Valor Añadido correctamente");
            return true;
        }else{
            System.out.println("La key de los objetos añadidos no es correcta");
            return false;
        }//end else
    }//end static boolean
}//end class
