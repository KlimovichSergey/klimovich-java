package by.itacademy.klimovich;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        try {
            System.out.println("Сложение: " + calculator.sum(10,20));
            System.out.println("Вычетание: " + calculator.subtract(10,20));
            System.out.println("Умножение: " + calculator.multiplay(10,200));
            System.out.println("Деление: " + calculator.divide(10,0));
        } catch (ArithmeticException  | IndexOutOfBoundsException e) {
            System.err.println("Перехвачено исключение" + e);

        }
    }
}
