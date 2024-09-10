import java.util.Scanner;

public class LabTask4 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int sum = 0;
            int count = 0;
            int number;

            System.out.println("Enter numbers (enter -999 to end):");

            while (true) {
                number = input.nextInt();

                if (number == -999) {
                    break;
                }

                sum += number;
                count++;
            }
            
            if (count > 0) {
                double average = sum / count;
                System.out.printf("Sum: %d  ", sum);
                System.out.printf("Average: %.2f%n", average);
        } else {
            System.out.println("No numbers were entered.");
        }
            }
        }
    }

