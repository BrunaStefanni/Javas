import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ShoppingList {

    List<String> items = new ArrayList<>();

    // Adicionar um produto
    public void addItem(String item) {
        if (items.contains(item)) {
            System.out.println(item + " is already on the list");
        } else {
            items.add(item);
        }
    }

    // Remover um produto
    public void removeItem(String item) {
        if (items.contains(item)) {
            items.remove(item);
        } else {
            System.out.println(item + " is not on the list");
        }
    }

    // Mostrar a lista
    public void show() {
        System.out.println("Shopping list (" + items.size() + " items):");

        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i));
        }
    }

    // Programa principal
    public static void main(String[] args) {
        ShoppingList list = new ShoppingList();

        list.addItem("milk");
        list.addItem("bread");
        list.addItem("eggs");
        list.addItem("bread");
        list.addItem("apples");

        list.show();

        list.removeItem("eggs");
        list.removeItem("coffee");

        list.show();
    }
}
