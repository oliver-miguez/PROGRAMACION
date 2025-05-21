import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Crear a aplicación que simula o rexistro das temperaturas, o longo dun día, nunha estación meteorolóxica. A aplicación mostrará un menú coas opcións:
 * Novo rexistro (o introduciremos manualmente, ainda que se supón que o sistema debería estar automatizado).
 * Listar rexistros.
 * Mostar a estatística (cos valores máximo, mínimo e promedio das temperaturas rexistradas ata o momento dende a primeira lectura do dia.
 * Saír.
 * 	O sair, os datos se gardarán nun ficheiro binario, onde o nome estará composto pola cadea “rexistros” concatenada coa data do día no formato “yyyyMMdd” e extensión “.dat”.
 * 	Cada rexistro constará da temperatura en grados centígrados a hora, que se lerá do sistema no momento da creación do rexistro.
 */
public class Main {
    public static void main(String[] args) {

        List<Integer> valores = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int op;

        do{

        System.out.println("MENU DE OPCION");
        System.out.println("1.Novo Rexistro");
        System.out.println("2.Mostrar Rexistros");
        System.out.println("3.Mostrar a estadistica");
        System.out.println("4.Sair");
        op = sc.nextInt();

            switch (op){
                case 1 -> novoRexistro(valores);
                case 2 -> mostrarRexistros(valores);
                case 3 -> estadisticas(valores);
                case 4 -> System.out.println("Cerrando programa");
                default -> System.out.println("Opción no válida");
            }//end switch

        }while (op != 4);

    }//end main

    /**
     * Permite introducir un nuevo registro de temperatra
     * @param valores arrayList donde almacenará los valores recogidos
     */
    static void novoRexistro(List<Integer> valores){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un novo rexistro:");
        int rexistro = sc.nextInt();

        valores.add(rexistro);
        System.out.println("Rexistrado correctamente");
    }//end novoRexistro

    /**
     * Muestra los registros guardados
     * @param valores
     */
    static void mostrarRexistros(List<Integer> valores) {
        if (valores.isEmpty()) {
            System.out.println("Aún no hay rexistros almacenados.");
        } else {
            System.out.println("Rexistros guardados:");
            System.out.println(valores);
        }
    }//end mostrarRexistros

    /**
     * Muestra la temperatura mayor, menor y el promedio
     * @param valores arrayList
     */
    static void estadisticas(List<Integer>valores){
        int max = 0;
        int min = 0;
        int promedio = 0;

        for(Integer valor : valores) {
            max = Collections.max(valores);
            min = Collections.min(valores);
            promedio += valor;
        }//end for

        System.out.println("Max:"+max);
        System.out.println("Min:"+min);
        System.out.println("Promedio:"+promedio);

    }//end estadisticas


}//end class