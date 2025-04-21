package PayrollCalc;

import java.util.Scanner;

public class PayrollCalc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name");
        String name = scanner.nextLine();

        System.out.print("Enter hours worked: ");
        int hours = scanner.nextInt();

        System.out.print("Enter pay rate: ");
        float payRate = scanner.nextFloat();

        scanner.nextLine();
        System.out.println("Result: " + name + "gets paid " + "$" + hours*payRate);
    }
}
