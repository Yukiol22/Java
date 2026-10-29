import java.util.ArrayList;
public class GroceryListManager {
    private ArrayList<String> grocerylist = new ArrayList<>();
    private boolean updated = false;
    private boolean called = false;


    public void addItem(String item){
        if (!grocerylist.contains(item)) {
            grocerylist.add(item);
        }else {
            System.out.println("Item " + item + " Is Already In Grocery list");
        }
        if(called){
            updated=true;
            called = false;
        }
    }

    public void removeItem(String item){
        if (grocerylist.contains(item)) {
            if(called){
                updated=true;
                called = false;
            }
            for (int i = 0; i < grocerylist.size(); i++) {
                String value = grocerylist.get(i);
                if (value == item) {
                    System.out.println("Removing" + "\"" +item +"\"" + " from the list...");
                    grocerylist.remove(i);
                }
            }
        }else{
            System.out.println("Item "  + "\"" +item +"\"" + " Not Found");
        }
    }
    public void checkItem(String item){
        boolean value = grocerylist.contains(item);
        System.out.println("Is " + '"'+item+'"'+ " in the grocery list? " + value);

    }


    public void displayList(){
        called = true;
        if (updated){
            System.out.println("Updated Grocery List:");
        }else {
            System.out.println("Grocery List:");
        }
        for (int i = 0 ; i < grocerylist.size(); i++){
            System.out.println((i+1)+". "+grocerylist.toArray()[i]);
        }
        updated = false;
    }

    public static void main(String[] arg) {
        GroceryListManager test = new GroceryListManager();
        test.addItem("Apples");
        test.addItem("Milk");
        test.addItem("Bread");
        test.displayList();
        test.checkItem("Apples");
        test.checkItem("yayy");
        test.removeItem("Milk");
        test.removeItem("tay");
        test.displayList();
    }
}
