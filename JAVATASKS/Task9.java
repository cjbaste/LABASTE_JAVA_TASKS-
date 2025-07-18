package JAVATASKS;
import static java.lang.Math.*;

public class Task9 {

    public static int add(int a, int b) {
        return addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    public static float divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Float.NaN; 
        }
        return (float) a / b;
    }

     public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int num3 = 0;
        System.out.println("Examples:");
        int sum = add(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + sum);

        int difference = subtract(num1, num2);
        System.out.println(num1 + " - " + num2 + " = " + difference);

        int product = multiply(num1, num2);
        System.out.println(num1 + " * " + num2 + " = " + product);

        float quotient = divide(num1, num2);
        System.out.println(num1 + " / " + num2 + " = " + quotient);

        System.out.println("\nDivision by zero:");
        float quotient2 = divide(num1, num3);
        System.out.println(num1 + " / " + num3 + " = " + quotient2);
    }
}