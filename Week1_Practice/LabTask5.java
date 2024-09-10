// import java.util.Scanner;

// public class LabTask5 {
//     public static void main(String[] args) {
//         try (Scanner input = new Scanner(System.in)) {
//             // Input the first operand
//             System.out.print("Enter the first operand: ");
//             double operand1 = input.nextDouble();

//             // Input the second operand
//             System.out.print("Enter the second operand: ");
//             double operand2 = input.nextDouble();

//             // Input the operator
//             System.out.print("Enter the operator (+, -, *, /): ");
//             char operator = input.next().charAt(0);

//             double result;

//             // Perform the operation based on the operator
//             switch (operator) {
//                 case '+':
//                     result = operand1 + operand2;
//                     System.out.printf("Result: %.2f%n", result);
//                     break;
//                 case '-':
//                     result = operand1 - operand2;
//                     System.out.printf("Result: %.2f%n", result);
//                     break;
//                 case '*':
//                     result = operand1 * operand2;
//                     System.out.printf("Result: %.2f%n", result);
//                     break;
//                 case '/':
//                     if (operand2 != 0) {
//                         result = operand1 / operand2;
//                         System.out.printf("Result: %.2f%n", result);
//                     }
//             }

//         }
//     }
// }

import java.util.Scanner;

public class LabTask5 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

        // Input the first operand
        System.out.print("Enter the first operand: ");
        double operand1 = input.nextDouble();

        // Input the second operand
        System.out.print("Enter the second operand: ");
        double operand2 = input.nextDouble();

        // Input the operator
        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        double result;

        // Perform the operation based on the operator
        switch (operator) {
            case '+' -> {
                result = operand1 + operand2;
                System.out.printf("Result: %.2f%n", result);
                }
            case '-' -> {
                result = operand1 - operand2;
                System.out.printf("Result: %.2f%n", result);
                }
            case '*' -> {
                result = operand1 * operand2;
                System.out.printf("Result: %.2f%n", result);
                }
            case '/' -> {
                if (operand2 != 0) {
                    result = operand1 / operand2;
                    System.out.printf("Result: %.2f%n", result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                }
            default -> System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
            }
        }
    }
}
