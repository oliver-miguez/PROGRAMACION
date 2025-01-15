import java.util.Scanner;

/**
 * Repaso del eje anterior
 */
public class repaso_ahoracado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Palabra que el usuario debe adivinar
        String palabraAdivinar = "casas";
        // transforma el String de palabraAdivinar en un array de chars
        char[] desglose = palabraAdivinar.toCharArray();
        //Muestra la palabra en version oculta "______"
        char[]progreso = new char[desglose.length];

        for(int i = 0 ; i < progreso.length;i++){
            progreso[i] = '_';
        }//end for
        System.out.println(progreso);
        //total de ronda
        int ronda = 7;
        //acciones que tomara cuando el usuario aun disponga de rondas antes de perder
        do{
            boolean acertar = false;
            System.out.println("Introduce una letra o una palabra: ");
            String texto = sc.next();
            for ( int i = 0; i < palabraAdivinar.length();i++){
                if(texto.charAt(0) == palabraAdivinar.charAt(i)){
                    progreso[i]= texto.charAt(0);
                    System.out.println(progreso);
                    acertar = true;
                }//end if
                else{
                    acertar = false;

                }//end else
                if(acertar == false ){
                    ronda--;
                    System.out.println("error, ronda "+ ronda);
                    break;
                }//end if
                else{
                    System.out.println("portentoso !");
                    break;
                }


            }//end for


//
//                switch (ronda) {
//                    case 1:
//                        System.out.println("\\");
//                    case 2:
//                        System.out.println("/");
//                    case 3:
//                        System.out.println("\\");
//                    case 4:
//                        System.out.println("|");
//                    case 5:
//                        System.out.println("/");
//                    case 6:
//                        System.out.println("O");
//
//                }//end swtich
//            }//end else
        }while(ronda<7);

    }//end main
}//end
