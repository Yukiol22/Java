# Positive Integer Calculator

This Java project demonstrates a simple MVC model class named `Calculator`. The calculator stores a single integer value, allows positive integers to be added to it, resets the value to zero, and reports the current total. Negative integers are rejected.

## Calculator class

```java
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
```

## How it works

The `value` field stores the calculator's current total. It starts at `0` because Java initializes integer fields to zero.

The `reset()` method sets `value` back to `0`. The `add(int number)` method first checks whether the supplied integer is negative. If it is, the method throws an `IllegalArgumentException` and leaves the stored value unchanged. Otherwise, the method adds the integer to `value`.

The `sum(int... numbers)` method accepts zero or more integers. It processes each number with the `add` method, so negative values are rejected consistently. The method returns the resulting total.

The `getValue()` method is a simple accessor that returns the current calculator total without changing it.
