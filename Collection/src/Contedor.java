public class Contedor <T>{    //A letra T usase para tipos de caracter xenérico, (existen varios tipos mais especificos)

    //PROPIEDADES
    private T obxeto;
    //CONSTRUCTOR
    public Contedor(){}

    //MÉTODOS

    /**
     * Permitira gardar o obxeto
     * @param novo novo obxeto que se creou
     */
    void gardar(T novo){
        obxeto = novo;
    }

    /**
     * Devolta unha referencia ao obxeto e vacía o obxeto evitando que tome de nomo referencia
     * @return referencia ao obxeto
     */
    T extraer(){
        T res = obxeto;
        obxeto= null;
        return res;
    }
}
