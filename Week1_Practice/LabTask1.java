import java.util.Scanner;

public class LabTask1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a one digit number (0-9):");
            // Check if the input is an integer
            if (input.hasNextInt()) {
                int number = input.nextInt();

                // Check if the number entered is within the range 0-9
                if (number >= 0 && number <= 9) {
                    // Print the number in words
                    switch (number) {
                        case 0 -> System.out.println("Zero");
                        case 1 -> System.out.println("One");
                        case 2 -> System.out.println("Two");
                        case 3 -> System.out.println("Three");
                        case 4 -> System.out.println("Four");
                        case 5 -> System.out.println("Five");
                        case 6 -> System.out.println("Six");
                        case 7 -> System.out.println("Seven");
                        case 8 -> System.out.println("Eight");
                        case 9 -> System.out.println("Nine");

                    }
                
                } else {
                    System.out.println("Invalid number!");
                }
            } else {
                System.out.println("Invalid number!");
            }
        }
    }
    
}