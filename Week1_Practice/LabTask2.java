import java.util.Scanner;

public class LabTask2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter five integers: ");

            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int num3 = input.nextInt();
            int num4 = input.nextInt();
            int num5 = input.nextInt();

            // Finding the largets integer
            int largest = num1;

            if (num2 > largest) {
                largest = num2;
            }

            if (num3 > largest) {
                largest = num3;
            }

            if (num4 > largest) {
                largest = num4;
            }

            if (num5 > largest) {
                largest = num5;
            }

            System.out.println("The largest integer is: " + largest);

        }
    }
}
