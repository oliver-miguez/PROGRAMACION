import java.util.Comparator;

public class ComparadorDni implements Comparator<Cliente> {
    @Override
    public int compare(Cliente c1, Cliente c2) {
        return c1.dni.compareTo(c2.dni);
    }
}
