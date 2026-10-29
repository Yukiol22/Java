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

    public void addItem(String item, double cost, String category , int quantity) {
        for (GroceryItem i : groceryList) {
            if (i.item.equals(item)){
                System.out.println("Item \"" + item + "\" is already in the grocery list!");
                return;
            }
        }
        if (called) {
            updated = true;
            called = false;
        }
        groceryList.add(new GroceryItem(item, cost, category, quantity));
        System.out.println("Added \"" + item + "\" ($" + cost + ") to [" + category + "]");
    }

    public void removeItem(String item) {
        for (int j = 0; j < groceryList.size(); j++) {
            GroceryItem i = groceryList.get(j);
            if (i.item.equals(item)) {
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
            if (i.item.equals(item)) {
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

    public void displayAvailableItems() {
        System.out.println("\nAvailable Items (Positive Quantity):");
        boolean found = false;
        for (GroceryItem i : groceryList) {
            if (i.quantity > 0) {
                System.out.println("- " + i.item + " | Qty: " + i.quantity + " | Unit Cost: $" + i.cost + " | Total: $" + (i.cost * i.quantity)); // Fixed multiplication operator
                found = true;
            }
        }
        if (!found) {
            System.out.println("(No items available)");
        }
    }
    public void updateQuantity(String item, int newQuantity){
        for (GroceryItem i : groceryList){
            if (i.item.equals(item)){
                i.quantity = newQuantity;
                System.out.println("Updated quantity of \"" + item + "\" to " + newQuantity);
                return;
            }
        }
        System.out.println("Item \"" + item + "\" Not Found");
    }

    public void displayByCategory(String item){
        System.out.println("Items in Category [" + item + "]:");
        boolean found = false;
        for (GroceryItem i : groceryList){
            if (i.category.equals(item)){
                System.out.println(i.item);
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
            System.out.println("\nUpdated Grocery List:");
        } else {
            System.out.println("\nGrocery List:");
        }
        for (GroceryItem i : groceryList) {
            System.out.println("- " + i.item + " | Qty: " + i.quantity + " | Unit: $" + i.cost + " [" + i.category + "]");
        }
        System.out.println("Total Cost: $" + calculateTotalCost());
    }

    public static void main(String[] arg) {
        GroceryListManager test = new GroceryListManager();
        test.addItem("Apples", 3.0, "Fruits", 4);
        test.addItem("Milk", 1.5, "Dairy", 2);
        test.addItem("Bread", 2.5, "Bakery", 1);

        test.displayList();

        test.updateQuantity("Milk", 5);

        test.displayAvailableItems();

        test.displayList();
    }
}



