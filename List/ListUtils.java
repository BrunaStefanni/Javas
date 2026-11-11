import java.util.List; // não roda nesta pasta, preferencialmente executar em outro repositório

public class ListUtils {

    // Primeiro elemento (ou null se a lista estiver vazia)
    public static <T> T first(List<T> lista) {
        if (lista.isEmpty()) {
            return null;
        }
        return lista.get(0);
    }

    // Último elemento (ou null se a lista estiver vazia)
    public static <T> T last(List<T> lista) {
        if (lista.isEmpty()) {
            return null;
        }
        return lista.get(lista.size() - 1);
    }

    // Escreve cada elemento numa linha, com "- " antes
    public static <T> void printAll(List<T> lista) {
        for (T elemento : lista) {
            System.out.println("- " + elemento);
        }
    }

    // Soma os números usando doubleValue()
    public static <T extends Number> double sum(List<T> lista) {
        double total = 0;
        for (T numero : lista) {
            total += numero.doubleValue();
        }
        return total;
    }

    // Média (lista vazia devolve 0)
    public static <T extends Number> double average(List<T> lista) {
        if (lista.isEmpty()) {
            return 0;
        }
        return sum(lista) / lista.size();
    }

    // EXTRA: wildcard
    public static double sumAll(List<? extends Number> lista) {
        double total = 0;
        for (Number numero : lista) {
            total += numero.doubleValue();
        }
        return total;
    }
}