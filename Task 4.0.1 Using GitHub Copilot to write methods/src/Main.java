public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.add(3);
        calculator.add(7);
        calculator.add(5);

        System.out.println("Sum: " + calculator.getValue());

        calculator.reset();
        System.out.println("After reset: " + calculator.getValue());

        System.out.println("Sum of 2, 4, 6: " + calculator.sum(2, 4, 6));
    }
}
