package by.itacademy.klimovich;

public class Calculator implements ICalculator {
    @Override
    public int sum(int a, int b) throws IndexOutOfBoundsException {
        int result = a + b;
        if (result > Integer.MAX_VALUE) {
            throw new IndexOutOfBoundsException("Result greater that maximum int");
        }
        return result;
    }

    @Override
    public int multiplay(int a, int b) throws IndexOutOfBoundsException {
        int result = a * b;
        if (result > Integer.MAX_VALUE) {
            throw new IndexOutOfBoundsException("Result greater that maximum int");
        }
        return result;
    }

    @Override
    public double divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    @Override
    public int subtract(int a, int b) throws IndexOutOfBoundsException {
        int result = a - b;
        if (result < Integer.MIN_VALUE) {
            throw new IndexOutOfBoundsException("Result greater that minimum int");
        }
        return result;
    }
}
