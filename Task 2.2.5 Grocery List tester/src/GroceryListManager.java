import java.util.ArrayList;

public class GroceryListManager {
    private static class GroceryItem{
        String item;
        Double cost;
        String category;
        int quantity;

        public GroceryItem(String item, double cost, String category, int quantity){
            this.item = item;
            this.cost = cost;
            this.category = category;
            this.quantity = quantity;
        }
    }

    private ArrayList<GroceryItem> groceryList = new ArrayList<>();
    private boolean updated = false;
    private boolean called = false;

    public void addItem(String item, double cost, String category, int quantity) {
        for (GroceryItem i : groceryList) {
            if (i.item.equalsIgnoreCase(item)){
                System.out.println("Item \"" + item + "\" is already in the grocery list!");
                return;
            }
        }
        if (called) {
            updated = true;
            called = false;
        }
        groceryList.add(new GroceryItem(item, cost, category, quantity));
        System.out.println("Added \"" + item + "\" ($" + cost + ") to [" + category + "] x" + quantity);
    }

    public void removeItem(String item) {
        for (int j = 0; j < groceryList.size(); j++) {
            GroceryItem i = groceryList.get(j);
            if (i.item.equalsIgnoreCase(item)) {
                if (called) {
                    updated = true;
                    called = false;
                }
                groceryList.remove(j);
                System.out.println("Removing \"" + item + "\" from the list...");
                return;
            }
        }
        System.out.println("Item \"" + item + "\" Not Found");
    }

    public void checkItem(String item) {
        boolean exists = false;
        for (GroceryItem i : groceryList) {
            if (i.item.equalsIgnoreCase(item)) {
                exists = true;
                break;
            }
        }
        System.out.println("Is \"" + item + "\" in the grocery list? " + exists);
    }

    public double calculateTotalCost() {
        double total = 0.0;
        for (GroceryItem i : groceryList) {
            total += (i.cost * i.quantity);
        }
        return total;
    }

    public void updateQuantity(String item, int newQuantity){
        for (GroceryItem i : groceryList){
            if (i.item.equalsIgnoreCase(item)){
                i.quantity = newQuantity;
                System.out.println("Updated quantity of \"" + item + "\" to " + newQuantity);
                return;
            }
        }
        System.out.println("Item \"" + item + "\" Not Found");
    }

    public void displayByCategory(String targetCategory){
        System.out.println("\nItems in Category [" + targetCategory + "]:");
        boolean found = false;
        for (GroceryItem i : groceryList){
            if (i.category.equalsIgnoreCase(targetCategory)){
                System.out.println("- " + i.item + " (Qty: " + i.quantity + ", Cost: $" + i.cost + ")");
                found = true;
            }
        }
        if(!found){
            System.out.println("(No items found in this category)");
        }
    }

    public void displayList() {
        called = true;
        if (updated) {
            System.out.println("\n--- Updated Grocery List ---");
        } else {
            System.out.println("\n--- Grocery List ---");
        }
        for (GroceryItem i : groceryList) {
            System.out.println("- " + i.item + " | Qty: " + i.quantity + " | Unit: $" + i.cost + " | total: $" + (i.cost * i.quantity) + " [" + i.category + "]");
        }
        System.out.println("Total Cost: $" + calculateTotalCost() + "\n---------------------------------------------------------------");
    }

    public void displayAvailableItems() {
        System.out.println("\n--- Available Items (Positive Quantity) ---");
        boolean found = false;
        for (GroceryItem i : groceryList) {
            if (i.quantity > 0) {
                System.out.println("- " + i.item + " | Qty: " + i.quantity + " | Unit Cost: $" + i.cost + " | Total: $" + (i.cost * i.quantity));
                found = true;
            }
        }
        if (!found) {
            System.out.println("(No items available)");
        }
        System.out.println("---------------------------------------------------------------");
    }

    public static void main(String[] arg) {
        System.out.println("=== TEST ===");
        GroceryListManager test = new GroceryListManager();


        test.addItem("Apples", 3.0, "Fruits", 4);
        test.addItem("Milk", 1.5, "Dairy", 2);
        test.addItem("Bread", 2.5, "Bakery", 1);
        test.addItem("Bananas", 2.0, "Fruits", 3);
        test.addItem("Cheese", 4.0, "Dairy", 1);

        test.checkItem("Milk");

        test.displayList();

        test.displayByCategory("Fruits");
        test.displayByCategory("Dairy");
        test.displayByCategory("ep");

        test.addItem("Milk", 2.0, "Dairy", 1);

        test.updateQuantity("Milk", 5);

        test.displayAvailableItems();

        test.removeItem("Bread");

        test.displayList();

        System.out.println("=== ALL TESTS DONE ===");
    }
}