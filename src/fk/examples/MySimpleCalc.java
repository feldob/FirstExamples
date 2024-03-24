package fk.examples;

import java.math.BigDecimal;
import java.util.Scanner;

public class MySimpleCalc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Welcome to the basic calculator! Please enter the two numbers you want to process separated by a space:");
            String[] inputs = scanner.nextLine().split(" ");
            BigDecimal number1 = new BigDecimal(inputs[0]);
            BigDecimal number2 = new BigDecimal(inputs[1]);
            
            System.out.println("Ok, what do you want to do with the two? Enter one of the numbers 1-4 accordingly: 1. add, 2. subtract, 3. multiply, 4. divide");
            int choice = Integer.parseInt(scanner.nextLine());
            BigDecimal result = BigDecimal.ZERO;
            
            String operation;
            
            switch (choice) {
                case 1:
                    result = number1.add(number2);
                    operation = "add";
                    break;
                case 2:
                    result = number1.subtract(number2);
                    operation = "subtract";
                    break;
                case 3:
                    result = number1.multiply(number2);
                    operation = "multiply";
                    break;
                case 4:
                	result = number1.divide(number2, 2, BigDecimal.ROUND_HALF_UP);
                    operation = "divide";
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                    continue;
            }
            
            // Consolidated result output
            System.out.println("Result of " + operation + " the values: " + result);
            
            System.out.println("\nDo you want to perform another calculation? Enter 'yes' to continue or 'no' to exit.");
            String userDecision = scanner.nextLine();
            if (userDecision.equalsIgnoreCase("no")) {
                break;
            }
        }
        
        scanner.close();
        System.out.println("Thank you for using the basic calculator!");
    }
}
