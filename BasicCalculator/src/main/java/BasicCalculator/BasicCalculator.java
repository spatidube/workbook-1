package BasicCalculator;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        scanner.nextLine(); // fix the newline issue

        System.out.println("Possible Calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        scanner.nextLine();

        System.out.println("Please select an option: ");
        String operation = scanner.nextLine();

        scanner.nextLine();

        int result = num1 * num2;
        System.out.print("Result: " + result);




    }
    }


