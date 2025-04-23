public class Main {
    public static void main(String[] args) {
        Socios sc1 = new Socios("76736880W","Oliver","Ourense","Ourense",18,2000);
        Asalariados as1 = new Asalariados("2323T", "Oliver",12,123451234,"Programador");
        Traballador trab1 = new Traballador("asdfa","Oliver", 23);
        Voluntarios vol1 = new Voluntarios("aqer123","Oliver",112,18,"Programador",2, "Programador");

        System.out.println(sc1.aCadea());
        System.out.println(trab1.aCadea());
        System.out.println(as1.aCadea());
        System.out.println(vol1.aCadea());
        gastosIngresos asoc[] = new gastosIngresos[3];

        asoc[0] = as1;
        asoc[1] = vol1;


    }
}
