public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height, String color){
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public String toString(){
        return "Rectangle with width " + width + " and height " + height;
    }
}
