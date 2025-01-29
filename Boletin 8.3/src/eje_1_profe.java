public class eje_1_profe {

    public static void main(String[] args) {
        String[]secFrigorifico;

        secFrigorifico = palabraNsecuencias("Frigorifico",4);

        for( int i = 0; i < secFrigorifico.length;i++){
            System.out.println(secFrigorifico[i]);
        }//end for
    }//end main

    /**
     * Calcula las distintas secuencias posibles de dividir el String original en distintas partes
     * @param palabra String original
     * @param nCaracteres Caracteres en los que se quiere dividir
     * @return
     */
    public static String[]palabraNsecuencias(String palabra, int nCaracteres){
        int sec = palabra.length() - nCaracteres + 1; //calcula el número de secuencias que son necesarias realizar
        //si el usuario introduce que quiere dividirla de 4 en 4
        // calcula que solo existiran dos secuencias posibles de la palabra , en este caso "casas"

        String[] secuencias = new String[sec];

        for ( int i = 0 ; i < sec ; i++ ){
            secuencias[i]= palabra.substring(i,nCaracteres + 1);
        }//end for
        return  secuencias;
    }//end palabraNsecuencias

}//end class

