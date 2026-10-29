import java.util.ArrayList;
import java.util.HashMap;

public class GroceryListManager {
    private HashMap<String, Double> groceryList = new HashMap<>();
    private boolean updated = false;
    private boolean called = false;


    public void addItem(String item, double cost) {
        if (!groceryList.containsKey(item)) {
            groceryList.put(item, cost);
            System.out.println("Added \"" + item + "\" ($" + cost + ")");
        } else {
            System.out.println("Item \"" + item + "\" is already in the grocery list.");
        }
        if(called){
            updated=true;
            called = false;
        }
    }

    public void removeItem(String item){
        if (groceryList.containsKey(item)) {
            if (called) {
                updated = true;
                called = false;
            }
            groceryList.remove(item);
            System.out.println("Removing \"" + item + "\" from the list...");
        }
             else {
                System.out.println("Item \"" + item + "\" Not Found");
            }
    }

    public void checkItem(String item){
        boolean exists = groceryList.containsKey(item);
        System.out.println("Is \"" + item + "\" in the grocery list? " + exists);
    }

    public double calculateTotalCost() {
        double total = 0.0;
        for (double cost : groceryList.values()) {
            total += cost;
        }
        return total;
    }

    public void displayList() {
        called = true;
        if (updated){
            System.out.println("Updated Grocery List:");
        }else {
            System.out.println("Grocery List:");
        }
        for (String item : groceryList.keySet()) {
            System.out.println("- " + item + ": $" + groceryList.get(item));
        }
        System.out.println("Total Cost: $" + calculateTotalCost() + "\n");
    }

    public static void main(String[] arg) {
        GroceryListManager test = new GroceryListManager();
        test.addItem("Apples", 3.0);
        test.addItem("Milk", 1.5);
        test.addItem("Bread", 2.5);

        test.displayList();

        test.checkItem("Apples");
        test.checkItem("yayy");

        test.removeItem("Milk");
        test.removeItem("tay");

        test.displayList();
    }
}



