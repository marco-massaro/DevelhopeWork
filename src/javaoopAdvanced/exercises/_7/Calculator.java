package javaoopAdvanced.exercises._7;

// You can change any code in this class if you think there is a bug!
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0){
            throw new ArithmeticException("You divided by zero");
        }
        return a / b;

    }

    public double power(double base, double exponent) {
        if (exponent == 0){
            throw new ArithmeticException("Your exponent is zero");
        }
        if (exponent < 0){
            throw new ArithmeticException("Your exponent is negative");
        }
        if (exponent == Double.POSITIVE_INFINITY){
            throw new ArithmeticException("Your exponent is infinite");
        }
        if (exponent == Double.NEGATIVE_INFINITY){
            throw new ArithmeticException("Your exponent is infinite");
        }
        if (base < 0){
            throw new ArithmeticException("Your base is negative");
        }
        if (base == 0.5){
            throw new ArithmeticException("Your base is deciamal");
        }if (base == -0.5){
            throw new ArithmeticException("Your base is deciamal");
        }
        return Math.pow(base, exponent);
    }
}

