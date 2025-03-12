/**
 * Repaso de Boletín 10 de clases Abstractas
 * @author Oliver Miguez Alonso
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {

        //creacion de Vivenda
        Vivenda viv1 = new Vivenda("Mantelas ",7 ,"Ourense", 12222, "alugada", -9,"si", "ninguna");

        System.out.println(viv1.aCadea());
        System.out.println(viv1.calculadoraImporte());
        System.out.println(viv1.getNumeroHabitacions());

        //creacion PrazaGaraxe
        PrazasGaraxe praz1 = new PrazasGaraxe("mantelas",8,"Ourensense",1444,"comprada",12,4,-56);

        System.out.println(praz1.aCadea());
        System.out.println(praz1.calculadoraImporte());
        System.out.println(praz1.getLocalidade());
        System.out.println(praz1.getNumeroPlaza());
    }//end main
}//end class