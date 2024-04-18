package Ejercicio3;
import java.util.Comparator;
public class OrdeAlfabetico implements Comparator <Empregado>{
    @Override
    public int compare(Empregado e1, Empregado e2) {
        return e1.nome.compareToIgnoreCase(e2.nome);
    }
}
