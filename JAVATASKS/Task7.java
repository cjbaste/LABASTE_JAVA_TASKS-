package JAVATASKS;
import java.util.Scanner;

public class Task7 {
    
    public int add(int num1, int num2) {
        return num1 + num2;
    }
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
    public double divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0.0; 
        }
        return (double) num1 / num2; 
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        Task7 calculator = new Task7();
        System.out.println("Basic Arithmetic Operations");
        System.out.print("Enter the first integer: ");
        int number1 = inputScanner.nextInt();
        System.out.print("Enter the second integer: ");
        int number2 = inputScanner.nextInt();
        System.out.println("\nResults");

        int sum = calculator.add(number1, number2);
        System.out.println("Addition: " + number1 + " + " + number2 + " = " + sum);

        int difference = calculator.subtract(number1, number2);
        System.out.println("Subtraction: " + number1 + " - " + number2 + " = " + difference);

        int product = calculator.multiply(number1, number2);
        System.out.println("Multiplication: " + number1 + " * " + number2 + " = " + product);

        double quotient = calculator.divide(number1, number2);
        if (number2 != 0) {
            System.out.println("Division: " + number1 + " / " + number2 + " = " + quotient);
        }
        inputScanner.close();
    }

}
