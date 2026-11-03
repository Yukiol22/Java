public class Motorcycle implements Vehicle {
    private String fuel;
    private String color;

    public Motorcycle(String fuel, String color){
        this.color = color;
        this.fuel = fuel;
    }

    @Override
    public void start(){
        System.out.println("Motorcycle is starting...");
    }

    @Override
    public void stop(){
        System.out.println("Motorcycle is stopping...");
    }

    @Override
    public String getInfo(){
       return "Motorcycle Information:" +
               "\nType: Motorcycle" +
               "\nFuel: " + fuel +
               "\nColor: " + color ;
    }


}
