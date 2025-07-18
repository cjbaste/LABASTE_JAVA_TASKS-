package JAVATASKS;

import java.util.Scanner;

public class Task4 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine(); 
        StringBuilder stringBuilder = new StringBuilder(inputString);
        String reversedString = stringBuilder.reverse().toString();
        if (inputString.equals(reversedString)) {
            System.out.println("The input string is a palindrome.");
        } else {
            
            System.out.println("The input string is not a palindrome.");
        }

        scanner.close(); 
    }
}
