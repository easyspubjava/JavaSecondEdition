package chapter6;

class Calculator {
    static int operationCount = 0;

    public static int add(int a, int b) {
        operationCount++;
        return a + b;
    }

    public static int subtract(int a, int b) {
        operationCount++;
        return a - b;
    }

    public static int multiply(int a, int b) {
        operationCount++;
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero.");
        }
        operationCount++;
        return (double) a / b;
    }

    public static void printOperationCount() {
        System.out.println("총 " + operationCount + "번 호출되었습니다." );
    }
}

public class Exercise9 {
    public static void main(String[] args) {
        System.out.println("Addition: " + Calculator.add(5, 3));
        System.out.println("Subtraction: " + Calculator.subtract(5, 3));
        System.out.println("Multiplication: " + Calculator.multiply(5, 3));
        System.out.println("Division: " + Calculator.divide(5, 3));
        Calculator.printOperationCount();
    }
}
