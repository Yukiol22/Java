public class Main{
    private String name;

    public Main(String name){
        this.name = name;
    }
    public void meow() {
        System.out.println("The cat named " + name + " says: Meow!");
    }
    public static void main(String[] arg){
        Main cat = new Main("Whiskers");
        Main cat2 = new Main("Rex");

        cat.meow();
        cat2.meow();
    }
}