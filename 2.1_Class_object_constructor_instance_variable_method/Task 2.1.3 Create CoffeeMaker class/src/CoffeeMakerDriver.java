public class CoffeeMakerDriver {
    public static void main(String[] args){
        CoffeeMaker coffee = new CoffeeMaker();

        coffee.setOnOff();

        if (coffee.CoffeeMakerIsOn()) {
            System.out.println("Coffee maker is on");
        }

        coffee.setCoffeeType("espresso");
        coffee.setCoffeeAmmount(50);

        System.out.println("Coffee type is " + coffee.getCoffeeType());
        System.out.println("Coffee amount is " + coffee.getCoffeeAmmount() + " ml");

        coffee.setOnOff();
        if (!coffee.CoffeeMakerIsOn()){
            System.out.println("Coffee maker is off");
        }


    }
}
