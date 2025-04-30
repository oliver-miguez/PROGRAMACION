public class Main {
    public static void main(String[] args) {

        //Formas de utilizar los contenedores(collection) en java

        //Contenedor solo para objetos tipo integer
        //1ºForma
        Contedor<Integer> num = new Contedor<Integer>();
        num.gardar(5);
        System.out.println(num.extraer());

        //Contenedor para Strings
        //2ºForma
        Contedor<String > cad = new Contedor<>();
        cad.gardar("Ola mundo");
        System.out.println(cad.extraer());

        //3ºForma
        Contedor ele = new Contedor();
        ele.gardar(6);
        System.out.println(ele.extraer());

        //Contenedor para Cualquier tipo
        //4ºForma
        Contedor<?> contedorParaCalqueraTipo = new Contedor<Integer>();//se le asigna a un contenedor de cualquier tipo un objeto integer
        contedorParaCalqueraTipo = new Contedor<Double>();

        /*
        QUE NO SE PUEDE HACER CON LOS TIPOS GENÉRICOS:
        1- No se pueden usar primitivos: int, float, double --> en cambio hay que usar clases como Int, Float, Double(clases envoltorio)
        2- No se puede hacer instancias de genéricos , no se puede hacer un "new T()"
        3- No se pueden crear tablas de esos genéricos "new T[10]"
        4- No se pueden crear tablas de clases parametrizadas " new Contedor <integer>[5] "
        5- No pueden usar excepciones genéricas
         */

        System.out.println("______________________________________________________________");

        //Probando Pila y ContedorElementos

        //Array de valores que utilizaremos para probar las interfaces
        Double[] temp = new Double[5];
        temp[0] = 2.3;
        temp[1] = 15.53;
        temp[2] = 22.43;
        temp[3] = -5.66;
        temp[4] = 15.77;

        ContedorElementos<Double> t = new ContedorElementos<>(temp);
        t.apilar(2.33);
        t.apilar(56.7);
        t.apilar(777.2);

        System.out.println(t.desapilar());
        System.out.println(t.desapilar());
        System.out.println(t.desapilar());
        System.out.println(t.desapilar());

        System.out.println("______________________________________________________________");

        //Probando Fila
        t.encolar(1.34);
        t.encolar(5.54);
        System.out.println(t.desencolar());
        System.out.println(t.desencolar());
        System.out.println(t.desencolar());
        System.out.println(t.desencolar());
        System.out.println(t.desencolar());
        System.out.println(t.desencolar());


    }
}
