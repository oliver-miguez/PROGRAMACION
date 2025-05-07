import java.util.Comparator;

public class ComparadorDni implements Comparator<String> {
    @Override
    public int compare(String dni1, String dni2) {
        return dni1.compareTo(dni2);
    }
}
