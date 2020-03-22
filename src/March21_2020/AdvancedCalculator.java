package March21_2020;

public class AdvancedCalculator extends Calculator {
    protected String screenColor;

    AdvancedCalculator() {
        super();
        this.screenColor = "blue";
    }

    public void average(int num1, int num2) {
        displayValue = (num1 + num2) / 2;
        System.out.println(displayValue);
    }

    public void factorial(int num1) {
        displayValue = num1*(num1-1)*(num1-2);
        System.out.println(displayValue);
    }

    public void sqrt(double num1) {
        displayValue = (int)(Math.sqrt(num1));
        System.out.println(displayValue);
    }

    public void pow(int num1, int num2) {
        displayValue = (num1 * num2);
        System.out.println(displayValue);
    }
}
