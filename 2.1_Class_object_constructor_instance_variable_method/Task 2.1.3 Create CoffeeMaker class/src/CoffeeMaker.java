public class CoffeeMaker {
    private String type;
    private double ammount;
    private boolean isOn ; ;

    public CoffeeMaker(){
        this.type = "normal";
        this.ammount = 10;
        this.isOn = false;
    }

    public void setOnOff(){
        this.isOn =  !this.isOn;
    }

    public void setCoffeeType(String type) {
        if (this.isOn) {
            this.type = type;
        }
    }
    public void setCoffeeAmmount(double ammount){
        if (this.isOn && ammount >= 10 && ammount<=80){
            this.ammount = ammount;
        }
    }

    String getCoffeeType(){
        return type;
    }
    Double getCoffeeAmmount(){
        return ammount;
    }

    boolean CoffeeMakerIsOn(){
        return isOn;
    }
}
