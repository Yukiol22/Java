import java.util.ArrayList;

public class GroceryListManager {
    private static class GroceryItem{
        String item;
        Double cost;
        String category;

        public GroceryItem(String item, double cost,String category ){
            this.item = item;
            this.cost = cost;
            this.category = category;
        }
    }
    private ArrayList<GroceryItem> groceryList = new ArrayList<>();
    private boolean updated = false;
    private boolean called = false;

    public void addItem(String item, double cost,String category) {
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
        groceryList.add(new GroceryItem(item, cost, category));
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
        for (GroceryItem i : groceryList){
            total += i.cost;
        }
        return total;
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
        if (updated){
            System.out.println("Updated Grocery List:");
        }else {
            System.out.println("Grocery List:");
        }
        for (GroceryItem i : groceryList) {
            System.out.println("- " + i.item + " ($" + i.cost + ") [" + i.category + "]");
        }
        System.out.println("Total Cost: $" + calculateTotalCost() + "\n");
    }

    public static void main(String[] arg) {
        GroceryListManager test = new GroceryListManager();
        test.addItem("Apples", 3.0, "Fruits");
        test.addItem("Milk", 1.5, "Dairy");
        test.addItem("Bread", 2.5, "Bakery");
        test.addItem("Bananas", 2.0, "Fruits");

        test.displayList();

        test.displayByCategory("Fruits");
        test.checkItem("Apples");
        test.removeItem("Milk");

        test.displayList();
    }
}



