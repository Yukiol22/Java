import java.util.ArrayList;

public class ShapeCalculator {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5, "red"));
        shapes.add(new Circle(2, "red"));
        shapes.add(new Rectangle(4.0, 6.0, "blue"));
        shapes.add(new Triangle(3.0, 8.0, "green"));
        System.out.println("Shape Calculator");

        for(Shape i : shapes){
            System.out.println("Area of " + i + ": " + i.calculateArea() + " Color: " + i.getColor() );
        }
    }
}