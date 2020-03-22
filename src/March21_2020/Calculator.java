package March21_2020;

public class Calculator {
    protected int displayValue;

    Calculator() {
        int displayValue = 0;
        System.out.println("Display Value :"+displayValue);
    }

    public void add(int num1, int num2) {
        displayValue = num1 + num2;
        System.out.println(displayValue);
    }

    public void divide(int num1, int num2) {
        displayValue = num1 / num2;
        System.out.println(displayValue);
    }

    public void subtract(int num1, int num2) {
        displayValue = num1 - num2;
        System.out.println(displayValue);
    }

    public void multiply(int num1, int num2) {
        displayValue = num1 * num2;
        System.out.println(displayValue);
    }
}
