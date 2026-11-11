import java.util.List;

public class List_Main {
    public static void main(String[] args) {

        List<String> names = List.of("Ana", "Rui", "Marta");
        List<Integer> ages = List.of(25, 31, 19);
        List<Double> prices = List.of(2.5, 4.0, 1.25);
        List<String> empty = List.of();

        System.out.println("First name: " + ListUtils.first(names));
        System.out.println("Last age: " + ListUtils.last(ages));

        System.out.println("Names:");
        ListUtils.printAll(names);

        System.out.println("Sum of ages: " + ListUtils.sum(ages));
        System.out.println("Average age: " + ListUtils.average(ages));
        System.out.println("Sum of prices: " + ListUtils.sum(prices));
        System.out.println("First of empty list: " + ListUtils.first(empty));
    }
}