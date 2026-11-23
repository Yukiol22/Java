public class Calculator {
    private int value;

    public void reset() {
        value = 0;
    }

    public void add(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Negative integers are not allowed");
        }
        value += number;
    }

    public int sum(int... numbers) {
        for (int number : numbers) {
            add(number);
        }
        return value;
    }

    public int getValue() {
        return value;
    }
}
