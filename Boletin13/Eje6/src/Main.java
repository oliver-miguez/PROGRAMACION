import java.util.*;

/**
 * Codifica a aplicación que inserte nunha lista un conxunto de números enteiros entre 1 e 10. A partires desta lista crear:
 * Un conxunto cos elementos da lista sen repetir.
 * Un conxunto cos elementos repetidos.
 * Un conxunto cos elementos que só aparecen unha vez (únicos).
 */
public class Main {
    public static void main(String[] args) {
        //ArrayList
        Collection<Integer> numeros = new ArrayList<>(); //almacena todos los números generados
        //almacena los non y los repetidos
        Collection<Integer> nonRepetidos = new ArrayList<>();
        Collection<Integer> repetidos = new ArrayList<>();
        //Verificar si ya se vio en el array un número igual
        Set<Integer> vistos = new HashSet<>();

        //Generar números en cada posición del arrayList
        for(int i = 0; i < 20; i++){
            int num = (int) (Math.random() * 10) +1;
            numeros.add(num);
        }//end for

        for(int num : numeros){
            if(!vistos.add(num)){ //si ya esta en la lista de vistos
                if(!repetidos.contains(num)){//verifica que no se repita varias veces en los repetidos
                    repetidos.add(num);//añade el numero a la lista de repetidos
                }else{
                    nonRepetidos.add(num);
                }
            }
        }
        System.out.println("Repetidos: "+repetidos);
        System.out.println("Non repetidos: "+ nonRepetidos);

    }//end main
}//end class